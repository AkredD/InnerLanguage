/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public class TypeWrapper {
	private final String classPath;
	private final String className;
	private final TypeWrapper parent;
	private final List<TypeMethod> methods;

	public TypeWrapper(String classPath, String className, TypeWrapper parent, List<TypeMethod> methods) {
		this.classPath = classPath;
		this.className = className;
		this.parent = parent;
		this.methods = methods;
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
