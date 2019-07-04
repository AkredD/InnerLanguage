/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.types.TypeWrapper;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class VariableValueImpl extends AbstractNodeContext {
	private String name;
	private TypeWrapper castType;

	public VariableValueImpl(AbstractNodeContext parent, String name, TypeWrapper castType, Token start, Token stop) {
		super(parent, start, stop);
		this.name = name;
		this.castType = castType;
	}

	public TypeWrapper getCastType() {
		return castType;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ((castType == null) ? "" : "((" + castType + ") ") + name + ((castType == null) ? "" : ")");
	}
}
