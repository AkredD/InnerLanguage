/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.statements;

import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.ExpressionContext;
import cs.service.innerlanguage.translator.statements.StatementContext;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class IfImpl extends ExtendedStatement {
	private ExpressionContext ifCondition;
	private List<StatementContext> mainBlockPart;
	private List<StatementContext> elseBlockPart;

	public IfImpl(AbstractNodeContext parent, List<StatementContext> innerStatements, ExpressionContext ifCondition, Token start, Token stop) {
		super(parent, innerStatements, start, stop);
		this.ifCondition = ifCondition;
	}

	public ExpressionContext getIfCondition() {
		return ifCondition;
	}

	public void setIfCondition(ExpressionContext ifCondition) {
		this.ifCondition = ifCondition;
	}

	public List<StatementContext> getMainBlockPart() {
		return mainBlockPart;
	}

	public void setMainBlockPart(List<StatementContext> mainBlockPart) {
		this.mainBlockPart = mainBlockPart;
	}

	public List<StatementContext> getElseBlockPart() {
		return elseBlockPart;
	}

	public void setElseBlockPart(List<StatementContext> elseBlockPart) {
		this.elseBlockPart = elseBlockPart;
	}

	@Override
	public String toString() {
		StringBuilder ifSt = new StringBuilder();
		ifSt.append("if (").append(ifCondition.toString()).append(") {\n")
				  .append((mainBlockPart == null)
							 ? "\n"
							 : mainBlockPart.stream()
							 .map(st -> {
								 return "\t" + st.toString().replaceAll("\n", "\n\t") + ((ExtendedStatement.class.isAssignableFrom(st.getClass())) ? "" : ";") + "\n";
							 })
							 .collect(Collectors.joining()))
				  .append("}")
				  .append((elseBlockPart == null)
							 ? "\n"
							 : " else {\n"
								+ elseBlockPart.stream()
							 .map(st -> {
								 return "\t" + st.toString().replaceAll("\n", "\n\t") + ((ExtendedStatement.class.isAssignableFrom(st.getClass())) ? "" : ";") + "\n";
							 })
							 .collect(Collectors.joining())
								+ "}");
		return ifSt.toString();
	}
}
