/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.translator.types.TypeWrapper;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class ParameterImpl extends DataStatement {
	public ParameterImpl(AbstractNodeContext parent, TypeWrapper type, String dataName, Token start, Token stop) {
		super(parent, type, dataName, null, start, stop);
	}

	@Override
	public String toString() {
		return type + " " + dataName;
	}
}
