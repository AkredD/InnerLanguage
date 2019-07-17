/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.EqImpl;
import cs.service.innerlanguage.translator.statements.MinusEqImpl;
import cs.service.innerlanguage.translator.statements.PlusEqImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class EqInspector extends AbstractInspector {
	private static Set<Class> inspectingSubjects = new HashSet();

	static {
		Class[] classes = {EqImpl.class, PlusEqImpl.class, MinusEqImpl.class};
		inspectingSubjects.addAll(Arrays.asList(classes));
	}

	public EqInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		return inspectingSubjects;
	}

	@Override
	public <T extends NodeContext> void inspect(T node) {
		if (node instanceof EqImpl) {
			if (!inspectManager.getVariableContext().containsKey(((EqImpl) node).getDataName())) {
				inspectManager.handleException(ExceptionMessage.VARIABLE_DOESNT_EXISTS, ((EqImpl) node).getDataName(), ((EqImpl) node).getStart());
			}
			TypeWrapper type = inspectManager.getVarValueType(((EqImpl) node).getValue(), ((EqImpl) node).getStart());
			TypeWrapper expectingType = inspectManager.getVariableContext().get(((EqImpl) node).getDataName()).getType();
			if (!type.equals(expectingType)) {
				inspectManager.handleException(ExceptionMessage.INCOMPATIBLE_TYPES, ((EqImpl) node).getStart(), type.getClassName(), expectingType.getClassName());
			}
		}
		if (node instanceof PlusEqImpl) {
			if (!inspectManager.getVariableContext().containsKey(((PlusEqImpl) node).getDataName())) {
				inspectManager.handleException(ExceptionMessage.VARIABLE_DOESNT_EXISTS, ((PlusEqImpl) node).getDataName(), ((PlusEqImpl) node).getStart());
			}
			TypeWrapper type = inspectManager.getVarValueType(((PlusEqImpl) node).getValue(), ((PlusEqImpl) node).getStart());
			TypeWrapper expectingType = inspectManager.getVariableContext().get(((PlusEqImpl) node).getDataName()).getType();
			if (!expectingType.isMemberOf(MainProvider.instance().getTypeByName("String"))
				 && !expectingType.isMemberOf(MainProvider.instance().getTypeByName("Number"))) {
				inspectManager.handleException(ExceptionMessage.OPERATOR_DOESNT_SUPPORT_TYPE, ((PlusEqImpl) node).getStart(), expectingType.getClassName());
			}
			if (!type.equals(expectingType)) {
				inspectManager.handleException(ExceptionMessage.INCOMPATIBLE_TYPES, ((PlusEqImpl) node).getStart(), type.getClassName(), expectingType.getClassName());
			}
		}
		if (node instanceof MinusEqImpl) {
			if (!inspectManager.getVariableContext().containsKey(((MinusEqImpl) node).getDataName())) {
				inspectManager.handleException(ExceptionMessage.VARIABLE_DOESNT_EXISTS, ((MinusEqImpl) node).getDataName(), ((MinusEqImpl) node).getStart());
			}
			TypeWrapper type = inspectManager.getVarValueType(((MinusEqImpl) node).getValue(), ((MinusEqImpl) node).getStart());
			TypeWrapper expectingType = inspectManager.getVariableContext().get(((MinusEqImpl) node).getDataName()).getType();
			if (!expectingType.isMemberOf(MainProvider.instance().getTypeByName("Number"))) {
				inspectManager.handleException(ExceptionMessage.OPERATOR_DOESNT_SUPPORT_TYPE, ((MinusEqImpl) node).getStart(), expectingType.getClassName());
			}
			if (!type.equals(expectingType)) {
				inspectManager.handleException(ExceptionMessage.INCOMPATIBLE_TYPES, ((MinusEqImpl) node).getStart(), type.getClassName(), expectingType.getClassName());
			}
		}
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
