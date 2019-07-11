/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.CallFunctionImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class CallTypeInspector extends AbstractInspector {
	private static Set<Class> inspectingSubjects = new HashSet();

	static {
		Class[] classes = {CallFunctionImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public CallTypeInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		return;
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		return inspectingSubjects;
	}

	@Override
	public <T extends NodeContext> void inspect(T node) {
		if (node instanceof CallFunctionImpl) {
			inspectManager.getCallStatementReturnType((CallFunctionImpl) node);
		}
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
