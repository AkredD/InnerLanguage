/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.SingleValueStatement;

/**
 *
 * @author anisimov_a_v
 */
public class ReturnImpl extends SingleValueStatement {
	public ReturnImpl(AbstractNodeContext parent, NodeContext value) {
		super(parent, value);
	}

	@Override
	public String toString() {
		return "return " + value.toString();
	}
}
