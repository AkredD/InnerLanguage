/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.VariableValueImpl;
import cs.service.innerlanguage.translator.statements.SimpleStatement;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class CallFunctionImpl extends SimpleStatement {
	private VariableValueImpl var;
	private String typeName;
	private String functionName;
	private List<NodeContext> values;

	public CallFunctionImpl(AbstractNodeContext parent, VariableValueImpl var, String typeName, String functionName, List<NodeContext> values, Token start, Token stop) {
		super(parent, start, stop);
		this.var = var;
		this.typeName = typeName;
		this.functionName = functionName;
		this.values = values;
	}

	public VariableValueImpl getVar() {
		return var;
	}

	public String getFunctionName() {
		return functionName;
	}

	public String getTypeName() {
		return typeName;
	}

	public List<NodeContext> getValues() {
		return values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return ((var == null) ? ((typeName == null) ? "" : typeName + ".") : var.toString() + ".")
				 + functionName + " ("
				 + values.stream()
				  .map(val -> {
					  return val.toString();
				  })
				  .collect(Collectors.joining(", "))
				 + ")";
	}
}
