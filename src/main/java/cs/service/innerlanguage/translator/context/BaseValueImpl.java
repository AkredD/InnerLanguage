/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

/**
 *
 * @author anisimov_a_v
 */
public class BaseValueImpl implements NodeContext {
	private Object value;

	public BaseValueImpl(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}