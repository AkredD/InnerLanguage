/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.statements.SimpleStatement;

/**
 *
 * @author anisimov_a_v
 */
public class BreakImpl extends SimpleStatement {
	public BreakImpl(AbstractNodeContext parent) {
		super(parent);
	}

	@Override
	public String toString() {
		return "break";
	}
}
