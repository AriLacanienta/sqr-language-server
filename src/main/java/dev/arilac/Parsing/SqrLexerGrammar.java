// Generated from ./src/main/java/dev/arilac/Parsing/SqrLexerGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqrLexerGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, COLON=11, ADD=12, TO=13, BEGIN_PROG=14, END_PROG=15, BEGIN_PROCEDURE=16, 
		END_PROCEDURE=17, LET=18, LOCAL=19, INCLUDE=20, LOCAL_LOCAL=21, STR_VAR=22, 
		NUM_VAR=23, COL_VAR=24, LST_VAR=25, VAR=26, RETVAR=27, INT=28, IDENTIFIER=29, 
		WS=30, LINE_COMMENT=31, STR_LIT=32;
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
			"END_PROCEDURE", "LET", "LOCAL", "INCLUDE", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "VAR", "RETVAR", "BEGIN", "END", "PROCEDURE", 
			"PROGRAM", "INT", "IDENTIFIER", "WS", "LINE_COMMENT", "STR_LIT", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", "'{'", 
			"'}'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "COLON", "ADD", "TO", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", 
			"END_PROCEDURE", "LET", "LOCAL", "INCLUDE", "LOCAL_LOCAL", "STR_VAR", 
			"NUM_VAR", "COL_VAR", "LST_VAR", "VAR", "RETVAR", "INT", "IDENTIFIER", 
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
		"\u0004\u0000 \u0170\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00ee\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0116\b\u001e\u0001\u001f\u0004\u001f\u0119"+
		"\b\u001f\u000b\u001f\f\u001f\u011a\u0001 \u0001 \u0005 \u011f\b \n \f"+
		" \u0122\t \u0001!\u0004!\u0125\b!\u000b!\f!\u0126\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0005\"\u012d\b\"\n\"\f\"\u0130\t\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0005#\u0136\b#\n#\f#\u0139\t#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001"+
		"\u0137\u0000>\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u00009\u0000;\u0000=\u0000"+
		"?\u001cA\u001dC\u001eE\u001fG I\u0000K\u0000M\u0000O\u0000Q\u0000S\u0000"+
		"U\u0000W\u0000Y\u0000[\u0000]\u0000_\u0000a\u0000c\u0000e\u0000g\u0000"+
		"i\u0000k\u0000m\u0000o\u0000q\u0000s\u0000u\u0000w\u0000y\u0000{\u0000"+
		"\u0001\u0000\u001f\u0001\u000009\u0003\u0000AZ__az\u0005\u0000--09AZ_"+
		"_az\u0003\u0000\t\t\f\r  \u0002\u0000\n\n\r\r\u0002\u0000AAaa\u0002\u0000"+
		"BBbb\u0002\u0000CCcc\u0002\u0000DDdd\u0002\u0000EEee\u0002\u0000FFff\u0002"+
		"\u0000GGgg\u0002\u0000HHhh\u0002\u0000IIii\u0002\u0000JJjj\u0002\u0000"+
		"KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002\u0000NNnn\u0002\u0000OOoo\u0002"+
		"\u0000PPpp\u0002\u0000QQqq\u0002\u0000RRrr\u0002\u0000SSss\u0002\u0000"+
		"TTtt\u0002\u0000UUuu\u0002\u0000VVvv\u0002\u0000WWww\u0002\u0000XXxx\u0002"+
		"\u0000YYyy\u0002\u0000ZZzz\u0159\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0001}\u0001\u0000\u0000\u0000\u0003\u0081\u0001\u0000\u0000"+
		"\u0000\u0005\u0084\u0001\u0000\u0000\u0000\u0007\u0088\u0001\u0000\u0000"+
		"\u0000\t\u008a\u0001\u0000\u0000\u0000\u000b\u008c\u0001\u0000\u0000\u0000"+
		"\r\u008e\u0001\u0000\u0000\u0000\u000f\u0090\u0001\u0000\u0000\u0000\u0011"+
		"\u0092\u0001\u0000\u0000\u0000\u0013\u0094\u0001\u0000\u0000\u0000\u0015"+
		"\u0096\u0001\u0000\u0000\u0000\u0017\u0098\u0001\u0000\u0000\u0000\u0019"+
		"\u009c\u0001\u0000\u0000\u0000\u001b\u009f\u0001\u0000\u0000\u0000\u001d"+
		"\u00a3\u0001\u0000\u0000\u0000\u001f\u00a7\u0001\u0000\u0000\u0000!\u00b3"+
		"\u0001\u0000\u0000\u0000#\u00bf\u0001\u0000\u0000\u0000%\u00c3\u0001\u0000"+
		"\u0000\u0000\'\u00c9\u0001\u0000\u0000\u0000)\u00d2\u0001\u0000\u0000"+
		"\u0000+\u00de\u0001\u0000\u0000\u0000-\u00e1\u0001\u0000\u0000\u0000/"+
		"\u00e4\u0001\u0000\u0000\u00001\u00e7\u0001\u0000\u0000\u00003\u00ed\u0001"+
		"\u0000\u0000\u00005\u00ef\u0001\u0000\u0000\u00007\u00f2\u0001\u0000\u0000"+
		"\u00009\u00f8\u0001\u0000\u0000\u0000;\u00fc\u0001\u0000\u0000\u0000="+
		"\u0115\u0001\u0000\u0000\u0000?\u0118\u0001\u0000\u0000\u0000A\u011c\u0001"+
		"\u0000\u0000\u0000C\u0124\u0001\u0000\u0000\u0000E\u012a\u0001\u0000\u0000"+
		"\u0000G\u0133\u0001\u0000\u0000\u0000I\u013c\u0001\u0000\u0000\u0000K"+
		"\u013e\u0001\u0000\u0000\u0000M\u0140\u0001\u0000\u0000\u0000O\u0142\u0001"+
		"\u0000\u0000\u0000Q\u0144\u0001\u0000\u0000\u0000S\u0146\u0001\u0000\u0000"+
		"\u0000U\u0148\u0001\u0000\u0000\u0000W\u014a\u0001\u0000\u0000\u0000Y"+
		"\u014c\u0001\u0000\u0000\u0000[\u014e\u0001\u0000\u0000\u0000]\u0150\u0001"+
		"\u0000\u0000\u0000_\u0152\u0001\u0000\u0000\u0000a\u0154\u0001\u0000\u0000"+
		"\u0000c\u0156\u0001\u0000\u0000\u0000e\u0158\u0001\u0000\u0000\u0000g"+
		"\u015a\u0001\u0000\u0000\u0000i\u015c\u0001\u0000\u0000\u0000k\u015e\u0001"+
		"\u0000\u0000\u0000m\u0160\u0001\u0000\u0000\u0000o\u0162\u0001\u0000\u0000"+
		"\u0000q\u0164\u0001\u0000\u0000\u0000s\u0166\u0001\u0000\u0000\u0000u"+
		"\u0168\u0001\u0000\u0000\u0000w\u016a\u0001\u0000\u0000\u0000y\u016c\u0001"+
		"\u0000\u0000\u0000{\u016e\u0001\u0000\u0000\u0000}~\u0005a\u0000\u0000"+
		"~\u007f\u0005n\u0000\u0000\u007f\u0080\u0005d\u0000\u0000\u0080\u0002"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083\u0005"+
		"r\u0000\u0000\u0083\u0004\u0001\u0000\u0000\u0000\u0084\u0085\u0005n\u0000"+
		"\u0000\u0085\u0086\u0005o\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087"+
		"\u0006\u0001\u0000\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089\b"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005,\u0000\u0000\u008b\n\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005;\u0000\u0000\u008d\f\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005(\u0000\u0000\u008f\u000e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005)\u0000\u0000\u0091\u0010\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005{\u0000\u0000\u0093\u0012\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005}\u0000\u0000\u0095\u0014\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005:\u0000\u0000\u0097\u0016\u0001\u0000\u0000\u0000\u0098\u0099\u0003"+
		"I$\u0000\u0099\u009a\u0003O\'\u0000\u009a\u009b\u0003O\'\u0000\u009b\u0018"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0003o7\u0000\u009d\u009e\u0003e"+
		"2\u0000\u009e\u001a\u0001\u0000\u0000\u0000\u009f\u00a0\u00037\u001b\u0000"+
		"\u00a0\u00a1\u0005-\u0000\u0000\u00a1\u00a2\u0003=\u001e\u0000\u00a2\u001c"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u00039\u001c\u0000\u00a4\u00a5\u0005"+
		"-\u0000\u0000\u00a5\u00a6\u0003=\u001e\u0000\u00a6\u001e\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u00037\u001b\u0000\u00a8\u00a9\u0005-\u0000\u0000\u00a9"+
		"\u00aa\u0003g3\u0000\u00aa\u00ab\u0003k5\u0000\u00ab\u00ac\u0003e2\u0000"+
		"\u00ac\u00ad\u0003M&\u0000\u00ad\u00ae\u0003Q(\u0000\u00ae\u00af\u0003"+
		"O\'\u0000\u00af\u00b0\u0003q8\u0000\u00b0\u00b1\u0003k5\u0000\u00b1\u00b2"+
		"\u0003Q(\u0000\u00b2 \u0001\u0000\u0000\u0000\u00b3\u00b4\u00039\u001c"+
		"\u0000\u00b4\u00b5\u0005-\u0000\u0000\u00b5\u00b6\u0003g3\u0000\u00b6"+
		"\u00b7\u0003k5\u0000\u00b7\u00b8\u0003e2\u0000\u00b8\u00b9\u0003M&\u0000"+
		"\u00b9\u00ba\u0003Q(\u0000\u00ba\u00bb\u0003O\'\u0000\u00bb\u00bc\u0003"+
		"q8\u0000\u00bc\u00bd\u0003k5\u0000\u00bd\u00be\u0003Q(\u0000\u00be\"\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0003_/\u0000\u00c0\u00c1\u0003Q(\u0000"+
		"\u00c1\u00c2\u0003o7\u0000\u00c2$\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0003_/\u0000\u00c4\u00c5\u0003e2\u0000\u00c5\u00c6\u0003M&\u0000\u00c6"+
		"\u00c7\u0003I$\u0000\u00c7\u00c8\u0003_/\u0000\u00c8&\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005#\u0000\u0000\u00ca\u00cb\u0003Y,\u0000\u00cb"+
		"\u00cc\u0003c1\u0000\u00cc\u00cd\u0003M&\u0000\u00cd\u00ce\u0003_/\u0000"+
		"\u00ce\u00cf\u0003q8\u0000\u00cf\u00d0\u0003O\'\u0000\u00d0\u00d1\u0003"+
		"Q(\u0000\u00d1(\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003_/\u0000\u00d3"+
		"\u00d4\u0003e2\u0000\u00d4\u00d5\u0003M&\u0000\u00d5\u00d6\u0003I$\u0000"+
		"\u00d6\u00d7\u0003_/\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u00d9"+
		"\u0003_/\u0000\u00d9\u00da\u0003e2\u0000\u00da\u00db\u0003M&\u0000\u00db"+
		"\u00dc\u0003I$\u0000\u00dc\u00dd\u0003_/\u0000\u00dd*\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005$\u0000\u0000\u00df\u00e0\u0003A \u0000\u00e0"+
		",\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2\u00e3\u0003"+
		"A \u0000\u00e3.\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005&\u0000\u0000"+
		"\u00e5\u00e6\u0003A \u0000\u00e60\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005%\u0000\u0000\u00e8\u00e9\u0003A \u0000\u00e92\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ee\u0003+\u0015\u0000\u00eb\u00ee\u0003-\u0016\u0000\u00ec"+
		"\u00ee\u0003/\u0017\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee4\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005:\u0000\u0000\u00f0\u00f1\u00033\u0019"+
		"\u0000\u00f16\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003K%\u0000\u00f3"+
		"\u00f4\u0003Q(\u0000\u00f4\u00f5\u0003U*\u0000\u00f5\u00f6\u0003Y,\u0000"+
		"\u00f6\u00f7\u0003c1\u0000\u00f78\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0003Q(\u0000\u00f9\u00fa\u0003c1\u0000\u00fa\u00fb\u0003O\'\u0000\u00fb"+
		":\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003g3\u0000\u00fd\u00fe\u0003"+
		"k5\u0000\u00fe\u00ff\u0003e2\u0000\u00ff\u0100\u0003M&\u0000\u0100\u0101"+
		"\u0003Q(\u0000\u0101\u0102\u0003O\'\u0000\u0102\u0103\u0003q8\u0000\u0103"+
		"\u0104\u0003k5\u0000\u0104\u0105\u0003Q(\u0000\u0105<\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0003g3\u0000\u0107\u0108\u0003k5\u0000\u0108\u0109"+
		"\u0003e2\u0000\u0109\u010a\u0003U*\u0000\u010a\u010b\u0003k5\u0000\u010b"+
		"\u010c\u0003I$\u0000\u010c\u010d\u0003a0\u0000\u010d\u0116\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0003k5\u0000\u010f\u0110\u0003Q(\u0000\u0110"+
		"\u0111\u0003g3\u0000\u0111\u0112\u0003e2\u0000\u0112\u0113\u0003k5\u0000"+
		"\u0113\u0114\u0003o7\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0106"+
		"\u0001\u0000\u0000\u0000\u0115\u010e\u0001\u0000\u0000\u0000\u0116>\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0007\u0000\u0000\u0000\u0118\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b@\u0001\u0000"+
		"\u0000\u0000\u011c\u0120\u0007\u0001\u0000\u0000\u011d\u011f\u0007\u0002"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121B\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0007\u0003\u0000\u0000\u0124\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0006!\u0000\u0000\u0129D\u0001\u0000\u0000\u0000\u012a"+
		"\u012e\u0005!\u0000\u0000\u012b\u012d\b\u0004\u0000\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0006\"\u0000\u0000\u0132F\u0001\u0000\u0000\u0000\u0133\u0137\u0005"+
		"\'\u0000\u0000\u0134\u0136\t\u0000\u0000\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005\'\u0000"+
		"\u0000\u013bH\u0001\u0000\u0000\u0000\u013c\u013d\u0007\u0005\u0000\u0000"+
		"\u013dJ\u0001\u0000\u0000\u0000\u013e\u013f\u0007\u0006\u0000\u0000\u013f"+
		"L\u0001\u0000\u0000\u0000\u0140\u0141\u0007\u0007\u0000\u0000\u0141N\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0007\b\u0000\u0000\u0143P\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0007\t\u0000\u0000\u0145R\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0007\n\u0000\u0000\u0147T\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0007\u000b\u0000\u0000\u0149V\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0007\f\u0000\u0000\u014bX\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0007\r\u0000\u0000\u014dZ\u0001\u0000\u0000\u0000\u014e\u014f\u0007"+
		"\u000e\u0000\u0000\u014f\\\u0001\u0000\u0000\u0000\u0150\u0151\u0007\u000f"+
		"\u0000\u0000\u0151^\u0001\u0000\u0000\u0000\u0152\u0153\u0007\u0010\u0000"+
		"\u0000\u0153`\u0001\u0000\u0000\u0000\u0154\u0155\u0007\u0011\u0000\u0000"+
		"\u0155b\u0001\u0000\u0000\u0000\u0156\u0157\u0007\u0012\u0000\u0000\u0157"+
		"d\u0001\u0000\u0000\u0000\u0158\u0159\u0007\u0013\u0000\u0000\u0159f\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0007\u0014\u0000\u0000\u015bh\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0007\u0015\u0000\u0000\u015dj\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0007\u0016\u0000\u0000\u015fl\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0007\u0017\u0000\u0000\u0161n\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0007\u0018\u0000\u0000\u0163p\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0007\u0019\u0000\u0000\u0165r\u0001\u0000\u0000\u0000\u0166\u0167\u0007"+
		"\u001a\u0000\u0000\u0167t\u0001\u0000\u0000\u0000\u0168\u0169\u0007\u001b"+
		"\u0000\u0000\u0169v\u0001\u0000\u0000\u0000\u016a\u016b\u0007\u001c\u0000"+
		"\u0000\u016bx\u0001\u0000\u0000\u0000\u016c\u016d\u0007\u001d\u0000\u0000"+
		"\u016dz\u0001\u0000\u0000\u0000\u016e\u016f\u0007\u001e\u0000\u0000\u016f"+
		"|\u0001\u0000\u0000\u0000\b\u0000\u00ed\u0115\u011a\u0120\u0126\u012e"+
		"\u0137\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}