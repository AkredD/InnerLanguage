/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.ExtendedStatement;
import cs.service.innerlanguage.translator.statements.StatementContext;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.misc.Pair;

/**
 *
 * @author anisimov_a_v
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

	@Override
	public String toString() {
		StringBuilder function = new StringBuilder();
		function.append("public ").append(typeName).append(" ").append(functionName)
				  .append("(")
				  .append(parameters.stream()
							 .map(param -> {
								 return param.toString();
							 })
							 .collect(Collectors.joining(", ")))
				  .append(") {\n")
				  .append(innerStatements.stream()
							 .map(st -> {
								 return "\t" + st.toString().replaceAll("\n", "\n\t") + ((ExtendedStatement.class.isAssignableFrom(st.getClass())) ? "" : ";") + "\n";
							 })
							 .collect(Collectors.joining()))
				  .append("}");
		return function.toString();
	}
}
