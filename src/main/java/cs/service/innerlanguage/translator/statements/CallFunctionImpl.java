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
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class CallFunctionImpl extends SimpleStatement {
	private String dataName;
	private String functionName;
	private List<NodeContext> values;

	public CallFunctionImpl(AbstractNodeContext parent, String dataName, String functionName, List<NodeContext> values) {
		super(parent);
		this.dataName = dataName;
		this.functionName = functionName;
		this.values = values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return ((dataName == null) ? "" : dataName + ".")
				 + functionName + " ("
				 + values.stream()
				  .map(val -> {
					  return val.toString();
				  })
				  .collect(Collectors.joining(", "))
				 + ")";
	}
}
