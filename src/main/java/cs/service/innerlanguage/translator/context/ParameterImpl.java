/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.DataStatement;
import java.util.List;

/**
 *
 * @author anisimov_a_v
 */
public class ParameterImpl extends DataStatement {
	public ParameterImpl(AbstractNodeContext parent, String typeName, String dataName) {
		super(parent, typeName, dataName, null);
	}

	@Override
	public String toString() {
		return type + " " + dataName;
	}
}
