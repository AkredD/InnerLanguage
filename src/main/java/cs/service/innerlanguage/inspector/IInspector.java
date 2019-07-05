/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.ExtendedStatement;
import java.util.Set;

/**
 *
 * @author anisimov_a_v
 */
public interface IInspector {
	public <T extends NodeContext> void inspect(T node);

	public <T extends NodeContext> void startInspecting(T node);

	public <T extends NodeContext> void endInspecting(T node);

	public Set<Class> getInspectingSubjects();
}
