/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.parser.InnerParser;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class TypeImpl extends WrapperStatement {
	private String typeName;
	private List<DataStatement> staticBlock;
	private List<FunctionImpl> functions;

	public TypeImpl(AbstractNodeContext parent, String typeName, List<DataStatement> staticBlock, List<FunctionImpl> functions, Token start, Token stop) {
		super(parent, start, stop);
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

	@Override
	public String toString() {
		StringBuilder function = new StringBuilder();
		function.append("public class ").append(typeName).append(" {\n")
				  .append(staticBlock.stream()
							 .map(staticVar -> {
								 return "\tprivate " + staticVar.toString() + ";\n";
							 })
							 .collect(Collectors.joining()))
				  .append("\n")
				  .append(functions.stream()
							 .map(foo -> {
								 return "\t" + foo.toString().replaceAll("\n", "\n\t") + "\n";
							 })
							 .collect(Collectors.joining("\n")))
				  .append("}");
		return function.toString();
	}
}
