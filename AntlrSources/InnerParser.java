// Generated from Inner.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, NUMBER=2, DQ_STRING=3, DATE=4, WS=5, COMMENTS=6, OPENBRACKET=7, 
		CLOSEBRACKET=8, COMMA=9, ENDCOMMAND=10, EQ=11, MINUSEQ=12, PLUSEQ=13, 
		TYPE=14, STARTSTATEMENT=15, ENDSTATEMENT=16, FUNCTION=17, VALUES=18, IF=19, 
		ELSE=20, WHILE=21, RETURN=22, CONTINUE=23, BREAK=24, STATIC=25, CALL=26, 
		WRITE=27, OPERATOR=28, UNARYOPERATOR=29, CONDITIONBOOLOPERATOR=30, CONDITIONOPERATOR=31, 
		CONDITIONUNARYPERATOR=32, TYPENAME=33, DATANAME=34, DATADEF=35, CONSTANTDEF=36, 
		SYSTEMDEF=37;
	public static final int
		RULE_varValue = 0, RULE_condition = 1, RULE_boolExpression = 2, RULE_expression = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_eqStatement = 6, RULE_plusEqStatemet = 7, 
		RULE_minusEqStatemet = 8, RULE_returnStatement = 9, RULE_continueStatement = 10, 
		RULE_breakStatement = 11, RULE_callStatement = 12, RULE_writeStatement = 13, 
		RULE_statement = 14, RULE_function = 15, RULE_staticBlock = 16, RULE_type = 17, 
		RULE_dataDef = 18, RULE_constantDef = 19, RULE_systemDef = 20, RULE_inner = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"varValue", "condition", "boolExpression", "expression", "ifStatement", 
			"whileStatement", "eqStatement", "plusEqStatemet", "minusEqStatemet", 
			"returnStatement", "continueStatement", "breakStatement", "callStatement", 
			"writeStatement", "statement", "function", "staticBlock", "type", "dataDef", 
			"constantDef", "systemDef", "inner"
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
	public String getGrammarFileName() { return "Inner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InnerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VarValueContext extends ParserRuleContext {
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode BOOLEAN() { return getToken(InnerParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(InnerParser.NUMBER, 0); }
		public TerminalNode DQ_STRING() { return getToken(InnerParser.DQ_STRING, 0); }
		public TerminalNode DATE() { return getToken(InnerParser.DATE, 0); }
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public VarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitVarValue(this);
		}
	}

	public final VarValueContext varValue() throws RecognitionException {
		VarValueContext _localctx = new VarValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATANAME:
				{
				setState(44);
				match(DATANAME);
				}
				break;
			case BOOLEAN:
				{
				setState(45);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				{
				setState(46);
				match(NUMBER);
				}
				break;
			case DQ_STRING:
				{
				setState(47);
				match(DQ_STRING);
				}
				break;
			case DATE:
				{
				setState(48);
				match(DATE);
				}
				break;
			case OPENBRACKET:
			case CALL:
				{
				setState(49);
				callStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CONDITIONUNARYPERATOR() { return getToken(InnerParser.CONDITIONUNARYPERATOR, 0); }
		public TerminalNode CONDITIONBOOLOPERATOR() { return getToken(InnerParser.CONDITIONBOOLOPERATOR, 0); }
		public TerminalNode BOOLEAN() { return getToken(InnerParser.BOOLEAN, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitCondition(this);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53);
				boolExpression();
				}
				break;
			case 2:
				{
				setState(54);
				match(OPENBRACKET);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					condition(0);
					}
					break;
				case 2:
					{
					setState(56);
					boolExpression();
					}
					break;
				}
				setState(59);
				match(CLOSEBRACKET);
				}
				break;
			case 3:
				{
				setState(61);
				match(CONDITIONUNARYPERATOR);
				setState(62);
				condition(4);
				}
				break;
			case 4:
				{
				setState(63);
				boolExpression();
				setState(64);
				match(CONDITIONBOOLOPERATOR);
				setState(65);
				condition(3);
				}
				break;
			case 5:
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
					{
					setState(67);
					match(BOOLEAN);
					}
					break;
				case DATANAME:
					{
					setState(68);
					match(DATANAME);
					}
					break;
				case OPENBRACKET:
				case CALL:
					{
					setState(69);
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
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						match(CONDITIONBOOLOPERATOR);
						setState(76);
						condition(8);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(77);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(78);
						match(CONDITIONBOOLOPERATOR);
						setState(79);
						boolExpression();
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONDITIONOPERATOR() { return getToken(InnerParser.CONDITIONOPERATOR, 0); }
		public TerminalNode DQ_STRING() { return getToken(InnerParser.DQ_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(InnerParser.NUMBER, 0); }
		public TerminalNode DATE() { return getToken(InnerParser.DATE, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitBoolExpression(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolExpression);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(OPENBRACKET);
				setState(86);
				boolExpression();
				setState(87);
				match(CLOSEBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				expression(0);
				setState(90);
				match(CONDITIONOPERATOR);
				setState(91);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DQ_STRING:
					{
					setState(93);
					match(DQ_STRING);
					}
					break;
				case NUMBER:
					{
					setState(94);
					match(NUMBER);
					}
					break;
				case DATE:
					{
					setState(95);
					match(DATE);
					}
					break;
				case DATANAME:
					{
					setState(96);
					match(DATANAME);
					}
					break;
				case OPENBRACKET:
				case CALL:
					{
					setState(97);
					callStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public TerminalNode UNARYOPERATOR() { return getToken(InnerParser.UNARYOPERATOR, 0); }
		public TerminalNode DQ_STRING() { return getToken(InnerParser.DQ_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(InnerParser.NUMBER, 0); }
		public TerminalNode DATE() { return getToken(InnerParser.DATE, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(InnerParser.OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitExpression(this);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				match(OPENBRACKET);
				setState(104);
				expression(0);
				setState(105);
				match(CLOSEBRACKET);
				}
				break;
			case 2:
				{
				setState(107);
				match(UNARYOPERATOR);
				setState(108);
				expression(2);
				}
				break;
			case 3:
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DQ_STRING:
					{
					setState(109);
					match(DQ_STRING);
					}
					break;
				case NUMBER:
					{
					setState(110);
					match(NUMBER);
					}
					break;
				case DATE:
					{
					setState(111);
					match(DATE);
					}
					break;
				case DATANAME:
					{
					setState(112);
					match(DATANAME);
					}
					break;
				case OPENBRACKET:
				case CALL:
					{
					setState(113);
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
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(118);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(119);
					match(OPERATOR);
					setState(120);
					expression(4);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(InnerParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> STARTSTATEMENT() { return getTokens(InnerParser.STARTSTATEMENT); }
		public TerminalNode STARTSTATEMENT(int i) {
			return getToken(InnerParser.STARTSTATEMENT, i);
		}
		public List<TerminalNode> ENDCOMMAND() { return getTokens(InnerParser.ENDCOMMAND); }
		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}
		public List<TerminalNode> ENDSTATEMENT() { return getTokens(InnerParser.ENDSTATEMENT); }
		public TerminalNode ENDSTATEMENT(int i) {
			return getToken(InnerParser.ENDSTATEMENT, i);
		}
		public TerminalNode ELSE() { return getToken(InnerParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IF);
			setState(127);
			match(OPENBRACKET);
			setState(128);
			condition(0);
			setState(129);
			match(CLOSEBRACKET);
			{
			setState(130);
			match(STARTSTATEMENT);
			setState(131);
			match(ENDCOMMAND);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACKET) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(ENDSTATEMENT);
			setState(139);
			match(ENDCOMMAND);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(141);
				match(ELSE);
				setState(142);
				match(STARTSTATEMENT);
				setState(143);
				match(ENDCOMMAND);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACKET) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
					{
					{
					setState(144);
					statement();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(ENDSTATEMENT);
				setState(151);
				match(ENDCOMMAND);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(InnerParser.WHILE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public TerminalNode STARTSTATEMENT() { return getToken(InnerParser.STARTSTATEMENT, 0); }
		public List<TerminalNode> ENDCOMMAND() { return getTokens(InnerParser.ENDCOMMAND); }
		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(InnerParser.ENDSTATEMENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WHILE);
			setState(155);
			match(OPENBRACKET);
			setState(156);
			condition(0);
			setState(157);
			match(CLOSEBRACKET);
			{
			setState(158);
			match(STARTSTATEMENT);
			setState(159);
			match(ENDCOMMAND);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACKET) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(ENDSTATEMENT);
			setState(167);
			match(ENDCOMMAND);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqStatementContext extends ParserRuleContext {
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode EQ() { return getToken(InnerParser.EQ, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EqStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterEqStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitEqStatement(this);
		}
	}

	public final EqStatementContext eqStatement() throws RecognitionException {
		EqStatementContext _localctx = new EqStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eqStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DATANAME);
			setState(170);
			match(EQ);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(171);
				expression(0);
				}
				break;
			case 2:
				{
				setState(172);
				condition(0);
				}
				break;
			}
			setState(175);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusEqStatemetContext extends ParserRuleContext {
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode PLUSEQ() { return getToken(InnerParser.PLUSEQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public PlusEqStatemetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusEqStatemet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterPlusEqStatemet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitPlusEqStatemet(this);
		}
	}

	public final PlusEqStatemetContext plusEqStatemet() throws RecognitionException {
		PlusEqStatemetContext _localctx = new PlusEqStatemetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plusEqStatemet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DATANAME);
			setState(178);
			match(PLUSEQ);
			setState(179);
			expression(0);
			setState(180);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusEqStatemetContext extends ParserRuleContext {
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode MINUSEQ() { return getToken(InnerParser.MINUSEQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public MinusEqStatemetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusEqStatemet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterMinusEqStatemet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitMinusEqStatemet(this);
		}
	}

	public final MinusEqStatemetContext minusEqStatemet() throws RecognitionException {
		MinusEqStatemetContext _localctx = new MinusEqStatemetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_minusEqStatemet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DATANAME);
			setState(183);
			match(MINUSEQ);
			setState(184);
			expression(0);
			setState(185);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(InnerParser.RETURN, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(RETURN);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(188);
				match(DATANAME);
				}
				break;
			case 2:
				{
				setState(189);
				condition(0);
				}
				break;
			case 3:
				{
				setState(190);
				expression(0);
				}
				break;
			}
			setState(193);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(InnerParser.CONTINUE, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CONTINUE);
			setState(196);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(InnerParser.BREAK, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BREAK);
			setState(199);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(InnerParser.CALL, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}
		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InnerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitCallStatement(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callStatement);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(CALL);
				setState(202);
				match(DATANAME);
				setState(203);
				match(OPENBRACKET);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << DATANAME))) != 0)) {
					{
					setState(204);
					varValue();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(205);
						match(COMMA);
						setState(206);
						varValue();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(CLOSEBRACKET);
				}
				break;
			case OPENBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(OPENBRACKET);
				setState(216);
				callStatement();
				setState(217);
				match(CLOSEBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(InnerParser.WRITE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}
		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InnerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WRITE);
			setState(222);
			match(OPENBRACKET);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << NUMBER) | (1L << DQ_STRING) | (1L << DATE) | (1L << OPENBRACKET) | (1L << CALL) | (1L << DATANAME))) != 0)) {
				{
				setState(223);
				varValue();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					varValue();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(233);
			match(CLOSEBRACKET);
			setState(234);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DataDefContext dataDef() {
			return getRuleContext(DataDefContext.class,0);
		}
		public ConstantDefContext constantDef() {
			return getRuleContext(ConstantDefContext.class,0);
		}
		public SystemDefContext systemDef() {
			return getRuleContext(SystemDefContext.class,0);
		}
		public EqStatementContext eqStatement() {
			return getRuleContext(EqStatementContext.class,0);
		}
		public PlusEqStatemetContext plusEqStatemet() {
			return getRuleContext(PlusEqStatemetContext.class,0);
		}
		public MinusEqStatemetContext minusEqStatemet() {
			return getRuleContext(MinusEqStatemetContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(236);
				ifStatement();
				}
				break;
			case 2:
				{
				setState(237);
				returnStatement();
				}
				break;
			case 3:
				{
				setState(238);
				continueStatement();
				}
				break;
			case 4:
				{
				setState(239);
				breakStatement();
				}
				break;
			case 5:
				{
				setState(240);
				whileStatement();
				}
				break;
			case 6:
				{
				setState(241);
				dataDef();
				}
				break;
			case 7:
				{
				setState(242);
				constantDef();
				}
				break;
			case 8:
				{
				setState(243);
				systemDef();
				}
				break;
			case 9:
				{
				setState(244);
				eqStatement();
				}
				break;
			case 10:
				{
				setState(245);
				plusEqStatemet();
				}
				break;
			case 11:
				{
				setState(246);
				minusEqStatemet();
				}
				break;
			case 12:
				{
				setState(247);
				callStatement();
				setState(248);
				match(ENDCOMMAND);
				}
				break;
			case 13:
				{
				setState(250);
				writeStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(InnerParser.FUNCTION, 0); }
		public List<TerminalNode> TYPENAME() { return getTokens(InnerParser.TYPENAME); }
		public TerminalNode TYPENAME(int i) {
			return getToken(InnerParser.TYPENAME, i);
		}
		public List<TerminalNode> DATANAME() { return getTokens(InnerParser.DATANAME); }
		public TerminalNode DATANAME(int i) {
			return getToken(InnerParser.DATANAME, i);
		}
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public TerminalNode STARTSTATEMENT() { return getToken(InnerParser.STARTSTATEMENT, 0); }
		public List<TerminalNode> ENDCOMMAND() { return getTokens(InnerParser.ENDCOMMAND); }
		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(InnerParser.ENDSTATEMENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InnerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitFunction(this);
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
			setState(253);
			match(FUNCTION);
			setState(254);
			match(TYPENAME);
			setState(255);
			match(DATANAME);
			setState(256);
			match(OPENBRACKET);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPENAME) {
				{
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						match(TYPENAME);
						setState(258);
						match(DATANAME);
						setState(259);
						match(COMMA);
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(265);
				match(TYPENAME);
				setState(266);
				match(DATANAME);
				}
			}

			setState(269);
			match(CLOSEBRACKET);
			setState(270);
			match(STARTSTATEMENT);
			setState(271);
			match(ENDCOMMAND);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272);
				statement();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACKET) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << BREAK) | (1L << CALL) | (1L << WRITE) | (1L << DATANAME) | (1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0) );
			setState(277);
			match(ENDSTATEMENT);
			setState(278);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticBlockContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(InnerParser.STATIC, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<DataDefContext> dataDef() {
			return getRuleContexts(DataDefContext.class);
		}
		public DataDefContext dataDef(int i) {
			return getRuleContext(DataDefContext.class,i);
		}
		public List<ConstantDefContext> constantDef() {
			return getRuleContexts(ConstantDefContext.class);
		}
		public ConstantDefContext constantDef(int i) {
			return getRuleContext(ConstantDefContext.class,i);
		}
		public List<SystemDefContext> systemDef() {
			return getRuleContexts(SystemDefContext.class);
		}
		public SystemDefContext systemDef(int i) {
			return getRuleContext(SystemDefContext.class,i);
		}
		public StaticBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterStaticBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitStaticBlock(this);
		}
	}

	public final StaticBlockContext staticBlock() throws RecognitionException {
		StaticBlockContext _localctx = new StaticBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_staticBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(STATIC);
			setState(281);
			match(OPENBRACKET);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATADEF:
					{
					setState(282);
					dataDef();
					}
					break;
				case CONSTANTDEF:
					{
					setState(283);
					constantDef();
					}
					break;
				case SYSTEMDEF:
					{
					setState(284);
					systemDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATADEF) | (1L << CONSTANTDEF) | (1L << SYSTEMDEF))) != 0) );
			setState(289);
			match(CLOSEBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(InnerParser.TYPE, 0); }
		public TerminalNode TYPENAME() { return getToken(InnerParser.TYPENAME, 0); }
		public List<TerminalNode> ENDCOMMAND() { return getTokens(InnerParser.ENDCOMMAND); }
		public TerminalNode ENDCOMMAND(int i) {
			return getToken(InnerParser.ENDCOMMAND, i);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(InnerParser.ENDSTATEMENT, 0); }
		public StaticBlockContext staticBlock() {
			return getRuleContext(StaticBlockContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TYPE);
			setState(292);
			match(TYPENAME);
			setState(293);
			match(ENDCOMMAND);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(294);
				staticBlock();
				}
			}

			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				function();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			setState(302);
			match(ENDSTATEMENT);
			setState(303);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDefContext extends ParserRuleContext {
		public TerminalNode DATADEF() { return getToken(InnerParser.DATADEF, 0); }
		public TerminalNode TYPENAME() { return getToken(InnerParser.TYPENAME, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public TerminalNode VALUES() { return getToken(InnerParser.VALUES, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}
		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InnerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}
		public DataDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterDataDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitDataDef(this);
		}
	}

	public final DataDefContext dataDef() throws RecognitionException {
		DataDefContext _localctx = new DataDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(DATADEF);
			setState(306);
			match(TYPENAME);
			setState(307);
			match(DATANAME);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(308);
				match(VALUES);
				setState(309);
				match(OPENBRACKET);
				setState(310);
				varValue();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					varValue();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(CLOSEBRACKET);
				}
			}

			setState(322);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefContext extends ParserRuleContext {
		public TerminalNode CONSTANTDEF() { return getToken(InnerParser.CONSTANTDEF, 0); }
		public TerminalNode TYPENAME() { return getToken(InnerParser.TYPENAME, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode VALUES() { return getToken(InnerParser.VALUES, 0); }
		public TerminalNode OPENBRACKET() { return getToken(InnerParser.OPENBRACKET, 0); }
		public List<VarValueContext> varValue() {
			return getRuleContexts(VarValueContext.class);
		}
		public VarValueContext varValue(int i) {
			return getRuleContext(VarValueContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(InnerParser.CLOSEBRACKET, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InnerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InnerParser.COMMA, i);
		}
		public ConstantDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterConstantDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitConstantDef(this);
		}
	}

	public final ConstantDefContext constantDef() throws RecognitionException {
		ConstantDefContext _localctx = new ConstantDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(CONSTANTDEF);
			setState(325);
			match(TYPENAME);
			setState(326);
			match(DATANAME);
			setState(327);
			match(VALUES);
			setState(328);
			match(OPENBRACKET);
			setState(329);
			varValue();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
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
			setState(337);
			match(CLOSEBRACKET);
			setState(338);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemDefContext extends ParserRuleContext {
		public TerminalNode SYSTEMDEF() { return getToken(InnerParser.SYSTEMDEF, 0); }
		public TerminalNode TYPENAME() { return getToken(InnerParser.TYPENAME, 0); }
		public TerminalNode DATANAME() { return getToken(InnerParser.DATANAME, 0); }
		public TerminalNode ENDCOMMAND() { return getToken(InnerParser.ENDCOMMAND, 0); }
		public SystemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterSystemDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitSystemDef(this);
		}
	}

	public final SystemDefContext systemDef() throws RecognitionException {
		SystemDefContext _localctx = new SystemDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_systemDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SYSTEMDEF);
			setState(341);
			match(TYPENAME);
			setState(342);
			match(DATANAME);
			setState(343);
			match(ENDCOMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(InnerParser.EOF, 0); }
		public InnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).enterInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InnerListener ) ((InnerListener)listener).exitInner(this);
		}
	}

	public final InnerContext inner() throws RecognitionException {
		InnerContext _localctx = new InnerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			type();
			setState(346);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\65\n\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3I\n\3\5\3K\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3S\n\3"+
		"\f\3\16\3V\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4e\n\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5u"+
		"\n\5\5\5w\n\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\5\6\u009b\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d2\n\16\f\16\16\16\u00d5\13\16"+
		"\5\16\u00d7\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u00de\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17\5\17\u00ea\n\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0107\n\21\f\21\16\21\u010a\13\21\3\21\3\21\5\21\u010e\n\21\3\21"+
		"\3\21\3\21\3\21\6\21\u0114\n\21\r\21\16\21\u0115\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\6\22\u0120\n\22\r\22\16\22\u0121\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u012a\n\23\3\23\6\23\u012d\n\23\r\23\16\23\u012e\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013c\n\24\f\24"+
		"\16\24\u013f\13\24\3\24\3\24\5\24\u0143\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u014f\n\25\f\25\16\25\u0152\13\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\2\4\4\b\30\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u0186\2\64\3\2\2\2\4"+
		"J\3\2\2\2\6f\3\2\2\2\bv\3\2\2\2\n\u0080\3\2\2\2\f\u009c\3\2\2\2\16\u00ab"+
		"\3\2\2\2\20\u00b3\3\2\2\2\22\u00b8\3\2\2\2\24\u00bd\3\2\2\2\26\u00c5\3"+
		"\2\2\2\30\u00c8\3\2\2\2\32\u00dd\3\2\2\2\34\u00df\3\2\2\2\36\u00fd\3\2"+
		"\2\2 \u00ff\3\2\2\2\"\u011a\3\2\2\2$\u0125\3\2\2\2&\u0133\3\2\2\2(\u0146"+
		"\3\2\2\2*\u0156\3\2\2\2,\u015b\3\2\2\2.\65\7$\2\2/\65\7\3\2\2\60\65\7"+
		"\4\2\2\61\65\7\5\2\2\62\65\7\6\2\2\63\65\5\32\16\2\64.\3\2\2\2\64/\3\2"+
		"\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\3\3\2"+
		"\2\2\66\67\b\3\1\2\67K\5\6\4\28;\7\t\2\29<\5\4\3\2:<\5\6\4\2;9\3\2\2\2"+
		";:\3\2\2\2<=\3\2\2\2=>\7\n\2\2>K\3\2\2\2?@\7\"\2\2@K\5\4\3\6AB\5\6\4\2"+
		"BC\7 \2\2CD\5\4\3\5DK\3\2\2\2EI\7\3\2\2FI\7$\2\2GI\5\32\16\2HE\3\2\2\2"+
		"HF\3\2\2\2HG\3\2\2\2IK\3\2\2\2J\66\3\2\2\2J8\3\2\2\2J?\3\2\2\2JA\3\2\2"+
		"\2JH\3\2\2\2KT\3\2\2\2LM\f\t\2\2MN\7 \2\2NS\5\4\3\nOP\f\4\2\2PQ\7 \2\2"+
		"QS\5\6\4\2RL\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2"+
		"\2VT\3\2\2\2WX\7\t\2\2XY\5\6\4\2YZ\7\n\2\2Zg\3\2\2\2[\\\5\b\5\2\\]\7!"+
		"\2\2]^\5\b\5\2^g\3\2\2\2_e\7\5\2\2`e\7\4\2\2ae\7\6\2\2be\7$\2\2ce\5\32"+
		"\16\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2eg\3\2\2\2fW\3"+
		"\2\2\2f[\3\2\2\2fd\3\2\2\2g\7\3\2\2\2hi\b\5\1\2ij\7\t\2\2jk\5\b\5\2kl"+
		"\7\n\2\2lw\3\2\2\2mn\7\37\2\2nw\5\b\5\4ou\7\5\2\2pu\7\4\2\2qu\7\6\2\2"+
		"ru\7$\2\2su\5\32\16\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2"+
		"\2uw\3\2\2\2vh\3\2\2\2vm\3\2\2\2vt\3\2\2\2w}\3\2\2\2xy\f\5\2\2yz\7\36"+
		"\2\2z|\5\b\5\6{x\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\t\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\4\3\2"+
		"\u0083\u0084\7\n\2\2\u0084\u0085\7\21\2\2\u0085\u0089\7\f\2\2\u0086\u0088"+
		"\5\36\20\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\7\22\2\2\u008d\u008e\7\f\2\2\u008e\u009a\3\2\2\2\u008f\u0090\7\26\2\2"+
		"\u0090\u0091\7\21\2\2\u0091\u0095\7\f\2\2\u0092\u0094\5\36\20\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\22\2\2\u0099"+
		"\u009b\7\f\2\2\u009a\u008f\3\2\2\2\u009a\u009b\3\2\2\2\u009b\13\3\2\2"+
		"\2\u009c\u009d\7\27\2\2\u009d\u009e\7\t\2\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a5\7\f\2\2\u00a2\u00a4\5"+
		"\36\20\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\22"+
		"\2\2\u00a9\u00aa\7\f\2\2\u00aa\r\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00af"+
		"\7\r\2\2\u00ad\u00b0\5\b\5\2\u00ae\u00b0\5\4\3\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\17\3\2\2"+
		"\2\u00b3\u00b4\7$\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7"+
		"\7\f\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\u00ba\7\16\2\2\u00ba"+
		"\u00bb\5\b\5\2\u00bb\u00bc\7\f\2\2\u00bc\23\3\2\2\2\u00bd\u00c1\7\30\2"+
		"\2\u00be\u00c2\7$\2\2\u00bf\u00c2\5\4\3\2\u00c0\u00c2\5\b\5\2\u00c1\u00be"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\f\2\2\u00c4\25\3\2\2\2\u00c5\u00c6\7\31\2\2\u00c6\u00c7\7\f\2"+
		"\2\u00c7\27\3\2\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\7\f\2\2\u00ca\31"+
		"\3\2\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\7$\2\2\u00cd\u00d6\7\t\2\2\u00ce"+
		"\u00d3\5\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d2\5\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00de\7\n\2\2\u00d9\u00da\7\t\2\2\u00da"+
		"\u00db\5\32\16\2\u00db\u00dc\7\n\2\2\u00dc\u00de\3\2\2\2\u00dd\u00cb\3"+
		"\2\2\2\u00dd\u00d9\3\2\2\2\u00de\33\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0"+
		"\u00e9\7\t\2\2\u00e1\u00e6\5\2\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e5\5"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\n\2\2\u00ec"+
		"\u00ed\7\f\2\2\u00ed\35\3\2\2\2\u00ee\u00fe\5\n\6\2\u00ef\u00fe\5\24\13"+
		"\2\u00f0\u00fe\5\26\f\2\u00f1\u00fe\5\30\r\2\u00f2\u00fe\5\f\7\2\u00f3"+
		"\u00fe\5&\24\2\u00f4\u00fe\5(\25\2\u00f5\u00fe\5*\26\2\u00f6\u00fe\5\16"+
		"\b\2\u00f7\u00fe\5\20\t\2\u00f8\u00fe\5\22\n\2\u00f9\u00fa\5\32\16\2\u00fa"+
		"\u00fb\7\f\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00ee\3"+
		"\2\2\2\u00fd\u00ef\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd"+
		"\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f5\3\2"+
		"\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\37\3\2\2\2\u00ff\u0100\7\23\2"+
		"\2\u0100\u0101\7#\2\2\u0101\u0102\7$\2\2\u0102\u010d\7\t\2\2\u0103\u0104"+
		"\7#\2\2\u0104\u0105\7$\2\2\u0105\u0107\7\13\2\2\u0106\u0103\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7#\2\2\u010c\u010e\7$\2\2\u010d\u0108"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\n\2\2\u0110"+
		"\u0111\7\21\2\2\u0111\u0113\7\f\2\2\u0112\u0114\5\36\20\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\7\22\2\2\u0118\u0119\7\f\2\2\u0119!\3\2\2\2"+
		"\u011a\u011b\7\33\2\2\u011b\u011f\7\t\2\2\u011c\u0120\5&\24\2\u011d\u0120"+
		"\5(\25\2\u011e\u0120\5*\26\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\n\2\2\u0124#\3\2\2\2\u0125\u0126"+
		"\7\20\2\2\u0126\u0127\7#\2\2\u0127\u0129\7\f\2\2\u0128\u012a\5\"\22\2"+
		"\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d"+
		"\5 \21\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\22\2\2\u0131\u0132\7"+
		"\f\2\2\u0132%\3\2\2\2\u0133\u0134\7%\2\2\u0134\u0135\7#\2\2\u0135\u0142"+
		"\7$\2\2\u0136\u0137\7\24\2\2\u0137\u0138\7\t\2\2\u0138\u013d\5\2\2\2\u0139"+
		"\u013a\7\13\2\2\u013a\u013c\5\2\2\2\u013b\u0139\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7\n\2\2\u0141\u0143\3\2\2\2\u0142\u0136\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\f\2\2\u0145"+
		"\'\3\2\2\2\u0146\u0147\7&\2\2\u0147\u0148\7#\2\2\u0148\u0149\7$\2\2\u0149"+
		"\u014a\7\24\2\2\u014a\u014b\7\t\2\2\u014b\u0150\5\2\2\2\u014c\u014d\7"+
		"\13\2\2\u014d\u014f\5\2\2\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0154\7\n\2\2\u0154\u0155\7\f\2\2\u0155)\3\2\2\2\u0156\u0157"+
		"\7\'\2\2\u0157\u0158\7#\2\2\u0158\u0159\7$\2\2\u0159\u015a\7\f\2\2\u015a"+
		"+\3\2\2\2\u015b\u015c\5$\23\2\u015c\u015d\7\2\2\3\u015d-\3\2\2\2#\64;"+
		"HJRTdftv}\u0089\u0095\u009a\u00a5\u00af\u00c1\u00d3\u00d6\u00dd\u00e6"+
		"\u00e9\u00fd\u0108\u010d\u0115\u011f\u0121\u0129\u012e\u013d\u0142\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}