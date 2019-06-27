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
public class BinaryExpressionImpl extends ExpressionContext {
	private NodeContext leftOperand;
	//TODO revert operator
	private String operator;
	private NodeContext rightOperand;

	public BinaryExpressionImpl(AbstractNodeContext parent, NodeContext leftOperand, NodeContext rightOperand, String operator) {
		super(parent);
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

	//TODO add specific for java POWER operator
	@Override
	public String toString() {
		return leftOperand.toString() + " " + operator + " " + rightOperand;
	}
}
