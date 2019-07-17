/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class ExpressionContext extends AbstractNodeContext {
	protected Boolean inScope;
	private NodeContext inner;

	protected ExpressionContext(AbstractNodeContext parent, Token start, Token stop) {
		super(parent, start, stop);
		this.inScope = false;
	}

	public ExpressionContext(AbstractNodeContext parent, Boolean inScope, NodeContext inner, Token start, Token stop) {
		super(parent, start, stop);
		this.inScope = inScope;
		this.inner = inner;
	}

	public Boolean getInScope() {
		return inScope;
	}

	public NodeContext getInner() {
		return inner;
	}

	public void setInner(NodeContext inner) {
		this.inner = inner;
	}

	@Override
	public String toString() {
		return ((inScope) ? "(" : "") + inner.toString() + ((inScope) ? ")" : "");
	}
}
