/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.ReturnImpl;
import cs.service.innerlanguage.translator.types.TypeWrapper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Zhigalowsky S.
 */
public class ReturnTypeInspector extends AbstractInspector{
	private static Set<Class> inspectingSubjects = new HashSet();
	private FunctionImpl actualFoo;

	static {
		Class[] classes = {ReturnImpl.class, FunctionImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public ReturnTypeInspector(InspectManager inspectManager) {
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
				TypeWrapper returnType = inspectManager.getVarValueType(((ReturnImpl) node).getValue(), ((ReturnImpl) node).getStart());
		if (!returnType.equals(actualFoo.getType())) {
			inspectManager.handleException(ExceptionMessage.WRONG_RETURN_TYPE,
													 ((ReturnImpl) node).getStart(),
													 actualFoo.getType().getClassName(),
													 returnType.getClassName());
		}
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		if (node instanceof FunctionImpl) {
			actualFoo = (FunctionImpl) node;
		}
	}

}
