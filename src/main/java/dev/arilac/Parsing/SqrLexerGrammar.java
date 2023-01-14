package dev.arilac.Parsing;

// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\java\dev\arilac\SqrLexerGrammar.g4 by ANTLR 4.9.2
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
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, COLON=11, ADD=12, TO=13, BEGIN_PROG=14, END_PROG=15, BEGIN_PROCEDURE=16, 
		END_PROCEDURE=17, LET=18, LOCAL=19, INCLUDE=20, LOCAL_LOCAL=21, RETVAR=22, 
		VAR=23, STR_VAR=24, NUM_VAR=25, COL_VAR=26, LST_VAR=27, INT=28, IDENTIFIER=29, 
		WS=30, STR_LIT=31, COMMENT=32, NEWLINE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "COLON", "ADD", "TO", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", 
			"END_PROCEDURE", "LET", "LOCAL", "INCLUDE", "LOCAL_LOCAL", "RETVAR", 
			"VAR", "BEGIN", "END", "PROCEDURE", "PROGRAM", "STR_VAR", "NUM_VAR", 
			"COL_VAR", "LST_VAR", "INT", "IDENTIFIER", "WS", "STR_LIT", "COMMENT", 
			"NEWLINE", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", "'{'", 
			"'}'", "':'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "COLON", "ADD", "TO", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", 
			"END_PROCEDURE", "LET", "LOCAL", "INCLUDE", "LOCAL_LOCAL", "RETVAR", 
			"VAR", "STR_VAR", "NUM_VAR", "COL_VAR", "LST_VAR", "INT", "IDENTIFIER", 
			"WS", "STR_LIT", "COMMENT", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\5\30\u00ee\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u0113\n\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\6!\u0122\n!\r!\16!\u0123\3\"\3\"\7\""+
		"\u0128\n\"\f\"\16\"\u012b\13\"\3#\6#\u012e\n#\r#\16#\u012f\3#\3#\3$\3"+
		"$\7$\u0136\n$\f$\16$\u0139\13$\3$\3$\3%\3%\7%\u013f\n%\f%\16%\u0142\13"+
		"%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\4\u0137"+
		"\u0140\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29"+
		"\32;\33=\34?\35A\36C\37E G!I\"K#M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e"+
		"\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\3\2!\3\2\62;\5\2C\\aac|\7"+
		"\2//\62;C\\aac|\5\2\13\13\16\17\"\"\3\2??\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0166\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\3\u0081\3\2\2\2\5\u0085\3\2\2\2\7\u0088\3\2\2\2"+
		"\t\u008c\3\2\2\2\13\u008e\3\2\2\2\r\u0090\3\2\2\2\17\u0092\3\2\2\2\21"+
		"\u0094\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c"+
		"\3\2\2\2\33\u00a0\3\2\2\2\35\u00a3\3\2\2\2\37\u00a7\3\2\2\2!\u00ab\3\2"+
		"\2\2#\u00b7\3\2\2\2%\u00c3\3\2\2\2\'\u00c7\3\2\2\2)\u00cd\3\2\2\2+\u00d6"+
		"\3\2\2\2-\u00e8\3\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f5\3\2\2"+
		"\2\65\u00f9\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0117\3\2\2\2=\u011a"+
		"\3\2\2\2?\u011d\3\2\2\2A\u0121\3\2\2\2C\u0125\3\2\2\2E\u012d\3\2\2\2G"+
		"\u0133\3\2\2\2I\u013c\3\2\2\2K\u0145\3\2\2\2M\u0147\3\2\2\2O\u0149\3\2"+
		"\2\2Q\u014b\3\2\2\2S\u014d\3\2\2\2U\u014f\3\2\2\2W\u0151\3\2\2\2Y\u0153"+
		"\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_\u0159\3\2\2\2a\u015b\3\2\2\2c"+
		"\u015d\3\2\2\2e\u015f\3\2\2\2g\u0161\3\2\2\2i\u0163\3\2\2\2k\u0165\3\2"+
		"\2\2m\u0167\3\2\2\2o\u0169\3\2\2\2q\u016b\3\2\2\2s\u016d\3\2\2\2u\u016f"+
		"\3\2\2\2w\u0171\3\2\2\2y\u0173\3\2\2\2{\u0175\3\2\2\2}\u0177\3\2\2\2\177"+
		"\u0179\3\2\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\6\3\2\2"+
		"\2\u0088\u0089\7p\2\2\u0089\u008a\7q\2\2\u008a\u008b\7v\2\2\u008b\b\3"+
		"\2\2\2\u008c\u008d\7?\2\2\u008d\n\3\2\2\2\u008e\u008f\7.\2\2\u008f\f\3"+
		"\2\2\2\u0090\u0091\7=\2\2\u0091\16\3\2\2\2\u0092\u0093\7*\2\2\u0093\20"+
		"\3\2\2\2\u0094\u0095\7+\2\2\u0095\22\3\2\2\2\u0096\u0097\7}\2\2\u0097"+
		"\24\3\2\2\2\u0098\u0099\7\177\2\2\u0099\26\3\2\2\2\u009a\u009b\7<\2\2"+
		"\u009b\30\3\2\2\2\u009c\u009d\5M\'\2\u009d\u009e\5S*\2\u009e\u009f\5S"+
		"*\2\u009f\32\3\2\2\2\u00a0\u00a1\5s:\2\u00a1\u00a2\5i\65\2\u00a2\34\3"+
		"\2\2\2\u00a3\u00a4\5\61\31\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\5\67\34\2"+
		"\u00a6\36\3\2\2\2\u00a7\u00a8\5\63\32\2\u00a8\u00a9\7/\2\2\u00a9\u00aa"+
		"\5\67\34\2\u00aa \3\2\2\2\u00ab\u00ac\5\61\31\2\u00ac\u00ad\7/\2\2\u00ad"+
		"\u00ae\5k\66\2\u00ae\u00af\5o8\2\u00af\u00b0\5i\65\2\u00b0\u00b1\5Q)\2"+
		"\u00b1\u00b2\5U+\2\u00b2\u00b3\5S*\2\u00b3\u00b4\5u;\2\u00b4\u00b5\5o"+
		"8\2\u00b5\u00b6\5U+\2\u00b6\"\3\2\2\2\u00b7\u00b8\5\63\32\2\u00b8\u00b9"+
		"\7/\2\2\u00b9\u00ba\5k\66\2\u00ba\u00bb\5o8\2\u00bb\u00bc\5i\65\2\u00bc"+
		"\u00bd\5Q)\2\u00bd\u00be\5U+\2\u00be\u00bf\5S*\2\u00bf\u00c0\5u;\2\u00c0"+
		"\u00c1\5o8\2\u00c1\u00c2\5U+\2\u00c2$\3\2\2\2\u00c3\u00c4\5c\62\2\u00c4"+
		"\u00c5\5U+\2\u00c5\u00c6\5s:\2\u00c6&\3\2\2\2\u00c7\u00c8\5c\62\2\u00c8"+
		"\u00c9\5i\65\2\u00c9\u00ca\5Q)\2\u00ca\u00cb\5M\'\2\u00cb\u00cc\5c\62"+
		"\2\u00cc(\3\2\2\2\u00cd\u00ce\7%\2\2\u00ce\u00cf\5]/\2\u00cf\u00d0\5g"+
		"\64\2\u00d0\u00d1\5Q)\2\u00d1\u00d2\5c\62\2\u00d2\u00d3\5u;\2\u00d3\u00d4"+
		"\5S*\2\u00d4\u00d5\5U+\2\u00d5*\3\2\2\2\u00d6\u00d7\5c\62\2\u00d7\u00d8"+
		"\5i\65\2\u00d8\u00d9\5Q)\2\u00d9\u00da\5M\'\2\u00da\u00db\5c\62\2\u00db"+
		"\u00dc\7/\2\2\u00dc\u00dd\5c\62\2\u00dd\u00de\5i\65\2\u00de\u00df\5Q)"+
		"\2\u00df\u00e0\5M\'\2\u00e0\u00e1\5c\62\2\u00e1,\3\2\2\2\u00e2\u00e3\7"+
		"<\2\2\u00e3\u00e9\59\35\2\u00e4\u00e5\7<\2\2\u00e5\u00e9\5;\36\2\u00e6"+
		"\u00e7\7<\2\2\u00e7\u00e9\5=\37\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9.\3\2\2\2\u00ea\u00ee\59\35\2\u00eb\u00ee"+
		"\5;\36\2\u00ec\u00ee\5=\37\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\5O(\2\u00f0\u00f1\5U+\2\u00f1"+
		"\u00f2\5Y-\2\u00f2\u00f3\5]/\2\u00f3\u00f4\5g\64\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f6\5U+\2\u00f6\u00f7\5g\64\2\u00f7\u00f8\5S*\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\5k\66\2\u00fa\u00fb\5o8\2\u00fb\u00fc\5i\65\2\u00fc\u00fd\5Q)\2"+
		"\u00fd\u00fe\5U+\2\u00fe\u00ff\5S*\2\u00ff\u0100\5u;\2\u0100\u0101\5o"+
		"8\2\u0101\u0102\5U+\2\u0102\66\3\2\2\2\u0103\u0104\5k\66\2\u0104\u0105"+
		"\5o8\2\u0105\u0106\5i\65\2\u0106\u0107\5Y-\2\u0107\u0108\5o8\2\u0108\u0109"+
		"\5M\'\2\u0109\u010a\5e\63\2\u010a\u0113\3\2\2\2\u010b\u010c\5o8\2\u010c"+
		"\u010d\5U+\2\u010d\u010e\5k\66\2\u010e\u010f\5i\65\2\u010f\u0110\5o8\2"+
		"\u0110\u0111\5s:\2\u0111\u0113\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u010b"+
		"\3\2\2\2\u01138\3\2\2\2\u0114\u0115\7&\2\2\u0115\u0116\5C\"\2\u0116:\3"+
		"\2\2\2\u0117\u0118\7%\2\2\u0118\u0119\5C\"\2\u0119<\3\2\2\2\u011a\u011b"+
		"\7(\2\2\u011b\u011c\5C\"\2\u011c>\3\2\2\2\u011d\u011e\7\'\2\2\u011e\u011f"+
		"\5C\"\2\u011f@\3\2\2\2\u0120\u0122\t\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124B\3\2\2\2\u0125"+
		"\u0129\t\3\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aD\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012e\t\5\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b#"+
		"\2\2\u0132F\3\2\2\2\u0133\u0137\7)\2\2\u0134\u0136\13\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7)\2\2\u013bH\3\2\2\2\u013c"+
		"\u0140\7#\2\2\u013d\u013f\n\6\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\5K&\2\u0144J\3\2\2\2\u0145\u0146\7\f\2\2\u0146"+
		"L\3\2\2\2\u0147\u0148\t\7\2\2\u0148N\3\2\2\2\u0149\u014a\t\b\2\2\u014a"+
		"P\3\2\2\2\u014b\u014c\t\t\2\2\u014cR\3\2\2\2\u014d\u014e\t\n\2\2\u014e"+
		"T\3\2\2\2\u014f\u0150\t\13\2\2\u0150V\3\2\2\2\u0151\u0152\t\f\2\2\u0152"+
		"X\3\2\2\2\u0153\u0154\t\r\2\2\u0154Z\3\2\2\2\u0155\u0156\t\16\2\2\u0156"+
		"\\\3\2\2\2\u0157\u0158\t\17\2\2\u0158^\3\2\2\2\u0159\u015a\t\20\2\2\u015a"+
		"`\3\2\2\2\u015b\u015c\t\21\2\2\u015cb\3\2\2\2\u015d\u015e\t\22\2\2\u015e"+
		"d\3\2\2\2\u015f\u0160\t\23\2\2\u0160f\3\2\2\2\u0161\u0162\t\24\2\2\u0162"+
		"h\3\2\2\2\u0163\u0164\t\25\2\2\u0164j\3\2\2\2\u0165\u0166\t\26\2\2\u0166"+
		"l\3\2\2\2\u0167\u0168\t\27\2\2\u0168n\3\2\2\2\u0169\u016a\t\30\2\2\u016a"+
		"p\3\2\2\2\u016b\u016c\t\31\2\2\u016cr\3\2\2\2\u016d\u016e\t\32\2\2\u016e"+
		"t\3\2\2\2\u016f\u0170\t\33\2\2\u0170v\3\2\2\2\u0171\u0172\t\34\2\2\u0172"+
		"x\3\2\2\2\u0173\u0174\t\35\2\2\u0174z\3\2\2\2\u0175\u0176\t\36\2\2\u0176"+
		"|\3\2\2\2\u0177\u0178\t\37\2\2\u0178~\3\2\2\2\u0179\u017a\t \2\2\u017a"+
		"\u0080\3\2\2\2\13\2\u00e8\u00ed\u0112\u0123\u0129\u012f\u0137\u0140\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}