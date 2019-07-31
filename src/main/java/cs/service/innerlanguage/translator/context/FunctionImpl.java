/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.ExtendedStatement;
import cs.service.innerlanguage.translator.statements.StatementContext;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

/**
 *
 * @author anisimov_a_v
 */
public class FunctionImpl extends WrapperStatement {
	private String functionName;
	private TypeWrapper type;
	private List<ParameterImpl> parameters;
	private List<StatementContext> innerStatements;
	private boolean primitive;
	private boolean overriding;

	public FunctionImpl(AbstractNodeContext parent, TypeWrapper type, String functionName, List<ParameterImpl> parameters, List<StatementContext> innerStatements, Token start, Token stop) {
		super(parent, start, stop);
		this.functionName = functionName;
		this.type = type;
		this.parameters = parameters;
		this.innerStatements = innerStatements;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setOverriding(boolean overriding) {
		this.overriding = overriding;
	}

	public List<ParameterImpl> getParameters() {
		return parameters;
	}

	public void setParameters(List<ParameterImpl> parameters) {
		this.parameters = parameters;
	}

	public List<StatementContext> getInnerStatements() {
		return innerStatements;
	}

	public void setInnerStatements(List<StatementContext> innerStatements) {
		this.innerStatements = innerStatements;
	}

	public void setPrimitive(boolean primitive) {
		this.primitive = primitive;
	}

	public TypeWrapper getType() {
		return type;
	}

	@Override
	public String toString() {
		StringBuilder function = new StringBuilder();
		function.append((overriding) ? "@Override\n" : "");
		function.append("public ").append((primitive) ? transformWrapperToPrimitive(type.getClassName()) : type).append(" ").append(functionName)
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

	private String transformWrapperToPrimitive(String simpleClassName) {
		switch (simpleClassName) {
			case "Integer":
				return "int";
			case "Short":
				return "short";
			case "Long":
				return "long";
			case "Float":
				return "float";
			case "Double":
				return "double";
			case "Char":
				return "char";
			case "Byte":
				return "byte";
			case "Boolean":
				return "boolean";
			default:
				return "void";
		}
	}
}
