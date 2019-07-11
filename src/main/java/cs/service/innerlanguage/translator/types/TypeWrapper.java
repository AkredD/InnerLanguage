/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import cs.service.innerlanguage.translator.types.basic.BaseMethodView;
import cs.service.innerlanguage.translator.types.basic.BaseTypeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class TypeWrapper {
	private final String classPath;
	private final String className;
	private final TypeWrapper parent;
	private final Boolean instanceablel;
	private List<TypeMethod> constructors;
	private List<TypeMethod> methods;
	private List<TypeMethod> staticMethods;
	private List<BaseMethodView> methodsView;
	private List<BaseMethodView> staticMethodsView;
	private List<BaseMethodView> constructorsView;
	private List<TypeMethod> allStaticMethods;
	private List<TypeMethod> allMethods;

	public TypeWrapper(String classPath, String className, TypeWrapper parent, Boolean instanceablel, List<TypeMethod> methods, List<TypeMethod> constructors, List<TypeMethod> staticMethods) {
		this.classPath = classPath;
		this.className = className;
		this.parent = parent;
		this.constructors = constructors;
		this.methods = methods;
		this.instanceablel = instanceablel;
		this.staticMethods = staticMethods;
	}

	public TypeWrapper(BaseTypeView view, TypeWrapper parent) {
		this.classPath = view.getClassPath();
		this.className = view.getClassName();
		this.parent = parent;
		this.instanceablel = view.getInstanceable();
		this.methodsView = view.getMethods();
		this.constructorsView = view.getConstructors();
		this.staticMethodsView = view.getStaticMethods();
	}

	public List<TypeMethod> getConstructors() {
		return constructors;
	}

	public Boolean getInstanceablel() {
		return instanceablel;
	}

	public List<TypeMethod> getStaticMethods() {
		return staticMethods;
	}

	public synchronized List<TypeMethod> gettAllStaticMethods() {
		if (allStaticMethods != null) {
			return allStaticMethods;
		}
		allStaticMethods = new ArrayList();
		TypeWrapper viewingType = this;
		while (viewingType != null) {
			allStaticMethods.addAll(viewingType.getStaticMethods());
			viewingType = viewingType.getParent();
		}
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

	public synchronized List<TypeMethod> getAllMethods() {
		if (allMethods != null) {
			return allMethods;
		}
		allMethods = new ArrayList();
		TypeWrapper viewingType = this;
		while (viewingType != null) {
			allMethods.addAll(viewingType.getMethods());
			viewingType = viewingType.getParent();
		}
		return allMethods;
	}

	public TypeWrapper getParent() {
		return parent;
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
		if (type.getParent() == null) {
			return false;
		}
		return isAssignableFrom(type.getParent());
	}

	public Boolean isMemberOf(TypeWrapper type) {
		return type.isAssignableFrom(this);
	}
}
