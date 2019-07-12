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
import cs.service.innerlanguage.translator.types.NullTypeWrapper;
import cs.service.innerlanguage.translator.types.TypeMethod;
import cs.service.innerlanguage.translator.types.TypeWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class CallFunctionImpl extends SimpleStatement {
	private VariableValueImpl var;
	private TypeWrapper type;
	private String functionName;
	private List<NodeContext> values;
	private TypeMethod method;

	public CallFunctionImpl(AbstractNodeContext parent, VariableValueImpl var, TypeWrapper type, String functionName, List<NodeContext> values, Token start, Token stop) {
		super(parent, start, stop);
		this.var = var;
		this.type = type;
		this.functionName = functionName;
		this.values = values;
	}

	public TypeMethod getMethod() {
		return method;
	}

	public void setMethod(TypeMethod method) {
		this.method = method;
	}

	public VariableValueImpl getVar() {
		return var;
	}

	public String getFunctionName() {
		return functionName;
	}

	public TypeWrapper getType() {
		return type;
	}

	public void setType(TypeWrapper type) {
		this.type = type;
	}

	public List<NodeContext> getValues() {
		return values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return ((method.isPrimitive()) ? "((" + type.getClassName() + ") " : "")
				 + ((var == null) ? ((type == null) ? "" : type + ".") : var.toString() + ".")
				 + functionName + "("
				 + values.stream()
				  .map(val -> {
					  return val.toString();
				  })
				  .collect(Collectors.joining(", "))
				 + ")"
				 + ((method.isPrimitive()) ? ")" : "");
	}
}
