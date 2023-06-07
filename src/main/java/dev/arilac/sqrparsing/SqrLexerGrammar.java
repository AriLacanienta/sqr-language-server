// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\antlr4\dev\arilac\SqrLexerGrammar.g4 by ANTLR 4.9.2

package dev.arilac.sqrparsing;

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
		LOCAL_LOCAL=39, STR_VAR=40, NUM_VAR=41, COL_VAR=42, LST_VAR=43, RETVAR=44, 
		INT=45, IDENTIFIER=46, WS=47, LINE_COMMENT=48, STR_LIT=49;
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
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "BEGIN", "END", "PROCEDURE", 
			"PROGRAM", "INT", "IDENTIFIER", "WS", "LINE_COMMENT", "STR_LIT", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "INT", "IDENTIFIER", "WS", 
			"LINE_COMMENT", "STR_LIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e0\n\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3-\5-\u0165\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u018a\n\61\3\62\6\62\u018d\n\62"+
		"\r\62\16\62\u018e\3\63\3\63\7\63\u0193\n\63\f\63\16\63\u0196\13\63\3\64"+
		"\6\64\u0199\n\64\r\64\16\64\u019a\3\64\3\64\3\65\3\65\7\65\u01a1\n\65"+
		"\f\65\16\65\u01a4\13\65\3\65\3\65\3\66\3\66\7\66\u01aa\n\66\f\66\16\66"+
		"\u01ad\13\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3"+
		"I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3\u01ab\2Q\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c/e\60g\61i\62k\63m\2o\2q\2s\2u\2w\2y\2{\2"+
		"}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2"+
		"!\3\2\62;\5\2C\\aac|\7\2//\62;C\\aac|\6\2\13\f\16\17\"\"//\4\2\f\f\17"+
		"\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4"+
		"\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSs"+
		"s\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2"+
		"\\\\||\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\u00a1\3\2\2\2\5\u00a4\3\2\2\2\7\u00a6"+
		"\3\2\2\2\t\u00a8\3\2\2\2\13\u00aa\3\2\2\2\r\u00ac\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00b0\3\2\2\2\23\u00b2\3\2\2\2\25\u00b5\3\2\2\2\27\u00bc\3\2\2"+
		"\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2\35\u00c4\3\2\2\2\37\u00c8\3\2\2\2"+
		"!\u00cb\3\2\2\2#\u00df\3\2\2\2%\u00e1\3\2\2\2\'\u00e3\3\2\2\2)\u00e5\3"+
		"\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2\63"+
		"\u00ef\3\2\2\2\65\u00f8\3\2\2\2\67\u00fc\3\2\2\29\u00ff\3\2\2\2;\u0105"+
		"\3\2\2\2=\u0109\3\2\2\2?\u010d\3\2\2\2A\u0119\3\2\2\2C\u0125\3\2\2\2E"+
		"\u012b\3\2\2\2G\u012f\3\2\2\2I\u0134\3\2\2\2K\u013a\3\2\2\2M\u0143\3\2"+
		"\2\2O\u0148\3\2\2\2Q\u0154\3\2\2\2S\u0157\3\2\2\2U\u015a\3\2\2\2W\u015d"+
		"\3\2\2\2Y\u0164\3\2\2\2[\u0166\3\2\2\2]\u016c\3\2\2\2_\u0170\3\2\2\2a"+
		"\u0189\3\2\2\2c\u018c\3\2\2\2e\u0190\3\2\2\2g\u0198\3\2\2\2i\u019e\3\2"+
		"\2\2k\u01a7\3\2\2\2m\u01b0\3\2\2\2o\u01b2\3\2\2\2q\u01b4\3\2\2\2s\u01b6"+
		"\3\2\2\2u\u01b8\3\2\2\2w\u01ba\3\2\2\2y\u01bc\3\2\2\2{\u01be\3\2\2\2}"+
		"\u01c0\3\2\2\2\177\u01c2\3\2\2\2\u0081\u01c4\3\2\2\2\u0083\u01c6\3\2\2"+
		"\2\u0085\u01c8\3\2\2\2\u0087\u01ca\3\2\2\2\u0089\u01cc\3\2\2\2\u008b\u01ce"+
		"\3\2\2\2\u008d\u01d0\3\2\2\2\u008f\u01d2\3\2\2\2\u0091\u01d4\3\2\2\2\u0093"+
		"\u01d6\3\2\2\2\u0095\u01d8\3\2\2\2\u0097\u01da\3\2\2\2\u0099\u01dc\3\2"+
		"\2\2\u009b\u01de\3\2\2\2\u009d\u01e0\3\2\2\2\u009f\u01e2\3\2\2\2\u00a1"+
		"\u00a2\7~\2\2\u00a2\u00a3\7~\2\2\u00a3\4\3\2\2\2\u00a4\u00a5\7`\2\2\u00a5"+
		"\6\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9"+
		"\n\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad"+
		"\16\3\2\2\2\u00ae\u00af\7@\2\2\u00af\20\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\22\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4\24\3\2\2\2\u00b5"+
		"\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9"+
		"\u00bd\7?\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bd\7@\2\2\u00bc\u00b8\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\32\3"+
		"\2\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\34\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\36\3\2\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca \3\2\2\2\u00cb"+
		"\u00cc\7z\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\"\3\2\2\2\u00cf"+
		"\u00e0\5\3\2\2\u00d0\u00e0\5\5\3\2\u00d1\u00e0\5\7\4\2\u00d2\u00e0\5\t"+
		"\5\2\u00d3\u00e0\5\13\6\2\u00d4\u00e0\5\r\7\2\u00d5\u00e0\5\17\b\2\u00d6"+
		"\u00e0\5\21\t\2\u00d7\u00e0\5\23\n\2\u00d8\u00e0\5\25\13\2\u00d9\u00e0"+
		"\5\27\f\2\u00da\u00e0\5\31\r\2\u00db\u00e0\5\33\16\2\u00dc\u00e0\5\35"+
		"\17\2\u00dd\u00e0\5\37\20\2\u00de\u00e0\5!\21\2\u00df\u00cf\3\2\2\2\u00df"+
		"\u00d0\3\2\2\2\u00df\u00d1\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d3\3\2"+
		"\2\2\u00df\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d6\3\2\2\2\u00df"+
		"\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00da\3\2"+
		"\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7.\2\2\u00e2&\3\2\2\2\u00e3"+
		"\u00e4\7=\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6*\3\2\2\2\u00e7\u00e8"+
		"\7+\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7"+
		"\177\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\62\3\2\2\2\u00ef\u00f0"+
		"\7%\2\2\u00f0\u00f1\5}?\2\u00f1\u00f2\5\u0087D\2\u00f2\u00f3\5q9\2\u00f3"+
		"\u00f4\5\u0083B\2\u00f4\u00f5\5\u0095K\2\u00f5\u00f6\5s:\2\u00f6\u00f7"+
		"\5u;\2\u00f7\64\3\2\2\2\u00f8\u00f9\5m\67\2\u00f9\u00fa\5s:\2\u00fa\u00fb"+
		"\5s:\2\u00fb\66\3\2\2\2\u00fc\u00fd\5\u0093J\2\u00fd\u00fe\5\u0089E\2"+
		"\u00fe8\3\2\2\2\u00ff\u0100\5\u008fH\2\u0100\u0101\5\u0089E\2\u0101\u0102"+
		"\5\u0095K\2\u0102\u0103\5\u0087D\2\u0103\u0104\5s:\2\u0104:\3\2\2\2\u0105"+
		"\u0106\5[.\2\u0106\u0107\7/\2\2\u0107\u0108\5a\61\2\u0108<\3\2\2\2\u0109"+
		"\u010a\5]/\2\u010a\u010b\7/\2\2\u010b\u010c\5a\61\2\u010c>\3\2\2\2\u010d"+
		"\u010e\5[.\2\u010e\u010f\7/\2\2\u010f\u0110\5\u008bF\2\u0110\u0111\5\u008f"+
		"H\2\u0111\u0112\5\u0089E\2\u0112\u0113\5q9\2\u0113\u0114\5u;\2\u0114\u0115"+
		"\5s:\2\u0115\u0116\5\u0095K\2\u0116\u0117\5\u008fH\2\u0117\u0118\5u;\2"+
		"\u0118@\3\2\2\2\u0119\u011a\5]/\2\u011a\u011b\7/\2\2\u011b\u011c\5\u008b"+
		"F\2\u011c\u011d\5\u008fH\2\u011d\u011e\5\u0089E\2\u011e\u011f\5q9\2\u011f"+
		"\u0120\5u;\2\u0120\u0121\5s:\2\u0121\u0122\5\u0095K\2\u0122\u0123\5\u008f"+
		"H\2\u0123\u0124\5u;\2\u0124B\3\2\2\2\u0125\u0126\5\u0083B\2\u0126\u0127"+
		"\5\u0089E\2\u0127\u0128\5q9\2\u0128\u0129\5m\67\2\u0129\u012a\5\u0083"+
		"B\2\u012aD\3\2\2\2\u012b\u012c\5\u0083B\2\u012c\u012d\5u;\2\u012d\u012e"+
		"\5\u0093J\2\u012eF\3\2\2\2\u012f\u0130\5\u0091I\2\u0130\u0131\5\u0093"+
		"J\2\u0131\u0132\5\u0089E\2\u0132\u0133\5\u008bF\2\u0133H\3\2\2\2\u0134"+
		"\u0135\5\u008dG\2\u0135\u0136\5\u0095K\2\u0136\u0137\5}?\2\u0137\u0138"+
		"\5u;\2\u0138\u0139\5\u0093J\2\u0139J\3\2\2\2\u013a\u013b\5\u0091I\2\u013b"+
		"\u013c\5\u0095K\2\u013c\u013d\5o8\2\u013d\u013e\5\u0093J\2\u013e\u013f"+
		"\5\u008fH\2\u013f\u0140\5m\67\2\u0140\u0141\5q9\2\u0141\u0142\5\u0093"+
		"J\2\u0142L\3\2\2\2\u0143\u0144\5w<\2\u0144\u0145\5\u008fH\2\u0145\u0146"+
		"\5\u0089E\2\u0146\u0147\5\u0085C\2\u0147N\3\2\2\2\u0148\u0149\5\u0083"+
		"B\2\u0149\u014a\5\u0089E\2\u014a\u014b\5q9\2\u014b\u014c\5m\67\2\u014c"+
		"\u014d\5\u0083B\2\u014d\u014e\7/\2\2\u014e\u014f\5\u0083B\2\u014f\u0150"+
		"\5\u0089E\2\u0150\u0151\5q9\2\u0151\u0152\5m\67\2\u0152\u0153\5\u0083"+
		"B\2\u0153P\3\2\2\2\u0154\u0155\7&\2\2\u0155\u0156\5e\63\2\u0156R\3\2\2"+
		"\2\u0157\u0158\7%\2\2\u0158\u0159\5e\63\2\u0159T\3\2\2\2\u015a\u015b\7"+
		"(\2\2\u015b\u015c\5e\63\2\u015cV\3\2\2\2\u015d\u015e\7\'\2\2\u015e\u015f"+
		"\5e\63\2\u015fX\3\2\2\2\u0160\u0161\7<\2\2\u0161\u0165\5Q)\2\u0162\u0163"+
		"\7<\2\2\u0163\u0165\5S*\2\u0164\u0160\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"Z\3\2\2\2\u0166\u0167\5o8\2\u0167\u0168\5u;\2\u0168\u0169\5y=\2\u0169"+
		"\u016a\5}?\2\u016a\u016b\5\u0087D\2\u016b\\\3\2\2\2\u016c\u016d\5u;\2"+
		"\u016d\u016e\5\u0087D\2\u016e\u016f\5s:\2\u016f^\3\2\2\2\u0170\u0171\5"+
		"\u008bF\2\u0171\u0172\5\u008fH\2\u0172\u0173\5\u0089E\2\u0173\u0174\5"+
		"q9\2\u0174\u0175\5u;\2\u0175\u0176\5s:\2\u0176\u0177\5\u0095K\2\u0177"+
		"\u0178\5\u008fH\2\u0178\u0179\5u;\2\u0179`\3\2\2\2\u017a\u017b\5\u008b"+
		"F\2\u017b\u017c\5\u008fH\2\u017c\u017d\5\u0089E\2\u017d\u017e\5y=\2\u017e"+
		"\u017f\5\u008fH\2\u017f\u0180\5m\67\2\u0180\u0181\5\u0085C\2\u0181\u018a"+
		"\3\2\2\2\u0182\u0183\5\u008fH\2\u0183\u0184\5u;\2\u0184\u0185\5\u008b"+
		"F\2\u0185\u0186\5\u0089E\2\u0186\u0187\5\u008fH\2\u0187\u0188\5\u0093"+
		"J\2\u0188\u018a\3\2\2\2\u0189\u017a\3\2\2\2\u0189\u0182\3\2\2\2\u018a"+
		"b\3\2\2\2\u018b\u018d\t\2\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fd\3\2\2\2\u0190\u0194\t"+
		"\3\2\2\u0191\u0193\t\4\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195f\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0197\u0199\t\5\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b\64\2\2"+
		"\u019dh\3\2\2\2\u019e\u01a2\7#\2\2\u019f\u01a1\n\6\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\b\65\2\2\u01a6j\3\2\2\2"+
		"\u01a7\u01ab\7)\2\2\u01a8\u01aa\13\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01af\7)\2\2\u01afl\3\2\2\2\u01b0\u01b1\t\7\2\2\u01b1"+
		"n\3\2\2\2\u01b2\u01b3\t\b\2\2\u01b3p\3\2\2\2\u01b4\u01b5\t\t\2\2\u01b5"+
		"r\3\2\2\2\u01b6\u01b7\t\n\2\2\u01b7t\3\2\2\2\u01b8\u01b9\t\13\2\2\u01b9"+
		"v\3\2\2\2\u01ba\u01bb\t\f\2\2\u01bbx\3\2\2\2\u01bc\u01bd\t\r\2\2\u01bd"+
		"z\3\2\2\2\u01be\u01bf\t\16\2\2\u01bf|\3\2\2\2\u01c0\u01c1\t\17\2\2\u01c1"+
		"~\3\2\2\2\u01c2\u01c3\t\20\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\t\21\2"+
		"\2\u01c5\u0082\3\2\2\2\u01c6\u01c7\t\22\2\2\u01c7\u0084\3\2\2\2\u01c8"+
		"\u01c9\t\23\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\t\24\2\2\u01cb\u0088\3"+
		"\2\2\2\u01cc\u01cd\t\25\2\2\u01cd\u008a\3\2\2\2\u01ce\u01cf\t\26\2\2\u01cf"+
		"\u008c\3\2\2\2\u01d0\u01d1\t\27\2\2\u01d1\u008e\3\2\2\2\u01d2\u01d3\t"+
		"\30\2\2\u01d3\u0090\3\2\2\2\u01d4\u01d5\t\31\2\2\u01d5\u0092\3\2\2\2\u01d6"+
		"\u01d7\t\32\2\2\u01d7\u0094\3\2\2\2\u01d8\u01d9\t\33\2\2\u01d9\u0096\3"+
		"\2\2\2\u01da\u01db\t\34\2\2\u01db\u0098\3\2\2\2\u01dc\u01dd\t\35\2\2\u01dd"+
		"\u009a\3\2\2\2\u01de\u01df\t\36\2\2\u01df\u009c\3\2\2\2\u01e0\u01e1\t"+
		"\37\2\2\u01e1\u009e\3\2\2\2\u01e2\u01e3\t \2\2\u01e3\u00a0\3\2\2\2\f\2"+
		"\u00bc\u00df\u0164\u0189\u018e\u0194\u019a\u01a2\u01ab\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}