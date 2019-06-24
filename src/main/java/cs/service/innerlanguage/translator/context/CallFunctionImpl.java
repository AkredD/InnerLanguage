/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;

/**
 *
 * @author root
 */
public class CallFunctionImpl extends SimpleStatement {
    private String typeName;
    private String functionName;
    private List<NodeContext> values;
    
    public CallFunctionImpl(AbstractNodeContext parent, String typeName, String functionName, List<NodeContext> values) {
        super(parent);
        this.typeName = typeName;
        this.functionName = functionName;
        this.values = values;
    }

    public void setValues(List<NodeContext> values) {
        this.values = values;
    }
}
