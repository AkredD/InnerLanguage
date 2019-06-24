/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

/**
 *
 * @author akredd
 */
public class ReturnImpl extends SingleValueStatement{
    
    public ReturnImpl(AbstractNodeContext parent, NodeContext value) {
        super(parent, value);
    }
    
}
