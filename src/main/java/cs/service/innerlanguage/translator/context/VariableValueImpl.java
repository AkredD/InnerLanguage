/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class VariableValueImpl extends AbstractNodeContext {
	private String name;

	public VariableValueImpl(AbstractNodeContext parent, String name, Token start, Token stop) {
		super(parent, start, stop);
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
