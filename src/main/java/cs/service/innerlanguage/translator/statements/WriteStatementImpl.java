/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class WriteStatementImpl extends SimpleStatement {
	private List<NodeContext> values = new ArrayList();

	public WriteStatementImpl(AbstractNodeContext parent, List<NodeContext> values, Token start, Token stop) {
		super(parent, start, stop);
		this.values = values;
	}

	public List<NodeContext> getValues() {
		return values;
	}

	public void setValues(List<NodeContext> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "System.out.println("
				 + values.stream()
				  .map(value -> {
					  return value.toString() + ".toString()";
				  })
				  .collect(Collectors.joining(" + \" \\n \" + "))
				 + ")";
	}
}
