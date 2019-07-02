/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class TypeMethod {
	private final TypeWrapper output;
	private final Set<TypeConstructor> constructors;

	public TypeMethod(TypeWrapper output, Set<TypeConstructor> constructors) {
		this.output = output;
		this.constructors = constructors;
	}

	public Set<TypeConstructor> getConstructors() {
		return constructors;
	}

	public TypeWrapper getOutput() {
		return output;
	}
}
