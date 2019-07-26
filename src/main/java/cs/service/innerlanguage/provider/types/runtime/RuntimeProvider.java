/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types.runtime;

import com.google.common.base.Predicate;
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
import java.io.FileReader;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author anisimov_a_v
 */
public class RuntimeProvider implements IProvider {
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
			//Don't work in glassfish
			//String pathFileContent = IOUtils.toString(Thread.currentThread().getContextClassLoader().getResourceAsStream("system" + File.separator + "pathes"), "UTF-8");
			String pathFileContent = new String(Files.readAllBytes(Paths.get(("system" + File.separator + "pathes"))));
			String[] javaPathes = (pathFileContent.contains(";")) ? pathFileContent.split(";") : new String[] {pathFileContent};
			List<ClassLoader> classLoadersList = new LinkedList<>();
			classLoadersList.add(ClasspathHelper.contextClassLoader());
			classLoadersList.add(ClasspathHelper.staticClassLoader());
			for (String className : javaPathes) {
				Reflections reflections = new Reflections(new ConfigurationBuilder()
						  .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
						  .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
						  .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(className))));
				Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
				allClasses.forEach(clazz -> {
					register(clazz.getName());
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
					  return new TypeMethod(MainProvider.instance().getTypeByName("Void"), null, false, methodConstructor);
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
			return MainProvider.instance().getTypeWrapperByPrimitive.apply(clazz);
		}
		if (!(typesByClassName.containsKey(clazz.getName())
				|| mainProvider.getBasicTypesByClassName().containsKey(clazz.getName()))) {
			register(clazz.getName());
		}
		return (typesByClassName.containsKey(clazz.getName())) ? typesByClassName.get(clazz.getName()) : mainProvider.getTypeByClassName(clazz.getName());
	}
}
