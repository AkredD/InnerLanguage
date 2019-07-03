/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.types;

import cs.service.innerlanguage.translator.types.basic.BaseTypeConstructorView;
import cs.service.innerlanguage.utils.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class TypeConstructor {
	private final List<Pair<TypeWrapper, String>> parameters;

	public TypeConstructor(List<Pair<TypeWrapper, String>> parameters) {
		this.parameters = parameters;
	}

	public TypeConstructor(BaseTypeConstructorView constructorView, Map<String, TypeWrapper> typesByClassName) {
		this.parameters = (constructorView != null && constructorView.getParameters() != null)
								? constructorView
				  .getParameters()
				  .entrySet()
				  .stream()
				  .map(entry -> {
					  return new Pair<>(typesByClassName.get(entry.getValue()), entry.getKey());
				  })
				  .collect(Collectors.toList())
								: new ArrayList();
	}

	public List<Pair<TypeWrapper, String>> getParameters() {
		return parameters;
	}
}
