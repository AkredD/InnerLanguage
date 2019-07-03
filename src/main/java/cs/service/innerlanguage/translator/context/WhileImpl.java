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
public class WhileImpl extends ExtendedStatement {
    private BinaryConditionImpl condition;
    
    public WhileImpl(AbstractNodeContext parent, List<StatementContext> innerStatements, Token start, Token stop) {
        super(parent, innerStatements, start, stop);
    }
    
}
