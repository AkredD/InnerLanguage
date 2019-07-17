/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs.service.innerlanguage.translator;

import cs.service.innerlanguage.parser.InnerParser;
import cs.service.innerlanguage.parser.exceptions.ExceptionMessage;
import cs.service.innerlanguage.parser.exceptions.ExecutionException;
import cs.service.innerlanguage.parser.exceptions.InnerException;
import cs.service.innerlanguage.provider.MainProvider;
import cs.service.innerlanguage.translator.context.AbstractNodeContext;
import cs.service.innerlanguage.translator.context.BaseValueImpl;
import cs.service.innerlanguage.translator.context.BinaryBoolExprImpl;
import cs.service.innerlanguage.translator.context.BinaryConditionImpl;
import cs.service.innerlanguage.translator.context.BinaryExpressionImpl;
import cs.service.innerlanguage.translator.statements.BreakImpl;
import cs.service.innerlanguage.translator.statements.CallFunctionImpl;
import cs.service.innerlanguage.translator.statements.ConstantDefinitionImpl;
import cs.service.innerlanguage.translator.statements.ContinueImpl;
import cs.service.innerlanguage.translator.statements.DataDefinitionImpl;
import cs.service.innerlanguage.translator.statements.DataStatement;
import cs.service.innerlanguage.translator.statements.EqImpl;
import cs.service.innerlanguage.translator.context.ExpressionContext;
import cs.service.innerlanguage.translator.context.FunctionImpl;
import cs.service.innerlanguage.translator.statements.IfImpl;
import cs.service.innerlanguage.translator.statements.MinusEqImpl;
import cs.service.innerlanguage.translator.context.NodeContext;
import cs.service.innerlanguage.translator.context.NullImpl;
import cs.service.innerlanguage.translator.context.ParameterImpl;
import cs.service.innerlanguage.translator.statements.PlusEqImpl;
import cs.service.innerlanguage.translator.statements.ReturnImpl;
import cs.service.innerlanguage.translator.statements.StatementContext;
import cs.service.innerlanguage.translator.statements.SystemDefinitionImpl;
import cs.service.innerlanguage.translator.context.TypeImpl;
import cs.service.innerlanguage.translator.context.UnaryConditionImpl;
import cs.service.innerlanguage.translator.context.UnaryExpressionImpl;
import cs.service.innerlanguage.translator.context.VariableValueImpl;
import cs.service.innerlanguage.translator.statements.WhileImpl;
import cs.service.innerlanguage.translator.statements.WriteStatementImpl;
import cs.service.innerlanguage.provider.types.TypeWrapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author anisimov_a_v
 */
public class InnerVisitorImpl extends InnerBaseVisitor<NodeContext> {
	/**
	 * Start method
	 * Get the main object for next translation
	 *
	 * @param ctx
	 *
	 * @return the value of NodeContext
	 */
	@Override
	public NodeContext visitInner(InnerParser.InnerContext ctx) {
		return ctx.type().accept(this); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Get the value of DataStatement
	 *
	 * @param ctx
	 *
	 * @return the value of DataStatement
	 */
	@Override
	public NodeContext visitVarDefinition(InnerParser.VarDefinitionContext ctx) {
		if (ctx.constantDef() != null) {
			return ctx.constantDef().accept(this);
		}
		if (ctx.systemDef() != null) {
			return ctx.systemDef().accept(this);
		}
		if (ctx.dataDef() != null) {
			return ctx.dataDef().accept(this);
		}
		return null;
	}

	/**
	 * Get the value of System variable definition
	 *
	 * @param ctx
	 *
	 * @return the value of SystemDefinitionImpl
	 */
	@Override
	public NodeContext visitSystemDef(InnerParser.SystemDefContext ctx) {
		checkTypeExistence(ctx.TYPENAME(), ctx.TYPENAME().getText());
		return new SystemDefinitionImpl(null, MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME().getText()), ctx.DATANAME().getText(), ctx.start, ctx.stop);
	}

