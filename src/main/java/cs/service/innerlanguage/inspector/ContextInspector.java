/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.ConstantDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.translator.statements.ExtendedStatement;
import cs.service.innerlanguage.translator.statements.IfImpl;
import cs.service.innerlanguage.translator.statements.SystemDefinitionImpl;
import cs.service.innerlanguage.translator.statements.WhileImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class ContextInspector extends AbstractInspector {
	private static final Set<Class> inspectingSubjects = new HashSet();
	private Set<String> actualLocalContext = new HashSet();
	private Stack<Set<String>> contextStack = new Stack();

	static {
		Class[] classes = {ConstantDefinitionImpl.class, DataDefinitionImpl.class, SystemDefinitionImpl.class,
								 IfImpl.class, WhileImpl.class, FunctionImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public ContextInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		return inspectingSubjects;
	}

	@Override
	public <T extends NodeContext> void inspect(T node) {
		DataStatement data = (DataStatement) node;
		if (inspectManager.getVariableContext().containsKey(data.getDataName())
			 || inspectManager.getFunctionContext().containsKey(data.getDataName())) {
			Token varDefinition = (inspectManager.getVariableContext().containsKey(data.getDataName()))
										 ? inspectManager.getVariableContext().get(data.getDataName()).getStart()
										 : (inspectManager.getFunctionContext().containsKey(data.getDataName()))
											? inspectManager.getFunctionContext().get(data.getDataName()).getStart()
											: null;
			inspectManager.handleException(ExceptionMessage.NAME_ALREADY_IN_USE, data.getStart(), data.getDataName(), varDefinition.getLine() + ":" + varDefinition.getStartIndex());
		}
		inspectManager.checkDataInitialization(data);
		inspectManager.getVariableContext().put(data.getDataName(), data);
		actualLocalContext.add(data.getDataName());
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		if (node instanceof FunctionImpl) {
			FunctionImpl foo = (FunctionImpl) node;
			if (foo.getParameters() != null) {
				foo.getParameters().forEach(param -> {
					inspect(param);
				});
			}
		}
		contextStack.push(actualLocalContext);
		actualLocalContext = new HashSet<>();
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		actualLocalContext.forEach(var -> {
			inspectManager.getVariableContext().remove(var);
		});
		actualLocalContext = contextStack.pop();
	}
}
