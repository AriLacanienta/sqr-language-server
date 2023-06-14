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
		LOCAL=101, EVALUATE=102, WHEN=103, WHEN_OTHER=104, END_EVALUATE=105, IF=106, 
		ELSE=107, END_IF=108, LET=109, STOP=110, QUIET=111, SUBTRACT=112, FROM=113, 
		WHILE=114, BREAK=115, END_WHILE=116, STR_VAR=117, NUM_VAR=118, COL_VAR=119, 
		LST_VAR=120, RETVAR=121, INT=122, DEC=123, FLT=124, STR_LIT=125, IDENTIFIER=126, 
		WS=127, LINE_COMMENT=128;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_procedureArguments = 2, RULE_proc_arg = 3, 
		RULE_return_arg = 4, RULE_sqrCommand = 5, RULE_add = 6, RULE_evaluate_statement = 7, 
		RULE_when_block = 8, RULE_if_statement = 9, RULE_let = 10, RULE_expression = 11, 
		RULE_operator = 12, RULE_comparison_operator = 13, RULE_operand = 14, 
		RULE_var_or_lit = 15, RULE_variable = 16, RULE_literal = 17, RULE_number = 18, 
		RULE_num_lit = 19, RULE_numeric = 20, RULE_function = 21, RULE_func_arg = 22, 
		RULE_func_keyword = 23, RULE_stop = 24, RULE_subtract = 25, RULE_while_statement = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "procedure", "procedureArguments", "proc_arg", "return_arg", 
			"sqrCommand", "add", "evaluate_statement", "when_block", "if_statement", 
			"let", "expression", "operator", "comparison_operator", "operand", "var_or_lit", 
			"variable", "literal", "number", "num_lit", "numeric", "function", "func_arg", 
			"func_keyword", "stop", "subtract", "while_statement"
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
			"END_PROCEDURE", "LOCAL", "EVALUATE", "WHEN", "WHEN_OTHER", "END_EVALUATE", 
			"IF", "ELSE", "END_IF", "LET", "STOP", "QUIET", "SUBTRACT", "FROM", "WHILE", 
			"BREAK", "END_WHILE", "STR_VAR", "NUM_VAR", "COL_VAR", "LST_VAR", "RETVAR", 
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
		public TerminalNode EOF() { return getToken(SqrParserGrammar.EOF, 0); }
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
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
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN_PROCEDURE) {
				{
				{
				setState(54);
				procedure();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		public TerminalNode BEGIN_PROCEDURE() { return getToken(SqrParserGrammar.BEGIN_PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqrParserGrammar.IDENTIFIER, 0); }
		public ProcedureArgumentsContext procedureArguments() {
			return getRuleContext(ProcedureArgumentsContext.class,0);
		}
		public TerminalNode END_PROCEDURE() { return getToken(SqrParserGrammar.END_PROCEDURE, 0); }
		public List<SqrCommandContext> sqrCommand() {
			return getRuleContexts(SqrCommandContext.class);
		}
		public SqrCommandContext sqrCommand(int i) {
			return getRuleContext(SqrCommandContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(BEGIN_PROCEDURE);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			procedureArguments();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
				{
				{
				setState(65);
				sqrCommand();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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

	public static class ProcedureArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SqrParserGrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SqrParserGrammar.RPAREN, 0); }
		public List<Proc_argContext> proc_arg() {
			return getRuleContexts(Proc_argContext.class);
		}
		public Proc_argContext proc_arg(int i) {
			return getRuleContext(Proc_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqrParserGrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqrParserGrammar.COMMA, i);
		}
		public List<Return_argContext> return_arg() {
			return getRuleContexts(Return_argContext.class);
		}
		public Return_argContext return_arg(int i) {
			return getRuleContext(Return_argContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_procedureArguments);
		int _la;
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(LPAREN);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STR_VAR || _la==NUM_VAR) {
					{
					{
					setState(74);
					proc_arg();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						match(COMMA);
						setState(81);
						proc_arg();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RETVAR) {
					{
					{
					setState(87);
					return_arg();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					return_arg();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(RPAREN);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(LOCAL);
				}
				break;
			case ADD:
			case END_PROCEDURE:
			case EVALUATE:
			case IF:
			case LET:
			case STOP:
			case SUBTRACT:
			case WHILE:
			case BREAK:
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
		enterRule(_localctx, 6, RULE_proc_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class Return_argContext extends ParserRuleContext {
		public TerminalNode RETVAR() { return getToken(SqrParserGrammar.RETVAR, 0); }
		public TerminalNode COMMA() { return getToken(SqrParserGrammar.COMMA, 0); }
		public Return_argContext return_arg() {
			return getRuleContext(Return_argContext.class,0);
		}
		public Return_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterReturn_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitReturn_arg(this);
		}
	}

	public final Return_argContext return_arg() throws RecognitionException {
		Return_argContext _localctx = new Return_argContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_arg);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(RETVAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(RETVAR);
				setState(109);
				match(COMMA);
				setState(110);
				return_arg();
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
		public TerminalNode BREAK() { return getToken(SqrParserGrammar.BREAK, 0); }
		public Evaluate_statementContext evaluate_statement() {
			return getRuleContext(Evaluate_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
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
		enterRule(_localctx, 10, RULE_sqrCommand);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				add();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(BREAK);
				}
				break;
			case EVALUATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				evaluate_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				if_statement();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				let();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				stop();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				subtract();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				while_statement();
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
		enterRule(_localctx, 12, RULE_add);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ADD);
				setState(124);
				numeric();
				setState(125);
				match(TO);
				setState(126);
				match(NUM_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ADD);
				setState(129);
				numeric();
				setState(130);
				match(TO);
				setState(131);
				match(NUM_VAR);
				setState(132);
				match(ROUND);
				setState(133);
				match(EQ);
				setState(134);
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

	public static class Evaluate_statementContext extends ParserRuleContext {
		public TerminalNode EVALUATE() { return getToken(SqrParserGrammar.EVALUATE, 0); }
		public Var_or_litContext var_or_lit() {
			return getRuleContext(Var_or_litContext.class,0);
		}
		public TerminalNode END_EVALUATE() { return getToken(SqrParserGrammar.END_EVALUATE, 0); }
		public List<When_blockContext> when_block() {
			return getRuleContexts(When_blockContext.class);
		}
		public When_blockContext when_block(int i) {
			return getRuleContext(When_blockContext.class,i);
		}
		public Evaluate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterEvaluate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitEvaluate_statement(this);
		}
	}

	public final Evaluate_statementContext evaluate_statement() throws RecognitionException {
		Evaluate_statementContext _localctx = new Evaluate_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_evaluate_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(EVALUATE);
			setState(139);
			var_or_lit();
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				when_block();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN || _la==WHEN_OTHER );
			setState(145);
			match(END_EVALUATE);
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

	public static class When_blockContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SqrParserGrammar.WHEN, 0); }
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public Var_or_litContext var_or_lit() {
			return getRuleContext(Var_or_litContext.class,0);
		}
		public List<SqrCommandContext> sqrCommand() {
			return getRuleContexts(SqrCommandContext.class);
		}
		public SqrCommandContext sqrCommand(int i) {
			return getRuleContext(SqrCommandContext.class,i);
		}
		public TerminalNode WHEN_OTHER() { return getToken(SqrParserGrammar.WHEN_OTHER, 0); }
		public When_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterWhen_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitWhen_block(this);
		}
	}

	public final When_blockContext when_block() throws RecognitionException {
		When_blockContext _localctx = new When_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_when_block);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(WHEN);
				setState(148);
				comparison_operator();
				setState(149);
				var_or_lit();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
					{
					{
					setState(150);
					sqrCommand();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WHEN_OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(WHEN_OTHER);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
					{
					{
					setState(157);
					sqrCommand();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SqrParserGrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(SqrParserGrammar.END_IF, 0); }
		public List<SqrCommandContext> sqrCommand() {
			return getRuleContexts(SqrCommandContext.class);
		}
		public SqrCommandContext sqrCommand(int i) {
			return getRuleContext(SqrCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqrParserGrammar.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(IF);
				setState(166);
				expression();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
					{
					{
					setState(167);
					sqrCommand();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(END_IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IF);
				setState(176);
				expression();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
					{
					{
					setState(177);
					sqrCommand();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(ELSE);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
					{
					{
					setState(184);
					sqrCommand();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(END_IF);
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
		enterRule(_localctx, 20, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LET);
			setState(195);
			variable();
			setState(196);
			match(EQ);
			setState(197);
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
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				operand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(NOT);
				setState(201);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				operand();
				setState(203);
				operator();
				setState(204);
				operand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				operand();
				setState(207);
				operator();
				setState(208);
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
		enterRule(_localctx, 24, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(SqrParserGrammar.GT, 0); }
		public TerminalNode LT() { return getToken(SqrParserGrammar.LT, 0); }
		public TerminalNode GTE() { return getToken(SqrParserGrammar.GTE, 0); }
		public TerminalNode LTE() { return getToken(SqrParserGrammar.LTE, 0); }
		public TerminalNode NEQ() { return getToken(SqrParserGrammar.NEQ, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitComparison_operator(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE) | (1L << NEQ) | (1L << EQ))) != 0)) ) {
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
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_VAR:
			case NUM_VAR:
			case COL_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				variable();
				}
				break;
			case PLUS:
			case MINUS:
			case INT:
			case DEC:
			case FLT:
			case STR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
				setState(218);
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

	public static class Var_or_litContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Var_or_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterVar_or_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitVar_or_lit(this);
		}
	}

	public final Var_or_litContext var_or_lit() throws RecognitionException {
		Var_or_litContext _localctx = new Var_or_litContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_or_lit);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_VAR:
			case NUM_VAR:
			case COL_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				variable();
				}
				break;
			case PLUS:
			case MINUS:
			case INT:
			case DEC:
			case FLT:
			case STR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				literal();
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
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (STR_VAR - 117)) | (1L << (NUM_VAR - 117)) | (1L << (COL_VAR - 117)))) != 0)) ) {
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
		public Num_litContext num_lit() {
			return getRuleContext(Num_litContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INT:
			case DEC:
			case FLT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				num_lit();
				}
				break;
			case STR_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(STR_LIT);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
		public TerminalNode FLT() { return getToken(SqrParserGrammar.FLT, 0); }
		public TerminalNode DEC() { return getToken(SqrParserGrammar.DEC, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & ((1L << (INT - 122)) | (1L << (DEC - 122)) | (1L << (FLT - 122)))) != 0)) ) {
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

	public static class Num_litContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqrParserGrammar.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqrParserGrammar.MINUS, 0); }
		public Num_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterNum_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitNum_lit(this);
		}
	}

	public final Num_litContext num_lit() throws RecognitionException {
		Num_litContext _localctx = new Num_litContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_num_lit);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DEC:
			case FLT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				number();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(PLUS);
				setState(235);
				number();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(MINUS);
				setState(237);
				number();
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

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode COL_VAR() { return getToken(SqrParserGrammar.COL_VAR, 0); }
		public Num_litContext num_lit() {
			return getRuleContext(Num_litContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_numeric);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(NUM_VAR);
				}
				break;
			case COL_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(COL_VAR);
				}
				break;
			case PLUS:
			case MINUS:
			case INT:
			case DEC:
			case FLT:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				num_lit();
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
		enterRule(_localctx, 42, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			func_keyword();
			setState(246);
			match(LPAREN);
			setState(247);
			func_arg();
			setState(248);
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
		enterRule(_localctx, 44, RULE_func_arg);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				expression();
				setState(252);
				match(COMMA);
				setState(253);
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
		enterRule(_localctx, 46, RULE_func_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 48, RULE_stop);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(STOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(STOP);
				setState(261);
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
		enterRule(_localctx, 50, RULE_subtract);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(SUBTRACT);
				setState(265);
				numeric();
				setState(266);
				match(FROM);
				setState(267);
				match(NUM_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(SUBTRACT);
				setState(270);
				numeric();
				setState(271);
				match(FROM);
				setState(272);
				match(NUM_VAR);
				setState(273);
				match(ROUND);
				setState(274);
				match(EQ);
				setState(275);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SqrParserGrammar.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_WHILE() { return getToken(SqrParserGrammar.END_WHILE, 0); }
		public List<SqrCommandContext> sqrCommand() {
			return getRuleContexts(SqrCommandContext.class);
		}
		public SqrCommandContext sqrCommand(int i) {
			return getRuleContext(SqrCommandContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(WHILE);
			setState(280);
			expression();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ADD - 94)) | (1L << (EVALUATE - 94)) | (1L << (IF - 94)) | (1L << (LET - 94)) | (1L << (STOP - 94)) | (1L << (SUBTRACT - 94)) | (1L << (WHILE - 94)) | (1L << (BREAK - 94)))) != 0)) {
				{
				{
				setState(281);
				sqrCommand();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(END_WHILE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0082\u0124\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3\4\7\4N\n\4\f\4\16\4"+
		"Q\13\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4"+
		"\3\4\7\4b\n\4\f\4\16\4e\13\4\3\4\3\4\3\4\5\4j\n\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6r\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\6\t\u0090"+
		"\n\t\r\t\16\t\u0091\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d"+
		"\13\n\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\5\n\u00a6\n\n\3\13\3\13"+
		"\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00b5\n\13\f\13\16\13\u00b8\13\13\3\13\3\13\7\13\u00bc\n\13\f\13"+
		"\16\13\u00bf\13\13\3\13\3\13\5\13\u00c3\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d5\n\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\5\21\u00e2\n\21\3\22\3\22"+
		"\3\23\3\23\5\23\u00e8\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00f1"+
		"\n\25\3\26\3\26\3\26\5\26\u00f6\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0102\n\30\3\31\3\31\3\32\3\32\3\32\5\32\u0109\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0118\n\33\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16\34\u0120\13\34\3"+
		"\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\b\3\2wx\3\2\3\23\3\2\n\17\3\2wy\3\2|~\4\2\33^bb\2\u0130\2"+
		";\3\2\2\2\4@\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\nq\3\2\2\2\f{\3\2\2\2\16\u008a"+
		"\3\2\2\2\20\u008c\3\2\2\2\22\u00a5\3\2\2\2\24\u00c2\3\2\2\2\26\u00c4\3"+
		"\2\2\2\30\u00d4\3\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36\u00dd\3\2"+
		"\2\2 \u00e1\3\2\2\2\"\u00e3\3\2\2\2$\u00e7\3\2\2\2&\u00e9\3\2\2\2(\u00f0"+
		"\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2.\u0101\3\2\2\2\60\u0103\3\2\2\2"+
		"\62\u0108\3\2\2\2\64\u0117\3\2\2\2\66\u0119\3\2\2\28:\5\4\3\298\3\2\2"+
		"\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\3\3\2"+
		"\2\2@A\7e\2\2AB\7\u0080\2\2BF\5\6\4\2CE\5\f\7\2DC\3\2\2\2EH\3\2\2\2FD"+
		"\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7f\2\2J\5\3\2\2\2KO\7\26\2\2"+
		"LN\5\b\5\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PV\3\2\2\2QO\3\2\2\2"+
		"RS\7\24\2\2SU\5\b\5\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2"+
		"\2XV\3\2\2\2Y[\5\n\6\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]c\3\2"+
		"\2\2^\\\3\2\2\2_`\7\24\2\2`b\5\n\6\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fj\7\27\2\2gj\7g\2\2hj\3\2\2\2iK\3\2\2\2ig\3"+
		"\2\2\2ih\3\2\2\2j\7\3\2\2\2kl\t\2\2\2l\t\3\2\2\2mr\7{\2\2no\7{\2\2op\7"+
		"\24\2\2pr\5\n\6\2qm\3\2\2\2qn\3\2\2\2r\13\3\2\2\2s|\5\16\b\2t|\7u\2\2"+
		"u|\5\20\t\2v|\5\24\13\2w|\5\26\f\2x|\5\62\32\2y|\5\64\33\2z|\5\66\34\2"+
		"{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|\r\3\2\2\2}~\7`\2\2~\177\5*\26\2\177\u0080\7a\2\2\u0080\u0081"+
		"\7x\2\2\u0081\u008b\3\2\2\2\u0082\u0083\7`\2\2\u0083\u0084\5*\26\2\u0084"+
		"\u0085\7a\2\2\u0085\u0086\7x\2\2\u0086\u0087\7b\2\2\u0087\u0088\7\17\2"+
		"\2\u0088\u0089\7|\2\2\u0089\u008b\3\2\2\2\u008a}\3\2\2\2\u008a\u0082\3"+
		"\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008f\5 \21\2\u008e\u0090"+
		"\5\22\n\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7k\2\2\u0094\21\3"+
		"\2\2\2\u0095\u0096\7i\2\2\u0096\u0097\5\34\17\2\u0097\u009b\5 \21\2\u0098"+
		"\u009a\5\f\7\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u00a6\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a2\7j\2\2\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\23\3\2\2"+
		"\2\u00a7\u00a8\7l\2\2\u00a8\u00ac\5\30\r\2\u00a9\u00ab\5\f\7\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00c3\3\2"+
		"\2\2\u00b1\u00b2\7l\2\2\u00b2\u00b6\5\30\r\2\u00b3\u00b5\5\f\7\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\7m\2\2\u00ba"+
		"\u00bc\5\f\7\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00a7\3\2\2\2\u00c2\u00b1\3\2"+
		"\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7"+
		"\7\17\2\2\u00c7\u00c8\5\30\r\2\u00c8\27\3\2\2\2\u00c9\u00d5\5\36\20\2"+
		"\u00ca\u00cb\7\20\2\2\u00cb\u00d5\5\30\r\2\u00cc\u00cd\5\36\20\2\u00cd"+
		"\u00ce\5\32\16\2\u00ce\u00cf\5\36\20\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1"+
		"\5\36\20\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\5\30\r\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\33\3\2\2\2\u00d8"+
		"\u00d9\t\4\2\2\u00d9\35\3\2\2\2\u00da\u00de\5\"\22\2\u00db\u00de\5$\23"+
		"\2\u00dc\u00de\5,\27\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e2\5\"\22\2\u00e0\u00e2\5$\23\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\t\5\2\2"+
		"\u00e4#\3\2\2\2\u00e5\u00e8\5(\25\2\u00e6\u00e8\7\177\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8%\3\2\2\2\u00e9\u00ea\t\6\2\2\u00ea"+
		"\'\3\2\2\2\u00eb\u00f1\5&\24\2\u00ec\u00ed\7\b\2\2\u00ed\u00f1\5&\24\2"+
		"\u00ee\u00ef\7\t\2\2\u00ef\u00f1\5&\24\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1)\3\2\2\2\u00f2\u00f6\7x\2\2\u00f3\u00f6"+
		"\7y\2\2\u00f4\u00f6\5(\25\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6+\3\2\2\2\u00f7\u00f8\5\60\31\2\u00f8\u00f9\7\26\2"+
		"\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\7\27\2\2\u00fb-\3\2\2\2\u00fc\u0102"+
		"\5\30\r\2\u00fd\u00fe\5\30\r\2\u00fe\u00ff\7\24\2\2\u00ff\u0100\5.\30"+
		"\2\u0100\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0102/"+
		"\3\2\2\2\u0103\u0104\t\7\2\2\u0104\61\3\2\2\2\u0105\u0109\7p\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0109\7q\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2"+
		"\2\u0109\63\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c\5*\26\2\u010c\u010d"+
		"\7s\2\2\u010d\u010e\7x\2\2\u010e\u0118\3\2\2\2\u010f\u0110\7r\2\2\u0110"+
		"\u0111\5*\26\2\u0111\u0112\7s\2\2\u0112\u0113\7x\2\2\u0113\u0114\7b\2"+
		"\2\u0114\u0115\7\17\2\2\u0115\u0116\7|\2\2\u0116\u0118\3\2\2\2\u0117\u010a"+
		"\3\2\2\2\u0117\u010f\3\2\2\2\u0118\65\3\2\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011e\5\30\r\2\u011b\u011d\5\f\7\2\u011c\u011b\3\2\2\2\u011d\u0120\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7v\2\2\u0122\67\3\2\2\2\36;FOV\\ciq{\u008a"+
		"\u0091\u009b\u00a2\u00a5\u00ac\u00b6\u00bd\u00c2\u00d4\u00dd\u00e1\u00e7"+
		"\u00f0\u00f5\u0101\u0108\u0117\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}