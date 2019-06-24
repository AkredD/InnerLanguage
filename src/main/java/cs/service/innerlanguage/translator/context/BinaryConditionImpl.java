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
public class BinaryConditionImpl extends ExpressionContext{
    private NodeContext leftOperand;
    //TODO revert operator
    private String operator;
    private NodeContext rightOperand;
    
    public BinaryConditionImpl(AbstractNodeContext parent, NodeContext leftOperand, NodeContext rightOperand, String operator) {
        super(parent);
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }
    
}
