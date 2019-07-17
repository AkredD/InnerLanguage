/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import cs.service.innerlanguage.translator.context.TypeImpl;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class SystemDefinitionImpl extends DataStatement {
	public SystemDefinitionImpl(AbstractNodeContext parent, TypeWrapper type, String dataName, Token start, Token stop) {
		super(parent, type, dataName, null, false, start, stop);
	}

	public void registerSystemTypeDefinition() {
		TypeImpl parentType = findType(super.parent);
		if (!parentType.getInjectedTypes().contains(type)) {
			parentType.getInjectedTypes().add(type);
		}
	}

	private TypeImpl findType(AbstractNodeContext parent) {
		if (parent instanceof TypeImpl) {
			return (TypeImpl) parent;
		}
		return findType(parent.getParent());
	}

	@Override
	public String toString() {
		return type + " " + dataName + " = system" + type.getClassName();
	}
}
