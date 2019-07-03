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
public class BinaryConditionImpl extends ExpressionContext {
	private NodeContext leftOperand;
	//TODO revert operator
	private String operator;
	private NodeContext rightOperand;

	public BinaryConditionImpl(AbstractNodeContext parent, NodeContext leftOperand, NodeContext rightOperand, String operator, Token start, Token stop) {
		super(parent, start, stop);
		this.leftOperand = leftOperand;
		this.operator = operator;
		this.rightOperand = rightOperand;
	}

	public void setLeftOperand(NodeContext leftOperand) {
		this.leftOperand = leftOperand;
	}

	public void setRightOperand(NodeContext rightOperand) {
		this.rightOperand = rightOperand;
	}

	@Override
	public String toString() {
		return leftOperand.toString() + " " + convertBoolOperator(operator) + " " + rightOperand;
	}

	private String convertBoolOperator(String operator) {
		switch (operator) {
			case "AND":
			case "and":
				return "&&";
			case "OR":
			case "or":
				return "||";
			case "==":
				return "==";
			default:
				System.out.println("Cannot resolve boolean operator - " + operator);
				return null;
		}
	}
}
