/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.statements.StatementContext;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public abstract class ExtendedStatement extends StatementContext {
	protected List<StatementContext> innerStatements;

	public ExtendedStatement(AbstractNodeContext parent, List<StatementContext> innerStatements) {
		super(parent);
		this.innerStatements = innerStatements;
	}

	public void setInnerStatements(List<StatementContext> innerStatements) {
		this.innerStatements = innerStatements;
	}
}
