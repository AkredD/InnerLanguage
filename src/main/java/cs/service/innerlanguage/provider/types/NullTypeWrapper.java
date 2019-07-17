/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.provider.types;

import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public class NullTypeWrapper extends TypeWrapper {
	private NullTypeWrapper(String classPath, String className, TypeWrapper parent, Boolean instanceablel, List<TypeMethod> methods, List<TypeMethod> constructors, List<TypeMethod> staticMethods) {
		super(classPath, className, parent, instanceablel, methods, constructors, staticMethods);
	}

	public NullTypeWrapper() {
		super(null, null, null, false, null, null, null);
	}

	@Override
	public boolean equals(Object a) {
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}

	@Override
	public Boolean isAssignableFrom(TypeWrapper type) {
		return true;
	}

	@Override
	public Boolean isMemberOf(TypeWrapper type) {
		return true;
	}
}
