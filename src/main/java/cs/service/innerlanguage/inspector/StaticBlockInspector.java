/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.ExtendedStatement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public class StaticBlockInspector extends AbstractInspector {
	private static Set<Class> inspectingSubjects = new HashSet();

	public StaticBlockInspector(InspectManager inspectManager) {
		super(inspectManager);
	}

	@Override
	public <T extends NodeContext> void endInspecting(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Set<Class> getInspectingSubjects() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T extends NodeContext> void inspect(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T extends NodeContext> void startInspecting(T node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
