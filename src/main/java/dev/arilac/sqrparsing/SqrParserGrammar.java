// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\antlr4\dev\arilac\SqrParserGrammar.g4 by ANTLR 4.9.2

package dev.arilac.sqrparsing;

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
		CONCAT=1, EXPONENT=2, MULT=3, DIV=4, MOD=5, PLUS=6, MINUS=7, GT=8, LT=9, 
		GTE=10, LTE=11, NEQ=12, EQ=13, NOT=14, AND=15, OR=16, XOR=17, COMMA=18, 
		SEMI=19, LPAREN=20, RPAREN=21, LCURLY=22, RCURLY=23, COLON=24, FNC_ABS=25, 
		FNC_ACOS=26, FNC_ASIN=27, FNC_ATAN=28, FNC_CEIL=29, FNC_COS=30, FNC_COSH=31, 
		FNC_DEG=32, FNC_E10=33, FNC_EXP=34, FNC_FLOOR=35, FNC_LOG=36, FNC_LOG10=37, 
		FNC_MOD=38, FNC_POWER=39, FNC_RAD=40, FNC_SIGN=41, FNC_SIN=42, FNC_SINH=43, 
		FNC_SQRT=44, FNC_TAN=45, FNC_TANH=46, FNC_TRUNC=47, FNC_DELETE=48, FNC_EXISTS=49, 
		FNC_RENAME=50, FNC_ARRAY=51, FNC_ASCII=52, FNC_ASCIIC=53, FNC_CHR=54, 
		FNC_COND=55, FNC_DATEADD=56, FNC_DATEDIFF=57, FNC_DATENOW=58, FNC_DATETOSTR=59, 
		FNC_EDIT=60, FNC_GETENV=61, FNC_INSTR=62, FNC_INSTRB=63, FNC_ISBLANK=64, 
		FNC_ISNULL=65, FNC_LENGTH=66, FNC_LENGTHB=67, FNC_LENGTHP=68, FNC_LENGTHT=69, 
		FNC_LOWER=70, FNC_LPAD=71, FNC_LTRIM=72, FNC_NVL=73, FNC_RANGE=74, FNC_REPLACE=75, 
		FNC_ROMAN=76, FNC_RPAD=77, FNC_RTRIM=78, FNC_STRTODATE=79, FNC_SUBSTR=80, 
		FNC_SUBSTRB=81, FNC_SUBSTRP=82, FNC_SUBSTRT=83, FNC_TO_CHAR=84, FNC_TO_MULTI_BYTE=85, 
		FNC_TO_NUMBER=86, FNC_TO_SINGLE_BYTE=87, FNC_TRANSLATE=88, FNC_TRANSFORM=89, 
		FNC_UNICODE=90, FNC_UPPER=91, FNC_WRAPDEPTH=92, INCLUDE=93, ADD=94, TO=95, 
		ROUND=96, BEGIN_PROG=97, END_PROG=98, BEGIN_PROCEDURE=99, END_PROCEDURE=100, 
		LOCAL=101, IF=102, END_IF=103, LET=104, STOP=105, QUIET=106, SUBTRACT=107, 
		FROM=108, LOCAL_LOCAL=109, STR_VAR=110, NUM_VAR=111, COL_VAR=112, LST_VAR=113, 
		RETVAR=114, INT=115, DEC=116, FLT=117, STR_LIT=118, IDENTIFIER=119, WS=120, 
		LINE_COMMENT=121;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_procedureName = 2, RULE_procedureArguments = 3, 
		RULE_proc_arguments = 4, RULE_proc_arg = 5, RULE_returnArg = 6, RULE_procedureBody = 7, 
		RULE_sqrCommand = 8, RULE_add = 9, RULE_if = 10, RULE_let = 11, RULE_expression = 12, 
		RULE_operator = 13, RULE_operand = 14, RULE_variable = 15, RULE_literal = 16, 
		RULE_numeric = 17, RULE_function = 18, RULE_func_arg = 19, RULE_func_keyword = 20, 
		RULE_stop = 21, RULE_subtract = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "procedure", "procedureName", "procedureArguments", "proc_arguments", 
			"proc_arg", "returnArg", "procedureBody", "sqrCommand", "add", "if", 
			"let", "expression", "operator", "operand", "variable", "literal", "numeric", 
			"function", "func_arg", "func_keyword", "stop", "subtract"
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
			"SEMI", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "COLON", "FNC_ABS", "FNC_ACOS", 
			"FNC_ASIN", "FNC_ATAN", "FNC_CEIL", "FNC_COS", "FNC_COSH", "FNC_DEG", 
			"FNC_E10", "FNC_EXP", "FNC_FLOOR", "FNC_LOG", "FNC_LOG10", "FNC_MOD", 
			"FNC_POWER", "FNC_RAD", "FNC_SIGN", "FNC_SIN", "FNC_SINH", "FNC_SQRT", 
			"FNC_TAN", "FNC_TANH", "FNC_TRUNC", "FNC_DELETE", "FNC_EXISTS", "FNC_RENAME", 
			"FNC_ARRAY", "FNC_ASCII", "FNC_ASCIIC", "FNC_CHR", "FNC_COND", "FNC_DATEADD", 
			"FNC_DATEDIFF", "FNC_DATENOW", "FNC_DATETOSTR", "FNC_EDIT", "FNC_GETENV", 
			"FNC_INSTR", "FNC_INSTRB", "FNC_ISBLANK", "FNC_ISNULL", "FNC_LENGTH", 
			"FNC_LENGTHB", "FNC_LENGTHP", "FNC_LENGTHT", "FNC_LOWER", "FNC_LPAD", 
			"FNC_LTRIM", "FNC_NVL", "FNC_RANGE", "FNC_REPLACE", "FNC_ROMAN", "FNC_RPAD", 
			"FNC_RTRIM", "FNC_STRTODATE", "FNC_SUBSTR", "FNC_SUBSTRB", "FNC_SUBSTRP", 
			"FNC_SUBSTRT", "FNC_TO_CHAR", "FNC_TO_MULTI_BYTE", "FNC_TO_NUMBER", "FNC_TO_SINGLE_BYTE", 
			"FNC_TRANSLATE", "FNC_TRANSFORM", "FNC_UNICODE", "FNC_UPPER", "FNC_WRAPDEPTH", 
			"INCLUDE", "ADD", "TO", "ROUND", "BEGIN_PROG", "END_PROG", "BEGIN_PROCEDURE", 
			"END_PROCEDURE", "LOCAL", "IF", "END_IF", "LET", "STOP", "QUIET", "SUBTRACT", 
			"FROM", "LOCAL_LOCAL", "STR_VAR", "NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", 
			"INT", "DEC", "FLT", "STR_LIT", "IDENTIFIER", "WS", "LINE_COMMENT"
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
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
		return program(0);
	}

	private ProgramContext program(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramContext _localctx = new ProgramContext(_ctx, _parentState);
		ProgramContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_program, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			procedure();
			setState(48);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_program);
					setState(50);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(51);
					procedure();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ProcedureContext extends ParserRuleContext {
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
			setState(57);
			match(BEGIN_PROCEDURE);
			setState(58);
			procedureName();
			setState(59);
			procedureArguments();
			setState(60);
			procedureBody();
			setState(61);
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
			setState(63);
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
		public Proc_argumentsContext proc_arguments() {
			return getRuleContext(Proc_argumentsContext.class,0);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(LPAREN);
				setState(66);
				proc_arguments(0);
				setState(67);
				match(RPAREN);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(LOCAL);
				}
				break;
			case ADD:
			case END_PROCEDURE:
			case IF:
			case LET:
			case STOP:
			case SUBTRACT:
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

	public static class Proc_argumentsContext extends ParserRuleContext {
		public Proc_argContext proc_arg() {
			return getRuleContext(Proc_argContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SqrParserGrammar.COMMA, 0); }
		public Proc_argumentsContext proc_arguments() {
			return getRuleContext(Proc_argumentsContext.class,0);
		}
		public ReturnArgContext returnArg() {
			return getRuleContext(ReturnArgContext.class,0);
		}
		public Proc_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProc_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProc_arguments(this);
		}
	}

	public final Proc_argumentsContext proc_arguments() throws RecognitionException {
		return proc_arguments(0);
	}

	private Proc_argumentsContext proc_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Proc_argumentsContext _localctx = new Proc_argumentsContext(_ctx, _parentState);
		Proc_argumentsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_proc_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(74);
				proc_arg();
				}
				break;
			case 2:
				{
				setState(75);
				proc_arg();
				setState(76);
				match(COMMA);
				setState(77);
				proc_arguments(3);
				}
				break;
			case 3:
				{
				setState(79);
				returnArg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Proc_argumentsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_proc_arguments);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					match(COMMA);
					setState(84);
					returnArg();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Proc_argContext extends ParserRuleContext {
		public TerminalNode STR_VAR() { return getToken(SqrParserGrammar.STR_VAR, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public Proc_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterProc_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitProc_arg(this);
		}
	}

	public final Proc_argContext proc_arg() throws RecognitionException {
		Proc_argContext _localctx = new Proc_argContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==STR_VAR || _la==NUM_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 12, RULE_returnArg);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(RETVAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(RETVAR);
				setState(94);
				match(COMMA);
				setState(95);
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
		enterRule(_localctx, 14, RULE_procedureBody);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				sqrCommand();
				setState(99);
				procedureBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				sqrCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public StopContext stop() {
			return getRuleContext(StopContext.class,0);
		}
		public SubtractContext subtract() {
			return getRuleContext(SubtractContext.class,0);
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
		enterRule(_localctx, 16, RULE_sqrCommand);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				add();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				if();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				let();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				stop();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				subtract();
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
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqrParserGrammar.TO, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode ROUND() { return getToken(SqrParserGrammar.ROUND, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
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
		enterRule(_localctx, 18, RULE_add);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(ADD);
				setState(113);
				numeric();
				setState(114);
				match(TO);
				setState(115);
				match(NUM_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ADD);
				setState(118);
				numeric();
				setState(119);
				match(TO);
				setState(120);
				match(NUM_VAR);
				setState(121);
				match(ROUND);
				setState(122);
				match(EQ);
				setState(123);
				match(INT);
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SqrParserGrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(SqrParserGrammar.END_IF, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitIf(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IF);
			setState(128);
			expression();
			setState(129);
			procedureBody();
			setState(130);
			match(END_IF);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LET);
			setState(133);
			variable();
			setState(134);
			match(EQ);
			setState(135);
			expression();
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
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqrParserGrammar.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NOT);
				setState(139);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				operand();
				setState(141);
				operator();
				setState(142);
				operand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				operand();
				setState(145);
				operator();
				setState(146);
				expression();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode CONCAT() { return getToken(SqrParserGrammar.CONCAT, 0); }
		public TerminalNode EXPONENT() { return getToken(SqrParserGrammar.EXPONENT, 0); }
		public TerminalNode MULT() { return getToken(SqrParserGrammar.MULT, 0); }
		public TerminalNode DIV() { return getToken(SqrParserGrammar.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqrParserGrammar.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqrParserGrammar.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqrParserGrammar.MINUS, 0); }
		public TerminalNode GT() { return getToken(SqrParserGrammar.GT, 0); }
		public TerminalNode LT() { return getToken(SqrParserGrammar.LT, 0); }
		public TerminalNode GTE() { return getToken(SqrParserGrammar.GTE, 0); }
		public TerminalNode LTE() { return getToken(SqrParserGrammar.LTE, 0); }
		public TerminalNode NEQ() { return getToken(SqrParserGrammar.NEQ, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public TerminalNode NOT() { return getToken(SqrParserGrammar.NOT, 0); }
		public TerminalNode AND() { return getToken(SqrParserGrammar.AND, 0); }
		public TerminalNode OR() { return getToken(SqrParserGrammar.OR, 0); }
		public TerminalNode XOR() { return getToken(SqrParserGrammar.XOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONCAT) | (1L << EXPONENT) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << PLUS) | (1L << MINUS) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE) | (1L << NEQ) | (1L << EQ) | (1L << NOT) | (1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperandContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operand);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_VAR:
			case NUM_VAR:
			case COL_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				variable();
				}
				break;
			case INT:
			case DEC:
			case FLT:
			case STR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				literal();
				}
				break;
			case FNC_ABS:
			case FNC_ACOS:
			case FNC_ASIN:
			case FNC_ATAN:
			case FNC_CEIL:
			case FNC_COS:
			case FNC_COSH:
			case FNC_DEG:
			case FNC_E10:
			case FNC_EXP:
			case FNC_FLOOR:
			case FNC_LOG:
			case FNC_LOG10:
			case FNC_MOD:
			case FNC_POWER:
			case FNC_RAD:
			case FNC_SIGN:
			case FNC_SIN:
			case FNC_SINH:
			case FNC_SQRT:
			case FNC_TAN:
			case FNC_TANH:
			case FNC_TRUNC:
			case FNC_DELETE:
			case FNC_EXISTS:
			case FNC_RENAME:
			case FNC_ARRAY:
			case FNC_ASCII:
			case FNC_ASCIIC:
			case FNC_CHR:
			case FNC_COND:
			case FNC_DATEADD:
			case FNC_DATEDIFF:
			case FNC_DATENOW:
			case FNC_DATETOSTR:
			case FNC_EDIT:
			case FNC_GETENV:
			case FNC_INSTR:
			case FNC_INSTRB:
			case FNC_ISBLANK:
			case FNC_ISNULL:
			case FNC_LENGTH:
			case FNC_LENGTHB:
			case FNC_LENGTHP:
			case FNC_LENGTHT:
			case FNC_LOWER:
			case FNC_LPAD:
			case FNC_LTRIM:
			case FNC_NVL:
			case FNC_RANGE:
			case FNC_REPLACE:
			case FNC_ROMAN:
			case FNC_RPAD:
			case FNC_RTRIM:
			case FNC_STRTODATE:
			case FNC_SUBSTR:
			case FNC_SUBSTRB:
			case FNC_SUBSTRP:
			case FNC_SUBSTRT:
			case FNC_TO_CHAR:
			case FNC_TO_MULTI_BYTE:
			case FNC_TO_NUMBER:
			case FNC_TO_SINGLE_BYTE:
			case FNC_TRANSLATE:
			case FNC_TRANSFORM:
			case FNC_UNICODE:
			case FNC_UPPER:
			case FNC_WRAPDEPTH:
			case ROUND:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				function();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode STR_VAR() { return getToken(SqrParserGrammar.STR_VAR, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode COL_VAR() { return getToken(SqrParserGrammar.COL_VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (STR_VAR - 110)) | (1L << (NUM_VAR - 110)) | (1L << (COL_VAR - 110)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public TerminalNode FLT() { return getToken(SqrParserGrammar.FLT, 0); }
		public TerminalNode DEC() { return getToken(SqrParserGrammar.DEC, 0); }
		public TerminalNode STR_LIT() { return getToken(SqrParserGrammar.STR_LIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (INT - 115)) | (1L << (DEC - 115)) | (1L << (FLT - 115)) | (1L << (STR_LIT - 115)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode COL_VAR() { return getToken(SqrParserGrammar.COL_VAR, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public TerminalNode FLT() { return getToken(SqrParserGrammar.FLT, 0); }
		public TerminalNode DEC() { return getToken(SqrParserGrammar.DEC, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitNumeric(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (NUM_VAR - 111)) | (1L << (COL_VAR - 111)) | (1L << (INT - 111)) | (1L << (DEC - 111)) | (1L << (FLT - 111)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		public Func_keywordContext func_keyword() {
			return getRuleContext(Func_keywordContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SqrParserGrammar.LPAREN, 0); }
		public Func_argContext func_arg() {
			return getRuleContext(Func_argContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqrParserGrammar.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			func_keyword();
			setState(164);
			match(LPAREN);
			setState(165);
			func_arg();
			setState(166);
			match(RPAREN);
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

	public static class Func_argContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SqrParserGrammar.COMMA, 0); }
		public Func_argContext func_arg() {
			return getRuleContext(Func_argContext.class,0);
		}
		public Func_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterFunc_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitFunc_arg(this);
		}
	}

	public final Func_argContext func_arg() throws RecognitionException {
		Func_argContext _localctx = new Func_argContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_arg);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				expression();
				setState(170);
				match(COMMA);
				setState(171);
				func_arg();
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

	public static class Func_keywordContext extends ParserRuleContext {
		public TerminalNode FNC_ABS() { return getToken(SqrParserGrammar.FNC_ABS, 0); }
		public TerminalNode FNC_ACOS() { return getToken(SqrParserGrammar.FNC_ACOS, 0); }
		public TerminalNode FNC_ASIN() { return getToken(SqrParserGrammar.FNC_ASIN, 0); }
		public TerminalNode FNC_ATAN() { return getToken(SqrParserGrammar.FNC_ATAN, 0); }
		public TerminalNode FNC_CEIL() { return getToken(SqrParserGrammar.FNC_CEIL, 0); }
		public TerminalNode FNC_COS() { return getToken(SqrParserGrammar.FNC_COS, 0); }
		public TerminalNode FNC_COSH() { return getToken(SqrParserGrammar.FNC_COSH, 0); }
		public TerminalNode FNC_DEG() { return getToken(SqrParserGrammar.FNC_DEG, 0); }
		public TerminalNode FNC_E10() { return getToken(SqrParserGrammar.FNC_E10, 0); }
		public TerminalNode FNC_EXP() { return getToken(SqrParserGrammar.FNC_EXP, 0); }
		public TerminalNode FNC_FLOOR() { return getToken(SqrParserGrammar.FNC_FLOOR, 0); }
		public TerminalNode FNC_LOG() { return getToken(SqrParserGrammar.FNC_LOG, 0); }
		public TerminalNode FNC_LOG10() { return getToken(SqrParserGrammar.FNC_LOG10, 0); }
		public TerminalNode FNC_MOD() { return getToken(SqrParserGrammar.FNC_MOD, 0); }
		public TerminalNode FNC_POWER() { return getToken(SqrParserGrammar.FNC_POWER, 0); }
		public TerminalNode FNC_RAD() { return getToken(SqrParserGrammar.FNC_RAD, 0); }
		public TerminalNode ROUND() { return getToken(SqrParserGrammar.ROUND, 0); }
		public TerminalNode FNC_SIGN() { return getToken(SqrParserGrammar.FNC_SIGN, 0); }
		public TerminalNode FNC_SIN() { return getToken(SqrParserGrammar.FNC_SIN, 0); }
		public TerminalNode FNC_SINH() { return getToken(SqrParserGrammar.FNC_SINH, 0); }
		public TerminalNode FNC_SQRT() { return getToken(SqrParserGrammar.FNC_SQRT, 0); }
		public TerminalNode FNC_TAN() { return getToken(SqrParserGrammar.FNC_TAN, 0); }
		public TerminalNode FNC_TANH() { return getToken(SqrParserGrammar.FNC_TANH, 0); }
		public TerminalNode FNC_TRUNC() { return getToken(SqrParserGrammar.FNC_TRUNC, 0); }
		public TerminalNode FNC_DELETE() { return getToken(SqrParserGrammar.FNC_DELETE, 0); }
		public TerminalNode FNC_EXISTS() { return getToken(SqrParserGrammar.FNC_EXISTS, 0); }
		public TerminalNode FNC_RENAME() { return getToken(SqrParserGrammar.FNC_RENAME, 0); }
		public TerminalNode FNC_ARRAY() { return getToken(SqrParserGrammar.FNC_ARRAY, 0); }
		public TerminalNode FNC_ASCII() { return getToken(SqrParserGrammar.FNC_ASCII, 0); }
		public TerminalNode FNC_ASCIIC() { return getToken(SqrParserGrammar.FNC_ASCIIC, 0); }
		public TerminalNode FNC_CHR() { return getToken(SqrParserGrammar.FNC_CHR, 0); }
		public TerminalNode FNC_COND() { return getToken(SqrParserGrammar.FNC_COND, 0); }
		public TerminalNode FNC_DATEADD() { return getToken(SqrParserGrammar.FNC_DATEADD, 0); }
		public TerminalNode FNC_DATEDIFF() { return getToken(SqrParserGrammar.FNC_DATEDIFF, 0); }
		public TerminalNode FNC_DATENOW() { return getToken(SqrParserGrammar.FNC_DATENOW, 0); }
		public TerminalNode FNC_DATETOSTR() { return getToken(SqrParserGrammar.FNC_DATETOSTR, 0); }
		public TerminalNode FNC_EDIT() { return getToken(SqrParserGrammar.FNC_EDIT, 0); }
		public TerminalNode FNC_GETENV() { return getToken(SqrParserGrammar.FNC_GETENV, 0); }
		public TerminalNode FNC_INSTR() { return getToken(SqrParserGrammar.FNC_INSTR, 0); }
		public TerminalNode FNC_INSTRB() { return getToken(SqrParserGrammar.FNC_INSTRB, 0); }
		public TerminalNode FNC_ISBLANK() { return getToken(SqrParserGrammar.FNC_ISBLANK, 0); }
		public TerminalNode FNC_ISNULL() { return getToken(SqrParserGrammar.FNC_ISNULL, 0); }
		public TerminalNode FNC_LENGTH() { return getToken(SqrParserGrammar.FNC_LENGTH, 0); }
		public TerminalNode FNC_LENGTHB() { return getToken(SqrParserGrammar.FNC_LENGTHB, 0); }
		public TerminalNode FNC_LENGTHP() { return getToken(SqrParserGrammar.FNC_LENGTHP, 0); }
		public TerminalNode FNC_LENGTHT() { return getToken(SqrParserGrammar.FNC_LENGTHT, 0); }
		public TerminalNode FNC_LOWER() { return getToken(SqrParserGrammar.FNC_LOWER, 0); }
		public TerminalNode FNC_LPAD() { return getToken(SqrParserGrammar.FNC_LPAD, 0); }
		public TerminalNode FNC_LTRIM() { return getToken(SqrParserGrammar.FNC_LTRIM, 0); }
		public TerminalNode FNC_NVL() { return getToken(SqrParserGrammar.FNC_NVL, 0); }
		public TerminalNode FNC_RANGE() { return getToken(SqrParserGrammar.FNC_RANGE, 0); }
		public TerminalNode FNC_REPLACE() { return getToken(SqrParserGrammar.FNC_REPLACE, 0); }
		public TerminalNode FNC_ROMAN() { return getToken(SqrParserGrammar.FNC_ROMAN, 0); }
		public TerminalNode FNC_RPAD() { return getToken(SqrParserGrammar.FNC_RPAD, 0); }
		public TerminalNode FNC_RTRIM() { return getToken(SqrParserGrammar.FNC_RTRIM, 0); }
		public TerminalNode FNC_STRTODATE() { return getToken(SqrParserGrammar.FNC_STRTODATE, 0); }
		public TerminalNode FNC_SUBSTR() { return getToken(SqrParserGrammar.FNC_SUBSTR, 0); }
		public TerminalNode FNC_SUBSTRB() { return getToken(SqrParserGrammar.FNC_SUBSTRB, 0); }
		public TerminalNode FNC_SUBSTRP() { return getToken(SqrParserGrammar.FNC_SUBSTRP, 0); }
		public TerminalNode FNC_SUBSTRT() { return getToken(SqrParserGrammar.FNC_SUBSTRT, 0); }
		public TerminalNode FNC_TO_CHAR() { return getToken(SqrParserGrammar.FNC_TO_CHAR, 0); }
		public TerminalNode FNC_TO_MULTI_BYTE() { return getToken(SqrParserGrammar.FNC_TO_MULTI_BYTE, 0); }
		public TerminalNode FNC_TO_NUMBER() { return getToken(SqrParserGrammar.FNC_TO_NUMBER, 0); }
		public TerminalNode FNC_TO_SINGLE_BYTE() { return getToken(SqrParserGrammar.FNC_TO_SINGLE_BYTE, 0); }
		public TerminalNode FNC_TRANSLATE() { return getToken(SqrParserGrammar.FNC_TRANSLATE, 0); }
		public TerminalNode FNC_TRANSFORM() { return getToken(SqrParserGrammar.FNC_TRANSFORM, 0); }
		public TerminalNode FNC_UNICODE() { return getToken(SqrParserGrammar.FNC_UNICODE, 0); }
		public TerminalNode FNC_UPPER() { return getToken(SqrParserGrammar.FNC_UPPER, 0); }
		public TerminalNode FNC_WRAPDEPTH() { return getToken(SqrParserGrammar.FNC_WRAPDEPTH, 0); }
		public Func_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterFunc_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitFunc_keyword(this);
		}
	}

	public final Func_keywordContext func_keyword() throws RecognitionException {
		Func_keywordContext _localctx = new Func_keywordContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FNC_ABS) | (1L << FNC_ACOS) | (1L << FNC_ASIN) | (1L << FNC_ATAN) | (1L << FNC_CEIL) | (1L << FNC_COS) | (1L << FNC_COSH) | (1L << FNC_DEG) | (1L << FNC_E10) | (1L << FNC_EXP) | (1L << FNC_FLOOR) | (1L << FNC_LOG) | (1L << FNC_LOG10) | (1L << FNC_MOD) | (1L << FNC_POWER) | (1L << FNC_RAD) | (1L << FNC_SIGN) | (1L << FNC_SIN) | (1L << FNC_SINH) | (1L << FNC_SQRT) | (1L << FNC_TAN) | (1L << FNC_TANH) | (1L << FNC_TRUNC) | (1L << FNC_DELETE) | (1L << FNC_EXISTS) | (1L << FNC_RENAME) | (1L << FNC_ARRAY) | (1L << FNC_ASCII) | (1L << FNC_ASCIIC) | (1L << FNC_CHR) | (1L << FNC_COND) | (1L << FNC_DATEADD) | (1L << FNC_DATEDIFF) | (1L << FNC_DATENOW) | (1L << FNC_DATETOSTR) | (1L << FNC_EDIT) | (1L << FNC_GETENV) | (1L << FNC_INSTR) | (1L << FNC_INSTRB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FNC_ISBLANK - 64)) | (1L << (FNC_ISNULL - 64)) | (1L << (FNC_LENGTH - 64)) | (1L << (FNC_LENGTHB - 64)) | (1L << (FNC_LENGTHP - 64)) | (1L << (FNC_LENGTHT - 64)) | (1L << (FNC_LOWER - 64)) | (1L << (FNC_LPAD - 64)) | (1L << (FNC_LTRIM - 64)) | (1L << (FNC_NVL - 64)) | (1L << (FNC_RANGE - 64)) | (1L << (FNC_REPLACE - 64)) | (1L << (FNC_ROMAN - 64)) | (1L << (FNC_RPAD - 64)) | (1L << (FNC_RTRIM - 64)) | (1L << (FNC_STRTODATE - 64)) | (1L << (FNC_SUBSTR - 64)) | (1L << (FNC_SUBSTRB - 64)) | (1L << (FNC_SUBSTRP - 64)) | (1L << (FNC_SUBSTRT - 64)) | (1L << (FNC_TO_CHAR - 64)) | (1L << (FNC_TO_MULTI_BYTE - 64)) | (1L << (FNC_TO_NUMBER - 64)) | (1L << (FNC_TO_SINGLE_BYTE - 64)) | (1L << (FNC_TRANSLATE - 64)) | (1L << (FNC_TRANSFORM - 64)) | (1L << (FNC_UNICODE - 64)) | (1L << (FNC_UPPER - 64)) | (1L << (FNC_WRAPDEPTH - 64)) | (1L << (ROUND - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StopContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(SqrParserGrammar.STOP, 0); }
		public TerminalNode QUIET() { return getToken(SqrParserGrammar.QUIET, 0); }
		public StopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitStop(this);
		}
	}

	public final StopContext stop() throws RecognitionException {
		StopContext _localctx = new StopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stop);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(STOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(STOP);
				setState(179);
				match(QUIET);
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

	public static class SubtractContext extends ParserRuleContext {
		public TerminalNode SUBTRACT() { return getToken(SqrParserGrammar.SUBTRACT, 0); }
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqrParserGrammar.FROM, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode ROUND() { return getToken(SqrParserGrammar.ROUND, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public SubtractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitSubtract(this);
		}
	}

	public final SubtractContext subtract() throws RecognitionException {
		SubtractContext _localctx = new SubtractContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subtract);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(SUBTRACT);
				setState(183);
				numeric();
				setState(184);
				match(FROM);
				setState(185);
				match(NUM_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(SUBTRACT);
				setState(188);
				numeric();
				setState(189);
				match(FROM);
				setState(190);
				match(NUM_VAR);
				setState(191);
				match(ROUND);
				setState(192);
				match(EQ);
				setState(193);
				match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 4:
			return proc_arguments_sempred((Proc_argumentsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean program_sempred(ProgramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean proc_arguments_sempred(Proc_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n"+
		"\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bc\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u009e\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00b0\n\25\3\26\3\26\3\27\3\27\3\27\5\27\u00b7"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00c6\n\30\3\30\2\4\2\n\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\b\3\2pq\3\2\3\23\3\2pr\3\2ux\4\2qruw\4\2\33^bb\2\u00c6\2\60"+
		"\3\2\2\2\4;\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nR\3\2\2\2\f\\\3\2\2\2\16b\3"+
		"\2\2\2\20i\3\2\2\2\22p\3\2\2\2\24\177\3\2\2\2\26\u0081\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2\36\u009d\3\2\2\2 \u009f\3\2"+
		"\2\2\"\u00a1\3\2\2\2$\u00a3\3\2\2\2&\u00a5\3\2\2\2(\u00af\3\2\2\2*\u00b1"+
		"\3\2\2\2,\u00b6\3\2\2\2.\u00c5\3\2\2\2\60\61\b\2\1\2\61\62\5\4\3\2\62"+
		"\63\7\2\2\3\638\3\2\2\2\64\65\f\4\2\2\65\67\5\4\3\2\66\64\3\2\2\2\67:"+
		"\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;<\7e\2\2<=\5\6\4\2"+
		"=>\5\b\5\2>?\5\20\t\2?@\7f\2\2@\5\3\2\2\2AB\7y\2\2B\7\3\2\2\2CD\7\26\2"+
		"\2DE\5\n\6\2EF\7\27\2\2FJ\3\2\2\2GJ\7g\2\2HJ\3\2\2\2IC\3\2\2\2IG\3\2\2"+
		"\2IH\3\2\2\2J\t\3\2\2\2KL\b\6\1\2LS\5\f\7\2MN\5\f\7\2NO\7\24\2\2OP\5\n"+
		"\6\5PS\3\2\2\2QS\5\16\b\2RK\3\2\2\2RM\3\2\2\2RQ\3\2\2\2SY\3\2\2\2TU\f"+
		"\4\2\2UV\7\24\2\2VX\5\16\b\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"\13\3\2\2\2[Y\3\2\2\2\\]\t\2\2\2]\r\3\2\2\2^c\7t\2\2_`\7t\2\2`a\7\24\2"+
		"\2ac\5\16\b\2b^\3\2\2\2b_\3\2\2\2c\17\3\2\2\2de\5\22\n\2ef\5\20\t\2fj"+
		"\3\2\2\2gj\5\22\n\2hj\3\2\2\2id\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\21\3\2\2"+
		"\2kq\5\24\13\2lq\5\26\f\2mq\5\30\r\2nq\5,\27\2oq\5.\30\2pk\3\2\2\2pl\3"+
		"\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\23\3\2\2\2rs\7`\2\2st\5$\23\2tu"+
		"\7a\2\2uv\7q\2\2v\u0080\3\2\2\2wx\7`\2\2xy\5$\23\2yz\7a\2\2z{\7q\2\2{"+
		"|\7b\2\2|}\7\17\2\2}~\7u\2\2~\u0080\3\2\2\2\177r\3\2\2\2\177w\3\2\2\2"+
		"\u0080\25\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\5\32\16\2\u0083\u0084"+
		"\5\20\t\2\u0084\u0085\7i\2\2\u0085\27\3\2\2\2\u0086\u0087\7j\2\2\u0087"+
		"\u0088\5 \21\2\u0088\u0089\7\17\2\2\u0089\u008a\5\32\16\2\u008a\31\3\2"+
		"\2\2\u008b\u0097\5\36\20\2\u008c\u008d\7\20\2\2\u008d\u0097\5\32\16\2"+
		"\u008e\u008f\5\36\20\2\u008f\u0090\5\34\17\2\u0090\u0091\5\36\20\2\u0091"+
		"\u0097\3\2\2\2\u0092\u0093\5\36\20\2\u0093\u0094\5\34\17\2\u0094\u0095"+
		"\5\32\16\2\u0095\u0097\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u008c\3\2\2\2"+
		"\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\33\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099\35\3\2\2\2\u009a\u009e\5 \21\2\u009b\u009e\5\"\22\2\u009c"+
		"\u009e\5&\24\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\37\3\2\2\2\u009f\u00a0\t\4\2\2\u00a0!\3\2\2\2\u00a1\u00a2\t"+
		"\5\2\2\u00a2#\3\2\2\2\u00a3\u00a4\t\6\2\2\u00a4%\3\2\2\2\u00a5\u00a6\5"+
		"*\26\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7\27\2\2\u00a9"+
		"\'\3\2\2\2\u00aa\u00b0\5\32\16\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\7\24"+
		"\2\2\u00ad\u00ae\5(\25\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0)\3\2\2\2\u00b1\u00b2\t\7\2\2\u00b2+\3\2\2\2\u00b3"+
		"\u00b7\7k\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b7\7l\2\2\u00b6\u00b3\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7-\3\2\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\5"+
		"$\23\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00c6\3\2\2\2\u00bd"+
		"\u00be\7m\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7q\2"+
		"\2\u00c1\u00c2\7b\2\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c6/\3\2\2\2\178IR"+
		"Ybip\177\u0096\u009d\u00af\u00b6\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}