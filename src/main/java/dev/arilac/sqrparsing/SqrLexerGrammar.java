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
		CONCAT=1, EXPONENT=2, MULT=3, DIV=4, MOD=5, PLUS=6, MINUS=7, GT=8, LT=9, 
		GTE=10, LTE=11, NEQ=12, EQ=13, NOT=14, AND=15, OR=16, XOR=17, COMMA=18, 
		SEMI=19, LPAREN=20, RPAREN=21, LCURLY=22, RCURLY=23, COLON=24, INCLUDE=25, 
		ADD=26, TO=27, ROUND=28, BEGIN_PROG=29, END_PROG=30, BEGIN_PROCEDURE=31, 
		END_PROCEDURE=32, LOCAL=33, LET=34, STOP=35, QUIET=36, SUBTRACT=37, FROM=38, 
		LOCAL_LOCAL=39, STR_VAR=40, NUM_VAR=41, COL_VAR=42, LST_VAR=43, RETVAR=44, 
		INT=45, DEC=46, FLT=47, IDENTIFIER=48, WS=49, LINE_COMMENT=50, STR_LIT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONCAT", "EXPONENT", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "LT", 
			"GTE", "LTE", "NEQ", "EQ", "NOT", "AND", "OR", "XOR", "COMMA", "SEMI", 
			"LPAREN", "RPAREN", "LCURLY", "RCURLY", "COLON", "INCLUDE", "ADD", "TO", 
			"ROUND", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", "END_PROCEDURE", 
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "BEGIN", "END", "PROCEDURE", 
			"PROGRAM", "INT", "DEC", "FLT", "IDENTIFIER", "WS", "LINE_COMMENT", "STR_LIT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'^'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'<'", 
			"'>='", "'<='", null, "'='", "'not'", "'and'", "'or'", "'xor'", "','", 
			"';'", "'('", "')'", "'{'", "'}'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONCAT", "EXPONENT", "MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", 
			"LT", "GTE", "LTE", "NEQ", "EQ", "NOT", "AND", "OR", "XOR", "COMMA", 
			"SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "COLON", "INCLUDE", "ADD", 
			"TO", "ROUND", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", "END_PROCEDURE", 
			"LOCAL", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", "INT", "DEC", "FLT", "IDENTIFIER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-"+
		"\3-\5-\u0159\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u017e\n\61\3\62\6\62\u0181\n\62\r"+
		"\62\16\62\u0182\3\63\3\63\3\63\6\63\u0188\n\63\r\63\16\63\u0189\3\63\3"+
		"\63\6\63\u018e\n\63\r\63\16\63\u018f\3\64\7\64\u0193\n\64\f\64\16\64\u0196"+
		"\13\64\3\64\3\64\6\64\u019a\n\64\r\64\16\64\u019b\3\65\3\65\7\65\u01a0"+
		"\n\65\f\65\16\65\u01a3\13\65\3\66\6\66\u01a6\n\66\r\66\16\66\u01a7\3\66"+
		"\3\66\3\67\3\67\7\67\u01ae\n\67\f\67\16\67\u01b1\13\67\3\67\3\67\38\3"+
		"8\78\u01b7\n8\f8\168\u01ba\138\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I"+
		"\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3\u01b8\2S\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c/e\60g\61i\62k\63m\64o\65q\2"+
		"s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\3\2!\3\2\62;\5\2C\\aac|\7\2//\62;C\\aac|\6"+
		"\2\13\f\16\17\"\"//\4\2\f\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01de\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\3\u00a5\3\2\2\2\5\u00a8\3\2\2\2\7\u00aa\3\2\2\2\t\u00ac"+
		"\3\2\2\2\13\u00ae\3\2\2\2\r\u00b0\3\2\2\2\17\u00b2\3\2\2\2\21\u00b4\3"+
		"\2\2\2\23\u00b6\3\2\2\2\25\u00b8\3\2\2\2\27\u00bb\3\2\2\2\31\u00c2\3\2"+
		"\2\2\33\u00c4\3\2\2\2\35\u00c6\3\2\2\2\37\u00ca\3\2\2\2!\u00ce\3\2\2\2"+
		"#\u00d1\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db\3"+
		"\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2"+
		"\65\u00ec\3\2\2\2\67\u00f0\3\2\2\29\u00f3\3\2\2\2;\u00f9\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0101\3\2\2\2A\u010d\3\2\2\2C\u0119\3\2\2\2E\u011f\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0128\3\2\2\2K\u012e\3\2\2\2M\u0137\3\2\2\2O\u013c\3\2"+
		"\2\2Q\u0148\3\2\2\2S\u014b\3\2\2\2U\u014e\3\2\2\2W\u0151\3\2\2\2Y\u0158"+
		"\3\2\2\2[\u015a\3\2\2\2]\u0160\3\2\2\2_\u0164\3\2\2\2a\u017d\3\2\2\2c"+
		"\u0180\3\2\2\2e\u0184\3\2\2\2g\u0194\3\2\2\2i\u019d\3\2\2\2k\u01a5\3\2"+
		"\2\2m\u01ab\3\2\2\2o\u01b4\3\2\2\2q\u01bd\3\2\2\2s\u01bf\3\2\2\2u\u01c1"+
		"\3\2\2\2w\u01c3\3\2\2\2y\u01c5\3\2\2\2{\u01c7\3\2\2\2}\u01c9\3\2\2\2\177"+
		"\u01cb\3\2\2\2\u0081\u01cd\3\2\2\2\u0083\u01cf\3\2\2\2\u0085\u01d1\3\2"+
		"\2\2\u0087\u01d3\3\2\2\2\u0089\u01d5\3\2\2\2\u008b\u01d7\3\2\2\2\u008d"+
		"\u01d9\3\2\2\2\u008f\u01db\3\2\2\2\u0091\u01dd\3\2\2\2\u0093\u01df\3\2"+
		"\2\2\u0095\u01e1\3\2\2\2\u0097\u01e3\3\2\2\2\u0099\u01e5\3\2\2\2\u009b"+
		"\u01e7\3\2\2\2\u009d\u01e9\3\2\2\2\u009f\u01eb\3\2\2\2\u00a1\u01ed\3\2"+
		"\2\2\u00a3\u01ef\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6\u00a7\7~\2\2\u00a7\4"+
		"\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9\6\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab\b"+
		"\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\n\3\2\2\2\u00ae\u00af\7\'\2\2\u00af"+
		"\f\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\16\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3"+
		"\20\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\22\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\24\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba\7?\2\2\u00ba\26\3\2\2\2\u00bb"+
		"\u00bc\7>\2\2\u00bc\u00bd\7?\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7#\2\2\u00bf"+
		"\u00c3\7?\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c3\7@\2\2\u00c2\u00be\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5\34\3"+
		"\2\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\36\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd"+
		" \3\2\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\"\3\2\2\2\u00d1"+
		"\u00d2\7z\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4$\3\2\2\2\u00d5"+
		"\u00d6\7.\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8(\3\2\2\2\u00d9\u00da"+
		"\7*\2\2\u00da*\3\2\2\2\u00db\u00dc\7+\2\2\u00dc,\3\2\2\2\u00dd\u00de\7"+
		"}\2\2\u00de.\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0\60\3\2\2\2\u00e1\u00e2"+
		"\7<\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\5\u0081A\2\u00e5"+
		"\u00e6\5\u008bF\2\u00e6\u00e7\5u;\2\u00e7\u00e8\5\u0087D\2\u00e8\u00e9"+
		"\5\u0099M\2\u00e9\u00ea\5w<\2\u00ea\u00eb\5y=\2\u00eb\64\3\2\2\2\u00ec"+
		"\u00ed\5q9\2\u00ed\u00ee\5w<\2\u00ee\u00ef\5w<\2\u00ef\66\3\2\2\2\u00f0"+
		"\u00f1\5\u0097L\2\u00f1\u00f2\5\u008dG\2\u00f28\3\2\2\2\u00f3\u00f4\5"+
		"\u0093J\2\u00f4\u00f5\5\u008dG\2\u00f5\u00f6\5\u0099M\2\u00f6\u00f7\5"+
		"\u008bF\2\u00f7\u00f8\5w<\2\u00f8:\3\2\2\2\u00f9\u00fa\5[.\2\u00fa\u00fb"+
		"\7/\2\2\u00fb\u00fc\5a\61\2\u00fc<\3\2\2\2\u00fd\u00fe\5]/\2\u00fe\u00ff"+
		"\7/\2\2\u00ff\u0100\5a\61\2\u0100>\3\2\2\2\u0101\u0102\5[.\2\u0102\u0103"+
		"\7/\2\2\u0103\u0104\5\u008fH\2\u0104\u0105\5\u0093J\2\u0105\u0106\5\u008d"+
		"G\2\u0106\u0107\5u;\2\u0107\u0108\5y=\2\u0108\u0109\5w<\2\u0109\u010a"+
		"\5\u0099M\2\u010a\u010b\5\u0093J\2\u010b\u010c\5y=\2\u010c@\3\2\2\2\u010d"+
		"\u010e\5]/\2\u010e\u010f\7/\2\2\u010f\u0110\5\u008fH\2\u0110\u0111\5\u0093"+
		"J\2\u0111\u0112\5\u008dG\2\u0112\u0113\5u;\2\u0113\u0114\5y=\2\u0114\u0115"+
		"\5w<\2\u0115\u0116\5\u0099M\2\u0116\u0117\5\u0093J\2\u0117\u0118\5y=\2"+
		"\u0118B\3\2\2\2\u0119\u011a\5\u0087D\2\u011a\u011b\5\u008dG\2\u011b\u011c"+
		"\5u;\2\u011c\u011d\5q9\2\u011d\u011e\5\u0087D\2\u011eD\3\2\2\2\u011f\u0120"+
		"\5\u0087D\2\u0120\u0121\5y=\2\u0121\u0122\5\u0097L\2\u0122F\3\2\2\2\u0123"+
		"\u0124\5\u0095K\2\u0124\u0125\5\u0097L\2\u0125\u0126\5\u008dG\2\u0126"+
		"\u0127\5\u008fH\2\u0127H\3\2\2\2\u0128\u0129\5\u0091I\2\u0129\u012a\5"+
		"\u0099M\2\u012a\u012b\5\u0081A\2\u012b\u012c\5y=\2\u012c\u012d\5\u0097"+
		"L\2\u012dJ\3\2\2\2\u012e\u012f\5\u0095K\2\u012f\u0130\5\u0099M\2\u0130"+
		"\u0131\5s:\2\u0131\u0132\5\u0097L\2\u0132\u0133\5\u0093J\2\u0133\u0134"+
		"\5q9\2\u0134\u0135\5u;\2\u0135\u0136\5\u0097L\2\u0136L\3\2\2\2\u0137\u0138"+
		"\5{>\2\u0138\u0139\5\u0093J\2\u0139\u013a\5\u008dG\2\u013a\u013b\5\u0089"+
		"E\2\u013bN\3\2\2\2\u013c\u013d\5\u0087D\2\u013d\u013e\5\u008dG\2\u013e"+
		"\u013f\5u;\2\u013f\u0140\5q9\2\u0140\u0141\5\u0087D\2\u0141\u0142\7/\2"+
		"\2\u0142\u0143\5\u0087D\2\u0143\u0144\5\u008dG\2\u0144\u0145\5u;\2\u0145"+
		"\u0146\5q9\2\u0146\u0147\5\u0087D\2\u0147P\3\2\2\2\u0148\u0149\7&\2\2"+
		"\u0149\u014a\5i\65\2\u014aR\3\2\2\2\u014b\u014c\7%\2\2\u014c\u014d\5i"+
		"\65\2\u014dT\3\2\2\2\u014e\u014f\7(\2\2\u014f\u0150\5i\65\2\u0150V\3\2"+
		"\2\2\u0151\u0152\7\'\2\2\u0152\u0153\5i\65\2\u0153X\3\2\2\2\u0154\u0155"+
		"\7<\2\2\u0155\u0159\5Q)\2\u0156\u0157\7<\2\2\u0157\u0159\5S*\2\u0158\u0154"+
		"\3\2\2\2\u0158\u0156\3\2\2\2\u0159Z\3\2\2\2\u015a\u015b\5s:\2\u015b\u015c"+
		"\5y=\2\u015c\u015d\5}?\2\u015d\u015e\5\u0081A\2\u015e\u015f\5\u008bF\2"+
		"\u015f\\\3\2\2\2\u0160\u0161\5y=\2\u0161\u0162\5\u008bF\2\u0162\u0163"+
		"\5w<\2\u0163^\3\2\2\2\u0164\u0165\5\u008fH\2\u0165\u0166\5\u0093J\2\u0166"+
		"\u0167\5\u008dG\2\u0167\u0168\5u;\2\u0168\u0169\5y=\2\u0169\u016a\5w<"+
		"\2\u016a\u016b\5\u0099M\2\u016b\u016c\5\u0093J\2\u016c\u016d\5y=\2\u016d"+
		"`\3\2\2\2\u016e\u016f\5\u008fH\2\u016f\u0170\5\u0093J\2\u0170\u0171\5"+
		"\u008dG\2\u0171\u0172\5}?\2\u0172\u0173\5\u0093J\2\u0173\u0174\5q9\2\u0174"+
		"\u0175\5\u0089E\2\u0175\u017e\3\2\2\2\u0176\u0177\5\u0093J\2\u0177\u0178"+
		"\5y=\2\u0178\u0179\5\u008fH\2\u0179\u017a\5\u008dG\2\u017a\u017b\5\u0093"+
		"J\2\u017b\u017c\5\u0097L\2\u017c\u017e\3\2\2\2\u017d\u016e\3\2\2\2\u017d"+
		"\u0176\3\2\2\2\u017eb\3\2\2\2\u017f\u0181\t\2\2\2\u0180\u017f\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183d\3"+
		"\2\2\2\u0184\u0185\t\2\2\2\u0185\u0187\7\60\2\2\u0186\u0188\t\2\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u018d\5y=\2\u018c\u018e\t\2\2\2\u018d\u018c"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"f\3\2\2\2\u0191\u0193\t\2\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u0199\7\60\2\2\u0198\u019a\t\2\2\2\u0199\u0198\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019ch\3"+
		"\2\2\2\u019d\u01a1\t\3\2\2\u019e\u01a0\t\4\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2j\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a4\u01a6\t\5\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\b\66\2\2\u01aal\3\2\2\2\u01ab\u01af\7#\2\2\u01ac\u01ae\n\6\2\2"+
		"\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\67\2\2"+
		"\u01b3n\3\2\2\2\u01b4\u01b8\7)\2\2\u01b5\u01b7\13\2\2\2\u01b6\u01b5\3"+
		"\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7)\2\2\u01bcp\3\2\2\2\u01bd"+
		"\u01be\t\7\2\2\u01ber\3\2\2\2\u01bf\u01c0\t\b\2\2\u01c0t\3\2\2\2\u01c1"+
		"\u01c2\t\t\2\2\u01c2v\3\2\2\2\u01c3\u01c4\t\n\2\2\u01c4x\3\2\2\2\u01c5"+
		"\u01c6\t\13\2\2\u01c6z\3\2\2\2\u01c7\u01c8\t\f\2\2\u01c8|\3\2\2\2\u01c9"+
		"\u01ca\t\r\2\2\u01ca~\3\2\2\2\u01cb\u01cc\t\16\2\2\u01cc\u0080\3\2\2\2"+
		"\u01cd\u01ce\t\17\2\2\u01ce\u0082\3\2\2\2\u01cf\u01d0\t\20\2\2\u01d0\u0084"+
		"\3\2\2\2\u01d1\u01d2\t\21\2\2\u01d2\u0086\3\2\2\2\u01d3\u01d4\t\22\2\2"+
		"\u01d4\u0088\3\2\2\2\u01d5\u01d6\t\23\2\2\u01d6\u008a\3\2\2\2\u01d7\u01d8"+
		"\t\24\2\2\u01d8\u008c\3\2\2\2\u01d9\u01da\t\25\2\2\u01da\u008e\3\2\2\2"+
		"\u01db\u01dc\t\26\2\2\u01dc\u0090\3\2\2\2\u01dd\u01de\t\27\2\2\u01de\u0092"+
		"\3\2\2\2\u01df\u01e0\t\30\2\2\u01e0\u0094\3\2\2\2\u01e1\u01e2\t\31\2\2"+
		"\u01e2\u0096\3\2\2\2\u01e3\u01e4\t\32\2\2\u01e4\u0098\3\2\2\2\u01e5\u01e6"+
		"\t\33\2\2\u01e6\u009a\3\2\2\2\u01e7\u01e8\t\34\2\2\u01e8\u009c\3\2\2\2"+
		"\u01e9\u01ea\t\35\2\2\u01ea\u009e\3\2\2\2\u01eb\u01ec\t\36\2\2\u01ec\u00a0"+
		"\3\2\2\2\u01ed\u01ee\t\37\2\2\u01ee\u00a2\3\2\2\2\u01ef\u01f0\t \2\2\u01f0"+
		"\u00a4\3\2\2\2\17\2\u00c2\u0158\u017d\u0182\u0189\u018f\u0194\u019b\u01a1"+
		"\u01a7\u01af\u01b8\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}