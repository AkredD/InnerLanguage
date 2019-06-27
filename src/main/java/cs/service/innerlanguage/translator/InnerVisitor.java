// Generated from Inner.g4 by ANTLR 4.7.2
package cs.service.innerlanguage.translator;

import cs.service.innerlanguage.parser.InnerParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InnerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InnerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InnerParser#varValue}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitVarValue(InnerParser.VarValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#condition}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitCondition(InnerParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#boolExpression}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitBoolExpression(InnerParser.BoolExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#expression}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitExpression(InnerParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#ifStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitIfStatement(InnerParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#whileStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitWhileStatement(InnerParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#eqStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitEqStatement(InnerParser.EqStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#plusEqStatemet}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitPlusEqStatemet(InnerParser.PlusEqStatemetContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#minusEqStatemet}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitMinusEqStatemet(InnerParser.MinusEqStatemetContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#returnStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitReturnStatement(InnerParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#continueStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitContinueStatement(InnerParser.ContinueStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#breakStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitBreakStatement(InnerParser.BreakStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#callStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitCallStatement(InnerParser.CallStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#writeStatement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitWriteStatement(InnerParser.WriteStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#statement}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitStatement(InnerParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#function}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitFunction(InnerParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#staticBlock}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitStaticBlock(InnerParser.StaticBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#type}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitType(InnerParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#varDefinition}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitVarDefinition(InnerParser.VarDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#dataDef}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitDataDef(InnerParser.DataDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#constantDef}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitConstantDef(InnerParser.ConstantDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#systemDef}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitSystemDef(InnerParser.SystemDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link InnerParser#inner}.
	 *
	 * @param ctx the parse tree
	 *
	 * @return the visitor result
	 */
	T visitInner(InnerParser.InnerContext ctx);
}
