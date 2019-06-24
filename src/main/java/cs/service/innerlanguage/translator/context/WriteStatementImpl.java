/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;

/**
 *
 * @author akredd
 */
public class WriteStatementImpl extends SimpleStatement{
    private List<NodeContext> values;
    
    public WriteStatementImpl(AbstractNodeContext parent, List<NodeContext> values) {
        super(parent);
        this.values = values;
    }

    public void setValues(List<NodeContext> values) {
        this.values = values;
    }
    
    
}
