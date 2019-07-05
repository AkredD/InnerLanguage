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
	public static final int RULE_varValue = 0, RULE_dataname = 1, RULE_condition = 2, RULE_boolExpression = 3,
			  RULE_expression = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_eqStatement = 7,
			  RULE_plusEqStatement = 8, RULE_minusEqStatement = 9, RULE_returnStatement = 10,
			  RULE_continueStatement = 11, RULE_breakStatement = 12, RULE_callStatement = 13,
			  RULE_writeStatement = 14, RULE_statement = 15, RULE_function = 16, RULE_staticBlock = 17,
			  RULE_type = 18, RULE_varDefinition = 19, RULE_dataDef = 20, RULE_constantDef = 21,
			  RULE_systemDef = 22, RULE_inner = 23;

	private static String[] makeRuleNames() {
		return new String[] {
			"varValue", "dataname", "condition", "boolExpression", "expression",
			"ifStatement", "whileStatement", "eqStatement", "plusEqStatement", "minusEqStatement",
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
		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
				setState(56);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
					case 1: {
						setState(48);
						dataname();
					}
					break;
					case 2: {
						setState(49);
						match(BOOLEAN);
					}
					break;
					case 3: {
						setState(50);
						match(NUMBER);
					}
					break;
					case 4: {
						setState(51);
						match(DQ_STRING);
					}
					break;
					case 5: {
						setState(52);
						match(DATE);
					}
					break;
					case 6: {
						setState(53);
						callStatement();
					}
					break;
					case 7: {
						setState(54);
						expression(0);
					}
					break;
					case 8: {
						setState(55);
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
	public static class DatanameContext extends ParserRuleContext {
		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
		}

		public TerminalNode OPENBRACKET() {
			return getToken(InnerParser.OPENBRACKET, 0);
		}

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public TerminalNode CLOSEBRACKET() {
			return getToken(InnerParser.CLOSEBRACKET, 0);
		}

		public DatanameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dataname;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitDataname(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final DatanameContext dataname() throws RecognitionException {
		DatanameContext _localctx = new DatanameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == OPENBRACKET) {
					{
						setState(58);
						match(OPENBRACKET);
						setState(59);
						match(TYPENAME);
						setState(60);
						match(CLOSEBRACKET);
					}
				}
				setState(63);
				match(DATANAME);
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

		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(85);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
					case 1: {
						setState(66);
						boolExpression();
					}
					break;
					case 2: {
						setState(67);
						match(OPENBRACKET);
						setState(70);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
							case 1: {
								setState(68);
								condition(0);
							}
							break;
							case 2: {
								setState(69);
								boolExpression();
							}
							break;
						}
						setState(72);
						match(CLOSEBRACKET);
					}
					break;
					case 3: {
						setState(74);
						match(CONDITIONUNARYPERATOR);
						setState(75);
						condition(4);
					}
					break;
					case 4: {
						setState(76);
						boolExpression();
						setState(77);
						match(CONDITIONBOOLOPERATOR);
						setState(78);
						condition(3);
					}
					break;
					case 5: {
						setState(83);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case BOOLEAN: {
								setState(80);
								match(BOOLEAN);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(81);
								dataname();
							}
							break;
							case CALL: {
								setState(82);
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
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
						_prevctx = _localctx;
						{
							setState(93);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
								case 1: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(87);
									if (!(precpred(_ctx, 7))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									}
									setState(88);
									match(CONDITIONBOOLOPERATOR);
									setState(89);
									condition(8);
								}
								break;
								case 2: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(90);
									if (!(precpred(_ctx, 2))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									}
									setState(91);
									match(CONDITIONBOOLOPERATOR);
									setState(92);
									boolExpression();
								}
								break;
							}
						}
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
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

		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
		enterRule(_localctx, 6, RULE_boolExpression);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
					 {
						setState(98);
						match(OPENBRACKET);
						setState(99);
						boolExpression();
						setState(100);
						match(CLOSEBRACKET);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					 {
						setState(102);
						expression(0);
						setState(103);
						match(CONDITIONOPERATOR);
						setState(104);
						expression(0);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					 {
						setState(111);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(106);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(107);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(108);
								match(DATE);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(109);
								dataname();
							}
							break;
							case CALL: {
								setState(110);
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

		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(129);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
					case 1: {
						setState(116);
						match(OPENBRACKET);
						setState(117);
						expression(0);
						setState(118);
						match(CLOSEBRACKET);
					}
					break;
					case 2: {
						setState(120);
						match(UNARYOPERATOR);
						setState(121);
						expression(2);
					}
					break;
					case 3: {
						setState(127);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(122);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(123);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(124);
								match(DATE);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(125);
								dataname();
							}
							break;
							case CALL: {
								setState(126);
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
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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
								setState(131);
								if (!(precpred(_ctx, 3))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								}
								setState(132);
								match(OPERATOR);
								setState(133);
								expression(4);
							}
						}
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(139);
				match(IF);
				setState(140);
				match(OPENBRACKET);
				setState(141);
				condition(0);
				setState(142);
				match(CLOSEBRACKET);
				{
					setState(143);
					match(STARTSTATEMENT);
					setState(144);
					match(ENDCOMMAND);
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(145);
								statement();
							}
						}
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(151);
					match(ENDSTATEMENT);
					setState(152);
					match(ENDCOMMAND);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ELSE) {
					{
						setState(154);
						match(ELSE);
						setState(155);
						match(STARTSTATEMENT);
						setState(156);
						match(ENDCOMMAND);
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
							{
								{
									setState(157);
									statement();
								}
							}
							setState(162);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(163);
						match(ENDSTATEMENT);
						setState(164);
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
		enterRule(_localctx, 12, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(167);
				match(WHILE);
				setState(168);
				match(OPENBRACKET);
				setState(169);
				condition(0);
				setState(170);
				match(CLOSEBRACKET);
				{
					setState(171);
					match(STARTSTATEMENT);
					setState(172);
					match(ENDCOMMAND);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(173);
								statement();
							}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(ENDSTATEMENT);
					setState(180);
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
		enterRule(_localctx, 14, RULE_eqStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(182);
				match(DATANAME);
				setState(183);
				match(EQ);
				setState(184);
				varValue();
				setState(185);
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
	public static class PlusEqStatementContext extends ParserRuleContext {
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

		public PlusEqStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_plusEqStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitPlusEqStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final PlusEqStatementContext plusEqStatement() throws RecognitionException {
		PlusEqStatementContext _localctx = new PlusEqStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_plusEqStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(187);
				match(DATANAME);
				setState(188);
				match(PLUSEQ);
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
	public static class MinusEqStatementContext extends ParserRuleContext {
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

		public MinusEqStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_minusEqStatement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof InnerVisitor) {
				return ((InnerVisitor<? extends T>) visitor).visitMinusEqStatement(this);
			} else {
				return visitor.visitChildren(this);
			}
		}
	}

	public final MinusEqStatementContext minusEqStatement() throws RecognitionException {
		MinusEqStatementContext _localctx = new MinusEqStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_minusEqStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(192);
				match(DATANAME);
				setState(193);
				match(MINUSEQ);
				setState(194);
				varValue();
				setState(195);
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
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(197);
				match(RETURN);
				setState(198);
				varValue();
				setState(199);
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
		enterRule(_localctx, 22, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(201);
				match(CONTINUE);
				setState(202);
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
		enterRule(_localctx, 24, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(204);
				match(BREAK);
				setState(205);
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

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
		enterRule(_localctx, 26, RULE_callStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(207);
				match(CALL);
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case TYPENAME: {
						setState(208);
						match(TYPENAME);
					}
					break;
					case OPENBRACKET:
					case DATANAME: {
						setState(209);
						dataname();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(212);
				match(ENDCOMMAND);
				setState(213);
				match(DATANAME);
				setState(214);
				match(OPENBRACKET);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(215);
						varValue();
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(216);
									match(COMMA);
									setState(217);
									varValue();
								}
							}
							setState(222);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(225);
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
		enterRule(_localctx, 28, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(227);
				match(WRITE);
				setState(228);
				match(OPENBRACKET);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(229);
						varValue();
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(230);
									match(COMMA);
									setState(231);
									varValue();
								}
							}
							setState(236);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(239);
				match(CLOSEBRACKET);
				setState(240);
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

		public PlusEqStatementContext plusEqStatement() {
			return getRuleContext(PlusEqStatementContext.class, 0);
		}

		public MinusEqStatementContext minusEqStatement() {
			return getRuleContext(MinusEqStatementContext.class, 0);
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

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
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
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(260);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
					case 1: {
						setState(242);
						ifStatement();
					}
					break;
					case 2: {
						setState(243);
						returnStatement();
					}
					break;
					case 3: {
						setState(244);
						continueStatement();
					}
					break;
					case 4: {
						setState(245);
						breakStatement();
					}
					break;
					case 5: {
						setState(246);
						whileStatement();
					}
					break;
					case 6: {
						setState(247);
						dataDef();
					}
					break;
					case 7: {
						setState(248);
						constantDef();
					}
					break;
					case 8: {
						setState(249);
						systemDef();
					}
					break;
					case 9: {
						setState(250);
						eqStatement();
					}
					break;
					case 10: {
						setState(251);
						plusEqStatement();
					}
					break;
					case 11: {
						setState(252);
						minusEqStatement();
					}
					break;
					case 12: {
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == TYPENAME) {
							{
								setState(253);
								match(TYPENAME);
							}
						}
						setState(256);
						callStatement();
						setState(257);
						match(ENDCOMMAND);
					}
					break;
					case 13: {
						setState(259);
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(262);
				match(FUNCTION);
				setState(263);
				match(TYPENAME);
				setState(264);
				match(DATANAME);
				setState(265);
				match(OPENBRACKET);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == TYPENAME) {
					{
						setState(271);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(266);
										match(TYPENAME);
										setState(267);
										match(DATANAME);
										setState(268);
										match(COMMA);
									}
								}
							}
							setState(273);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
						}
						setState(274);
						match(TYPENAME);
						setState(275);
						match(DATANAME);
					}
				}
				setState(278);
				match(CLOSEBRACKET);
				setState(279);
				match(STARTSTATEMENT);
				setState(280);
				match(ENDCOMMAND);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(281);
							statement();
						}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(286);
				match(ENDSTATEMENT);
				setState(287);
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
		enterRule(_localctx, 34, RULE_staticBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(289);
				match(STATIC);
				setState(290);
				match(OPENBRACKET);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(291);
							varDefinition();
						}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(296);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(298);
				match(TYPE);
				setState(299);
				match(TYPENAME);
				setState(300);
				match(ENDCOMMAND);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == STATIC) {
					{
						setState(301);
						staticBlock();
					}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(304);
							function();
						}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == FUNCTION);
				setState(309);
				match(ENDSTATEMENT);
				setState(310);
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
		enterRule(_localctx, 38, RULE_varDefinition);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DATADEF:
					enterOuterAlt(_localctx, 1);
					 {
						setState(312);
						dataDef();
					}
					break;
				case CONSTANTDEF:
					enterOuterAlt(_localctx, 2);
					 {
						setState(313);
						constantDef();
					}
					break;
				case SYSTEMDEF:
					enterOuterAlt(_localctx, 3);
					 {
						setState(314);
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
		enterRule(_localctx, 40, RULE_dataDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(317);
				match(DATADEF);
				setState(318);
				match(TYPENAME);
				setState(319);
				match(DATANAME);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == VALUES) {
					{
						setState(320);
						match(VALUES);
						setState(321);
						match(OPENBRACKET);
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
							{
								setState(322);
								varValue();
								setState(327);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(323);
											match(COMMA);
											setState(324);
											varValue();
										}
									}
									setState(329);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
						}
						setState(332);
						match(CLOSEBRACKET);
					}
				}
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
		enterRule(_localctx, 42, RULE_constantDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				match(CONSTANTDEF);
				setState(338);
				match(TYPENAME);
				setState(339);
				match(DATANAME);
				setState(340);
				match(VALUES);
				setState(341);
				match(OPENBRACKET);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(342);
						varValue();
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(343);
									match(COMMA);
									setState(344);
									varValue();
								}
							}
							setState(349);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(352);
				match(CLOSEBRACKET);
				setState(353);
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
		enterRule(_localctx, 44, RULE_systemDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(355);
				match(SYSTEMDEF);
				setState(356);
				match(TYPENAME);
				setState(357);
				match(DATANAME);
				setState(358);
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
		enterRule(_localctx, 46, RULE_inner);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(360);
				type();
				setState(361);
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
			case 2:
				return condition_sempred((ConditionContext) _localctx, predIndex);
			case 4:
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
										= "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u016e\4\2\t\2\4"
										  + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
										  + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
										  + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
										  + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\5\3@\n\3\3\3\3\3"
										  + "\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"
										  + "\3\4\5\4V\n\4\5\4X\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"
										  + "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\5\5t\n\5"
										  + "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\5\6\u0084"
										  + "\n\6\3\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\7\3\7\3\7\3\7\3\7"
										  + "\3\7\3\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"
										  + "\7\7\u00a1\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\5\7\u00a8\n\7\3\b\3\b\3\b\3"
										  + "\b\3\b\3\b\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4\13\b\3\b\3\b\3\b\3\t\3\t\3"
										  + "\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"
										  + "\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00d5\n\17\3\17\3\17"
										  + "\3\17\3\17\3\17\3\17\7\17\u00dd\n\17\f\17\16\17\u00e0\13\17\5\17\u00e2"
										  + "\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee"
										  + "\13\20\5\20\u00f0\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"
										  + "\21\3\21\3\21\3\21\3\21\3\21\5\21\u0101\n\21\3\21\3\21\3\21\3\21\5\21"
										  + "\u0107\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0110\n\22\f\22\16"
										  + "\22\u0113\13\22\3\22\3\22\5\22\u0117\n\22\3\22\3\22\3\22\3\22\6\22\u011d"
										  + "\n\22\r\22\16\22\u011e\3\22\3\22\3\22\3\23\3\23\3\23\6\23\u0127\n\23\r"
										  + "\23\16\23\u0128\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0131\n\24\3\24\6\24"
										  + "\u0134\n\24\r\24\16\24\u0135\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u013e"
										  + "\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0148\n\26\f\26\16"
										  + "\26\u014b\13\26\5\26\u014d\n\26\3\26\5\26\u0150\n\26\3\26\3\26\3\27\3"
										  + "\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u015c\n\27\f\27\16\27\u015f\13"
										  + "\27\5\27\u0161\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"
										  + "\3\31\3\31\2\4\6\n\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."
										  + "\60\2\2\2\u0196\2:\3\2\2\2\4?\3\2\2\2\6W\3\2\2\2\bs\3\2\2\2\n\u0083\3"
										  + "\2\2\2\f\u008d\3\2\2\2\16\u00a9\3\2\2\2\20\u00b8\3\2\2\2\22\u00bd\3\2"
										  + "\2\2\24\u00c2\3\2\2\2\26\u00c7\3\2\2\2\30\u00cb\3\2\2\2\32\u00ce\3\2\2"
										  + "\2\34\u00d1\3\2\2\2\36\u00e5\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2\2\2$\u0123"
										  + "\3\2\2\2&\u012c\3\2\2\2(\u013d\3\2\2\2*\u013f\3\2\2\2,\u0153\3\2\2\2."
										  + "\u0165\3\2\2\2\60\u016a\3\2\2\2\62;\5\4\3\2\63;\7\3\2\2\64;\7\4\2\2\65"
										  + ";\7\5\2\2\66;\7\6\2\2\67;\5\34\17\28;\5\n\6\29;\5\6\4\2:\62\3\2\2\2:\63"
										  + "\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3"
										  + "\2\2\2;\3\3\2\2\2<=\7\t\2\2=>\7#\2\2>@\7\n\2\2?<\3\2\2\2?@\3\2\2\2@A\3"
										  + "\2\2\2AB\7$\2\2B\5\3\2\2\2CD\b\4\1\2DX\5\b\5\2EH\7\t\2\2FI\5\6\4\2GI\5"
										  + "\b\5\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\n\2\2KX\3\2\2\2LM\7\"\2\2MX\5"
										  + "\6\4\6NO\5\b\5\2OP\7 \2\2PQ\5\6\4\5QX\3\2\2\2RV\7\3\2\2SV\5\4\3\2TV\5"
										  + "\34\17\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2VX\3\2\2\2WC\3\2\2\2WE\3\2\2\2W"
										  + "L\3\2\2\2WN\3\2\2\2WU\3\2\2\2Xa\3\2\2\2YZ\f\t\2\2Z[\7 \2\2[`\5\6\4\n\\"
										  + "]\f\4\2\2]^\7 \2\2^`\5\b\5\2_Y\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2"
										  + "ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\7\t\2\2ef\5\b\5\2fg\7\n\2\2gt\3\2\2"
										  + "\2hi\5\n\6\2ij\7!\2\2jk\5\n\6\2kt\3\2\2\2lr\7\5\2\2mr\7\4\2\2nr\7\6\2"
										  + "\2or\5\4\3\2pr\5\34\17\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2"
										  + "\2\2rt\3\2\2\2sd\3\2\2\2sh\3\2\2\2sq\3\2\2\2t\t\3\2\2\2uv\b\6\1\2vw\7"
										  + "\t\2\2wx\5\n\6\2xy\7\n\2\2y\u0084\3\2\2\2z{\7\37\2\2{\u0084\5\n\6\4|\u0082"
										  + "\7\5\2\2}\u0082\7\4\2\2~\u0082\7\6\2\2\177\u0082\5\4\3\2\u0080\u0082\5"
										  + "\34\17\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2"
										  + "\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083u\3\2\2\2\u0083z\3\2\2"
										  + "\2\u0083\u0081\3\2\2\2\u0084\u008a\3\2\2\2\u0085\u0086\f\5\2\2\u0086\u0087"
										  + "\7\36\2\2\u0087\u0089\5\n\6\6\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2"
										  + "\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008a"
										  + "\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5\6\4\2"
										  + "\u0090\u0091\7\n\2\2\u0091\u0092\7\21\2\2\u0092\u0096\7\f\2\2\u0093\u0095"
										  + "\5 \21\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"
										  + "\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\22"
										  + "\2\2\u009a\u009b\7\f\2\2\u009b\u00a7\3\2\2\2\u009c\u009d\7\26\2\2\u009d"
										  + "\u009e\7\21\2\2\u009e\u00a2\7\f\2\2\u009f\u00a1\5 \21\2\u00a0\u009f\3"
										  + "\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"
										  + "\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a8\7"
										  + "\f\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\r\3\2\2\2\u00a9\u00aa"
										  + "\7\27\2\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\5\6\4\2\u00ac\u00ad\7\n\2\2"
										  + "\u00ad\u00ae\7\21\2\2\u00ae\u00b2\7\f\2\2\u00af\u00b1\5 \21\2\u00b0\u00af"
										  + "\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"
										  + "\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7\7"
										  + "\f\2\2\u00b7\17\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb"
										  + "\5\2\2\2\u00bb\u00bc\7\f\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7$\2\2\u00be"
										  + "\u00bf\7\17\2\2\u00bf\u00c0\5\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\23\3\2\2"
										  + "\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5\2\2\2\u00c5\u00c6"
										  + "\7\f\2\2\u00c6\25\3\2\2\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\5\2\2\2\u00c9"
										  + "\u00ca\7\f\2\2\u00ca\27\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7\f\2"
										  + "\2\u00cd\31\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\7\f\2\2\u00d0\33"
										  + "\3\2\2\2\u00d1\u00d4\7\34\2\2\u00d2\u00d5\7#\2\2\u00d3\u00d5\5\4\3\2\u00d4"
										  + "\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\f"
										  + "\2\2\u00d7\u00d8\7$\2\2\u00d8\u00e1\7\t\2\2\u00d9\u00de\5\2\2\2\u00da"
										  + "\u00db\7\13\2\2\u00db\u00dd\5\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3"
										  + "\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"
										  + "\u00de\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"
										  + "\2\2\u00e3\u00e4\7\n\2\2\u00e4\35\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00ef"
										  + "\7\t\2\2\u00e7\u00ec\5\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00eb\5\2\2\2"
										  + "\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"
										  + "\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef"
										  + "\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\7\f"
										  + "\2\2\u00f3\37\3\2\2\2\u00f4\u0107\5\f\7\2\u00f5\u0107\5\26\f\2\u00f6\u0107"
										  + "\5\30\r\2\u00f7\u0107\5\32\16\2\u00f8\u0107\5\16\b\2\u00f9\u0107\5*\26"
										  + "\2\u00fa\u0107\5,\27\2\u00fb\u0107\5.\30\2\u00fc\u0107\5\20\t\2\u00fd"
										  + "\u0107\5\22\n\2\u00fe\u0107\5\24\13\2\u00ff\u0101\7#\2\2\u0100\u00ff\3"
										  + "\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\34\17\2\u0103"
										  + "\u0104\7\f\2\2\u0104\u0107\3\2\2\2\u0105\u0107\5\36\20\2\u0106\u00f4\3"
										  + "\2\2\2\u0106\u00f5\3\2\2\2\u0106\u00f6\3\2\2\2\u0106\u00f7\3\2\2\2\u0106"
										  + "\u00f8\3\2\2\2\u0106\u00f9\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fb\3\2"
										  + "\2\2\u0106\u00fc\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"
										  + "\u0100\3\2\2\2\u0106\u0105\3\2\2\2\u0107!\3\2\2\2\u0108\u0109\7\23\2\2"
										  + "\u0109\u010a\7#\2\2\u010a\u010b\7$\2\2\u010b\u0116\7\t\2\2\u010c\u010d"
										  + "\7#\2\2\u010d\u010e\7$\2\2\u010e\u0110\7\13\2\2\u010f\u010c\3\2\2\2\u0110"
										  + "\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2"
										  + "\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7#\2\2\u0115\u0117\7$\2\2\u0116\u0111"
										  + "\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\n\2\2\u0119"
										  + "\u011a\7\21\2\2\u011a\u011c\7\f\2\2\u011b\u011d\5 \21\2\u011c\u011b\3"
										  + "\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"
										  + "\u0120\3\2\2\2\u0120\u0121\7\22\2\2\u0121\u0122\7\f\2\2\u0122#\3\2\2\2"
										  + "\u0123\u0124\7\33\2\2\u0124\u0126\7\t\2\2\u0125\u0127\5(\25\2\u0126\u0125"
										  + "\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"
										  + "\u012a\3\2\2\2\u012a\u012b\7\n\2\2\u012b%\3\2\2\2\u012c\u012d\7\20\2\2"
										  + "\u012d\u012e\7#\2\2\u012e\u0130\7\f\2\2\u012f\u0131\5$\23\2\u0130\u012f"
										  + "\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0134\5\"\22\2"
										  + "\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"
										  + "\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\22\2\2\u0138\u0139\7\f\2\2"
										  + "\u0139\'\3\2\2\2\u013a\u013e\5*\26\2\u013b\u013e\5,\27\2\u013c\u013e\5"
										  + ".\30\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e"
										  + ")\3\2\2\2\u013f\u0140\7%\2\2\u0140\u0141\7#\2\2\u0141\u014f\7$\2\2\u0142"
										  + "\u0143\7\24\2\2\u0143\u014c\7\t\2\2\u0144\u0149\5\2\2\2\u0145\u0146\7"
										  + "\13\2\2\u0146\u0148\5\2\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149"
										  + "\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"
										  + "\2\2\u014c\u0144\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"
										  + "\u0150\7\n\2\2\u014f\u0142\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2"
										  + "\2\2\u0151\u0152\7\f\2\2\u0152+\3\2\2\2\u0153\u0154\7&\2\2\u0154\u0155"
										  + "\7#\2\2\u0155\u0156\7$\2\2\u0156\u0157\7\24\2\2\u0157\u0160\7\t\2\2\u0158"
										  + "\u015d\5\2\2\2\u0159\u015a\7\13\2\2\u015a\u015c\5\2\2\2\u015b\u0159\3"
										  + "\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"
										  + "\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0161\3\2"
										  + "\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\n\2\2\u0163\u0164\7\f\2\2\u0164"
										  + "-\3\2\2\2\u0165\u0166\7\'\2\2\u0166\u0167\7#\2\2\u0167\u0168\7$\2\2\u0168"
										  + "\u0169\7\f\2\2\u0169/\3\2\2\2\u016a\u016b\5&\24\2\u016b\u016c\7\2\2\3"
										  + "\u016c\61\3\2\2\2%:?HUW_aqs\u0081\u0083\u008a\u0096\u00a2\u00a7\u00b2"
										  + "\u00d4\u00de\u00e1\u00ec\u00ef\u0100\u0106\u0111\u0116\u011e\u0128\u0130"
										  + "\u0135\u013d\u0149\u014c\u014f\u015d\u0160";
	public static final ATN _ATN
									= new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
