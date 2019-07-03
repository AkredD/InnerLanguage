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
	private List<TypeMethod> methods;
	private List<BaseMethodView> methodsView;

	public TypeWrapper(String classPath, String className, TypeWrapper parent, Boolean instanceablel, List<TypeMethod> methods) {
		this.classPath = classPath;
		this.className = className;
		this.parent = parent;
		this.methods = methods;
		this.instanceablel = instanceablel;
	}

	public TypeWrapper(BaseTypeView view, TypeWrapper parent) {
		this.classPath = view.getClassPath();
		this.className = view.getClassName();
		this.parent = parent;
		this.instanceablel = view.getInstanceable();
		this.methodsView = view.getMethods();
	}

	public Boolean getInstanceablel() {
		return instanceablel;
	}

	public void initMethods(Map<String, TypeWrapper> typesByClassName) {
		this.methods = (methodsView != null) ? methodsView
				  .stream()
				  .map(methodView -> {
					  return new TypeMethod(methodView, typesByClassName);
				  })
				  .collect(Collectors.toList())
							: new ArrayList();
		methodsView.clear();
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

	public TypeWrapper getParent() {
		return parent;
	}
}
