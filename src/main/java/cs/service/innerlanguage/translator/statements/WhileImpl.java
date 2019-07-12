/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.ExpressionContext;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class WhileImpl extends ExtendedStatement {
	private ExpressionContext whileCondition;

	public WhileImpl(AbstractNodeContext parent, List<StatementContext> innerStatements, ExpressionContext whileCondition, Token start, Token stop) {
		super(parent, innerStatements, start, stop);
		this.whileCondition = whileCondition;
	}

	public List<StatementContext> getInnerStatements() {
		return innerStatements;
	}

	public ExpressionContext getWhileCondition() {
		return whileCondition;
	}

	public void setWhileCondition(ExpressionContext whileCondition) {
		this.whileCondition = whileCondition;
	}

	@Override
	public String toString() {
		StringBuilder ifSt = new StringBuilder();
		ifSt.append("while (").append(whileCondition.toString()).append(") {\n")
				  .append(innerStatements.stream()
							 .map(st -> {
								 return "\t" + st.toString().replaceAll("\n", "\n\t") + ((ExtendedStatement.class.isAssignableFrom(st.getClass())) ? "" : ";") + "\n";
							 })
							 .collect(Collectors.joining()))
				  .append("}");
		return ifSt.toString();
	}
}
