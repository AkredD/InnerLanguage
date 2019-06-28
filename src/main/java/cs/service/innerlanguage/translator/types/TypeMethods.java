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
public class TypeMethods {
	private final TypeWrapper output;
	private final Set<TypeConstructor> contructors;

	public TypeMethods(TypeWrapper output, Set<TypeConstructor> contructors) {
		this.output = output;
		this.contructors = contructors;
	}

	public Set<TypeConstructor> getContructors() {
		return contructors;
	}

	public TypeWrapper getOutput() {
		return output;
	}
}
