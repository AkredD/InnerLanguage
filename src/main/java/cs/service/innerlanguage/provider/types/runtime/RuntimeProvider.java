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
import java.util.function.BiFunction;
import java.util.function.Function;
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
import cs.service.innerlanguage.provider.IProvider;

/**
 *
 * @author anisimov_a_v
 */
public class RuntimeProvider implements IProvider{
	private MainProvider mainProvider;
	private final List<TypeWrapper> systemTypes = new ArrayList();
	private final Map<String, TypeWrapper> typesByName = new HashMap();
	private final Map<String, TypeWrapper> typesByClassName = new HashMap();
	private Boolean ignorePrimitiveArrays;
	private Boolean ignoreVarargs;

	public RuntimeProvider(MainProvider mainProvaider) {
		this.mainProvider = mainProvaider;
	}

	public void setIgnorePrimitiveArrays(Boolean ignorePrimitiveArrays) {
		this.ignorePrimitiveArrays = ignorePrimitiveArrays;
	}

	public void setIgnoreVarargs(Boolean ignoreVarargs) {
		this.ignoreVarargs = ignoreVarargs;
	}

	@Override
	public TypeWrapper getTypeByClassName(String className) {
		return typesByClassName.get(className);
	}

	@Override
	public Map<String, TypeWrapper> getTypesByClassName() {
		return typesByClassName;
	}

	@Override
	public TypeWrapper getTypeByName(String name) {
		return typesByName.get(name);
	}

	@Override
	public Map<String, TypeWrapper> getTypesByName() {
		return typesByName;
	}

	@Override
	public void reload() {
		try {
			String pathFileContent = IOUtils.toString(Thread.currentThread().getContextClassLoader().getResourceAsStream("system" + File.separator + "pathes"), "UTF-8");
			String[] javaPathes = (pathFileContent.contains(";")) ? pathFileContent.split(";") : new String[]{pathFileContent};
			List<ClassLoader> classLoadersList = new LinkedList<>();
			classLoadersList.add(ClasspathHelper.contextClassLoader());
			classLoadersList.add(ClasspathHelper.staticClassLoader());
			for (String className : javaPathes) {
				//System.out.println("package: " + className);
				Reflections reflections = new Reflections(new ConfigurationBuilder()
						  .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
						  .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
						  .filterInputsBy(new FilterBuilder().includePackage(className)));
				Set<String> allClasses = reflections.getAllTypes();
				//System.out.println("in package " + className + " " + allClasses.size());
				allClasses.forEach(clazz -> {
					register(clazz);
				});
			}
		} catch (IOException ex) {
			Logger.getLogger(MainProvider.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	private final Function<Class, TypeWrapper> getTypeWrapperByClass = (clazz) -> {
		if (!(typesByClassName.containsKey(clazz.getName())
				|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getName()))) {
			register(clazz.getName());
		}
		return ((typesByClassName.containsKey(clazz.getName()))
				  ? typesByClassName.get(clazz.getName())
				  : mainProvider.getBasicTypesByClassName().get(clazz.getName()));
	};

	public void register(String className) {
		try {
			Class clazz = Class.forName(className);
			System.out.println(clazz.getName());
			//class already registered
			if (typesByClassName.containsKey(className)
				 || mainProvider.getBasicTypesByClassName().containsKey(className)) {
				return;
			}
			//registering super class
			List<TypeWrapper> parentList = new ArrayList();
			if ((clazz.getSuperclass() == null && (clazz.getInterfaces() == null || clazz.getInterfaces().length == 0))) {
				parentList.add(mainProvider.getTypeByName("Object"));
			}
			if (clazz.getSuperclass() != null) {
				parentList.add(getTypeWrapperByClass.apply(clazz.getSuperclass()));
			}
			if (clazz.getInterfaces() != null) {
				Arrays.asList(clazz.getInterfaces()).forEach(interfaceClazz -> {
					parentList.add(getTypeWrapperByClass.apply(interfaceClazz));
				});
			}
			Boolean instanceablel = Modifier.isAbstract(clazz.getModifiers()) || clazz.isInterface();
			TypeWrapper type = new TypeWrapper(clazz.getName(), clazz.getSimpleName(), parentList, !instanceablel, false, null, null, null);
			typesByName.put(type.getClassName(), type);
			typesByClassName.put(type.getClassPath(), type);
			type.setMethods(formMethods(clazz, false));
			type.setStaticMethods(formMethods(clazz, true));
			type.setConstructors(formConstructors(clazz));
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
					  .filter(method -> !ignorePrimitiveArrays || !method.getReturnType().getName().startsWith("["))
					  .filter(method -> !ignoreVarargs || !method.isVarArgs())
					  .peek(method -> {
						  if (method.isVarArgs()) {
							  mainProvider.handleException(ExceptionMessage.VARARGS_DOESNT_SUPPORT, method.getName(), clazz.getSimpleName());
						  }
						  if (method.getReturnType().getName().startsWith("[")) {
							  mainProvider.handleException(ExceptionMessage.PRIMITVE_ARRAYS_DOESNT_SUPPORT, method.getName(), clazz.getSimpleName());
						  }
					  })
					  .map(method -> {
						  TypeConstructor methodConstructor = new TypeConstructor(Arrays.asList(method.getParameterTypes())
									 .stream()
									 .map(paramClazz -> {
										 TypeWrapper type = getTypeWrapperByClass(paramClazz, method.getName());
										 return type;
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
				mainProvider.handleException(ExceptionMessage.PRIMITVE_ARRAYS_DOESNT_SUPPORT, methodName, clazz.getSimpleName());
			}
			TypeWrapper primitive = null;
			switch (clazz.getName()) {
				case "int":
					primitive = mainProvider.getTypeByName("Integer");
					break;
				case "short":
					primitive = mainProvider.getTypeByName("Short");
					break;
				case "long":
					primitive = mainProvider.getTypeByName("Long");
					break;
				case "float":
					primitive = mainProvider.getTypeByName("Float");
					break;
				case "double":
					primitive = mainProvider.getTypeByName("Double");
					break;
				case "char":
					primitive = mainProvider.getTypeByName("Character");
					break;
				case "byte":
					primitive = mainProvider.getTypeByName("Byte");
					break;
				case "boolean":
					primitive = mainProvider.getTypeByName("Boolean");
					break;
				case "void":
					primitive = mainProvider.getTypeByName("Void");
					break;
			}
			return primitive;
		}
		if (!(typesByClassName.containsKey(clazz.getName())
				|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getName()))) {
			register(clazz.getName());
		}
		return (typesByClassName.containsKey(clazz.getName())) ? typesByClassName.get(clazz.getName()) : mainProvider.getTypeByClassName(clazz.getName());
	}
}
