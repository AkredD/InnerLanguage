/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.statements.DataStatement;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author anisimov_a_v
 */
public class DataDefinitionImpl extends DataStatement {
	//TODO revert with new Object View
	public DataDefinitionImpl(AbstractNodeContext parent, String typeName, String dataName, List<NodeContext> values) {
		super(parent, typeName, dataName, values);
	}

	@Override
	public String toString() {
		return type + " " + dataName + " = new " + type + " ("
				 + values.stream()
				  .map(value -> {
					  return value.toString();
				  })
				  .collect(Collectors.joining(", "))
				 + ")";
	}
}
