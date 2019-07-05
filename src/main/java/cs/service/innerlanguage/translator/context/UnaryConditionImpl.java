/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class UnaryConditionImpl extends ExpressionContext {
	private NodeContext operand;
	//TODO revert operator
	private String operator;

	public UnaryConditionImpl(AbstractNodeContext parent, NodeContext operand, String operator, Token start, Token stop) {
		super(parent, start, stop);
		this.operand = operand;
		this.operator = operator;
	}

	public NodeContext getOperand() {
		return operand;
	}

	public void setOperand(NodeContext operand) {
		this.operand = operand;
	}

	public String getOperator() {
		return operator;
	}

	@Override
	public String toString() {
		return "!" + operand.toString();
	}
}
