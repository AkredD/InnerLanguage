// Generated from Inner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InnerParser}.
 */
public interface InnerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InnerParser#varValue}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(InnerParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#varValue}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(InnerParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(InnerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(InnerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(InnerParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(InnerParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(InnerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(InnerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(InnerParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(InnerParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(InnerParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(InnerParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#eqStatement}.
	 * @param ctx the parse tree
	 */
	void enterEqStatement(InnerParser.EqStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#eqStatement}.
	 * @param ctx the parse tree
	 */
	void exitEqStatement(InnerParser.EqStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#plusEqStatemet}.
	 * @param ctx the parse tree
	 */
	void enterPlusEqStatemet(InnerParser.PlusEqStatemetContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#plusEqStatemet}.
	 * @param ctx the parse tree
	 */
	void exitPlusEqStatemet(InnerParser.PlusEqStatemetContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#minusEqStatemet}.
	 * @param ctx the parse tree
	 */
	void enterMinusEqStatemet(InnerParser.MinusEqStatemetContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#minusEqStatemet}.
	 * @param ctx the parse tree
	 */
	void exitMinusEqStatemet(InnerParser.MinusEqStatemetContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(InnerParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(InnerParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(InnerParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(InnerParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(InnerParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(InnerParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(InnerParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(InnerParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(InnerParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(InnerParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(InnerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(InnerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(InnerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(InnerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#staticBlock}.
	 * @param ctx the parse tree
	 */
	void enterStaticBlock(InnerParser.StaticBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#staticBlock}.
	 * @param ctx the parse tree
	 */
	void exitStaticBlock(InnerParser.StaticBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(InnerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(InnerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void enterDataDef(InnerParser.DataDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#dataDef}.
	 * @param ctx the parse tree
	 */
	void exitDataDef(InnerParser.DataDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#constantDef}.
	 * @param ctx the parse tree
	 */
	void enterConstantDef(InnerParser.ConstantDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#constantDef}.
	 * @param ctx the parse tree
	 */
	void exitConstantDef(InnerParser.ConstantDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#systemDef}.
	 * @param ctx the parse tree
	 */
	void enterSystemDef(InnerParser.SystemDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#systemDef}.
	 * @param ctx the parse tree
	 */
	void exitSystemDef(InnerParser.SystemDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link InnerParser#inner}.
	 * @param ctx the parse tree
	 */
	void enterInner(InnerParser.InnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InnerParser#inner}.
	 * @param ctx the parse tree
	 */
	void exitInner(InnerParser.InnerContext ctx);
}