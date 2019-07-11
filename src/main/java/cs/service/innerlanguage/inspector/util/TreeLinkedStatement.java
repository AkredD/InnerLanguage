/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector.util;

import cs.service.innerlanguage.inspector.util.BranchLinkedStatement;
import cs.service.innerlanguage.translator.statements.StatementContext;

/**
 *
 * @author anisimov_a_v
 */
public class TreeLinkedStatement extends ITreeTraversal {
	private ITreeTraversal left;
	private ITreeTraversal right;

	public TreeLinkedStatement(ITreeTraversal parent, StatementContext element) {
		super(parent, element);
	}

	public ITreeTraversal getLeft() {
		return left;
	}

	public void setLeft(ITreeTraversal left) {
		this.left = left;
	}

	public ITreeTraversal getRight() {
		return right;
	}

	public void setRight(ITreeTraversal right) {
		this.right = right;
	}
}
