/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import cs.service.innerlanguage.utils.Pair;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public class TypeConstructor {
	private final List<Pair<TypeWrapper, String>> parameters;

	public TypeConstructor(List<Pair<TypeWrapper, String>> parameters) {
		this.parameters = parameters;
	}

	public List<Pair<TypeWrapper, String>> getParameters() {
		return parameters;
	}
}
