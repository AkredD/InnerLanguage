// Generated from Inner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InnerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "UPPER", "LOWER", "LETTER", "WORD", "ALPHANUM", "DATAFR", "CONSTANTFR", 
			"SYSTEMFR", "COLON", "PLUS", "MINUS", "INC", "DEC", "MULTIPLICATION", 
			"DIVISION", "POWER", "MOD", "NOTEQ", "MOREOP", "MOREOREQ", "LESSOP", 
			"LESSOREQ", "DEQ", "AND", "OR", "NOT", "TRUE", "FALSE", "BOOLEAN", "NUMBER", 
			"DQ_STRING", "DATE", "WS", "COMMENTS", "OPENBRACKET", "CLOSEBRACKET", 
			"COMMA", "ENDCOMMAND", "EQ", "MINUSEQ", "PLUSEQ", "TYPE", "STARTSTATEMENT", 
			"ENDSTATEMENT", "FUNCTION", "VALUES", "IF", "ELSE", "WHILE", "RETURN", 
			"CONTINUE", "BREAK", "STATIC", "CALL", "WRITE", "OPERATOR", "UNARYOPERATOR", 
			"CONDITIONBOOLOPERATOR", "CONDITIONOPERATOR", "CONDITIONUNARYPERATOR", 
			"TYPENAME", "DATANAME", "DATADEF", "CONSTANTDEF", "SYSTEMDEF"
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


	public InnerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Inner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u026d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5"+
		"\5\u0090\n\5\3\6\3\6\5\6\u0094\n\6\3\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ee\n\32\3\33\3\33\3\33\3\33\5\33"+
		"\u00f4\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00fc\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u0106\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0112\n\36\3\37\3\37\5\37\u0116\n\37\3"+
		" \6 \u0119\n \r \16 \u011a\3 \3 \6 \u011f\n \r \16 \u0120\5 \u0123\n "+
		"\3 \3 \5 \u0127\n \3 \6 \u012a\n \r \16 \u012b\5 \u012e\n \3!\3!\3!\7"+
		"!\u0133\n!\f!\16!\u0136\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0150\n\"\r\""+
		"\16\"\u0151\5\"\u0154\n\"\5\"\u0156\n\"\3\"\3\"\3#\6#\u015b\n#\r#\16#"+
		"\u015c\3#\3#\3$\3$\3$\3$\7$\u0165\n$\f$\16$\u0168\13$\3$\3$\3$\3$\3$\3"+
		"$\7$\u0170\n$\f$\16$\u0173\13$\3$\5$\u0176\n$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0192\n,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u019e\n-\3.\3.\3.\3.\3.\3.\5.\u01a6\n"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01b8\n/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01c6\n\60\3\61"+
		"\3\61\3\61\3\61\5\61\u01cc\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u01d6\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u01e2\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u01f0\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0202\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u020e\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u021c\n\67\38\38\38\38\38\38\38\38\58\u0226"+
		"\n8\39\39\39\39\39\39\39\39\39\39\59\u0232\n9\3:\3:\3:\3:\3:\3:\5:\u023a"+
		"\n:\3;\3;\3;\3;\5;\u0240\n;\3<\3<\3<\5<\u0245\n<\3=\3=\3=\3=\3=\3=\3="+
		"\3=\5=\u024f\n=\3>\3>\3?\3?\3?\3?\7?\u0257\n?\f?\16?\u025a\13?\3@\3@\3"+
		"@\3@\7@\u0260\n@\f@\16@\u0263\13@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3\u0166\2"+
		"D\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\3?\4A\5C\6E\7G"+
		"\bI\tK\nM\13O\fQ\rS\16U\17W\20Y\21[\22]\23_\24a\25c\26e\27g\30i\31k\32"+
		"m\33o\34q\35s\36u\37w y!{\"}#\177$\u0081%\u0083&\u0085\'\3\2\7\5\2%&\60"+
		"\60aa\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\3\2\f\f\2\u028e\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2\t\u008f\3\2\2\2\13\u0093\3\2"+
		"\2\2\r\u0097\3\2\2\2\17\u00a1\3\2\2\2\21\u00b3\3\2\2\2\23\u00c1\3\2\2"+
		"\2\25\u00c3\3\2\2\2\27\u00c5\3\2\2\2\31\u00c7\3\2\2\2\33\u00c9\3\2\2\2"+
		"\35\u00cc\3\2\2\2\37\u00cf\3\2\2\2!\u00d1\3\2\2\2#\u00d3\3\2\2\2%\u00d5"+
		"\3\2\2\2\'\u00d7\3\2\2\2)\u00da\3\2\2\2+\u00dc\3\2\2\2-\u00df\3\2\2\2"+
		"/\u00e1\3\2\2\2\61\u00e4\3\2\2\2\63\u00ed\3\2\2\2\65\u00f3\3\2\2\2\67"+
		"\u00fb\3\2\2\29\u0105\3\2\2\2;\u0111\3\2\2\2=\u0115\3\2\2\2?\u0118\3\2"+
		"\2\2A\u012f\3\2\2\2C\u0139\3\2\2\2E\u015a\3\2\2\2G\u0175\3\2\2\2I\u0179"+
		"\3\2\2\2K\u017b\3\2\2\2M\u017d\3\2\2\2O\u017f\3\2\2\2Q\u0181\3\2\2\2S"+
		"\u0183\3\2\2\2U\u0186\3\2\2\2W\u0191\3\2\2\2Y\u019d\3\2\2\2[\u01a5\3\2"+
		"\2\2]\u01b7\3\2\2\2_\u01c5\3\2\2\2a\u01cb\3\2\2\2c\u01d5\3\2\2\2e\u01e1"+
		"\3\2\2\2g\u01ef\3\2\2\2i\u0201\3\2\2\2k\u020d\3\2\2\2m\u021b\3\2\2\2o"+
		"\u0225\3\2\2\2q\u0231\3\2\2\2s\u0239\3\2\2\2u\u023f\3\2\2\2w\u0244\3\2"+
		"\2\2y\u024e\3\2\2\2{\u0250\3\2\2\2}\u0252\3\2\2\2\177\u025b\3\2\2\2\u0081"+
		"\u0264\3\2\2\2\u0083\u0267\3\2\2\2\u0085\u026a\3\2\2\2\u0087\u0088\4\62"+
		";\2\u0088\4\3\2\2\2\u0089\u008a\4C\\\2\u008a\6\3\2\2\2\u008b\u008c\4c"+
		"|\2\u008c\b\3\2\2\2\u008d\u0090\5\7\4\2\u008e\u0090\5\5\3\2\u008f\u008d"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\n\3\2\2\2\u0091\u0094\5\t\5\2\u0092"+
		"\u0094\t\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\f\3\2\2\2"+
		"\u0095\u0098\5\13\6\2\u0096\u0098\5\3\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\16\3\2\2\2\u0099\u009a\7F\2\2\u009a\u009b\7C\2\2\u009b"+
		"\u009c\7V\2\2\u009c\u00a2\7C\2\2\u009d\u009e\7f\2\2\u009e\u009f\7c\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0\u00a2\7c\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7Q\2\2\u00a5"+
		"\u00a6\7P\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7C\2\2"+
		"\u00a9\u00aa\7P\2\2\u00aa\u00b4\7V\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b4\7v\2\2\u00b3\u00a3\3\2\2"+
		"\2\u00b3\u00ab\3\2\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\7U\2\2\u00b6\u00b7"+
		"\7[\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7G\2\2\u00ba"+
		"\u00c2\7O\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7{\2\2\u00bd\u00be\7u\2\2"+
		"\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c2\7o\2\2\u00c1\u00b5"+
		"\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4"+
		"\26\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8"+
		"\32\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb\7-\2\2\u00cb\34\3\2\2\2\u00cc"+
		"\u00cd\7/\2\2\u00cd\u00ce\7/\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0"+
		" \3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\7`\2\2\u00d4"+
		"$\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8"+
		"\u00d9\7@\2\2\u00d9(\3\2\2\2\u00da\u00db\7@\2\2\u00db*\3\2\2\2\u00dc\u00dd"+
		"\7@\2\2\u00dd\u00de\7?\2\2\u00de,\3\2\2\2\u00df\u00e0\7>\2\2\u00e0.\3"+
		"\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3\60\3\2\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5\u00e6\7?\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9"+
		"\7P\2\2\u00e9\u00ee\7F\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7p\2\2\u00ec"+
		"\u00ee\7f\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\64\3\2\2\2"+
		"\u00ef\u00f0\7Q\2\2\u00f0\u00f4\7T\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f4"+
		"\7t\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\66\3\2\2\2\u00f5"+
		"\u00f6\7P\2\2\u00f6\u00f7\7Q\2\2\u00f7\u00fc\7V\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9\u00fa\7q\2\2\u00fa\u00fc\7v\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f8"+
		"\3\2\2\2\u00fc8\3\2\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7T\2\2\u00ff\u0100"+
		"\7W\2\2\u0100\u0106\7G\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103"+
		"\u0104\7w\2\2\u0104\u0106\7g\2\2\u0105\u00fd\3\2\2\2\u0105\u0101\3\2\2"+
		"\2\u0106:\3\2\2\2\u0107\u0108\7H\2\2\u0108\u0109\7C\2\2\u0109\u010a\7"+
		"N\2\2\u010a\u010b\7U\2\2\u010b\u0112\7G\2\2\u010c\u010d\7h\2\2\u010d\u010e"+
		"\7c\2\2\u010e\u010f\7n\2\2\u010f\u0110\7u\2\2\u0110\u0112\7g\2\2\u0111"+
		"\u0107\3\2\2\2\u0111\u010c\3\2\2\2\u0112<\3\2\2\2\u0113\u0116\59\35\2"+
		"\u0114\u0116\5;\36\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116>\3"+
		"\2\2\2\u0117\u0119\5\3\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0122\3\2\2\2\u011c\u011e\7\60"+
		"\2\2\u011d\u011f\5\3\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u012d\3\2\2\2\u0124\u0126\t\3\2\2\u0125"+
		"\u0127\t\4\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u012a\5\3\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u0124\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e@\3\2\2\2\u012f\u0134\7$\2\2\u0130\u0131"+
		"\7^\2\2\u0131\u0133\7$\2\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7$\2\2\u0138B\3\2\2\2\u0139\u013a\7)\2\2\u013a\u013b"+
		"\5\3\2\2\u013b\u013c\5\3\2\2\u013c\u013d\5\3\2\2\u013d\u013e\5\3\2\2\u013e"+
		"\u013f\7/\2\2\u013f\u0140\5\3\2\2\u0140\u0141\5\3\2\2\u0141\u0142\7/\2"+
		"\2\u0142\u0143\5\3\2\2\u0143\u0155\5\3\2\2\u0144\u0145\7\"\2\2\u0145\u0146"+
		"\5\3\2\2\u0146\u0147\5\3\2\2\u0147\u0148\7<\2\2\u0148\u0149\5\3\2\2\u0149"+
		"\u014a\5\3\2\2\u014a\u014b\7<\2\2\u014b\u014c\5\3\2\2\u014c\u0153\5\3"+
		"\2\2\u014d\u014f\7\60\2\2\u014e\u0150\5\3\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2"+
		"\2\2\u0153\u014d\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0144\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7)"+
		"\2\2\u0158D\3\2\2\2\u0159\u015b\t\5\2\2\u015a\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\b#\2\2\u015fF\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7,\2\2\u0162"+
		"\u0166\3\2\2\2\u0163\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3"+
		"\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016a\7,\2\2\u016a\u0176\7\61\2\2\u016b\u016c\7\61"+
		"\2\2\u016c\u016d\7\61\2\2\u016d\u0171\3\2\2\2\u016e\u0170\n\6\2\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7\f\2\2\u0175"+
		"\u0160\3\2\2\2\u0175\u016b\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b$"+
		"\2\2\u0178H\3\2\2\2\u0179\u017a\7*\2\2\u017aJ\3\2\2\2\u017b\u017c\7+\2"+
		"\2\u017cL\3\2\2\2\u017d\u017e\7.\2\2\u017eN\3\2\2\2\u017f\u0180\7\60\2"+
		"\2\u0180P\3\2\2\2\u0181\u0182\7?\2\2\u0182R\3\2\2\2\u0183\u0184\7/\2\2"+
		"\u0184\u0185\7?\2\2\u0185T\3\2\2\2\u0186\u0187\7-\2\2\u0187\u0188\7?\2"+
		"\2\u0188V\3\2\2\2\u0189\u018a\7V\2\2\u018a\u018b\7[\2\2\u018b\u018c\7"+
		"R\2\2\u018c\u0192\7G\2\2\u018d\u018e\7v\2\2\u018e\u018f\7{\2\2\u018f\u0190"+
		"\7r\2\2\u0190\u0192\7g\2\2\u0191\u0189\3\2\2\2\u0191\u018d\3\2\2\2\u0192"+
		"X\3\2\2\2\u0193\u0194\7U\2\2\u0194\u0195\7V\2\2\u0195\u0196\7C\2\2\u0196"+
		"\u0197\7T\2\2\u0197\u019e\7V\2\2\u0198\u0199\7u\2\2\u0199\u019a\7v\2\2"+
		"\u019a\u019b\7c\2\2\u019b\u019c\7t\2\2\u019c\u019e\7v\2\2\u019d\u0193"+
		"\3\2\2\2\u019d\u0198\3\2\2\2\u019eZ\3\2\2\2\u019f\u01a0\7G\2\2\u01a0\u01a1"+
		"\7P\2\2\u01a1\u01a6\7F\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7p\2\2\u01a4"+
		"\u01a6\7f\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\\\3\2\2\2"+
		"\u01a7\u01a8\7H\2\2\u01a8\u01a9\7W\2\2\u01a9\u01aa\7P\2\2\u01aa\u01ab"+
		"\7E\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7K\2\2\u01ad\u01ae\7Q\2\2\u01ae"+
		"\u01b8\7P\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7p\2\2"+
		"\u01b2\u01b3\7e\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6"+
		"\7q\2\2\u01b6\u01b8\7p\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01af\3\2\2\2\u01b8"+
		"^\3\2\2\2\u01b9\u01ba\7X\2\2\u01ba\u01bb\7C\2\2\u01bb\u01bc\7N\2\2\u01bc"+
		"\u01bd\7W\2\2\u01bd\u01be\7G\2\2\u01be\u01c6\7U\2\2\u01bf\u01c0\7x\2\2"+
		"\u01c0\u01c1\7c\2\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4"+
		"\7g\2\2\u01c4\u01c6\7u\2\2\u01c5\u01b9\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c6"+
		"`\3\2\2\2\u01c7\u01c8\7K\2\2\u01c8\u01cc\7H\2\2\u01c9\u01ca\7k\2\2\u01ca"+
		"\u01cc\7h\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01c9\3\2\2\2\u01ccb\3\2\2\2\u01cd"+
		"\u01ce\7G\2\2\u01ce\u01cf\7N\2\2\u01cf\u01d0\7U\2\2\u01d0\u01d6\7G\2\2"+
		"\u01d1\u01d2\7g\2\2\u01d2\u01d3\7n\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d6"+
		"\7g\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d6d\3\2\2\2\u01d7\u01d8"+
		"\7Y\2\2\u01d8\u01d9\7J\2\2\u01d9\u01da\7K\2\2\u01da\u01db\7N\2\2\u01db"+
		"\u01e2\7G\2\2\u01dc\u01dd\7y\2\2\u01dd\u01de\7j\2\2\u01de\u01df\7k\2\2"+
		"\u01df\u01e0\7n\2\2\u01e0\u01e2\7g\2\2\u01e1\u01d7\3\2\2\2\u01e1\u01dc"+
		"\3\2\2\2\u01e2f\3\2\2\2\u01e3\u01e4\7T\2\2\u01e4\u01e5\7G\2\2\u01e5\u01e6"+
		"\7V\2\2\u01e6\u01e7\7W\2\2\u01e7\u01e8\7T\2\2\u01e8\u01f0\7P\2\2\u01e9"+
		"\u01ea\7t\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7w\2\2"+
		"\u01ed\u01ee\7t\2\2\u01ee\u01f0\7p\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01e9"+
		"\3\2\2\2\u01f0h\3\2\2\2\u01f1\u01f2\7E\2\2\u01f2\u01f3\7Q\2\2\u01f3\u01f4"+
		"\7P\2\2\u01f4\u01f5\7V\2\2\u01f5\u01f6\7K\2\2\u01f6\u01f7\7P\2\2\u01f7"+
		"\u01f8\7W\2\2\u01f8\u0202\7G\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7q\2\2"+
		"\u01fb\u01fc\7p\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7k\2\2\u01fe\u01ff"+
		"\7p\2\2\u01ff\u0200\7w\2\2\u0200\u0202\7g\2\2\u0201\u01f1\3\2\2\2\u0201"+
		"\u01f9\3\2\2\2\u0202j\3\2\2\2\u0203\u0204\7D\2\2\u0204\u0205\7T\2\2\u0205"+
		"\u0206\7G\2\2\u0206\u0207\7C\2\2\u0207\u020e\7M\2\2\u0208\u0209\7d\2\2"+
		"\u0209\u020a\7t\2\2\u020a\u020b\7g\2\2\u020b\u020c\7c\2\2\u020c\u020e"+
		"\7m\2\2\u020d\u0203\3\2\2\2\u020d\u0208\3\2\2\2\u020el\3\2\2\2\u020f\u0210"+
		"\7U\2\2\u0210\u0211\7V\2\2\u0211\u0212\7C\2\2\u0212\u0213\7V\2\2\u0213"+
		"\u0214\7K\2\2\u0214\u021c\7E\2\2\u0215\u0216\7u\2\2\u0216\u0217\7v\2\2"+
		"\u0217\u0218\7c\2\2\u0218\u0219\7v\2\2\u0219\u021a\7k\2\2\u021a\u021c"+
		"\7e\2\2\u021b\u020f\3\2\2\2\u021b\u0215\3\2\2\2\u021cn\3\2\2\2\u021d\u021e"+
		"\7E\2\2\u021e\u021f\7C\2\2\u021f\u0220\7N\2\2\u0220\u0226\7N\2\2\u0221"+
		"\u0222\7e\2\2\u0222\u0223\7c\2\2\u0223\u0224\7n\2\2\u0224\u0226\7n\2\2"+
		"\u0225\u021d\3\2\2\2\u0225\u0221\3\2\2\2\u0226p\3\2\2\2\u0227\u0228\7"+
		"Y\2\2\u0228\u0229\7T\2\2\u0229\u022a\7K\2\2\u022a\u022b\7V\2\2\u022b\u0232"+
		"\7G\2\2\u022c\u022d\7y\2\2\u022d\u022e\7t\2\2\u022e\u022f\7k\2\2\u022f"+
		"\u0230\7v\2\2\u0230\u0232\7g\2\2\u0231\u0227\3\2\2\2\u0231\u022c\3\2\2"+
		"\2\u0232r\3\2\2\2\u0233\u023a\5\27\f\2\u0234\u023a\5\31\r\2\u0235\u023a"+
		"\5\37\20\2\u0236\u023a\5!\21\2\u0237\u023a\5%\23\2\u0238\u023a\5#\22\2"+
		"\u0239\u0233\3\2\2\2\u0239\u0234\3\2\2\2\u0239\u0235\3\2\2\2\u0239\u0236"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023at\3\2\2\2\u023b"+
		"\u0240\5\27\f\2\u023c\u0240\5\31\r\2\u023d\u0240\5\33\16\2\u023e\u0240"+
		"\5\35\17\2\u023f\u023b\3\2\2\2\u023f\u023c\3\2\2\2\u023f\u023d\3\2\2\2"+
		"\u023f\u023e\3\2\2\2\u0240v\3\2\2\2\u0241\u0245\5\63\32\2\u0242\u0245"+
		"\5\65\33\2\u0243\u0245\5\61\31\2\u0244\u0241\3\2\2\2\u0244\u0242\3\2\2"+
		"\2\u0244\u0243\3\2\2\2\u0245x\3\2\2\2\u0246\u024f\5\61\31\2\u0247\u024f"+
		"\5\'\24\2\u0248\u024f\5)\25\2\u0249\u024f\5+\26\2\u024a\u024f\5-\27\2"+
		"\u024b\u024f\5/\30\2\u024c\u024f\5\63\32\2\u024d\u024f\5\65\33\2\u024e"+
		"\u0246\3\2\2\2\u024e\u0247\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u0249\3\2"+
		"\2\2\u024e\u024a\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024d\3\2\2\2\u024fz\3\2\2\2\u0250\u0251\5\67\34\2\u0251|\3\2\2\2\u0252"+
		"\u0258\5\5\3\2\u0253\u0257\5\7\4\2\u0254\u0257\5\5\3\2\u0255\u0257\5\3"+
		"\2\2\u0256\u0253\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0255\3\2\2\2\u0257"+
		"\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259~\3\2\2\2"+
		"\u025a\u0258\3\2\2\2\u025b\u0261\5\7\4\2\u025c\u0260\5\7\4\2\u025d\u0260"+
		"\5\5\3\2\u025e\u0260\5\3\2\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0080\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\5\17\b\2\u0265"+
		"\u0266\5\25\13\2\u0266\u0082\3\2\2\2\u0267\u0268\5\21\t\2\u0268\u0269"+
		"\5\25\13\2\u0269\u0084\3\2\2\2\u026a\u026b\5\23\n\2\u026b\u026c\5\25\13"+
		"\2\u026c\u0086\3\2\2\2\63\2\u008f\u0093\u0097\u00a1\u00b3\u00c1\u00ed"+
		"\u00f3\u00fb\u0105\u0111\u0115\u011a\u0120\u0122\u0126\u012b\u012d\u0134"+
		"\u0151\u0153\u0155\u015c\u0166\u0171\u0175\u0191\u019d\u01a5\u01b7\u01c5"+
		"\u01cb\u01d5\u01e1\u01ef\u0201\u020d\u021b\u0225\u0231\u0239\u023f\u0244"+
		"\u024e\u0256\u0258\u025f\u0261\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}