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
public abstract class SingleValueStatement extends SimpleStatement {
	protected NodeContext value;

	public SingleValueStatement(AbstractNodeContext parent, NodeContext value, Token start, Token stop) {
		super(parent, start, stop);
		this.value = value;
	}

	public NodeContext getValue() {
		return value;
	}

	public void setValue(NodeContext value) {
		this.value = value;
	}
}
