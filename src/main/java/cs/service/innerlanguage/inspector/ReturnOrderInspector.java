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
import cs.service.innerlanguage.translator.statements.ConstantDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataDefinitionImpl;
import cs.service.innerlanguage.translator.statements.IfImpl;
import cs.service.innerlanguage.translator.statements.ReturnImpl;
import cs.service.innerlanguage.translator.statements.SystemDefinitionImpl;
import cs.service.innerlanguage.translator.statements.WhileImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class ReturnOrderInspector extends AbstractInspector {
	private static Set<Class> inspectingSubjects = new HashSet();
	private Map<NodeContext, List<TraversalWrapper>> linkedStatement;

	static {
		Class[] classes = {ReturnImpl.class, IfImpl.class, WhileImpl.class, FunctionImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public ReturnOrderInspector(InspectManager inspectManager) {
		super(inspectManager);
		this.linkedStatement = new HashMap();
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		if (node instanceof FunctionImpl) {
			TraversalWrapper rootTraversal = linkedStatement.get(node).get(0);
			boolean returning = visitTraversalWrapper(rootTraversal.getTraversal(), (FunctionImpl) node);
			if (!returning) {
				inspectManager.handleException(ExceptionMessage.MISS_RETURN_STATEMENT, ((FunctionImpl) node).getStart(), ((FunctionImpl) node).getType().getClassName());
			}
			System.out.println(linkedStatement.size());
		}
	}

	private boolean visitTraversalWrapper(BranchLinkedStatement branch, FunctionImpl foo) {
		for (int i = 0; i < branch.getLinkedStatements().size(); ++i) {
			ITreeTraversal traversal = branch.getLinkedStatements().get(i);
			if (traversal.getElement() instanceof ReturnImpl) {
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
				visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getLeft(), foo);
			}
			if (traversal.getElement() instanceof IfImpl) {
				boolean left = visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getLeft(), foo);
				if (((TreeLinkedStatement) traversal).getRight() != null) {
					if (left && visitTraversalWrapper((BranchLinkedStatement) ((TreeLinkedStatement) traversal).getRight(), foo)) {
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
		AbstractNodeContext parent = ((AbstractNodeContext) node).getParent();
		BranchLinkedStatement parentTraversal = linkedStatement.get(parent).get(getLastIndex(parent)).getTraversal();
		if (node instanceof ReturnImpl) {
			EndPointStatement returnSt = new EndPointStatement(parentTraversal, (ReturnImpl) node);
			parentTraversal.addLinkedStatement(returnSt);
		}
	}

	private int getLastIndex(AbstractNodeContext parent) {
		return linkedStatement.get(parent).size() - 1;
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		if (node instanceof FunctionImpl) {
			linkedStatement.clear();
			BranchLinkedStatement root = new BranchLinkedStatement(null, null, ((FunctionImpl) node).getInnerStatements());
			linkedStatement.put(node, new ArrayList(Arrays.asList(new TraversalWrapper(root))));
			return;
		}
		AbstractNodeContext parent = ((AbstractNodeContext) node).getParent();
		BranchLinkedStatement parentTraversal = linkedStatement.get(parent).get(getLastIndex(parent)).getTraversal();
		if (node instanceof WhileImpl) {
			TreeLinkedStatement root = new TreeLinkedStatement(parentTraversal, (WhileImpl) node);
			BranchLinkedStatement left = new BranchLinkedStatement(root, (WhileImpl) node, ((WhileImpl) node).getInnerStatements());
			root.setLeft(left);
			linkedStatement.put(node, new ArrayList(Arrays.asList(new TraversalWrapper(left))));
			parentTraversal.addLinkedStatement(root);
		}
		if (node instanceof IfImpl) {
			if (!linkedStatement.containsKey(node)) {
				TreeLinkedStatement root = new TreeLinkedStatement(parentTraversal, (IfImpl) node);
				BranchLinkedStatement left = new BranchLinkedStatement(root, (IfImpl) node, ((IfImpl) node).getMainBlockPart());
				root.setLeft(left);
				linkedStatement.put(node, new ArrayList(Arrays.asList(new TraversalWrapper(left))));
				parentTraversal.addLinkedStatement(root);
			} else {
				TreeLinkedStatement root = (TreeLinkedStatement) parentTraversal.getLinkedStatements().get(parentTraversal.getLinkedStatements().size() - 1);
				BranchLinkedStatement right = new BranchLinkedStatement(root, (IfImpl) node, ((IfImpl) node).getElseBlockPart());
				root.setRight(right);
				linkedStatement.get(node).add(new TraversalWrapper(right));
			}
		}
	}
	private class TraversalWrapper {
		private final BranchLinkedStatement traversal;
		private boolean garanteedExit;
		private boolean visited;

		public TraversalWrapper(BranchLinkedStatement traversal) {
			this.traversal = traversal;
		}

		public Boolean getGaranteedExit() {
			return garanteedExit;
		}

		public void setGaranteedExit(Boolean garanteedExit) {
			this.garanteedExit = garanteedExit;
		}

		public BranchLinkedStatement getTraversal() {
			return traversal;
		}

		public boolean getVisited() {
			return visited;
		}

		public void setVisited(boolean visited) {
			this.visited = visited;
		}
	}
}
