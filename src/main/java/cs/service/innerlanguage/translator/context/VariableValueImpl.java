/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

/**
 *
 * @author anisimov_a_v
 */
public class VariableValueImpl extends AbstractNodeContext {
	private String name;

	public VariableValueImpl(AbstractNodeContext parent, String name) {
		super(parent);
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
