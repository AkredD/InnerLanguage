/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.SimpleStatement;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public abstract class DataStatement extends SimpleStatement {
	//TODO reverse with new Object View
	protected TypeWrapper type;
	protected String dataName;
	protected List<NodeContext> values;
	protected boolean instance;

	protected DataStatement(AbstractNodeContext parent, TypeWrapper type, String dataName, List<NodeContext> values, Boolean instance, Token start, Token stop) {
		super(parent, start, stop);
		this.type = type;
		this.dataName = dataName;
		this.instance = instance;
		this.values = values;
		//TODO check for unic
	}

	public String getDataName() {
		return dataName;
	}

	public TypeWrapper getType() {
		return type;
	}

	public List<NodeContext> getValues() {
		return values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	public boolean isInstance() {
		return instance;
	}
}
