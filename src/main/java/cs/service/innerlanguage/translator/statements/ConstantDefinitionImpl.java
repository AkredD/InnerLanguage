/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class ConstantDefinitionImpl extends DataStatement {
	public ConstantDefinitionImpl(AbstractNodeContext parent, TypeWrapper type, String dataName, List<NodeContext> values, Token start, Token stop) {
		super(parent, type, dataName, values, true, start, stop);
	}

	@Override
	public String toString() {
		return "final " + type + " " + dataName + " = new " + type + "("
				 + values.stream()
				  .map(value -> {
					  return value.toString();
				  })
				  .collect(Collectors.joining(", "))
				 + ")";
	}
}
