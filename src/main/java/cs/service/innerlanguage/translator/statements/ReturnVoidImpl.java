/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class ReturnVoidImpl extends ReturnImpl {
	public ReturnVoidImpl(AbstractNodeContext parent, NodeContext value, Token start, Token stop) {
		super(parent, value, start, stop);
	}

	@Override
	public String toString() {
		return "return";
	}
}
