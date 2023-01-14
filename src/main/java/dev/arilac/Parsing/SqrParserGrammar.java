// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\java\dev\arilac\SqrParserGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqrParserGrammar extends Parser {
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
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_procedureName = 2, RULE_procedureArguments = 3, 
		RULE_arguments = 4, RULE_returnArg = 5, RULE_procedureBody = 6, RULE_sqrCommand = 7, 
		RULE_add = 8, RULE_let = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "procedure", "procedureName", "procedureArguments", "arguments", 
			"returnArg", "procedureBody", "sqrCommand", "add", "let"
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

	@Override
	public String getGrammarFileName() { return "SqrParserGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqrParserGrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqrParserGrammar.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			procedure();
			setState(21);
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

	public static class ProcedureContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(SqrParserGrammar.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SqrParserGrammar.NEWLINE, i);
		}
		public TerminalNode BEGIN_PROCEDURE() { return getToken(SqrParserGrammar.BEGIN_PROCEDURE, 0); }
		public ProcedureNameContext procedureName() {
			return getRuleContext(ProcedureNameContext.class,0);
		}
		public ProcedureArgumentsContext procedureArguments() {
			return getRuleContext(ProcedureArgumentsContext.class,0);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public TerminalNode END_PROCEDURE() { return getToken(SqrParserGrammar.END_PROCEDURE, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(NEWLINE);
			setState(24);
			match(BEGIN_PROCEDURE);
			setState(25);
			procedureName();
			setState(26);
			procedureArguments();
			setState(27);
			procedureBody();
			setState(28);
			match(NEWLINE);
			setState(29);
			match(END_PROCEDURE);
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

	public static class ProcedureNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqrParserGrammar.IDENTIFIER, 0); }
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProcedureName(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IDENTIFIER);
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

	public static class ProcedureArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SqrParserGrammar.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqrParserGrammar.RPAREN, 0); }
		public TerminalNode LOCAL() { return getToken(SqrParserGrammar.LOCAL, 0); }
		public ProcedureArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProcedureArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProcedureArguments(this);
		}
	}

	public final ProcedureArgumentsContext procedureArguments() throws RecognitionException {
		ProcedureArgumentsContext _localctx = new ProcedureArgumentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureArguments);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(LPAREN);
				setState(34);
				arguments();
				setState(35);
				match(RPAREN);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(LOCAL);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SqrParserGrammar.VAR, 0); }
		public TerminalNode COMMA() { return getToken(SqrParserGrammar.COMMA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ReturnArgContext returnArg() {
			return getRuleContext(ReturnArgContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(VAR);
				setState(43);
				match(COMMA);
				setState(44);
				arguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				returnArg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(VAR);
				setState(47);
				match(COMMA);
				setState(48);
				returnArg();
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

	public static class ReturnArgContext extends ParserRuleContext {
		public TerminalNode RETVAR() { return getToken(SqrParserGrammar.RETVAR, 0); }
		public TerminalNode COMMA() { return getToken(SqrParserGrammar.COMMA, 0); }
		public ReturnArgContext returnArg() {
			return getRuleContext(ReturnArgContext.class,0);
		}
		public ReturnArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterReturnArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitReturnArg(this);
		}
	}

	public final ReturnArgContext returnArg() throws RecognitionException {
		ReturnArgContext _localctx = new ReturnArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnArg);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(RETVAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(RETVAR);
				setState(53);
				match(COMMA);
				setState(54);
				returnArg();
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

	public static class ProcedureBodyContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SqrParserGrammar.NEWLINE, 0); }
		public SqrCommandContext sqrCommand() {
			return getRuleContext(SqrCommandContext.class,0);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public ProcedureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProcedureBody(this);
		}
	}

	public final ProcedureBodyContext procedureBody() throws RecognitionException {
		ProcedureBodyContext _localctx = new ProcedureBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureBody);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(NEWLINE);
				setState(58);
				sqrCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(NEWLINE);
				setState(60);
				sqrCommand();
				setState(61);
				procedureBody();
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

	public static class SqrCommandContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public SqrCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterSqrCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitSqrCommand(this);
		}
	}

	public final SqrCommandContext sqrCommand() throws RecognitionException {
		SqrCommandContext _localctx = new SqrCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sqrCommand);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				add();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				let();
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqrParserGrammar.ADD, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public TerminalNode TO() { return getToken(SqrParserGrammar.TO, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ADD);
			setState(70);
			match(INT);
			setState(71);
			match(TO);
			setState(72);
			match(NUM_VAR);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SqrParserGrammar.LET, 0); }
		public TerminalNode VAR() { return getToken(SqrParserGrammar.VAR, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LET);
			setState(75);
			match(VAR);
			setState(76);
			match(EQ);
			setState(77);
			match(INT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#R\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5*\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\64\n\6\3\7\3\7\3\7\3\7"+
		"\5\7:\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\5\tF\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\2\2O\2\26\3\2\2\2\4\31\3\2\2\2\6!\3\2\2\2\b)\3\2\2\2\n\63\3\2\2\2\f"+
		"9\3\2\2\2\16A\3\2\2\2\20E\3\2\2\2\22G\3\2\2\2\24L\3\2\2\2\26\27\5\4\3"+
		"\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\7#\2\2\32\33\7\22\2\2\33\34\5\6\4"+
		"\2\34\35\5\b\5\2\35\36\5\16\b\2\36\37\7#\2\2\37 \7\23\2\2 \5\3\2\2\2!"+
		"\"\7\37\2\2\"\7\3\2\2\2#$\7\t\2\2$%\5\n\6\2%&\7\n\2\2&*\3\2\2\2\'*\7\25"+
		"\2\2(*\3\2\2\2)#\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\t\3\2\2\2+\64\7\31\2\2"+
		",-\7\31\2\2-.\7\7\2\2.\64\5\n\6\2/\64\5\f\7\2\60\61\7\31\2\2\61\62\7\7"+
		"\2\2\62\64\5\f\7\2\63+\3\2\2\2\63,\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\64"+
		"\13\3\2\2\2\65:\7\30\2\2\66\67\7\30\2\2\678\7\7\2\28:\5\f\7\29\65\3\2"+
		"\2\29\66\3\2\2\2:\r\3\2\2\2;<\7#\2\2<B\5\20\t\2=>\7#\2\2>?\5\20\t\2?@"+
		"\5\16\b\2@B\3\2\2\2A;\3\2\2\2A=\3\2\2\2B\17\3\2\2\2CF\5\22\n\2DF\5\24"+
		"\13\2EC\3\2\2\2ED\3\2\2\2F\21\3\2\2\2GH\7\16\2\2HI\7\36\2\2IJ\7\17\2\2"+
		"JK\7\33\2\2K\23\3\2\2\2LM\7\24\2\2MN\7\31\2\2NO\7\6\2\2OP\7\36\2\2P\25"+
		"\3\2\2\2\7)\639AE";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}