/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types;

import cs.service.innerlanguage.provider.types.basic.BaseMethodView;
import cs.service.innerlanguage.provider.types.basic.BaseTypeView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class TypeWrapper {
	private final String classPath;
	private final String className;
	private final Boolean instanceablel;
	private List<TypeWrapper> parentList;
	private List<TypeMethod> constructors;
	private List<TypeMethod> methods;
	private List<TypeMethod> staticMethods;
	private List<BaseMethodView> methodsView;
	private List<BaseMethodView> staticMethodsView;
	private List<BaseMethodView> constructorsView;
	private List<TypeMethod> allStaticMethods;
	private List<TypeMethod> allMethods;

	public TypeWrapper(String classPath, String className, List<TypeWrapper> parentList, Boolean instanceablel, List<TypeMethod> methods, List<TypeMethod> constructors, List<TypeMethod> staticMethods) {
		this.classPath = classPath;
		this.className = className;
		this.parentList = parentList;
		this.constructors = constructors;
		this.methods = methods;
		this.instanceablel = instanceablel;
		this.staticMethods = staticMethods;
	}

	public TypeWrapper(BaseTypeView view, List<TypeWrapper> parentList) {
		this.classPath = view.getClassPath();
		this.className = view.getClassName();
		this.parentList = parentList;
		this.instanceablel = view.getInstanceable();
		this.methodsView = view.getMethods();
		this.constructorsView = view.getConstructors();
		this.staticMethodsView = view.getStaticMethods();
	}

	public List<TypeMethod> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<TypeMethod> constructors) {
		this.constructors = constructors;
	}

	public Boolean getInstanceablel() {
		return instanceablel;
	}

	public List<TypeMethod> getStaticMethods() {
		return staticMethods;
	}

	public void setStaticMethods(List<TypeMethod> staticMethods) {
		this.staticMethods = staticMethods;
	}

	public synchronized List<TypeMethod> getAllStaticMethods() {
		if (allStaticMethods != null) {
			return allStaticMethods;
		}
		allStaticMethods = new ArrayList();
		Set<TypeMethod> staticMethodsSet = new HashSet();
		if (parentList != null) {
			staticMethodsSet = parentList.stream()
					  .map(parent -> {
						  return parent.getAllStaticMethods();
					  })
					  .collect(Collector.of(HashSet::new, HashSet::addAll, (left, right) -> {
											 left.addAll(right);
											 return left;
										 }))
		}
		staticMethodsSet.addAll(this.methods);
		allStaticMethods.addAll(staticMethodsSet);
		return allStaticMethods;
	}

	public void initMethods(Map<String, TypeWrapper> typesByClassName) {
		this.methods = (methodsView != null) ? methodsView
				  .stream()
				  .map(methodView -> {
					  return new TypeMethod(methodView, typesByClassName);
				  })
				  .collect(Collectors.toList())
							: new ArrayList();
		this.constructors = (constructorsView != null) ? constructorsView
				  .stream()
				  .map(constrView -> {
					  return new TypeMethod(constrView, typesByClassName);
				  }).collect(Collectors.toList())
								  : new ArrayList();
		this.staticMethods = (staticMethodsView != null) ? staticMethodsView
				  .stream()
				  .map(constrView -> {
					  return new TypeMethod(constrView, typesByClassName);
				  }).collect(Collectors.toList())
									: new ArrayList();
		staticMethodsView = null;
		constructorsView = null;
		methodsView = null;
	}

	public String getClassName() {
		return className;
	}

	public String getClassPath() {
		return classPath;
	}

	public List<TypeMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<TypeMethod> methods) {
		this.methods = methods;
	}

	public synchronized List<TypeMethod> getAllMethods() {
		if (allMethods != null) {
			return allMethods;
		}
		allMethods = new ArrayList();
		Set<TypeMethod> methodsSet = new HashSet();
		if (parentList != null) {
			methodsSet = parentList.stream()
					  .map(parent -> {
						  return parent.getAllMethods();
					  })
					  .collect(Collector.of(HashSet::new, HashSet::addAll, (left, right) -> {
											 left.addAll(right);
											 return left;
										 }))
		}
		methodsSet.addAll(this.methods);
		allMethods.addAll(methodsSet);
		return allMethods;
	}

	public List<TypeWrapper> getParentList() {
		return parentList;
	}

	@Override
	public String toString() {
		if (className.equals("Void")) {
			return "void";
		}
		return this.classPath;
	}

	public Boolean isAssignableFrom(TypeWrapper type) {
		if (className.equals(type.getClassName())) {
			return true;
		}
		if (type.getParentList() == null) {
			return false;
		}
		return type.getParentList()
				  .parallelStream()
				  .map(parent -> {
					  return isAssignableFrom(parent);
				  })
				  .filter(e -> e)
				  .findAny()
				  .isPresent();
	}

	public Boolean isMemberOf(TypeWrapper type) {
		return type.isAssignableFrom(this);
	}
}
