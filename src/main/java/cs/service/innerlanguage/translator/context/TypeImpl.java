/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator.context;

import cs.service.innerlanguage.adapter.InnerAdapter;
import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.parser.InnerParser;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author anisimov_a_v
 */
public class TypeImpl extends WrapperStatement {
	private String typeName;
	private TypeWrapper parentType;
	private List<DataStatement> staticBlock;
	private List<FunctionImpl> functions;
	private final Set<TypeWrapper> injectedTypes;

	public TypeImpl(AbstractNodeContext parent, String typeName, TypeWrapper parentType, List<DataStatement> staticBlock, List<FunctionImpl> functions, Token start, Token stop) {
		super(parent, start, stop);
		this.typeName = typeName;
		this.staticBlock = staticBlock;
		this.functions = functions;
		this.parentType = parentType;
		this.injectedTypes = new HashSet();
	}

	public Set<TypeWrapper> getInjectedTypes() {
		return injectedTypes;
	}

	public TypeWrapper getParentType() {
		return parentType;
	}

	public List<DataStatement> getStaticBlock() {
		return staticBlock;
	}

	public void setStaticBlock(List<DataStatement> staticBlock) {
		this.staticBlock = staticBlock;
	}

	public List<FunctionImpl> getFunctions() {
		return functions;
	}

	public void setFunctions(List<FunctionImpl> functions) {
		this.functions = functions;
	}

	public String getTypeName() {
		return typeName;
	}

	@Override
	public String toString() {
		try {
			StringBuilder function = new StringBuilder();
			Class parentClass = Class.forName(parentType.getClassPath());
			function.append("package ").append(InnerAdapter.instance().getPackageFolder()).append(".").append(typeName).append(";")
					  .append("\n\n")
					  .append("public class ").append(typeName)
					  .append(parentClass.isInterface() ? " implements " : " extends ")
					  .append(parentClass.getName())
					  .append(" {\n")
					  .append(injectedTypes.stream()
								 .map(injectingType -> {
									 return "\t@javax.inject.Inject\n"
											  + "\tprivate " + injectingType + " system" + injectingType.getClassName() + ";\n";
								 })
								 .collect(Collectors.joining()))
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
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(TypeImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
}
