/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector.util;

import cs.service.innerlanguage.translator.statements.StatementContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public class BranchLinkedStatement extends ITreeTraversal {
	private final List<StatementContext> innerStatements;
	private final List<ITreeTraversal> linkedStatements = new ArrayList();

	public BranchLinkedStatement(ITreeTraversal parent, StatementContext element, List<StatementContext> innerStatements) {
		super(parent, element);
		this.innerStatements = innerStatements;
	}

	public void addLinkedStatement(ITreeTraversal st) {
		this.linkedStatements.add(st);
	}

	public List<StatementContext> getInnerStatements() {
		return innerStatements;
	}

	public List<ITreeTraversal> getLinkedStatements() {
		return linkedStatements;
	}
}
