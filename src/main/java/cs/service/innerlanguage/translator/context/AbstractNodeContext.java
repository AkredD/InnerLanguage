/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.DataStatement;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public abstract class AbstractNodeContext implements NodeContext {
	protected Map<String, DataStatement> contextVariables = new HashMap();
	protected Map<String, FunctionImpl> contextFunctions = new HashMap();
	protected Map<String, TypeImpl> contextTypes = new HashMap();
	protected AbstractNodeContext parent;
	protected Token start;
	protected Token stop;

	protected AbstractNodeContext(AbstractNodeContext parent, Token start, Token stop) {
		this.parent = parent;
		this.start = start;
		this.stop = stop;
		if (parent != null) {
			setParentMaps();
		}
	}

	public Token getStart() {
		return start;
	}

	public Token getStop() {
		return stop;
	}

	private void setParentMaps() {
		this.contextTypes = parent.contextTypes;
		this.contextFunctions = parent.contextFunctions;
		this.contextVariables = new HashMap(parent.contextVariables);
	}

	protected AbstractNodeContext() {
		parent = null;
	}

	public AbstractNodeContext getParent() {
		return parent;
	}

	public void setParent(AbstractNodeContext parent) {
		this.parent = parent;
		if (parent != null) {
			setParentMaps();
		}
	}

	public String getPosition() {
		return start.getLine() + ":" + start.getStartIndex() + " - " + stop.getLine() + ":" + stop.getStopIndex() + "\n"
				 + start.getText();
	}
}
