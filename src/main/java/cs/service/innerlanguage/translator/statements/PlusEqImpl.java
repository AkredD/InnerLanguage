/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.SingleValueStatement;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class PlusEqImpl extends SingleValueStatement {
	private String dataName;

	public PlusEqImpl(AbstractNodeContext parent, String dataName, NodeContext value, Token start, Token stop) {
		super(parent, value, start, stop);
		this.dataName = dataName;
	}

	public String getDataName() {
		return dataName;
	}

	@Override
	public String toString() {
		return dataName + " += " + value.toString();
	}
}
