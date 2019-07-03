/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author root
 */
public abstract class DataStatement extends SimpleStatement{
    //TODO reverse with new Object View
    protected String type;
    protected String dataName;
    protected List<NodeContext> values;
    protected CallFunctionImpl callFunction;
    
    protected DataStatement(AbstractNodeContext parent, String typeName, String dataName, List<NodeContext> values, Token start, Token stop) {
        super(parent, start, stop);
        this.type = typeName;
        this.dataName = dataName;
        this.values = values;
        //TODO check for unic
    }

    public void setValues(List<NodeContext> values) {
        this.values = values;
    }
}
