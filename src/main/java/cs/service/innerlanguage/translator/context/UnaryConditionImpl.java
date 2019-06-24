/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

/**
 *
 * @author root
 */
public class UnaryConditionImpl extends ExpressionContext{
    private NodeContext operand;
    //TODO revert operator
    private String operator;
    
    public UnaryConditionImpl(AbstractNodeContext parent, NodeContext operand, String operator) {
        super(parent);
        this.operand = operand;
        this.operator = operator;
    }

    public void setOperand(NodeContext operand) {
        this.operand = operand;
    }
    
    
    
}
