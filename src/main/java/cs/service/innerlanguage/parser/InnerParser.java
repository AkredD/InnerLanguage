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
			  WRITE = 27, NULL = 28, PARENT = 29, OPERATOR = 30, UNARYOPERATOR = 31, CONDITIONBOOLOPERATOR = 32,
			  CONDITIONOPERATOR = 33, CONDITIONUNARYPERATOR = 34, TYPENAME = 35, DATANAME = 36,
			  DATADEF = 37, CONSTANTDEF = 38, SYSTEMDEF = 39;
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
			"'='", "'-='", "'+='", null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "NUMBER", "DQ_STRING", "DATE", "WS", "COMMENTS", "OPENBRACKET",
			"CLOSEBRACKET", "COMMA", "ENDCOMMAND", "EQ", "MINUSEQ", "PLUSEQ", "TYPE",
			"STARTSTATEMENT", "ENDSTATEMENT", "FUNCTION", "VALUES", "IF", "ELSE",
			"WHILE", "RETURN", "CONTINUE", "BREAK", "STATIC", "CALL", "WRITE", "NULL",
			"PARENT", "OPERATOR", "UNARYOPERATOR", "CONDITIONBOOLOPERATOR", "CONDITIONOPERATOR",
			"CONDITIONUNARYPERATOR", "TYPENAME", "DATANAME", "DATADEF", "CONSTANTDEF",
			"SYSTEMDEF"
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
		public TerminalNode NULL() {
			return getToken(InnerParser.NULL, 0);
		}

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
				setState(57);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
					case 1: {
						setState(48);
						match(NULL);
					}
					break;
					case 2: {
						setState(49);
						dataname();
					}
					break;
					case 3: {
						setState(50);
						match(BOOLEAN);
					}
					break;
					case 4: {
						setState(51);
						match(NUMBER);
					}
					break;
					case 5: {
						setState(52);
						match(DQ_STRING);
					}
					break;
					case 6: {
						setState(53);
						match(DATE);
					}
					break;
					case 7: {
						setState(54);
						callStatement();
					}
					break;
					case 8: {
						setState(55);
						expression(0);
					}
					break;
					case 9: {
						setState(56);
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
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == OPENBRACKET) {
					{
						setState(59);
						match(OPENBRACKET);
						setState(60);
						match(TYPENAME);
						setState(61);
						match(CLOSEBRACKET);
					}
				}
				setState(64);
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
				setState(86);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
					case 1: {
						setState(67);
						boolExpression();
					}
					break;
					case 2: {
						setState(68);
						match(OPENBRACKET);
						setState(71);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
							case 1: {
								setState(69);
								condition(0);
							}
							break;
							case 2: {
								setState(70);
								boolExpression();
							}
							break;
						}
						setState(73);
						match(CLOSEBRACKET);
					}
					break;
					case 3: {
						setState(75);
						match(CONDITIONUNARYPERATOR);
						setState(76);
						condition(4);
					}
					break;
					case 4: {
						setState(77);
						boolExpression();
						setState(78);
						match(CONDITIONBOOLOPERATOR);
						setState(79);
						condition(3);
					}
					break;
					case 5: {
						setState(84);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case BOOLEAN: {
								setState(81);
								match(BOOLEAN);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(82);
								dataname();
							}
							break;
							case CALL: {
								setState(83);
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
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) {
							triggerExitRuleEvent();
						}
						_prevctx = _localctx;
						{
							setState(94);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
								case 1: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(88);
									if (!(precpred(_ctx, 7))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									}
									setState(89);
									match(CONDITIONBOOLOPERATOR);
									setState(90);
									condition(8);
								}
								break;
								case 2: {
									_localctx = new ConditionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_condition);
									setState(91);
									if (!(precpred(_ctx, 2))) {
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									}
									setState(92);
									match(CONDITIONBOOLOPERATOR);
									setState(93);
									boolExpression();
								}
								break;
							}
						}
					}
					setState(98);
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
			setState(114);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
					 {
						setState(99);
						match(OPENBRACKET);
						setState(100);
						boolExpression();
						setState(101);
						match(CLOSEBRACKET);
					}
					break;
				case 2:
					enterOuterAlt(_localctx, 2);
					 {
						setState(103);
						expression(0);
						setState(104);
						match(CONDITIONOPERATOR);
						setState(105);
						expression(0);
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					 {
						setState(112);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(107);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(108);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(109);
								match(DATE);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(110);
								dataname();
							}
							break;
							case CALL: {
								setState(111);
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
				setState(130);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
					case 1: {
						setState(117);
						match(OPENBRACKET);
						setState(118);
						expression(0);
						setState(119);
						match(CLOSEBRACKET);
					}
					break;
					case 2: {
						setState(121);
						match(UNARYOPERATOR);
						setState(122);
						expression(2);
					}
					break;
					case 3: {
						setState(128);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DQ_STRING: {
								setState(123);
								match(DQ_STRING);
							}
							break;
							case NUMBER: {
								setState(124);
								match(NUMBER);
							}
							break;
							case DATE: {
								setState(125);
								match(DATE);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(126);
								dataname();
							}
							break;
							case CALL: {
								setState(127);
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
				setState(137);
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
								setState(132);
								if (!(precpred(_ctx, 3))) {
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								}
								setState(133);
								match(OPERATOR);
								setState(134);
								expression(4);
							}
						}
					}
					setState(139);
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
				setState(140);
				match(IF);
				setState(141);
				match(OPENBRACKET);
				setState(142);
				condition(0);
				setState(143);
				match(CLOSEBRACKET);
				{
					setState(144);
					match(STARTSTATEMENT);
					setState(145);
					match(ENDCOMMAND);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(146);
								statement();
							}
						}
						setState(151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(152);
					match(ENDSTATEMENT);
					setState(153);
					match(ENDCOMMAND);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ELSE) {
					{
						setState(155);
						match(ELSE);
						setState(156);
						match(STARTSTATEMENT);
						setState(157);
						match(ENDCOMMAND);
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
							{
								{
									setState(158);
									statement();
								}
							}
							setState(163);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(164);
						match(ENDSTATEMENT);
						setState(165);
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
				setState(168);
				match(WHILE);
				setState(169);
				match(OPENBRACKET);
				setState(170);
				condition(0);
				setState(171);
				match(CLOSEBRACKET);
				{
					setState(172);
					match(STARTSTATEMENT);
					setState(173);
					match(ENDCOMMAND);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
						{
							{
								setState(174);
								statement();
							}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(180);
					match(ENDSTATEMENT);
					setState(181);
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
				setState(183);
				match(DATANAME);
				setState(184);
				match(EQ);
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
				setState(188);
				match(DATANAME);
				setState(189);
				match(PLUSEQ);
				setState(190);
				varValue();
				setState(191);
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
				setState(193);
				match(DATANAME);
				setState(194);
				match(MINUSEQ);
				setState(195);
				varValue();
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
				setState(198);
				match(RETURN);
				setState(199);
				varValue();
				setState(200);
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
				setState(202);
				match(CONTINUE);
				setState(203);
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
				setState(205);
				match(BREAK);
				setState(206);
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

		public TerminalNode DATANAME() {
			return getToken(InnerParser.DATANAME, 0);
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

		public TerminalNode TYPENAME() {
			return getToken(InnerParser.TYPENAME, 0);
		}

		public DatanameContext dataname() {
			return getRuleContext(DatanameContext.class, 0);
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
				setState(208);
				match(CALL);
				setState(214);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
					case 1: {
						setState(211);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case TYPENAME: {
								setState(209);
								match(TYPENAME);
							}
							break;
							case OPENBRACKET:
							case DATANAME: {
								setState(210);
								dataname();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(213);
						match(ENDCOMMAND);
					}
					break;
				}
				setState(216);
				match(DATANAME);
				setState(217);
				match(OPENBRACKET);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << NULL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(218);
						varValue();
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(219);
									match(COMMA);
									setState(220);
									varValue();
								}
							}
							setState(225);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(228);
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
				setState(230);
				match(WRITE);
				setState(231);
				match(OPENBRACKET);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << NULL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(232);
						varValue();
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(233);
									match(COMMA);
									setState(234);
									varValue();
								}
							}
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(242);
				match(CLOSEBRACKET);
				setState(243);
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
				setState(263);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
					case 1: {
						setState(245);
						ifStatement();
					}
					break;
					case 2: {
						setState(246);
						returnStatement();
					}
					break;
					case 3: {
						setState(247);
						continueStatement();
					}
					break;
					case 4: {
						setState(248);
						breakStatement();
					}
					break;
					case 5: {
						setState(249);
						whileStatement();
					}
					break;
					case 6: {
						setState(250);
						dataDef();
					}
					break;
					case 7: {
						setState(251);
						constantDef();
					}
					break;
					case 8: {
						setState(252);
						systemDef();
					}
					break;
					case 9: {
						setState(253);
						eqStatement();
					}
					break;
					case 10: {
						setState(254);
						plusEqStatement();
					}
					break;
					case 11: {
						setState(255);
						minusEqStatement();
					}
					break;
					case 12: {
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == TYPENAME) {
							{
								setState(256);
								match(TYPENAME);
							}
						}
						setState(259);
						callStatement();
						setState(260);
						match(ENDCOMMAND);
					}
					break;
					case 13: {
						setState(262);
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
				setState(265);
				match(FUNCTION);
				setState(266);
				match(TYPENAME);
				setState(267);
				match(DATANAME);
				setState(268);
				match(OPENBRACKET);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == TYPENAME) {
					{
						setState(274);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(269);
										match(TYPENAME);
										setState(270);
										match(DATANAME);
										setState(271);
										match(COMMA);
									}
								}
							}
							setState(276);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
						}
						setState(277);
						match(TYPENAME);
						setState(278);
						match(DATANAME);
					}
				}
				setState(281);
				match(CLOSEBRACKET);
				setState(282);
				match(STARTSTATEMENT);
				setState(283);
				match(ENDCOMMAND);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(284);
							statement();
						}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << TYPENAME) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(289);
				match(ENDSTATEMENT);
				setState(290);
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
				setState(292);
				match(STATIC);
				setState(293);
				match(OPENBRACKET);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(294);
							varDefinition();
						}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0));
				setState(299);
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

		public List<TerminalNode> TYPENAME() {
			return getTokens(InnerParser.TYPENAME);
		}

		public TerminalNode TYPENAME(int i) {
			return getToken(InnerParser.TYPENAME, i);
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

		public TerminalNode PARENT() {
			return getToken(InnerParser.PARENT, 0);
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
				setState(301);
				match(TYPE);
				setState(302);
				match(TYPENAME);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == PARENT) {
					{
						setState(303);
						match(PARENT);
						setState(304);
						match(TYPENAME);
					}
				}
				setState(307);
				match(ENDCOMMAND);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == STATIC) {
					{
						setState(308);
						staticBlock();
					}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(311);
							function();
						}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == FUNCTION);
				setState(316);
				match(ENDSTATEMENT);
				setState(317);
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
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DATADEF:
					enterOuterAlt(_localctx, 1);
					 {
						setState(319);
						dataDef();
					}
					break;
				case CONSTANTDEF:
					enterOuterAlt(_localctx, 2);
					 {
						setState(320);
						constantDef();
					}
					break;
				case SYSTEMDEF:
					enterOuterAlt(_localctx, 3);
					 {
						setState(321);
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
				setState(324);
				match(DATADEF);
				setState(325);
				match(TYPENAME);
				setState(326);
				match(DATANAME);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == VALUES) {
					{
						setState(327);
						match(VALUES);
						setState(328);
						match(OPENBRACKET);
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << NULL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
							{
								setState(329);
								varValue();
								setState(334);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(330);
											match(COMMA);
											setState(331);
											varValue();
										}
									}
									setState(336);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
						}
						setState(339);
						match(CLOSEBRACKET);
					}
				}
				setState(342);
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
				setState(344);
				match(CONSTANTDEF);
				setState(345);
				match(TYPENAME);
				setState(346);
				match(DATANAME);
				setState(347);
				match(VALUES);
				setState(348);
				match(OPENBRACKET);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << NULL) | (1L << UNARYOPERATOR) | (1L << CONDITIONUNARYPERATOR) | (1L << DATANAME))) != 0)) {
					{
						setState(349);
						varValue();
						setState(354);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(350);
									match(COMMA);
									setState(351);
									varValue();
								}
							}
							setState(356);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				setState(359);
				match(CLOSEBRACKET);
				setState(360);
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
				setState(362);
				match(SYSTEMDEF);
				setState(363);
				match(TYPENAME);
				setState(364);
				match(DATANAME);
				setState(365);
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
				setState(367);
				type();
				setState(368);
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
										= "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0175\4\2\t\2\4"
										  + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
										  + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
										  + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
										  + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\3\3\3\3\3\5\3A\n\3\3\3"
										  + "\3\3\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"
										  + "\3\4\3\4\5\4W\n\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d"
										  + "\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\5\5"
										  + "u\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\5"
										  + "\6\u0085\n\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7"
										  + "\3\7\3\7\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\3\7\3\7\3\7\3\7"
										  + "\3\7\3\7\7\7\u00a2\n\7\f\7\16\7\u00a5\13\7\3\7\3\7\5\7\u00a9\n\7\3\b\3"
										  + "\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\3\b\3\b\3\b\3"
										  + "\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"
										  + "\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00d6\n\17\3"
										  + "\17\5\17\u00d9\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16\17"
										  + "\u00e3\13\17\5\17\u00e5\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00ee"
										  + "\n\20\f\20\16\20\u00f1\13\20\5\20\u00f3\n\20\3\20\3\20\3\20\3\21\3\21"
										  + "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0104\n\21\3\21"
										  + "\3\21\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"
										  + "\u0113\n\22\f\22\16\22\u0116\13\22\3\22\3\22\5\22\u011a\n\22\3\22\3\22"
										  + "\3\22\3\22\6\22\u0120\n\22\r\22\16\22\u0121\3\22\3\22\3\22\3\23\3\23\3"
										  + "\23\6\23\u012a\n\23\r\23\16\23\u012b\3\23\3\23\3\24\3\24\3\24\3\24\5\24"
										  + "\u0134\n\24\3\24\3\24\5\24\u0138\n\24\3\24\6\24\u013b\n\24\r\24\16\24"
										  + "\u013c\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0145\n\25\3\26\3\26\3\26\3"
										  + "\26\3\26\3\26\3\26\3\26\7\26\u014f\n\26\f\26\16\26\u0152\13\26\5\26\u0154"
										  + "\n\26\3\26\5\26\u0157\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"
										  + "\3\27\7\27\u0163\n\27\f\27\16\27\u0166\13\27\5\27\u0168\n\27\3\27\3\27"
										  + "\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\2\4\6\n\32\2\4\6\b"
										  + "\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u01a0\2;\3\2\2\2\4@"
										  + "\3\2\2\2\6X\3\2\2\2\bt\3\2\2\2\n\u0084\3\2\2\2\f\u008e\3\2\2\2\16\u00aa"
										  + "\3\2\2\2\20\u00b9\3\2\2\2\22\u00be\3\2\2\2\24\u00c3\3\2\2\2\26\u00c8\3"
										  + "\2\2\2\30\u00cc\3\2\2\2\32\u00cf\3\2\2\2\34\u00d2\3\2\2\2\36\u00e8\3\2"
										  + "\2\2 \u0109\3\2\2\2\"\u010b\3\2\2\2$\u0126\3\2\2\2&\u012f\3\2\2\2(\u0144"
										  + "\3\2\2\2*\u0146\3\2\2\2,\u015a\3\2\2\2.\u016c\3\2\2\2\60\u0171\3\2\2\2"
										  + "\62<\7\36\2\2\63<\5\4\3\2\64<\7\3\2\2\65<\7\4\2\2\66<\7\5\2\2\67<\7\6"
										  + "\2\28<\5\34\17\29<\5\n\6\2:<\5\6\4\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2"
										  + "\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<"
										  + "\3\3\2\2\2=>\7\t\2\2>?\7%\2\2?A\7\n\2\2@=\3\2\2\2@A\3\2\2\2AB\3\2\2\2"
										  + "BC\7&\2\2C\5\3\2\2\2DE\b\4\1\2EY\5\b\5\2FI\7\t\2\2GJ\5\6\4\2HJ\5\b\5\2"
										  + "IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KL\7\n\2\2LY\3\2\2\2MN\7$\2\2NY\5\6\4\6"
										  + "OP\5\b\5\2PQ\7\"\2\2QR\5\6\4\5RY\3\2\2\2SW\7\3\2\2TW\5\4\3\2UW\5\34\17"
										  + "\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WY\3\2\2\2XD\3\2\2\2XF\3\2\2\2XM\3\2\2"
										  + "\2XO\3\2\2\2XV\3\2\2\2Yb\3\2\2\2Z[\f\t\2\2[\\\7\"\2\2\\a\5\6\4\n]^\f\4"
										  + "\2\2^_\7\"\2\2_a\5\b\5\2`Z\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2"
										  + "\2\2c\7\3\2\2\2db\3\2\2\2ef\7\t\2\2fg\5\b\5\2gh\7\n\2\2hu\3\2\2\2ij\5"
										  + "\n\6\2jk\7#\2\2kl\5\n\6\2lu\3\2\2\2ms\7\5\2\2ns\7\4\2\2os\7\6\2\2ps\5"
										  + "\4\3\2qs\5\34\17\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s"
										  + "u\3\2\2\2te\3\2\2\2ti\3\2\2\2tr\3\2\2\2u\t\3\2\2\2vw\b\6\1\2wx\7\t\2\2"
										  + "xy\5\n\6\2yz\7\n\2\2z\u0085\3\2\2\2{|\7!\2\2|\u0085\5\n\6\4}\u0083\7\5"
										  + "\2\2~\u0083\7\4\2\2\177\u0083\7\6\2\2\u0080\u0083\5\4\3\2\u0081\u0083"
										  + "\5\34\17\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080"
										  + "\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0085\3\2\2\2\u0084v\3\2\2\2\u0084"
										  + "{\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u0087\f\5\2\2"
										  + "\u0087\u0088\7 \2\2\u0088\u008a\5\n\6\6\u0089\u0086\3\2\2\2\u008a\u008d"
										  + "\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d"
										  + "\u008b\3\2\2\2\u008e\u008f\7\25\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5"
										  + "\6\4\2\u0091\u0092\7\n\2\2\u0092\u0093\7\21\2\2\u0093\u0097\7\f\2\2\u0094"
										  + "\u0096\5 \21\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"
										  + "\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"
										  + "\u009b\7\22\2\2\u009b\u009c\7\f\2\2\u009c\u00a8\3\2\2\2\u009d\u009e\7"
										  + "\26\2\2\u009e\u009f\7\21\2\2\u009f\u00a3\7\f\2\2\u00a0\u00a2\5 \21\2\u00a1"
										  + "\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"
										  + "\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7"
										  + "\u00a9\7\f\2\2\u00a8\u009d\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\r\3\2\2\2"
										  + "\u00aa\u00ab\7\27\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae"
										  + "\7\n\2\2\u00ae\u00af\7\21\2\2\u00af\u00b3\7\f\2\2\u00b0\u00b2\5 \21\2"
										  + "\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"
										  + "\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\22\2\2"
										  + "\u00b7\u00b8\7\f\2\2\u00b8\17\3\2\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb\7"
										  + "\r\2\2\u00bb\u00bc\5\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\21\3\2\2\2\u00be"
										  + "\u00bf\7&\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\5\2\2\2\u00c1\u00c2\7\f"
										  + "\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6"
										  + "\5\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\7\30\2\2\u00c9"
										  + "\u00ca\5\2\2\2\u00ca\u00cb\7\f\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7\31\2"
										  + "\2\u00cd\u00ce\7\f\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\32\2\2\u00d0\u00d1"
										  + "\7\f\2\2\u00d1\33\3\2\2\2\u00d2\u00d8\7\34\2\2\u00d3\u00d6\7%\2\2\u00d4"
										  + "\u00d6\5\4\3\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2"
										  + "\2\2\u00d7\u00d9\7\f\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"
										  + "\u00da\3\2\2\2\u00da\u00db\7&\2\2\u00db\u00e4\7\t\2\2\u00dc\u00e1\5\2"
										  + "\2\2\u00dd\u00de\7\13\2\2\u00de\u00e0\5\2\2\2\u00df\u00dd\3\2\2\2\u00e0"
										  + "\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2"
										  + "\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"
										  + "\u00e6\3\2\2\2\u00e6\u00e7\7\n\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\7\35\2"
										  + "\2\u00e9\u00f2\7\t\2\2\u00ea\u00ef\5\2\2\2\u00eb\u00ec\7\13\2\2\u00ec"
										  + "\u00ee\5\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"
										  + "\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"
										  + "\u00ea\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\n"
										  + "\2\2\u00f5\u00f6\7\f\2\2\u00f6\37\3\2\2\2\u00f7\u010a\5\f\7\2\u00f8\u010a"
										  + "\5\26\f\2\u00f9\u010a\5\30\r\2\u00fa\u010a\5\32\16\2\u00fb\u010a\5\16"
										  + "\b\2\u00fc\u010a\5*\26\2\u00fd\u010a\5,\27\2\u00fe\u010a\5.\30\2\u00ff"
										  + "\u010a\5\20\t\2\u0100\u010a\5\22\n\2\u0101\u010a\5\24\13\2\u0102\u0104"
										  + "\7%\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"
										  + "\u0106\5\34\17\2\u0106\u0107\7\f\2\2\u0107\u010a\3\2\2\2\u0108\u010a\5"
										  + "\36\20\2\u0109\u00f7\3\2\2\2\u0109\u00f8\3\2\2\2\u0109\u00f9\3\2\2\2\u0109"
										  + "\u00fa\3\2\2\2\u0109\u00fb\3\2\2\2\u0109\u00fc\3\2\2\2\u0109\u00fd\3\2"
										  + "\2\2\u0109\u00fe\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0100\3\2\2\2\u0109"
										  + "\u0101\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0108\3\2\2\2\u010a!\3\2\2\2"
										  + "\u010b\u010c\7\23\2\2\u010c\u010d\7%\2\2\u010d\u010e\7&\2\2\u010e\u0119"
										  + "\7\t\2\2\u010f\u0110\7%\2\2\u0110\u0111\7&\2\2\u0111\u0113\7\13\2\2\u0112"
										  + "\u010f\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"
										  + "\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7%\2\2\u0118"
										  + "\u011a\7&\2\2\u0119\u0114\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"
										  + "\2\2\u011b\u011c\7\n\2\2\u011c\u011d\7\21\2\2\u011d\u011f\7\f\2\2\u011e"
										  + "\u0120\5 \21\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2"
										  + "\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\22\2\2\u0124"
										  + "\u0125\7\f\2\2\u0125#\3\2\2\2\u0126\u0127\7\33\2\2\u0127\u0129\7\t\2\2"
										  + "\u0128\u012a\5(\25\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129"
										  + "\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\n\2\2\u012e"
										  + "%\3\2\2\2\u012f\u0130\7\20\2\2\u0130\u0133\7%\2\2\u0131\u0132\7\37\2\2"
										  + "\u0132\u0134\7%\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"
										  + "\3\2\2\2\u0135\u0137\7\f\2\2\u0136\u0138\5$\23\2\u0137\u0136\3\2\2\2\u0137"
										  + "\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\"\22\2\u013a\u0139\3"
										  + "\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"
										  + "\u013e\3\2\2\2\u013e\u013f\7\22\2\2\u013f\u0140\7\f\2\2\u0140\'\3\2\2"
										  + "\2\u0141\u0145\5*\26\2\u0142\u0145\5,\27\2\u0143\u0145\5.\30\2\u0144\u0141"
										  + "\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145)\3\2\2\2\u0146"
										  + "\u0147\7\'\2\2\u0147\u0148\7%\2\2\u0148\u0156\7&\2\2\u0149\u014a\7\24"
										  + "\2\2\u014a\u0153\7\t\2\2\u014b\u0150\5\2\2\2\u014c\u014d\7\13\2\2\u014d"
										  + "\u014f\5\2\2\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"
										  + "\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153"
										  + "\u014b\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\7\n"
										  + "\2\2\u0156\u0149\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"
										  + "\u0159\7\f\2\2\u0159+\3\2\2\2\u015a\u015b\7(\2\2\u015b\u015c\7%\2\2\u015c"
										  + "\u015d\7&\2\2\u015d\u015e\7\24\2\2\u015e\u0167\7\t\2\2\u015f\u0164\5\2"
										  + "\2\2\u0160\u0161\7\13\2\2\u0161\u0163\5\2\2\2\u0162\u0160\3\2\2\2\u0163"
										  + "\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2"
										  + "\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0168\3\2\2\2\u0168"
										  + "\u0169\3\2\2\2\u0169\u016a\7\n\2\2\u016a\u016b\7\f\2\2\u016b-\3\2\2\2"
										  + "\u016c\u016d\7)\2\2\u016d\u016e\7%\2\2\u016e\u016f\7&\2\2\u016f\u0170"
										  + "\7\f\2\2\u0170/\3\2\2\2\u0171\u0172\5&\24\2\u0172\u0173\7\2\2\3\u0173"
										  + "\61\3\2\2\2\';@IVX`brt\u0082\u0084\u008b\u0097\u00a3\u00a8\u00b3\u00d5"
										  + "\u00d8\u00e1\u00e4\u00ef\u00f2\u0103\u0109\u0114\u0119\u0121\u012b\u0133"
										  + "\u0137\u013c\u0144\u0150\u0153\u0156\u0164\u0167";
	public static final ATN _ATN
									= new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
