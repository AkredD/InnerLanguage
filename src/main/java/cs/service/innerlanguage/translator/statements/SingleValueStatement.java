/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;

/**
 *
 * @author anisimov_a_v
 */
public abstract class SingleValueStatement extends SimpleStatement {
	protected NodeContext value;

	public SingleValueStatement(AbstractNodeContext parent, NodeContext value) {
		super(parent);
		this.value = value;
	}

	public void setValue(NodeContext value) {
		this.value = value;
	}
}
