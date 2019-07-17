/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.inspector.util.BranchLinkedStatement;
import cs.service.innerlanguage.inspector.util.EndPointStatement;
import cs.service.innerlanguage.inspector.util.ITreeTraversal;
import cs.service.innerlanguage.inspector.util.TreeLinkedStatement;
import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.BreakImpl;
import cs.service.innerlanguage.translator.statements.ContinueImpl;
import cs.service.innerlanguage.translator.statements.IfImpl;
import cs.service.innerlanguage.translator.statements.SimpleStatement;
import cs.service.innerlanguage.translator.statements.WhileImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author anisimov_a_v
 */
public class ContinueBreakInspector extends AbstractInspector {
	private static Set<Class> inspectingSubjects = new HashSet();
	private Stack<Map<NodeContext, List<BranchLinkedStatement>>> whileStatementsStack = new Stack();

	static {
		Class[] classes = {WhileImpl.class, IfImpl.class, ContinueImpl.class, BreakImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public ContinueBreakInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		if (node instanceof WhileImpl) {
			Map<NodeContext, List<BranchLinkedStatement>> whileStatement = whileStatementsStack.pop();
			visitTraversalWrapper(whileStatement.get((WhileImpl) node).get(0));
		}
	}

	private boolean visitTraversalWrapper(BranchLinkedStatement branch) {
		for (int i = 0; i < branch.getLinkedStatements().size(); ++i) {
			ITreeTraversal traversal = branch.getLinkedStatements().get(i);
			if (traversal.getElement() instanceof BreakImpl || traversal.getElement() instanceof ContinueImpl) {
				if (branch.getInnerStatements().indexOf(traversal.getElement())
					 < branch.getInnerStatements().size() - 1) {
					inspectManager.handleException(ExceptionMessage.UNREACHABLE_STATEMENT,
															 ((AbstractNodeContext) branch.getInnerStatements()
															 .get(branch.getInnerStatements().indexOf(traversal.getElement()) + 1))
															 .getStart());
				} else {
					return true;
				}
			}
			if (traversal.getElement() instanceof WhileImpl) {
				visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getLeft());
			}
			if (traversal.getElement() instanceof IfImpl) {
				boolean left = visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getLeft());
				if (((TreeLinkedStatement) traversal).getRight() != null) {
					if (left && visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getRight())) {
						if (branch.getInnerStatements().indexOf(traversal.getElement())
							 < branch.getInnerStatements().size() - 1) {
							inspectManager.handleException(ExceptionMessage.UNREACHABLE_STATEMENT,
																	 ((AbstractNodeContext) branch.getInnerStatements()
																	 .get(branch.getInnerStatements().indexOf(traversal.getElement()) + 1))
																	 .getStart());
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		return inspectingSubjects;
	}

	@Override
	public <T extends NodeContext> void inspect(T node) {
		if (node instanceof ContinueImpl || node instanceof BreakImpl) {
			if (whileStatementsStack.isEmpty() || !whileStatementsStack.peek().containsKey(((SimpleStatement) node).getParent())) {
				inspectManager.handleException(ExceptionMessage.ENDPOINT_OUT_OF_CONTEXT, ((SimpleStatement) node).getStart(), ((SimpleStatement) node).toString());
			}
			BranchLinkedStatement parent = whileStatementsStack.peek().get(((SimpleStatement) node).getParent()).get(getLastIndex(((SimpleStatement) node).getParent()));
			EndPointStatement endPointStatement = new EndPointStatement(parent, (SimpleStatement) node);
			parent.addLinkedStatement(endPointStatement);
		}
	}

	private int getLastIndex(NodeContext node) {
		return whileStatementsStack.peek().get(node).size() - 1;
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		if (node instanceof WhileImpl) {
			Map<NodeContext, List<BranchLinkedStatement>> whileStatement = new HashMap();
			BranchLinkedStatement rootWhile = new BranchLinkedStatement(null, ((WhileImpl) node), ((WhileImpl) node).getInnerStatements());
			whileStatement.put(node, new ArrayList(Arrays.asList(rootWhile)));
			whileStatementsStack.push(whileStatement);
			return;
		}
		if (node instanceof IfImpl) {
			if (whileStatementsStack.size() > 0 && whileStatementsStack.peek().containsKey(node)) {
				TreeLinkedStatement parent = (TreeLinkedStatement) whileStatementsStack.peek().get(node).get(0).getParent();
				BranchLinkedStatement right = new BranchLinkedStatement(parent, (IfImpl) node, ((IfImpl) node).getElseBlockPart());
				parent.setRight(right);
				whileStatementsStack.peek().get(node).add(right);
				return;
			}
			if (((IfImpl) node).getParent() instanceof WhileImpl || (whileStatementsStack.size() > 0 && whileStatementsStack.peek().containsKey(node))) {
				BranchLinkedStatement parent = whileStatementsStack.peek().get(((IfImpl) node).getParent()).get(getLastIndex(((IfImpl) node).getParent()));
				TreeLinkedStatement ifSt = new TreeLinkedStatement(parent, (IfImpl) node);
				BranchLinkedStatement left = new BranchLinkedStatement(ifSt, (IfImpl) node, ((IfImpl) node).getMainBlockPart());
				ifSt.setLeft(left);
				parent.addLinkedStatement(ifSt);
				whileStatementsStack.peek().put(node, new ArrayList(Arrays.asList(left)));
			}
		}
	}
}
