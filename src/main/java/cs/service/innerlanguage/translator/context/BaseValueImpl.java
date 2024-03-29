/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.provider.types.TypeWrapper;

/**
 *
 * @author anisimov_a_v
 */
public class BaseValueImpl implements NodeContext {
	private Object value;
	private TypeWrapper type;

	public BaseValueImpl(TypeWrapper type, Object value) {
		this.value = value;
		this.type = type;
	}

	public TypeWrapper getType() {
		return type;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
