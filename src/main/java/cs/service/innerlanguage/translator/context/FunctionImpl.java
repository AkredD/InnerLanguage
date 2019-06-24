/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import java.util.List;
import org.antlr.v4.runtime.misc.Pair;

/**
 *
 * @author root
 */
public class FunctionImpl extends WrapperStatement {
    private String functionName;
    private String typeName;
    private List<ParameterImpl> parameters;
    private List<StatementContext> innerStatements;
    
    public FunctionImpl(AbstractNodeContext parent, String typeName, String functionName, List<ParameterImpl> parameters, List<StatementContext> innerStatements) {
        super(parent);
        this.functionName = functionName;
        this.typeName = typeName;
        this.parameters = parameters;
        this.innerStatements = innerStatements;
    }

    public void setParameters(List<ParameterImpl> parameters) {
        this.parameters = parameters;
    }

    public void setInnerStatements(List<StatementContext> innerStatements) {
        this.innerStatements = innerStatements;
    }
    
    
}
