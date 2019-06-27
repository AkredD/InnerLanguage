/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class WriteStatementImpl extends SimpleStatement {
	private List<NodeContext> values;

	public WriteStatementImpl(AbstractNodeContext parent, List<NodeContext> values) {
		super(parent);
		this.values = values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "System.out.println("
				 + values.stream()
				  .map(value -> {
					  return value.toString();
				  })
				  .collect(Collectors.joining("\n"))
				 + ")";
	}
}
