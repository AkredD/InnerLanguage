/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.statements.StatementContext;

/**
 *
 * @author anisimov_a_v
 */
public abstract class SimpleStatement extends StatementContext {
	protected SimpleStatement(AbstractNodeContext parent) {
		super(parent);
	}
}