	/**
	 * Get the value of constant variable definition
	 *
	 * @param ctx
	 *
	 * @return the value of ConstantDefinitionImpl
	 */
	@Override
	public NodeContext visitConstantDef(InnerParser.ConstantDefContext ctx) {
		checkTypeExistence(ctx, ctx.TYPENAME().getText());
		List<NodeContext> values = null;
		ConstantDefinitionImpl definition = new ConstantDefinitionImpl(null, MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME().getText()), ctx.DATANAME().getText(), null, ctx.start, ctx.stop);
		if (ctx.varValue() != null) {
			values = ctx.varValue().stream()
					  .map(valueCtx -> {
						  NodeContext node = valueCtx.accept(this);
						  if (AbstractNodeContext.class.isAssignableFrom(node.getClass())) {
							  ((AbstractNodeContext) node).setParent(definition);
						  }
						  return node;
					  })
					  .collect(Collectors.toList());
		}
		definition.setValues(values);
		return definition;
	}

	/**
	 * Get the value of variable definition
	 *
	 * @param ctx
	 *
	 * @return the value of ConstantDefinitionImpl
	 */
	@Override
	public NodeContext visitDataDef(InnerParser.DataDefContext ctx) {
		checkTypeExistence(ctx, ctx.TYPENAME().getText());
		List<NodeContext> values = null;
		//(ctx.VALUES() != null) meanes that it is instance of Type
		DataDefinitionImpl definition = new DataDefinitionImpl(null, MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME().getText()), ctx.DATANAME().getText(), null, (ctx.VALUES() != null), ctx.start, ctx.stop);
		if (ctx.varValue() != null) {
			values = ctx.varValue().stream()
					  .map(valueCtx -> {
						  NodeContext node = valueCtx.accept(this);
						  if (AbstractNodeContext.class.isAssignableFrom(node.getClass())) {
							  ((AbstractNodeContext) node).setParent(definition);
						  }
						  return node;
					  })
					  .collect(Collectors.toList());
		}
		definition.setValues(values);
		return definition;
	}

	/**
	 * Get the value of new type
	 *
	 * @param ctx
	 *
	 * @return the value of TypeImpl
	 */
	@Override
	public NodeContext visitType(InnerParser.TypeContext ctx) {
		List<DataStatement> staticBlock = null;
		List<FunctionImpl> functions = null;
		TypeImpl type = new TypeImpl(null, ctx.TYPENAME().getText(), null, null, ctx.start, ctx.stop);
		if (ctx.staticBlock() != null) {
			staticBlock = ctx.staticBlock().varDefinition()
					  .stream()
					  .map(varCtx -> {
						  DataStatement dataStatement = (DataStatement) varCtx.accept(this);
						  dataStatement.setParent(type);
						  return dataStatement;
					  })
					  .collect(Collectors.toList());
		}
		if (ctx.function() != null) {
			functions = ctx.function().stream()
					  .map(fooCtx -> {
						  FunctionImpl foo = (FunctionImpl) fooCtx.accept(this);
						  foo.setParent(type);
						  return foo;
					  })
					  .collect(Collectors.toList());
		}
		type.setStaticBlock(staticBlock);
		type.setFunctions(functions);
		return type;
	}

	/**
	 * Get the value of type static block
	 * do not usage
	 *
	 * @param ctx
	 *
	 * @return the value of data definition
	 */
	@Deprecated
	@Override
	public NodeContext visitStaticBlock(InnerParser.StaticBlockContext ctx) {
		return super.visitStaticBlock(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Get the value of type function
	 *
	 * @param ctx
	 *
	 * @return the value of FunctionImpl
	 */
	@Override
	public NodeContext visitFunction(InnerParser.FunctionContext ctx) {
		// TYPENAME(0) - function type name, DATANAME(0) - function name
		checkTypeExistence(ctx.TYPENAME(0), ctx.TYPENAME(0).getText());
		FunctionImpl foo = new FunctionImpl(null, MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME(0).getText()), ctx.DATANAME(0).getText(), null, null, ctx.start, ctx.stop);
		List<ParameterImpl> parameters = new ArrayList();
		List<StatementContext> statements = null;
		for (int i = 1; i < ctx.TYPENAME().size(); ++i) {
			checkTypeExistence(ctx.TYPENAME(i), ctx.TYPENAME(i).getText());
			parameters.add(new ParameterImpl(foo, MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME(i).getText()), ctx.DATANAME(i).getText(), ctx.start, ctx.stop));
		}
		if (ctx.statement() != null) {
			statements = ctx.statement().stream()
					  .map(stCtx -> {
						  StatementContext st = (StatementContext) stCtx.accept(this);
						  st.setParent(foo);
						  return st;
					  })
					  .collect(Collectors.toList());
		}
		foo.setParameters(parameters);
		foo.setInnerStatements(statements);
		return foo;
	}

	/**
	 * Get the value of type statement
	 * do not usage
	 *
	 * @param ctx
	 *
	 * @return the value of StatementContext
	 */
	@Deprecated
	@Override
	public NodeContext visitStatement(InnerParser.StatementContext ctx) {
		return super.visitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Get the value of type function
	 *
	 * @param ctx
	 *
	 * @return the value of FunctionImpl
	 */
	@Override
	public NodeContext visitWriteStatement(InnerParser.WriteStatementContext ctx) {
		WriteStatementImpl st = new WriteStatementImpl(null, null, ctx.start, ctx.stop);
		List<NodeContext> values = null;
		if (ctx.varValue() != null) {
			values = ctx.varValue().stream()
					  .map(valueCtx -> {
						  NodeContext node = valueCtx.accept(this);
						  if (AbstractNodeContext.class.isAssignableFrom(node.getClass())) {
							  ((AbstractNodeContext) node).setParent(st);
						  }
						  return node;
					  })
					  .collect(Collectors.toList());
		}
		st.setValues(values);
		return st;
	}

	/**
	 * Get the value of call function statement
	 *
	 * @param ctx
	 *
	 * @return the value of CallFunctionImpl
	 */
	@Override
	public NodeContext visitCallStatement(InnerParser.CallStatementContext ctx) {
		TypeWrapper type = null;
		VariableValueImpl var = null;
		//call inner type function
		if (ctx.TYPENAME() == null && ctx.dataname() == null) {
			//do nothing
		} else {
			//call object method
			if (ctx.dataname() != null) {
				TypeWrapper castType = null;
				if (ctx.dataname().TYPENAME() != null) {
					checkTypeExistence(ctx.dataname(), ctx.dataname().TYPENAME().getText());
					castType = MainProvider.instance().getBasicTypesByName().get(ctx.dataname().TYPENAME().getText());
				}
				var = new VariableValueImpl(null, ctx.dataname().DATANAME().getText(), castType, ctx.start, ctx.stop);
			}
			//call type static method
			if (ctx.TYPENAME() != null) {
				checkTypeExistence(ctx.TYPENAME(), ctx.TYPENAME().getText());
				type = MainProvider.instance().getBasicTypesByName().get(ctx.TYPENAME().getText());
			}
		}
		CallFunctionImpl callFoo = new CallFunctionImpl(null, var, type, ctx.DATANAME().getText(), null, ctx.start, ctx.stop);
		List<NodeContext> values = null;
		if (ctx.varValue() != null) {
			values = ctx.varValue().stream()
					  .map(valueCtx -> {
						  NodeContext node = valueCtx.accept(this);
						  if (AbstractNodeContext.class.isAssignableFrom(node.getClass())) {
							  ((AbstractNodeContext) node).setParent(callFoo);
						  }
						  return node;
					  })
					  .collect(Collectors.toList());
		}
		callFoo.setValues(values);
		return callFoo;
	}

	/**
	 * Get the value of simple break command
	 *
	 * @param ctx
	 *
	 * @return the value of BreakImpl
	 */
	@Override
	public NodeContext visitBreakStatement(InnerParser.BreakStatementContext ctx) {
		return new BreakImpl(null, ctx.start, ctx.stop);
	}

	/**
	 * Get the value of simple continue command
	 *
	 * @param ctx
	 *
	 * @return the value of ContinueImpl
	 */
	@Override
	public NodeContext visitContinueStatement(InnerParser.ContinueStatementContext ctx) {
		return new ContinueImpl(null, ctx.start, ctx.stop);
	}

	/**
	 * Get the value of simple return command with attribute
	 *
	 * @param ctx
	 *
	 * @return the value of ReturnImpl
	 */
	@Override
	public NodeContext visitReturnStatement(InnerParser.ReturnStatementContext ctx) {
		ReturnImpl returnStatement = new ReturnImpl(null, null, ctx.start, ctx.stop);
		NodeContext value = ctx.varValue().accept(this);
		if (AbstractNodeContext.class.isAssignableFrom(value.getClass())) {
			((AbstractNodeContext) value).setParent(returnStatement);
		}
		returnStatement.setValue(value);
		return returnStatement;
	}

	/**
	 * Get the value of simple -= statement
	 *
	 * @param ctx
	 *
	 * @return the value of MinusEqImpl
	 */
	@Override
	public NodeContext visitMinusEqStatement(InnerParser.MinusEqStatementContext ctx) {
		MinusEqImpl minusStatement = new MinusEqImpl(null, ctx.DATANAME().getText(), null, ctx.start, ctx.stop);
		NodeContext value = ctx.varValue().accept(this);
		if (AbstractNodeContext.class.isAssignableFrom(value.getClass())) {
			((AbstractNodeContext) value).setParent(minusStatement);
		}
		minusStatement.setValue(value);
		return minusStatement;
	}

	/**
	 * Get the value of simple += statement
	 *
	 * @param ctx
	 *
	 * @return the value of PlusEqImpl
	 */
	@Override
	public NodeContext visitPlusEqStatement(InnerParser.PlusEqStatementContext ctx) {
		PlusEqImpl plusEqStatement = new PlusEqImpl(null, ctx.DATANAME().getText(), null, ctx.start, ctx.stop);
		NodeContext value = ctx.varValue().accept(this);
		if (AbstractNodeContext.class.isAssignableFrom(value.getClass())) {
			((AbstractNodeContext) value).setParent(plusEqStatement);
		}
		plusEqStatement.setValue(value);
		return plusEqStatement;
	}

	/**
	 * Get the value of simple = statement
	 *
	 * @param ctx
	 *
	 * @return the value of EqImpl
	 */
	@Override
	public NodeContext visitEqStatement(InnerParser.EqStatementContext ctx) {
		EqImpl eqStatement = new EqImpl(null, ctx.DATANAME().getText(), null, ctx.start, ctx.stop);
		NodeContext value = ctx.varValue().accept(this);
		if (AbstractNodeContext.class
				  .isAssignableFrom(value.getClass())) {
			((AbstractNodeContext) value).setParent(eqStatement);
		}
		eqStatement.setValue(value);
		return eqStatement;
	}

	/**
	 * Get the value of while statement
	 *
	 * @param ctx
	 *
	 * @return the value of WhileImpl
	 */
	@Override
	public NodeContext visitWhileStatement(InnerParser.WhileStatementContext ctx) {
		ExpressionContext expCtx = (ExpressionContext) ctx.condition().accept(this);
		WhileImpl whileSt = new WhileImpl(null, null, expCtx, ctx.start, ctx.stop);
		whileSt.setInnerStatements(ctx.statement().stream()
				  .map(stCtx -> {
					  StatementContext st = (StatementContext) stCtx.accept(this);
					  st.setParent(whileSt);
					  return st;
				  })
				  .collect(Collectors.toList())
		);
		expCtx.setParent(whileSt);
		return whileSt;
	}

	/**
	 * Get the value of if statement
	 *
	 * @param ctx
	 *
	 * @return the value of WhileImpl
	 */
	@Override
	public NodeContext visitIfStatement(InnerParser.IfStatementContext ctx) {
		ExpressionContext expCtx = (ExpressionContext) ctx.condition().accept(this);
		List<StatementContext> mainBlockContexts = new ArrayList();
		List<StatementContext> elseBlockContexts = new ArrayList();
		IfImpl ifSt = new IfImpl(null, null, expCtx, ctx.start, ctx.stop);
		expCtx.setParent(ifSt);
		Integer startMainBlock = 0;
		Integer startElseBlock = 0;
		for (ParseTree node : ctx.children) {
			if (startMainBlock == 1 && ParserRuleContext.class.isAssignableFrom(node.getClass())) {
				StatementContext stCtx = (StatementContext) node.accept(this);
				stCtx.setParent(ifSt);
				mainBlockContexts.add(stCtx);
			}
			if (startElseBlock == 1 && ParserRuleContext.class.isAssignableFrom(node.getClass())) {
				StatementContext stCtx = (StatementContext) node.accept(this);
				stCtx.setParent(ifSt);
				elseBlockContexts.add(stCtx);
			}
			if (node instanceof TerminalNodeImpl) {
				if (((TerminalNodeImpl) node).symbol.getType() == 10) {
					if (startMainBlock != 2) {
						startMainBlock++;
					} else {
						startElseBlock++;
					}
				}
			}
		}
		ifSt.setMainBlockPart(mainBlockContexts);
		ifSt.setElseBlockPart(elseBlockContexts);
		return ifSt;
	}

	/**
	 * Get the value of expression
	 *
	 * @param ctx
	 *
	 * @return the value of NodeContext (ExpressionContext || UnaryExpressionImpl ||
	 * BinaryExpressionImpl || varValue)
	 */
	@Override
	public NodeContext visitExpression(InnerParser.ExpressionContext ctx) throws InnerException {
		if (ctx.OPENBRACKET() != null) {
			ExpressionContext expCtx = new ExpressionContext(null, true, null, ctx.start, ctx.stop);
			NodeContext inner = ctx.expression().get(0).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())) {
				((AbstractNodeContext) inner).setParent(expCtx);
			}
			expCtx.setInner(inner);
			return expCtx;
		}
		if (ctx.UNARYOPERATOR() != null) {
			UnaryExpressionImpl unary = new UnaryExpressionImpl(null, null, ctx.UNARYOPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext inner = ctx.expression().get(0).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())) {
				((AbstractNodeContext) inner).setParent(unary);
			}
			unary.setOperand(inner);
			return unary;
		}
		if (ctx.expression().size() == 2) {
			BinaryExpressionImpl expCtx = new BinaryExpressionImpl(null, null, null, ctx.OPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext left = (NodeContext) ctx.expression().get(0).accept(this);
			NodeContext right = (NodeContext) ctx.expression().get(1).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(left.getClass())) {
				((AbstractNodeContext) left).setParent(expCtx);
			}
			if (AbstractNodeContext.class.isAssignableFrom(right.getClass())) {
				((AbstractNodeContext) right).setParent(expCtx);
			}
			expCtx.setLeftOperand(left);
			expCtx.setRightOperand(right);
			return expCtx;
		}
		if (ctx.DQ_STRING() != null) {
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("String"), ctx.DQ_STRING().getText());
		}
		if (ctx.NUMBER() != null) {
			Number number = NumberUtils.createNumber(ctx.NUMBER().getText());
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get(number.getClass().getSimpleName()), number);
		}
		if (ctx.DATE() != null) {
			try {
				return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("Date"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ctx.DATE().getText()));
			} catch (ParseException ex) {
				handleException(ExceptionMessage.CANT_PARSE_DATE, ctx.DATE().getText(), ctx.getStart());
			}
		}
		if (ctx.dataname() != null) {
			TypeWrapper castType = null;
			if (ctx.dataname().TYPENAME() != null) {
				checkTypeExistence(ctx.dataname(), ctx.dataname().TYPENAME().getText());
				castType = MainProvider.instance().getBasicTypesByName().get(ctx.dataname().TYPENAME().getText());
			}
			return new VariableValueImpl(null, ctx.dataname().DATANAME().getText(), castType, ctx.start, ctx.stop);
		}
		if (ctx.callStatement() != null) {
			return ctx.callStatement().accept(this);
		}
		System.out.println("smth wrong in expr");
		return super.visitExpression(ctx);
	}

	/**
	 * Get the value of boolean expression
	 *
	 * @param ctx
	 *
	 * @return the value of NodeContext (ExpressionContext || BinaryBoolExprImpl || varValue)
	 */
	@Override
	public NodeContext visitBoolExpression(InnerParser.BoolExpressionContext ctx) throws InnerException {
		if (ctx.OPENBRACKET() != null) {
			ExpressionContext expCtx = new ExpressionContext(null, true, null, ctx.start, ctx.stop);
			NodeContext inner = ctx.boolExpression().accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())) {
				((AbstractNodeContext) inner).setParent(expCtx);
			}
			expCtx.setInner(inner);
			return expCtx;
		}
		if (ctx.expression() != null && !ctx.expression().isEmpty()) {
			BinaryBoolExprImpl expCtx = new BinaryBoolExprImpl(null, null, null, ctx.CONDITIONOPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext left = (NodeContext) ctx.expression().get(0).accept(this);
			NodeContext right = (NodeContext) ctx.expression().get(1).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(left.getClass())) {
				((AbstractNodeContext) left).setParent(expCtx);
			}
			if (AbstractNodeContext.class.isAssignableFrom(right.getClass())) {
				((AbstractNodeContext) right).setParent(expCtx);
			}
			expCtx.setLeftOperand(left);
			expCtx.setRightOperand(right);
			return expCtx;
		}
		if (ctx.DQ_STRING() != null) {
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("String"), ctx.DQ_STRING().getText());
		}
		if (ctx.NUMBER() != null) {
			Number number = NumberUtils.createNumber(ctx.NUMBER().getText());
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get(number.getClass().getSimpleName()), number);
		}
		if (ctx.DATE() != null) {
			try {
				return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("Date"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ctx.DATE().getText()));
			} catch (ParseException ex) {
				handleException(ExceptionMessage.CANT_PARSE_DATE, ctx.DATE().getText(), ctx.getStart());
			}
		}
		if (ctx.dataname() != null) {
			TypeWrapper castType = null;
			if (ctx.dataname().TYPENAME() != null) {
				checkTypeExistence(ctx.dataname(), ctx.dataname().TYPENAME().getText());
				castType = MainProvider.instance().getBasicTypesByName().get(ctx.dataname().TYPENAME().getText());
			}
			return new VariableValueImpl(null, ctx.dataname().DATANAME().getText(), castType, ctx.start, ctx.stop);
		}
		if (ctx.callStatement() != null) {
			return ctx.callStatement().accept(this);
		}
		System.out.println("smth wrong in bool expr");
		return super.visitBoolExpression(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Get the value of variable
	 *
	 * @param ctx
	 *
	 * @return the value of NodeContext (BaseValueImpl || VariableValueImpl ||
	 * callStatement || expression || condition)
	 */
	@Override
	public NodeContext visitCondition(InnerParser.ConditionContext ctx) {
		if (ctx.OPENBRACKET() != null) {
			ExpressionContext expCtx = new ExpressionContext(null, true, null, ctx.start, ctx.stop);
			NodeContext inner = ctx.condition().get(0).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())) {
				((AbstractNodeContext) inner).setParent(expCtx);
			}
			expCtx.setInner(inner);
			return expCtx;
		}
		if (ctx.CONDITIONUNARYPERATOR() != null) {
			UnaryConditionImpl unary = new UnaryConditionImpl(null, null, ctx.CONDITIONUNARYPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext inner = ctx.condition().get(0).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(inner.getClass())) {
				((AbstractNodeContext) inner).setParent(unary);
			}
			unary.setOperand(inner);
			return unary;
		}
		if (ctx.condition() != null && ctx.condition().size() == 2) {
			BinaryConditionImpl expCtx = new BinaryConditionImpl(null, null, null, ctx.CONDITIONBOOLOPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext left = (NodeContext) ctx.condition().get(0).accept(this);
			NodeContext right = (NodeContext) ctx.condition().get(1).accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(left.getClass())) {
				((AbstractNodeContext) left).setParent(expCtx);
			}
			if (AbstractNodeContext.class.isAssignableFrom(right.getClass())) {
				((AbstractNodeContext) right).setParent(expCtx);
			}
			expCtx.setLeftOperand(left);
			expCtx.setRightOperand(right);
			return expCtx;
		}
		if (ctx.condition() != null && ctx.condition().size() == 1 && ctx.boolExpression() != null && !ctx.boolExpression().isEmpty()) {
			BinaryConditionImpl expCtx = new BinaryConditionImpl(null, null, null, ctx.CONDITIONBOOLOPERATOR().getText(), ctx.start, ctx.stop);
			NodeContext left = (NodeContext) ctx.condition().get(0).accept(this);
			NodeContext right = (NodeContext) ctx.boolExpression().accept(this);
			if (AbstractNodeContext.class.isAssignableFrom(left.getClass())) {
				((AbstractNodeContext) left).setParent(expCtx);
			}
			if (AbstractNodeContext.class.isAssignableFrom(right.getClass())) {
				((AbstractNodeContext) right).setParent(expCtx);
			}
			expCtx.setLeftOperand(left);
			expCtx.setRightOperand(right);
			return expCtx;
		}
		if (ctx.condition() != null && ctx.condition().isEmpty() && ctx.boolExpression() != null && !ctx.boolExpression().isEmpty()) {
			return ctx.boolExpression().accept(this);
		}
		if (ctx.BOOLEAN() != null) {
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("Boolean"), Boolean.valueOf(ctx.BOOLEAN().getText()));
		}
		if (ctx.dataname() != null) {
			TypeWrapper castType = null;
			if (ctx.dataname().TYPENAME() != null) {
				checkTypeExistence(ctx.dataname(), ctx.dataname().TYPENAME().getText());
				castType = MainProvider.instance().getBasicTypesByName().get(ctx.dataname().TYPENAME().getText());
			}
			return new VariableValueImpl(null, ctx.dataname().DATANAME().getText(), castType, ctx.start, ctx.stop);
		}
		if (ctx.callStatement() != null) {
			return ctx.callStatement().accept(this);
		}
		System.out.println("smth wrong in visit condition");
		return super.visitCondition(ctx); //To change body of generated methods, choose Tools | Templates.
	}

	/**
	 * Get the value of boolean condition
	 *
	 * @param ctx
	 *
	 * @return the value of NodeContext (ExpressionContext || UnaryConditionImpl ||
	 * BinaryConditionImpl || varValue)
	 */
	@Override
	public NodeContext visitVarValue(InnerParser.VarValueContext ctx) {
		if (ctx.NULL() != null) {
			return new NullImpl();
		}
		if (ctx.BOOLEAN() != null) {
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("Boolean"), Boolean.valueOf(ctx.BOOLEAN().getText()));
		}
		if (ctx.DQ_STRING() != null) {
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("String"), ctx.DQ_STRING().getText());
		}
		if (ctx.NUMBER() != null) {
			Number number = NumberUtils.createNumber(ctx.NUMBER().getText());
			return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get(number.getClass().getSimpleName()), number);
		}
		if (ctx.DATE() != null) {
			try {
				return new BaseValueImpl(MainProvider.instance().getBasicTypesByName().get("Date"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ctx.DATE().getText()));
			} catch (ParseException ex) {
				handleException(ExceptionMessage.CANT_PARSE_DATE, ctx.DATE().getText(), ctx.getStart());
			}
		}
		if (ctx.dataname() != null) {
			TypeWrapper castType = null;
			if (ctx.dataname().TYPENAME() != null) {
				checkTypeExistence(ctx.dataname(), ctx.dataname().TYPENAME().getText());
				castType = MainProvider.instance().getBasicTypesByName().get(ctx.dataname().TYPENAME().getText());
			}
			return new VariableValueImpl(null, ctx.dataname().DATANAME().getText(), castType, ctx.start, ctx.stop);
		}
		if (ctx.callStatement() != null) {
			return ctx.callStatement().accept(this);
		}
		if (ctx.expression() != null) {
			return ctx.expression().accept(this);
		}
		if (ctx.condition() != null) {
			return ctx.condition().accept(this);
		}
		System.out.println("smth wrong in var value ");
		return super.visit(ctx);
	}

	@Override
	protected NodeContext aggregateResult(NodeContext aggregate, NodeContext nextResult) {
		return (aggregate == null) ? nextResult : aggregate;
	}

	private void handleException(ExceptionMessage cause, String details, Token start) {
		String message = String.format(cause.getLocalizedMessage(), details);
		throw new ExecutionException(message, start.getLine(), start.getCharPositionInLine());
	}

	private void checkTypeExistence(ParserRuleContext ctx, String typeName) {
		if (!MainProvider.instance().getBasicTypesByName().containsKey(typeName)) {
			handleException(ExceptionMessage.TYPE_NOT_EXIST, typeName, ctx.getStart());
		}
	}

	private void checkTypeExistence(TerminalNode node, String typeName) {
		if (!MainProvider.instance().getBasicTypesByName().containsKey(typeName)) {
			handleException(ExceptionMessage.TYPE_NOT_EXIST, typeName, node.getSymbol());
		}
	}
}
