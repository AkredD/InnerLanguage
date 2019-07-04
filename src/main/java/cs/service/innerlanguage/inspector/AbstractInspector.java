/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.inspector;

/**
 *
 * @author anisimov_a_v
 */
public abstract class AbstractInspector implements IInspector {
	protected InspectManager inspectManager;

	protected AbstractInspector(InspectManager inspectManager) {
		this.inspectManager = inspectManager;
	}
}
