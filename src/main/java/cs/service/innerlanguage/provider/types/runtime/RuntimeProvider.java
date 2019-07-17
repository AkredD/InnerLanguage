/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.runtime;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.provider.types.TypeConstructor;
import cs.service.innerlanguage.provider.types.TypeMethod;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.utils.Pair;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

/**
 *
 * @author anisimov_a_v
 */
public class RuntimeProvider {
	private MainProvider mainProvider;
	private final List<TypeWrapper> systemTypes;
	private final Map<String, TypeWrapper> typesByName;
	private final Map<String, TypeWrapper> typesByClassName;

	public RuntimeProvider(MainProvider mainProvaider) {
		this.systemTypes = new ArrayList();
		this.mainProvider = mainProvaider;
		this.typesByName = new HashMap();
		this.typesByClassName = new HashMap();
	}

	public void reload() {
		try {
			String pathFileContent = IOUtils.toString(Thread.currentThread().getContextClassLoader().getResourceAsStream("system" + File.separator + "pathes"), "UTF-8");
			String[] javaPathes = (pathFileContent.contains(";")) ? pathFileContent.split(";") : (String[]) Arrays.asList(pathFileContent).toArray();
			List<ClassLoader> classLoadersList = new LinkedList<>();
			classLoadersList.add(ClasspathHelper.contextClassLoader());
			classLoadersList.add(ClasspathHelper.staticClassLoader());
			for (String className : javaPathes) {
				Reflections reflections = new Reflections(new ConfigurationBuilder()
						  .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
						  .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[1])))
						  .filterInputsBy(new FilterBuilder().include(className + "\\..*")));
				Set<String> allClasses = reflections.getAllTypes();
				System.out.println("in package " + className + " " + allClasses.size());
				allClasses.forEach(clazz -> {
					register(clazz);
				});
			}
		} catch (IOException ex) {
			Logger.getLogger(MainProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void register(String className) {
		try {
			Class clazz = Class.forName(className);
			System.out.println(clazz.getName());
			//class already registered
			if (typesByClassName.containsKey(className)
				 || mainProvider.getBasicTypesByClassName().containsKey(className)) {
				return;
			}
			//registering super class
			TypeWrapper parent = null;
			if (clazz.getSuperclass() == null && (clazz.getInterfaces() == null || clazz.getInterfaces().length == 0)) {
				parent = mainProvider.getBasicTypeByName("Object");
			} else if (clazz.getSuperclass() != null && (clazz.getInterfaces() == null || clazz.getInterfaces().length == 0)) {
				if (!(typesByClassName.containsKey(clazz.getSuperclass().getName())
						|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getSuperclass().getName()))) {
					register(clazz.getSuperclass().getName());
				}
				parent = (typesByClassName.containsKey(clazz.getSuperclass().getName()))
							? typesByClassName.get(clazz.getSuperclass().getName())
							: mainProvider.getBasicTypesByClassName().get(clazz.getSuperclass().getName());
			} else if (clazz.getSuperclass() == null && (clazz.getInterfaces() != null || clazz.getInterfaces().length == 1)) {
				if (!(typesByClassName.containsKey(clazz.getInterfaces()[0].getName())
						|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getInterfaces()[0].getName()))) {
					register(clazz.getInterfaces()[0].getName());
				}
				parent = (typesByClassName.containsKey(clazz.getInterfaces()[0].getName()))
							? typesByClassName.get(clazz.getInterfaces()[0].getName())
							: mainProvider.getBasicTypesByClassName().get(clazz.getInterfaces()[0].getName());
			} else {
				mainProvider.handleException(ExceptionMessage.RUNTIME_TYPE_LOAD_EXCEPTION, clazz.getName());
			}
			Boolean instanceablel = Modifier.isAbstract(clazz.getModifiers()) || clazz.isInterface();
			List<TypeMethod> methods = formMethods(clazz, false);
			List<TypeMethod> staticMethods = formMethods(clazz, true);
			List<TypeMethod> constructors = formConstructors(clazz);
			TypeWrapper type = new TypeWrapper(clazz.getName(), clazz.getSimpleName(), parent, !instanceablel, methods, constructors, staticMethods);
			typesByName.put(type.getClassName(), type);
			typesByClassName.put(type.getClassPath(), type);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(RuntimeProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private List<TypeMethod> formConstructors(Class clazz) {
		return Arrays.asList(clazz.getConstructors()).stream()
				  .map(constructor -> {
					  TypeConstructor methodConstructor = new TypeConstructor(Arrays.asList(constructor.getParameterTypes())
								 .stream()
								 .map(paramClazz -> {
									 return getTypeWrapperByClass(paramClazz, "class constructor");
								 })
								 .map(type -> {
									 return new Pair<>(type, "o" + type.getClassName());
								 })
								 .collect(Collectors.toList()));
					  return new TypeMethod(null, null, false, methodConstructor);
				  })
				  .collect(Collectors.toList());
	}

	private List<TypeMethod> formMethods(Class clazz, Boolean needStatic) {
		if (clazz.getDeclaredMethods() != null) {
			return Arrays.asList(clazz.getMethods()).stream()
					  .filter(method -> method.getDeclaringClass().equals(clazz))
					  .filter(method -> !Modifier.isStatic(method.getModifiers()) ^ needStatic)
					  .peek(method -> {
						  if (method.isVarArgs()) {
							  mainProvider.handleException(ExceptionMessage.VARARGS_DOESNT_SUPPORT, method.getName(), clazz.getSimpleName());
						  }
						  if (method.getReturnType().getName().startsWith("[")) {
							  mainProvider.handleException(ExceptionMessage.PRIMITVE_ARRAYS_DOENST_SUPPORT, method.getName(), clazz.getSimpleName());
						  }
					  })
					  .map(method -> {
						  TypeConstructor methodConstructor = new TypeConstructor(Arrays.asList(method.getParameterTypes())
									 .stream()
									 .map(paramClazz -> {
										 return getTypeWrapperByClass(paramClazz, method.getName());
									 })
									 .map(type -> {
										 return new Pair<>(type, "o" + type.getClassName());
									 })
									 .collect(Collectors.toList()));
						  TypeMethod methodWrapper = new TypeMethod(getTypeWrapperByClass(method.getReturnType(), method.getName()), method.getName(), method.getReturnType().isPrimitive(), methodConstructor);
						  return methodWrapper;
					  })
					  .collect(Collectors.toList());
		}
		return new ArrayList();
	}

	private TypeWrapper getTypeWrapperByClass(Class clazz, String methodName) {
		if (clazz.isPrimitive()) {
			if (clazz.getName().startsWith("[")) {
				mainProvider.handleException(ExceptionMessage.PRIMITVE_ARRAYS_DOENST_SUPPORT, methodName, clazz.getSimpleName());
			}
			TypeWrapper primitive = null;
			switch (clazz.getName()) {
				case "int":
					primitive = mainProvider.getBasicTypeByName("Integer");
					break;
				case "short":
					primitive = mainProvider.getBasicTypeByName("Short");
					break;
				case "long":
					primitive = mainProvider.getBasicTypeByName("Long");
					break;
				case "float":
					primitive = mainProvider.getBasicTypeByName("Float");
					break;
				case "double":
					primitive = mainProvider.getBasicTypeByName("Double");
					break;
				case "char":
					primitive = mainProvider.getBasicTypeByName("Char");
					break;
				case "byte":
					primitive = mainProvider.getBasicTypeByName("Byte");
					break;
				case "boolean":
					primitive = mainProvider.getBasicTypeByName("Boolean");
					break;
			}
			return primitive;
		}
		if (!(typesByClassName.containsKey(clazz.getName())
				|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getName()))) {
			register(clazz.getName());
		}
		return (typesByClassName.containsKey(clazz.getName())) ? typesByClassName.get(clazz.getName()) : mainProvider.getBasicTypeByClassName(clazz.getName());
	}
}
