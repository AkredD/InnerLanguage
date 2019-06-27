// Generated from Inner.g4 by ANTLR 4.7.2
package cs.service.innerlanguage.parser;

import cs.service.innerlanguage.translator.InnerVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InnerParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache
																 = new PredictionContextCache();
	public static final int BOOLEAN = 1, NUMBER = 2, DQ_STRING = 3, DATE = 4, WS = 5, COMMENTS = 6, OPENBRACKET = 7,
			  CLOSEBRACKET = 8, COMMA = 9, ENDCOMMAND = 10, EQ = 11, MINUSEQ = 12, PLUSEQ = 13,
			  TYPE = 14, STARTSTATEMENT = 15, ENDSTATEMENT = 16, FUNCTION = 17, VALUES = 18, IF = 19,
			  ELSE = 20, WHILE = 21, RETURN = 22, CONTINUE = 23, BREAK = 24, STATIC = 25, CALL = 26,
			  WRITE = 27, OPERATOR = 28, UNARYOPERATOR = 29, CONDITIONBOOLOPERATOR = 30, CONDITIONOPERATOR = 31,
			  CONDITIONUNARYPERATOR = 32, TYPENAME = 33, DATANAME = 34, DATADEF = 35, CONSTANTDEF = 36,
			  SYSTEMDEF = 37;
	public static final int RULE_varValue = 0, RULE_condition = 1, RULE_boolExpression = 2, RULE_expression = 3,
			  RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_eqStatement = 6, RULE_plusEqStatemet = 7,
			  RULE_minusEqStatemet = 8, RULE_returnStatement = 9, RULE_continueStatement = 10,
			  RULE_breakStatement = 11, RULE_callStatement = 12, RULE_writeStatement = 13,
			  RULE_statement = 14, RULE_function = 15, RULE_staticBlock = 16, RULE_type = 17,
			  RULE_varDefinition = 18, RULE_dataDef = 19, RULE_constantDef = 20, RULE_systemDef = 21,
			  RULE_inner = 22;

	private static String[] makeRuleNames() {
		return new String[] {
			"varValue", "condition", "boolExpression", "expression", "ifStatement",
			"whileStatement", "eqStatement", "plusEqStatemet", "minusEqStatemet",
			"returnStatement", "continueStatement", "breakStatement", "callStatement",
			"writeStatement", "statement", "function", "staticBlock", "type", "varDefinition",
			"dataDef", "constantDef", "systemDef", "inner"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "','", "'.'",
			"'='", "'-='", "'+='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "NUMBER", "DQ_STRING", "DATE", "WS", "COMMENTS", "OPENBRACKET",
			"CLOSEBRACKET", "COMMA", "ENDCOMMAND", "EQ", "MINUSEQ", "PLUSEQ", "TYPE",
			"STARTSTATEMENT", "ENDSTATEMENT", "FUNCTION", "VALUES", "IF", "ELSE",
			"WHILE", "RETURN", "CONTINUE", "BREAK", "STATIC", "CALL", "WRITE", "OPERATOR",
			"UNARYOPERATOR", "CONDITIONBOOLOPERATOR", "CONDITIONOPERATOR", "CONDITIONUNARYPERATOR",
			"TYPENAME", "DATANAME", "DATADEF", "CONSTANTDEF", "SYSTEMDEF"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;

	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}
			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() {
		return "Inner.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public InnerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}
	public static class VarValueContext extends ParserRuleContext {
		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode BOOLEAN() {
			return getToken(InnerParser.BOOLEAN, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(InnerParser.NUMBER, 0);
		}

		public TerminalNode DQ_STRING() {
			return getToken(InnerParser.DQ_STRING, 0);
		}

		public TerminalNode DATE() {
			return getToken(InnerParser.DATE, 0);
		}

		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public VarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_varValue;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitVarValue(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final VarValueContext varValue() throws RecognitionException {
		VarValueContext _localctx = new VarValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(54);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
					case 1: {
						setState(46);
						match(DATANAME);
					}
					break;
					case 2: {
						setState(47);
						match(BOOLEAN);
					}
					break;
					case 3: {
						setState(48);
						match(NUMBER);
					}
					break;
					case 4: {
						setState(49);
						match(DQ_STRING);
					}
					break;
					case 5: {
						setState(50);
						match(DATE);
					}
					break;
					case 6: {
						setState(51);
						callStatement();
					}
					break;
					case 7: {
						setState(52);
						expression(0);
					}
					break;
					case 8: {
						setState(53);
						condition(0);
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class ConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}

		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class, i);
		}

		public TerminalNode CONDITIONUNARYPERATOR() {
			return getToken(InnerParser.CONDITIONUNARYPERATOR, 0);
		}

		public TerminalNode CONDITIONBOOLOPERATOR() {
			return getToken(InnerParser.CONDITIONBOOLOPERATOR, 0);
		}

		public TerminalNode BOOLEAN() {
			return getToken(InnerParser.BOOLEAN, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class, 0);
		}

		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_condition;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitCondition(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(76);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
					case 1: {
						setState(57);
						boolExpression();
					}
					break;
					case 2: {
						setState(58);
						match(OPENBRACKET);
						setState(61);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
							case 1: {
								setState(59);
								condition(0);
							}
							break;
							case 2: {
								setState(60);
								boolExpression();
							}
							break;
						}
						setState(63);
						match(CLOSEBRACKET);
					}
					break;
					case 3: {
						setState(65);
						match(CONDITIONUNARYPERATOR);
						setState(66);
						condition(4);
					}
					break;
					case 4: {
						setState(67);
						boolExpression();
						setState(68);
						match(CONDITIONBOOLOPERATOR);
						setState(69);
						condition(3);
					}
					break;
					case 5: {
						setState(74);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case BOOLEAN: {
								setState(71);
								match(BOOLEAN);
							}
							break;
							case DATANAME: {
								setState(72);
								match(DATANAME);
							}
							break;
							case CALL: {
								setState(73);
								callStatement();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
						_prevctx = _localctx;
						{
							setState(84);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
								case 1: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(78);
									if (!(precpred(_ctx, 7))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									}
									setState(79);
									match(CONDITIONBOOLOPERATOR);
									setState(80);
									condition(8);
								}
								break;
								case 2: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(81);
									if (!(precpred(_ctx, 2))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									}
									setState(82);
									match(CONDITIONBOOLOPERATOR);
									setState(83);
									boolExpression();
								}
								break;
							}
						}
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	public static class BoolExpressionContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode CONDITIONOPERATOR() {
			return getToken(InnerParser.CONDITIONOPERATOR, 0);
		}

		public TerminalNode DQ_STRING() {
			return getToken(InnerParser.DQ_STRING, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(InnerParser.NUMBER, 0);
		}

		public TerminalNode DATE() {
			return getToken(InnerParser.DATE, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class, 0);
		}

		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_boolExpression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitBoolExpression(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolExpression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
					 {
						setState(89);
						match(OPENBRACKET);
						setState(90);
						boolExpression();
						setState(91);
						match(CLOSEBRACKET);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					 {
						setState(93);
						expression(0);
						setState(94);
						match(CONDITIONOPERATOR);
						setState(95);
						expression(0);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					 {
						setState(102);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(97);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(98);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(99);
								match(DATE);
							}
							break;
							case DATANAME: {
								setState(100);
								match(DATANAME);
							}
							break;
							case CALL: {
								setState(101);
								callStatement();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public TerminalNode UNARYOPERATOR() {
			return getToken(InnerParser.UNARYOPERATOR, 0);
		}

		public TerminalNode DQ_STRING() {
			return getToken(InnerParser.DQ_STRING, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(InnerParser.NUMBER, 0);
		}

		public TerminalNode DATE() {
			return getToken(InnerParser.DATE, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class, 0);
		}

		public TerminalNode OPERATOR() {
			return getToken(InnerParser.OPERATOR, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitExpression(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case OPENBRACKET: {
						setState(107);
						match(OPENBRACKET);
						setState(108);
						expression(0);
						setState(109);
						match(CLOSEBRACKET);
					}
					break;
					case UNARYOPERATOR: {
						setState(111);
						match(UNARYOPERATOR);
						setState(112);
						expression(2);
					}
					break;
					case NUMBER:
					case DQ_STRING:
					case DATE:
					case CALL:
					case DATANAME: {
						setState(118);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(113);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(114);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(115);
								match(DATE);
							}
							break;
							case DATANAME: {
								setState(116);
								match(DATANAME);
							}
							break;
							case CALL: {
								setState(117);
								callStatement();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
						_prevctx = _localctx;
						{
							{
								_localctx = new ExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_expression);
								setState(122);
								if (!(precpred(_ctx, 3))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								}
								setState(123);
								match(OPERATOR);
								setState(124);
								expression(4);
							}
						}
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(InnerParser.IF, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<TerminalNode> STARTSTATEMENT() {
			return getTokens(InnerParser.STARTSTATEMENT);
		}

		public TerminalNode STARTSTATEMENT(int i) {
			return getToken(InnerParser.STARTSTATEMENT, i);
		}

		public List<TerminalNode> ENDCOMMAND() {
			return getTokens(InnerParser.ENDCOMMAND);
		}

		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}

		public List<TerminalNode> ENDSTATEMENT() {
			return getTokens(InnerParser.ENDSTATEMENT);
		}

		public TerminalNode ENDSTATEMENT(int i) {
			return getToken(InnerParser.ENDSTATEMENT, i);
		}

		public TerminalNode ELSE() {
			return getToken(InnerParser.ELSE, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitIfStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(130);
				match(IF);
				setState(131);
				match(OPENBRACKET);
				setState(132);
				condition(0);
				setState(133);
				match(CLOSEBRACKET);
				{
					setState(134);
					match(STARTSTATEMENT);
					setState(135);
					match(ENDCOMMAND);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(136);
								statement();
							}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(142);
					match(ENDSTATEMENT);
					setState(143);
					match(ENDCOMMAND);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ELSE) {
					{
						setState(145);
						match(ELSE);
						setState(146);
						match(STARTSTATEMENT);
						setState(147);
						match(ENDCOMMAND);
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
							{
								{
									setState(148);
									statement();
								}
							}
							setState(153);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(154);
						match(ENDSTATEMENT);
						setState(155);
						match(ENDCOMMAND);
					}
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() {
			return getToken(InnerParser.WHILE, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public TerminalNode STARTSTATEMENT() {
			return getToken(InnerParser.STARTSTATEMENT, 0);
		}

		public List<TerminalNode> ENDCOMMAND() {
			return getTokens(InnerParser.ENDCOMMAND);
		}

		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}

		public TerminalNode ENDSTATEMENT() {
			return getToken(InnerParser.ENDSTATEMENT, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitWhileStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				match(WHILE);
				setState(159);
				match(OPENBRACKET);
				setState(160);
				condition(0);
				setState(161);
				match(CLOSEBRACKET);
				{
					setState(162);
					match(STARTSTATEMENT);
					setState(163);
					match(ENDCOMMAND);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(164);
								statement();
							}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(170);
					match(ENDSTATEMENT);
					setState(171);
					match(ENDCOMMAND);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class EqStatementContext extends ParserRuleContext {
		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode EQ() {
			return getToken(InnerParser.EQ, 0);
		}

		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public EqStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_eqStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitEqStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final EqStatementContext eqStatement() throws RecognitionException {
		EqStatementContext _localctx = new EqStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eqStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				match(DATANAME);
				setState(174);
				match(EQ);
				setState(175);
				varValue();
				setState(176);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class PlusEqStatemetContext extends ParserRuleContext {
		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode PLUSEQ() {
			return getToken(InnerParser.PLUSEQ, 0);
		}

		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public PlusEqStatemetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_plusEqStatemet;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitPlusEqStatemet(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final PlusEqStatemetContext plusEqStatemet() throws RecognitionException {
		PlusEqStatemetContext _localctx = new PlusEqStatemetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plusEqStatemet);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(178);
				match(DATANAME);
				setState(179);
				match(PLUSEQ);
				setState(180);
				varValue();
				setState(181);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class MinusEqStatemetContext extends ParserRuleContext {
		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode MINUSEQ() {
			return getToken(InnerParser.MINUSEQ, 0);
		}

		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public MinusEqStatemetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_minusEqStatemet;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitMinusEqStatemet(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final MinusEqStatemetContext minusEqStatemet() throws RecognitionException {
		MinusEqStatemetContext _localctx = new MinusEqStatemetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_minusEqStatemet);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(183);
				match(DATANAME);
				setState(184);
				match(MINUSEQ);
				setState(185);
				varValue();
				setState(186);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() {
			return getToken(InnerParser.RETURN, 0);
		}

		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitReturnStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(188);
				match(RETURN);
				setState(189);
				varValue();
				setState(190);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() {
			return getToken(InnerParser.CONTINUE, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_continueStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitContinueStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(192);
				match(CONTINUE);
				setState(193);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() {
			return getToken(InnerParser.BREAK, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breakStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitBreakStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(195);
				match(BREAK);
				setState(196);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class CallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() {
			return getToken(InnerParser.CALL, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}

		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(InnerParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}

		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_callStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitCallStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(198);
				match(CALL);
				setState(199);
				match(TYPENAME);
				setState(200);
				match(ENDCOMMAND);
				setState(201);
				match(DATANAME);
				setState(202);
				match(OPENBRACKET);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(203);
						varValue();
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(204);
									match(COMMA);
									setState(205);
									varValue();
								}
							}
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(213);
				match(CLOSEBRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() {
			return getToken(InnerParser.WRITE, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}

		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(InnerParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}

		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_writeStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitWriteStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(215);
				match(WRITE);
				setState(216);
				match(OPENBRACKET);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(217);
						varValue();
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(218);
									match(COMMA);
									setState(219);
									varValue();
								}
							}
							setState(224);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(227);
				match(CLOSEBRACKET);
				setState(228);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}

		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class, 0);
		}

		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class, 0);
		}

		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class, 0);
		}

		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class, 0);
		}

		public ConstantDefContext constantDef() {
			return getRuleContext(ConstantDefContext.class, 0);
		}

		public SystemDefContext systemDef() {
			return getRuleContext(SystemDefContext.class, 0);
		}

		public EqStatementContext eqStatement() {
			return getRuleContext(EqStatementContext.class, 0);
		}

		public PlusEqStatemetContext plusEqStatemet() {
			return getRuleContext(PlusEqStatemetContext.class, 0);
		}

		public MinusEqStatemetContext minusEqStatemet() {
			return getRuleContext(MinusEqStatemetContext.class, 0);
		}

		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(245);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
					case 1: {
						setState(230);
						ifStatement();
					}
					break;
					case 2: {
						setState(231);
						returnStatement();
					}
					break;
					case 3: {
						setState(232);
						continueStatement();
					}
					break;
					case 4: {
						setState(233);
						breakStatement();
					}
					break;
					case 5: {
						setState(234);
						whileStatement();
					}
					break;
					case 6: {
						setState(235);
						dataDef();
					}
					break;
					case 7: {
						setState(236);
						constantDef();
					}
					break;
					case 8: {
						setState(237);
						systemDef();
					}
					break;
					case 9: {
						setState(238);
						eqStatement();
					}
					break;
					case 10: {
						setState(239);
						plusEqStatemet();
					}
					break;
					case 11: {
						setState(240);
						minusEqStatemet();
					}
					break;
					case 12: {
						setState(241);
						callStatement();
						setState(242);
						match(ENDCOMMAND);
					}
					break;
					case 13: {
						setState(244);
						writeStatement();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() {
			return getToken(InnerParser.FUNCTION, 0);
		}

		public List<TerminalNode> TYPENAME() {
			return getTokens(InnerParser.TYPENAME);
		}

		public TerminalNode TYPENAME(int i) {
			return getToken(InnerParser.TYPENAME, i);
		}

		public List<TerminalNode> DATANAME() {
			return getTokens(InnerParser.DATANAME);
		}

		public TerminalNode DATANAME(int i) {
			return getToken(InnerParser.DATANAME, i);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public TerminalNode STARTSTATEMENT() {
			return getToken(InnerParser.STARTSTATEMENT, 0);
		}

		public List<TerminalNode> ENDCOMMAND() {
			return getTokens(InnerParser.ENDCOMMAND);
		}

		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}

		public TerminalNode ENDSTATEMENT() {
			return getToken(InnerParser.ENDSTATEMENT, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(InnerParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}

		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_function;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitFunction(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(247);
				match(FUNCTION);
				setState(248);
				match(TYPENAME);
				setState(249);
				match(DATANAME);
				setState(250);
				match(OPENBRACKET);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == TYPENAME) {
					{
						setState(256);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(251);
										match(TYPENAME);
										setState(252);
										match(DATANAME);
										setState(253);
										match(COMMA);
									}
								}
							}
							setState(258);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
						}
						setState(259);
						match(TYPENAME);
						setState(260);
						match(DATANAME);
					}
				}
				setState(263);
				match(CLOSEBRACKET);
				setState(264);
				match(STARTSTATEMENT);
				setState(265);
				match(ENDCOMMAND);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(266);
							statement();
						}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(271);
				match(ENDSTATEMENT);
				setState(272);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class StaticBlockContext extends ParserRuleContext {
		public TerminalNode STATIC() {
			return getToken(InnerParser.STATIC, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}

		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class, i);
		}

		public StaticBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_staticBlock;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitStaticBlock(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final StaticBlockContext staticBlock() throws RecognitionException {
		StaticBlockContext _localctx = new StaticBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_staticBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(274);
				match(STATIC);
				setState(275);
				match(OPENBRACKET);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(276);
							varDefinition();
						}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(281);
				match(CLOSEBRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() {
			return getToken(InnerParser.TYPE, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public List<TerminalNode> ENDCOMMAND() {
			return getTokens(InnerParser.ENDCOMMAND);
		}

		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}

		public TerminalNode ENDSTATEMENT() {
			return getToken(InnerParser.ENDSTATEMENT, 0);
		}

		public StaticBlockContext staticBlock() {
			return getRuleContext(StaticBlockContext.class, 0);
		}

		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}

		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class, i);
		}

		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitType(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(283);
				match(TYPE);
				setState(284);
				match(TYPENAME);
				setState(285);
				match(ENDCOMMAND);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == STATIC) {
					{
						setState(286);
						staticBlock();
					}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(289);
							function();
						}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == FUNCTION);
				setState(294);
				match(ENDSTATEMENT);
				setState(295);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class VarDefinitionContext extends ParserRuleContext {
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class, 0);
		}

		public ConstantDefContext constantDef() {
			return getRuleContext(ConstantDefContext.class, 0);
		}

		public SystemDefContext systemDef() {
			return getRuleContext(SystemDefContext.class, 0);
		}

		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_varDefinition;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitVarDefinition(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varDefinition);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DATADEF:
					enterOuterAlt(_localctx, 1);
					 {
						setState(297);
						dataDef();
					}
					break;
				case CONSTANTDEF:
					enterOuterAlt(_localctx, 2);
					 {
						setState(298);
						constantDef();
					}
					break;
				case SYSTEMDEF:
					enterOuterAlt(_localctx, 3);
					 {
						setState(299);
						systemDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class DataDefContext extends ParserRuleContext {
		public TerminalNode DATADEF() {
			return getToken(InnerParser.DATADEF, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public TerminalNode VALUES() {
			return getToken(InnerParser.VALUES, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}

		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class, i);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(InnerParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}

		public DataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dataDef;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitDataDef(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final DataDefContext dataDef() throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dataDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(302);
				match(DATADEF);
				setState(303);
				match(TYPENAME);
				setState(304);
				match(DATANAME);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == VALUES) {
					{
						setState(305);
						match(VALUES);
						setState(306);
						match(OPENBRACKET);
						setState(307);
						varValue();
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(308);
									match(COMMA);
									setState(309);
									varValue();
								}
							}
							setState(314);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(315);
						match(CLOSEBRACKET);
					}
				}
				setState(319);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class ConstantDefContext extends ParserRuleContext {
		public TerminalNode CONSTANTDEF() {
			return getToken(InnerParser.CONSTANTDEF, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode VALUES() {
			return getToken(InnerParser.VALUES, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}

		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class, i);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(InnerParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}

		public ConstantDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantDef;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitConstantDef(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final ConstantDefContext constantDef() throws RecognitionException {
		ConstantDefContext _localctx = new ConstantDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				match(CONSTANTDEF);
				setState(322);
				match(TYPENAME);
				setState(323);
				match(DATANAME);
				setState(324);
				match(VALUES);
				setState(325);
				match(OPENBRACKET);
				setState(326);
				varValue();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(327);
							match(COMMA);
							setState(328);
							varValue();
						}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(CLOSEBRACKET);
				setState(335);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class SystemDefContext extends ParserRuleContext {
		public TerminalNode SYSTEMDEF() {
			return getToken(InnerParser.SYSTEMDEF, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode ENDCOMMAND() {
			return getToken(InnerParser.ENDCOMMAND, 0);
		}

		public SystemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_systemDef;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitSystemDef(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final SystemDefContext systemDef() throws RecognitionException {
		SystemDefContext _localctx = new SystemDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_systemDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				match(SYSTEMDEF);
				setState(338);
				match(TYPENAME);
				setState(339);
				match(DATANAME);
				setState(340);
				match(ENDCOMMAND);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}
	public static class InnerContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode EOF() {
			return getToken(InnerParser.EOF, 0);
		}

		public InnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inner;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitInner(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final InnerContext inner() throws RecognitionException {
		InnerContext _localctx = new InnerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inner);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(342);
				type();
				setState(343);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 1:
				return condition_sempred((ConditionContext) _localctx, predIndex);
			case 3:
				return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 7);
			case 1:
				return precpred(_ctx, 2);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 2:
				return precpred(_ctx, 3);
		}
		return true;
	}
	public static final String _serializedATN
										= "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u015c\4\2\t\2\4"
										  + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
										  + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
										  + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"
										  + "\2\3\2\3\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3"
										  + "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\5\3O\n\3\3\3\3\3\3\3\3\3\3"
										  + "\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"
										  + "\3\4\3\4\3\4\5\4i\n\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"
										  + "\3\5\3\5\5\5y\n\5\5\5{\n\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13"
										  + "\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3"
										  + "\6\3\6\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\3\6\5\6\u009f"
										  + "\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\3\7"
										  + "\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"
										  + "\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"
										  + "\16\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16\5\16\u00d6\n\16\3"
										  + "\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00df\n\17\f\17\16\17\u00e2\13"
										  + "\17\5\17\u00e4\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"
										  + "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8\n\20\3\21\3\21\3\21"
										  + "\3\21\3\21\3\21\3\21\7\21\u0101\n\21\f\21\16\21\u0104\13\21\3\21\3\21"
										  + "\5\21\u0108\n\21\3\21\3\21\3\21\3\21\6\21\u010e\n\21\r\21\16\21\u010f"
										  + "\3\21\3\21\3\21\3\22\3\22\3\22\6\22\u0118\n\22\r\22\16\22\u0119\3\22\3"
										  + "\22\3\23\3\23\3\23\3\23\5\23\u0122\n\23\3\23\6\23\u0125\n\23\r\23\16\23"
										  + "\u0126\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u012f\n\24\3\25\3\25\3\25\3"
										  + "\25\3\25\3\25\3\25\3\25\7\25\u0139\n\25\f\25\16\25\u013c\13\25\3\25\3"
										  + "\25\5\25\u0140\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"
										  + "\7\26\u014c\n\26\f\26\16\26\u014f\13\26\3\26\3\26\3\26\3\27\3\27\3\27"
										  + "\3\27\3\27\3\30\3\30\3\30\3\30\2\4\4\b\31\2\4\6\b\n\f\16\20\22\24\26\30"
										  + "\32\34\36 \"$&(*,.\2\2\2\u0180\28\3\2\2\2\4N\3\2\2\2\6j\3\2\2\2\bz\3\2"
										  + "\2\2\n\u0084\3\2\2\2\f\u00a0\3\2\2\2\16\u00af\3\2\2\2\20\u00b4\3\2\2\2"
										  + "\22\u00b9\3\2\2\2\24\u00be\3\2\2\2\26\u00c2\3\2\2\2\30\u00c5\3\2\2\2\32"
										  + "\u00c8\3\2\2\2\34\u00d9\3\2\2\2\36\u00f7\3\2\2\2 \u00f9\3\2\2\2\"\u0114"
										  + "\3\2\2\2$\u011d\3\2\2\2&\u012e\3\2\2\2(\u0130\3\2\2\2*\u0143\3\2\2\2,"
										  + "\u0153\3\2\2\2.\u0158\3\2\2\2\609\7$\2\2\619\7\3\2\2\629\7\4\2\2\639\7"
										  + "\5\2\2\649\7\6\2\2\659\5\32\16\2\669\5\b\5\2\679\5\4\3\28\60\3\2\2\28"
										  + "\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66\3\2\2"
										  + "\28\67\3\2\2\29\3\3\2\2\2:;\b\3\1\2;O\5\6\4\2<?\7\t\2\2=@\5\4\3\2>@\5"
										  + "\6\4\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\7\n\2\2BO\3\2\2\2CD\7\"\2\2DO\5"
										  + "\4\3\6EF\5\6\4\2FG\7 \2\2GH\5\4\3\5HO\3\2\2\2IM\7\3\2\2JM\7$\2\2KM\5\32"
										  + "\16\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MO\3\2\2\2N:\3\2\2\2N<\3\2\2\2NC\3"
										  + "\2\2\2NE\3\2\2\2NL\3\2\2\2OX\3\2\2\2PQ\f\t\2\2QR\7 \2\2RW\5\4\3\nST\f"
										  + "\4\2\2TU\7 \2\2UW\5\6\4\2VP\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"
										  + "\2\2\2Y\5\3\2\2\2ZX\3\2\2\2[\\\7\t\2\2\\]\5\6\4\2]^\7\n\2\2^k\3\2\2\2"
										  + "_`\5\b\5\2`a\7!\2\2ab\5\b\5\2bk\3\2\2\2ci\7\5\2\2di\7\4\2\2ei\7\6\2\2"
										  + "fi\7$\2\2gi\5\32\16\2hc\3\2\2\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2"
										  + "\2ik\3\2\2\2j[\3\2\2\2j_\3\2\2\2jh\3\2\2\2k\7\3\2\2\2lm\b\5\1\2mn\7\t"
										  + "\2\2no\5\b\5\2op\7\n\2\2p{\3\2\2\2qr\7\37\2\2r{\5\b\5\4sy\7\5\2\2ty\7"
										  + "\4\2\2uy\7\6\2\2vy\7$\2\2wy\5\32\16\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv"
										  + "\3\2\2\2xw\3\2\2\2y{\3\2\2\2zl\3\2\2\2zq\3\2\2\2zx\3\2\2\2{\u0081\3\2"
										  + "\2\2|}\f\5\2\2}~\7\36\2\2~\u0080\5\b\5\6\177|\3\2\2\2\u0080\u0083\3\2"
										  + "\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\t\3\2\2\2\u0083\u0081"
										  + "\3\2\2\2\u0084\u0085\7\25\2\2\u0085\u0086\7\t\2\2\u0086\u0087\5\4\3\2"
										  + "\u0087\u0088\7\n\2\2\u0088\u0089\7\21\2\2\u0089\u008d\7\f\2\2\u008a\u008c"
										  + "\5\36\20\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2"
										  + "\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"
										  + "\7\22\2\2\u0091\u0092\7\f\2\2\u0092\u009e\3\2\2\2\u0093\u0094\7\26\2\2"
										  + "\u0094\u0095\7\21\2\2\u0095\u0099\7\f\2\2\u0096\u0098\5\36\20\2\u0097"
										  + "\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"
										  + "\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\22\2\2\u009d"
										  + "\u009f\7\f\2\2\u009e\u0093\3\2\2\2\u009e\u009f\3\2\2\2\u009f\13\3\2\2"
										  + "\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\4\3\2\u00a3"
										  + "\u00a4\7\n\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a9\7\f\2\2\u00a6\u00a8\5"
										  + "\36\20\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"
										  + "\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\22"
										  + "\2\2\u00ad\u00ae\7\f\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1"
										  + "\7\r\2\2\u00b1\u00b2\5\2\2\2\u00b2\u00b3\7\f\2\2\u00b3\17\3\2\2\2\u00b4"
										  + "\u00b5\7$\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\5\2\2\2\u00b7\u00b8\7\f"
										  + "\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc"
										  + "\5\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\23\3\2\2\2\u00be\u00bf\7\30\2\2\u00bf"
										  + "\u00c0\5\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\25\3\2\2\2\u00c2\u00c3\7\31\2"
										  + "\2\u00c3\u00c4\7\f\2\2\u00c4\27\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7"
										  + "\7\f\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7\34\2\2\u00c9\u00ca\7#\2\2\u00ca"
										  + "\u00cb\7\f\2\2\u00cb\u00cc\7$\2\2\u00cc\u00d5\7\t\2\2\u00cd\u00d2\5\2"
										  + "\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d1\5\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"
										  + "\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2"
										  + "\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"
										  + "\u00d7\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8\33\3\2\2\2\u00d9\u00da\7\35\2"
										  + "\2\u00da\u00e3\7\t\2\2\u00db\u00e0\5\2\2\2\u00dc\u00dd\7\13\2\2\u00dd"
										  + "\u00df\5\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2"
										  + "\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"
										  + "\u00db\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\n"
										  + "\2\2\u00e6\u00e7\7\f\2\2\u00e7\35\3\2\2\2\u00e8\u00f8\5\n\6\2\u00e9\u00f8"
										  + "\5\24\13\2\u00ea\u00f8\5\26\f\2\u00eb\u00f8\5\30\r\2\u00ec\u00f8\5\f\7"
										  + "\2\u00ed\u00f8\5(\25\2\u00ee\u00f8\5*\26\2\u00ef\u00f8\5,\27\2\u00f0\u00f8"
										  + "\5\16\b\2\u00f1\u00f8\5\20\t\2\u00f2\u00f8\5\22\n\2\u00f3\u00f4\5\32\16"
										  + "\2\u00f4\u00f5\7\f\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\5\34\17\2\u00f7"
										  + "\u00e8\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00eb\3\2"
										  + "\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7"
										  + "\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2"
										  + "\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fa"
										  + "\7\23\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7$\2\2\u00fc\u0107\7\t\2\2\u00fd"
										  + "\u00fe\7#\2\2\u00fe\u00ff\7$\2\2\u00ff\u0101\7\13\2\2\u0100\u00fd\3\2"
										  + "\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"
										  + "\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7#\2\2\u0106\u0108\7$\2"
										  + "\2\u0107\u0102\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"
										  + "\7\n\2\2\u010a\u010b\7\21\2\2\u010b\u010d\7\f\2\2\u010c\u010e\5\36\20"
										  + "\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"
										  + "\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\22\2\2\u0112\u0113\7\f\2\2"
										  + "\u0113!\3\2\2\2\u0114\u0115\7\33\2\2\u0115\u0117\7\t\2\2\u0116\u0118\5"
										  + "&\24\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"
										  + "\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\n\2\2\u011c#\3\2\2\2"
										  + "\u011d\u011e\7\20\2\2\u011e\u011f\7#\2\2\u011f\u0121\7\f\2\2\u0120\u0122"
										  + "\5\"\22\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2"
										  + "\u0123\u0125\5 \21\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124"
										  + "\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\22\2\2"
										  + "\u0129\u012a\7\f\2\2\u012a%\3\2\2\2\u012b\u012f\5(\25\2\u012c\u012f\5"
										  + "*\26\2\u012d\u012f\5,\27\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"
										  + "\u012d\3\2\2\2\u012f\'\3\2\2\2\u0130\u0131\7%\2\2\u0131\u0132\7#\2\2\u0132"
										  + "\u013f\7$\2\2\u0133\u0134\7\24\2\2\u0134\u0135\7\t\2\2\u0135\u013a\5\2"
										  + "\2\2\u0136\u0137\7\13\2\2\u0137\u0139\5\2\2\2\u0138\u0136\3\2\2\2\u0139"
										  + "\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"
										  + "\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\n\2\2\u013e\u0140\3\2\2\2\u013f"
										  + "\u0133\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\f"
										  + "\2\2\u0142)\3\2\2\2\u0143\u0144\7&\2\2\u0144\u0145\7#\2\2\u0145\u0146"
										  + "\7$\2\2\u0146\u0147\7\24\2\2\u0147\u0148\7\t\2\2\u0148\u014d\5\2\2\2\u0149"
										  + "\u014a\7\13\2\2\u014a\u014c\5\2\2\2\u014b\u0149\3\2\2\2\u014c\u014f\3"
										  + "\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"
										  + "\u014d\3\2\2\2\u0150\u0151\7\n\2\2\u0151\u0152\7\f\2\2\u0152+\3\2\2\2"
										  + "\u0153\u0154\7\'\2\2\u0154\u0155\7#\2\2\u0155\u0156\7$\2\2\u0156\u0157"
										  + "\7\f\2\2\u0157-\3\2\2\2\u0158\u0159\5$\23\2\u0159\u015a\7\2\2\3\u015a"
										  + "/\3\2\2\2 8?LNVXhjxz\u0081\u008d\u0099\u009e\u00a9\u00d2\u00d5\u00e0\u00e3"
										  + "\u00f7\u0102\u0107\u010f\u0119\u0121\u0126\u012e\u013a\u013f\u014d";
	public static final ATN _ATN
									= new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
