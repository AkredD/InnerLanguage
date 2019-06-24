/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.parser.InnerParser;
import java.util.List;

/**
 *
 * @author root
 */
public class TypeImpl extends WrapperStatement{
    private String typeName;
    private List<DataStatement> staticBlock;
    private List<FunctionImpl> functions;
    
    public TypeImpl(AbstractNodeContext parent, String typeName, List<DataStatement> staticBlock, List<FunctionImpl> functions){
        super(parent);
        this.typeName = typeName;
        this.staticBlock = staticBlock;
        this.functions = functions;
    }

    public void setStaticBlock(List<DataStatement> staticBlock) {
        this.staticBlock = staticBlock;
    }

    public void setFunctions(List<FunctionImpl> functions) {
        this.functions = functions;
    }
    
    
}
