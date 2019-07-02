/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.SimpleStatement;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public abstract class DataStatement extends SimpleStatement {
	//TODO reverse with new Object View
	protected String type;
	protected String dataName;
	protected List<NodeContext> values;
	protected CallFunctionImpl callFunction;

	protected DataStatement(AbstractNodeContext parent, String typeName, String dataName, List<NodeContext> values) {
		super(parent);
		this.type = typeName;
		this.dataName = dataName;
		this.values = values;
		//TODO check for unic
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}
}