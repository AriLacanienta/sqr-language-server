// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\java\dev\arilac\Parsing\SqrLexerGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqrLexerGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONCAT=1, EXPONENT=2, MULT=3, DIV=4, PLUS=5, MINUS=6, GT=7, LT=8, GTE=9, 
		LTE=10, NEQ=11, EQ=12, NOT=13, AND=14, OR=15, XOR=16, OPERATOR=17, COMMA=18, 
		SEMI=19, LPAREN=20, RPAREN=21, LCURLY=22, RCURLY=23, COLON=24, INCLUDE=25, 
		ADD=26, TO=27, ROUND=28, BEGIN_PROG=29, END_PROG=30, BEGIN_PROCEDURE=31, 
		END_PROCEDURE=32, LOCAL=33, LET=34, STOP=35, QUIET=36, SUBTRACT=37, FROM=38, 
		LOCAL_LOCAL=39, VARIABLE=40, STR_VAR=41, NUM_VAR=42, COL_VAR=43, LST_VAR=44, 
		RETVAR=45, INT=46, IDENTIFIER=47, WS=48, LINE_COMMENT=49, STR_LIT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONCAT", "EXPONENT", "MULT", "DIV", "PLUS", "MINUS", "GT", "LT", "GTE", 
			"LTE", "NEQ", "EQ", "NOT", "AND", "OR", "XOR", "OPERATOR", "COMMA", "SEMI", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "COLON", "INCLUDE", "ADD", "TO", 
			"ROUND", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", "END_PROCEDURE", 
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "VARIABLE", 
			"STR_VAR", "NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "BEGIN", "END", 
			"PROCEDURE", "PROGRAM", "INT", "IDENTIFIER", "WS", "LINE_COMMENT", "STR_LIT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'^'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'>='", 
			"'<='", null, "'='", "'not'", "'and'", "'or'", "'xor'", null, "','", 
			"';'", "'('", "')'", "'{'", "'}'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONCAT", "EXPONENT", "MULT", "DIV", "PLUS", "MINUS", "GT", "LT", 
			"GTE", "LTE", "NEQ", "EQ", "NOT", "AND", "OR", "XOR", "OPERATOR", "COMMA", 
			"SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "COLON", "INCLUDE", "ADD", 
			"TO", "ROUND", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", "END_PROCEDURE", 
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "VARIABLE", 
			"STR_VAR", "NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "INT", "IDENTIFIER", 
			"WS", "LINE_COMMENT", "STR_LIT"
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


	public SqrLexerGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqrLexerGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01e8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e2"+
		"\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u015a\n)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u018e\n\62\3\63"+
		"\6\63\u0191\n\63\r\63\16\63\u0192\3\64\3\64\7\64\u0197\n\64\f\64\16\64"+
		"\u019a\13\64\3\65\6\65\u019d\n\65\r\65\16\65\u019e\3\65\3\65\3\66\3\66"+
		"\7\66\u01a5\n\66\f\66\16\66\u01a8\13\66\3\66\3\66\3\67\3\67\7\67\u01ae"+
		"\n\67\f\67\16\67\u01b1\13\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3"+
		"H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3\u01af\2R\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\60g\61i\62k\63m\64o\2q\2s"+
		"\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\3\2!\3\2\62;\5\2C\\aac|\7\2//\62;C\\aac|\6\2\13\f\16"+
		"\17\"\"//\4\2\f\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HH"+
		"hh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\2\u01e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3\u00a3\3"+
		"\2\2\2\5\u00a6\3\2\2\2\7\u00a8\3\2\2\2\t\u00aa\3\2\2\2\13\u00ac\3\2\2"+
		"\2\r\u00ae\3\2\2\2\17\u00b0\3\2\2\2\21\u00b2\3\2\2\2\23\u00b4\3\2\2\2"+
		"\25\u00b7\3\2\2\2\27\u00be\3\2\2\2\31\u00c0\3\2\2\2\33\u00c2\3\2\2\2\35"+
		"\u00c6\3\2\2\2\37\u00ca\3\2\2\2!\u00cd\3\2\2\2#\u00e1\3\2\2\2%\u00e3\3"+
		"\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3\2\2\2/\u00ed"+
		"\3\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2\2\65\u00fa\3\2\2\2\67\u00fe\3"+
		"\2\2\29\u0101\3\2\2\2;\u0107\3\2\2\2=\u010b\3\2\2\2?\u010f\3\2\2\2A\u011b"+
		"\3\2\2\2C\u0127\3\2\2\2E\u012d\3\2\2\2G\u0131\3\2\2\2I\u0136\3\2\2\2K"+
		"\u013c\3\2\2\2M\u0145\3\2\2\2O\u014a\3\2\2\2Q\u0159\3\2\2\2S\u015b\3\2"+
		"\2\2U\u015e\3\2\2\2W\u0161\3\2\2\2Y\u0164\3\2\2\2[\u0167\3\2\2\2]\u016a"+
		"\3\2\2\2_\u0170\3\2\2\2a\u0174\3\2\2\2c\u018d\3\2\2\2e\u0190\3\2\2\2g"+
		"\u0194\3\2\2\2i\u019c\3\2\2\2k\u01a2\3\2\2\2m\u01ab\3\2\2\2o\u01b4\3\2"+
		"\2\2q\u01b6\3\2\2\2s\u01b8\3\2\2\2u\u01ba\3\2\2\2w\u01bc\3\2\2\2y\u01be"+
		"\3\2\2\2{\u01c0\3\2\2\2}\u01c2\3\2\2\2\177\u01c4\3\2\2\2\u0081\u01c6\3"+
		"\2\2\2\u0083\u01c8\3\2\2\2\u0085\u01ca\3\2\2\2\u0087\u01cc\3\2\2\2\u0089"+
		"\u01ce\3\2\2\2\u008b\u01d0\3\2\2\2\u008d\u01d2\3\2\2\2\u008f\u01d4\3\2"+
		"\2\2\u0091\u01d6\3\2\2\2\u0093\u01d8\3\2\2\2\u0095\u01da\3\2\2\2\u0097"+
		"\u01dc\3\2\2\2\u0099\u01de\3\2\2\2\u009b\u01e0\3\2\2\2\u009d\u01e2\3\2"+
		"\2\2\u009f\u01e4\3\2\2\2\u00a1\u01e6\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4"+
		"\u00a5\7~\2\2\u00a5\4\3\2\2\2\u00a6\u00a7\7`\2\2\u00a7\6\3\2\2\2\u00a8"+
		"\u00a9\7,\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\n\3\2\2\2\u00ac"+
		"\u00ad\7-\2\2\u00ad\f\3\2\2\2\u00ae\u00af\7/\2\2\u00af\16\3\2\2\2\u00b0"+
		"\u00b1\7@\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\22\3\2\2\2\u00b4"+
		"\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bf\7?\2\2\u00bc"+
		"\u00bd\7>\2\2\u00bd\u00bf\7@\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\30\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7"+
		"p\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7v\2\2\u00c5\34\3\2\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7f\2\2\u00c9\36\3\2\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\u00cc\7t\2\2\u00cc \3\2\2\2\u00cd\u00ce\7z\2\2\u00ce\u00cf"+
		"\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\"\3\2\2\2\u00d1\u00e2\5\3\2\2\u00d2\u00e2"+
		"\5\5\3\2\u00d3\u00e2\5\7\4\2\u00d4\u00e2\5\t\5\2\u00d5\u00e2\5\13\6\2"+
		"\u00d6\u00e2\5\r\7\2\u00d7\u00e2\5\17\b\2\u00d8\u00e2\5\21\t\2\u00d9\u00e2"+
		"\5\23\n\2\u00da\u00e2\5\25\13\2\u00db\u00e2\5\27\f\2\u00dc\u00e2\5\31"+
		"\r\2\u00dd\u00e2\5\33\16\2\u00de\u00e2\5\35\17\2\u00df\u00e2\5\37\20\2"+
		"\u00e0\u00e2\5!\21\2\u00e1\u00d1\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d3"+
		"\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00d7\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2"+
		"\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2$\3\2\2\2"+
		"\u00e3\u00e4\7.\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7=\2\2\u00e6(\3\2\2\2\u00e7"+
		"\u00e8\7*\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea,\3\2\2\2\u00eb\u00ec"+
		"\7}\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7\177\2\2\u00ee\60\3\2\2\2\u00ef\u00f0"+
		"\7<\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7%\2\2\u00f2\u00f3\5\177@\2\u00f3"+
		"\u00f4\5\u0089E\2\u00f4\u00f5\5s:\2\u00f5\u00f6\5\u0085C\2\u00f6\u00f7"+
		"\5\u0097L\2\u00f7\u00f8\5u;\2\u00f8\u00f9\5w<\2\u00f9\64\3\2\2\2\u00fa"+
		"\u00fb\5o8\2\u00fb\u00fc\5u;\2\u00fc\u00fd\5u;\2\u00fd\66\3\2\2\2\u00fe"+
		"\u00ff\5\u0095K\2\u00ff\u0100\5\u008bF\2\u01008\3\2\2\2\u0101\u0102\5"+
		"\u0091I\2\u0102\u0103\5\u008bF\2\u0103\u0104\5\u0097L\2\u0104\u0105\5"+
		"\u0089E\2\u0105\u0106\5u;\2\u0106:\3\2\2\2\u0107\u0108\5]/\2\u0108\u0109"+
		"\7/\2\2\u0109\u010a\5c\62\2\u010a<\3\2\2\2\u010b\u010c\5_\60\2\u010c\u010d"+
		"\7/\2\2\u010d\u010e\5c\62\2\u010e>\3\2\2\2\u010f\u0110\5]/\2\u0110\u0111"+
		"\7/\2\2\u0111\u0112\5\u008dG\2\u0112\u0113\5\u0091I\2\u0113\u0114\5\u008b"+
		"F\2\u0114\u0115\5s:\2\u0115\u0116\5w<\2\u0116\u0117\5u;\2\u0117\u0118"+
		"\5\u0097L\2\u0118\u0119\5\u0091I\2\u0119\u011a\5w<\2\u011a@\3\2\2\2\u011b"+
		"\u011c\5_\60\2\u011c\u011d\7/\2\2\u011d\u011e\5\u008dG\2\u011e\u011f\5"+
		"\u0091I\2\u011f\u0120\5\u008bF\2\u0120\u0121\5s:\2\u0121\u0122\5w<\2\u0122"+
		"\u0123\5u;\2\u0123\u0124\5\u0097L\2\u0124\u0125\5\u0091I\2\u0125\u0126"+
		"\5w<\2\u0126B\3\2\2\2\u0127\u0128\5\u0085C\2\u0128\u0129\5\u008bF\2\u0129"+
		"\u012a\5s:\2\u012a\u012b\5o8\2\u012b\u012c\5\u0085C\2\u012cD\3\2\2\2\u012d"+
		"\u012e\5\u0085C\2\u012e\u012f\5w<\2\u012f\u0130\5\u0095K\2\u0130F\3\2"+
		"\2\2\u0131\u0132\5\u0093J\2\u0132\u0133\5\u0095K\2\u0133\u0134\5\u008b"+
		"F\2\u0134\u0135\5\u008dG\2\u0135H\3\2\2\2\u0136\u0137\5\u008fH\2\u0137"+
		"\u0138\5\u0097L\2\u0138\u0139\5\177@\2\u0139\u013a\5w<\2\u013a\u013b\5"+
		"\u0095K\2\u013bJ\3\2\2\2\u013c\u013d\5\u0093J\2\u013d\u013e\5\u0097L\2"+
		"\u013e\u013f\5q9\2\u013f\u0140\5\u0095K\2\u0140\u0141\5\u0091I\2\u0141"+
		"\u0142\5o8\2\u0142\u0143\5s:\2\u0143\u0144\5\u0095K\2\u0144L\3\2\2\2\u0145"+
		"\u0146\5y=\2\u0146\u0147\5\u0091I\2\u0147\u0148\5\u008bF\2\u0148\u0149"+
		"\5\u0087D\2\u0149N\3\2\2\2\u014a\u014b\5\u0085C\2\u014b\u014c\5\u008b"+
		"F\2\u014c\u014d\5s:\2\u014d\u014e\5o8\2\u014e\u014f\5\u0085C\2\u014f\u0150"+
		"\7/\2\2\u0150\u0151\5\u0085C\2\u0151\u0152\5\u008bF\2\u0152\u0153\5s:"+
		"\2\u0153\u0154\5o8\2\u0154\u0155\5\u0085C\2\u0155P\3\2\2\2\u0156\u015a"+
		"\5S*\2\u0157\u015a\5U+\2\u0158\u015a\5W,\2\u0159\u0156\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015aR\3\2\2\2\u015b\u015c\7&\2\2\u015c\u015d"+
		"\5g\64\2\u015dT\3\2\2\2\u015e\u015f\7%\2\2\u015f\u0160\5g\64\2\u0160V"+
		"\3\2\2\2\u0161\u0162\7(\2\2\u0162\u0163\5g\64\2\u0163X\3\2\2\2\u0164\u0165"+
		"\7\'\2\2\u0165\u0166\5g\64\2\u0166Z\3\2\2\2\u0167\u0168\7<\2\2\u0168\u0169"+
		"\5Q)\2\u0169\\\3\2\2\2\u016a\u016b\5q9\2\u016b\u016c\5w<\2\u016c\u016d"+
		"\5{>\2\u016d\u016e\5\177@\2\u016e\u016f\5\u0089E\2\u016f^\3\2\2\2\u0170"+
		"\u0171\5w<\2\u0171\u0172\5\u0089E\2\u0172\u0173\5u;\2\u0173`\3\2\2\2\u0174"+
		"\u0175\5\u008dG\2\u0175\u0176\5\u0091I\2\u0176\u0177\5\u008bF\2\u0177"+
		"\u0178\5s:\2\u0178\u0179\5w<\2\u0179\u017a\5u;\2\u017a\u017b\5\u0097L"+
		"\2\u017b\u017c\5\u0091I\2\u017c\u017d\5w<\2\u017db\3\2\2\2\u017e\u017f"+
		"\5\u008dG\2\u017f\u0180\5\u0091I\2\u0180\u0181\5\u008bF\2\u0181\u0182"+
		"\5{>\2\u0182\u0183\5\u0091I\2\u0183\u0184\5o8\2\u0184\u0185\5\u0087D\2"+
		"\u0185\u018e\3\2\2\2\u0186\u0187\5\u0091I\2\u0187\u0188\5w<\2\u0188\u0189"+
		"\5\u008dG\2\u0189\u018a\5\u008bF\2\u018a\u018b\5\u0091I\2\u018b\u018c"+
		"\5\u0095K\2\u018c\u018e\3\2\2\2\u018d\u017e\3\2\2\2\u018d\u0186\3\2\2"+
		"\2\u018ed\3\2\2\2\u018f\u0191\t\2\2\2\u0190\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193f\3\2\2\2\u0194"+
		"\u0198\t\3\2\2\u0195\u0197\t\4\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199h\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u019d\t\5\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\65"+
		"\2\2\u01a1j\3\2\2\2\u01a2\u01a6\7#\2\2\u01a3\u01a5\n\6\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\b\66\2\2\u01aal\3\2\2\2"+
		"\u01ab\u01af\7)\2\2\u01ac\u01ae\13\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\7)\2\2\u01b3n\3\2\2\2\u01b4\u01b5\t\7\2\2\u01b5"+
		"p\3\2\2\2\u01b6\u01b7\t\b\2\2\u01b7r\3\2\2\2\u01b8\u01b9\t\t\2\2\u01b9"+
		"t\3\2\2\2\u01ba\u01bb\t\n\2\2\u01bbv\3\2\2\2\u01bc\u01bd\t\13\2\2\u01bd"+
		"x\3\2\2\2\u01be\u01bf\t\f\2\2\u01bfz\3\2\2\2\u01c0\u01c1\t\r\2\2\u01c1"+
		"|\3\2\2\2\u01c2\u01c3\t\16\2\2\u01c3~\3\2\2\2\u01c4\u01c5\t\17\2\2\u01c5"+
		"\u0080\3\2\2\2\u01c6\u01c7\t\20\2\2\u01c7\u0082\3\2\2\2\u01c8\u01c9\t"+
		"\21\2\2\u01c9\u0084\3\2\2\2\u01ca\u01cb\t\22\2\2\u01cb\u0086\3\2\2\2\u01cc"+
		"\u01cd\t\23\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf\t\24\2\2\u01cf\u008a\3"+
		"\2\2\2\u01d0\u01d1\t\25\2\2\u01d1\u008c\3\2\2\2\u01d2\u01d3\t\26\2\2\u01d3"+
		"\u008e\3\2\2\2\u01d4\u01d5\t\27\2\2\u01d5\u0090\3\2\2\2\u01d6\u01d7\t"+
		"\30\2\2\u01d7\u0092\3\2\2\2\u01d8\u01d9\t\31\2\2\u01d9\u0094\3\2\2\2\u01da"+
		"\u01db\t\32\2\2\u01db\u0096\3\2\2\2\u01dc\u01dd\t\33\2\2\u01dd\u0098\3"+
		"\2\2\2\u01de\u01df\t\34\2\2\u01df\u009a\3\2\2\2\u01e0\u01e1\t\35\2\2\u01e1"+
		"\u009c\3\2\2\2\u01e2\u01e3\t\36\2\2\u01e3\u009e\3\2\2\2\u01e4\u01e5\t"+
		"\37\2\2\u01e5\u00a0\3\2\2\2\u01e6\u01e7\t \2\2\u01e7\u00a2\3\2\2\2\f\2"+
		"\u00be\u00e1\u0159\u018d\u0192\u0198\u019e\u01a6\u01af\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}