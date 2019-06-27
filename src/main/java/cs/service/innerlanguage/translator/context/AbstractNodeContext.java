/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.DataStatement;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anisimov_a_v
 */
public abstract class AbstractNodeContext implements NodeContext {
	protected Map<String, DataStatement> contextVariables = new HashMap();
	protected Map<String, FunctionImpl> contextFunctions = new HashMap();
	protected Map<String, TypeImpl> contextTypes = new HashMap();
	protected AbstractNodeContext parent;

	protected AbstractNodeContext(AbstractNodeContext parent) {
		this.parent = parent;
		if (parent != null) {
			setParentMaps();
		}
	}

	private void setParentMaps() {
		this.contextTypes = parent.contextTypes;
		this.contextFunctions = parent.contextFunctions;
		this.contextVariables = new HashMap(parent.contextVariables);
	}

	protected AbstractNodeContext() {
		parent = null;
	}

	public void setParent(AbstractNodeContext parent) {
		this.parent = parent;
		if (parent != null) {
			setParentMaps();
		}
	}
}
