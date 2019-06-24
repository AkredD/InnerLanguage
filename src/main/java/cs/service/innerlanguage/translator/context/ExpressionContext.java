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
public class ExpressionContext extends AbstractNodeContext{
    protected Boolean inScope;
    private NodeContext inner;
    
    public ExpressionContext(AbstractNodeContext parent) {
        super(parent);
        this.inScope = false;
    }
    
    public ExpressionContext(AbstractNodeContext parent, Boolean inScope, NodeContext inner) {
        super(parent);
        this.inScope = inScope;
        this.inner = inner;
    }

    public void setInner(NodeContext inner) {
        this.inner = inner;
    }
    
    
}
