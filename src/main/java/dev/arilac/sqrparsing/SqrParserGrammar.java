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
		CONCAT=1, EXPONENT=2, MULT=3, DIV=4, PLUS=5, MINUS=6, GT=7, LT=8, GTE=9, 
		LTE=10, NEQ=11, EQ=12, NOT=13, AND=14, OR=15, XOR=16, OPERATOR=17, COMMA=18, 
		SEMI=19, LPAREN=20, RPAREN=21, LCURLY=22, RCURLY=23, COLON=24, INCLUDE=25, 
		ADD=26, TO=27, ROUND=28, BEGIN_PROG=29, END_PROG=30, BEGIN_PROCEDURE=31, 
		END_PROCEDURE=32, LOCAL=33, LET=34, STOP=35, QUIET=36, SUBTRACT=37, FROM=38, 
		LOCAL_LOCAL=39, STR_VAR=40, NUM_VAR=41, COL_VAR=42, LST_VAR=43, RETVAR=44, 
		INT=45, IDENTIFIER=46, WS=47, LINE_COMMENT=48, STR_LIT=49;
	public static final int
		RULE_numeric = 0, RULE_variable = 1, RULE_expression = 2, RULE_operator = 3, 
		RULE_operand = 4, RULE_program = 5, RULE_procedure = 6, RULE_procedureName = 7, 
		RULE_procedureArguments = 8, RULE_arguments = 9, RULE_arg = 10, RULE_returnArg = 11, 
		RULE_procedureBody = 12, RULE_sqrCommand = 13, RULE_add = 14, RULE_stop = 15, 
		RULE_subtract = 16, RULE_let = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"numeric", "variable", "expression", "operator", "operand", "program", 
			"procedure", "procedureName", "procedureArguments", "arguments", "arg", 
			"returnArg", "procedureBody", "sqrCommand", "add", "stop", "subtract", 
			"let"
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

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode COL_VAR() { return getToken(SqrParserGrammar.COL_VAR, 0); }
		public TerminalNode INT() { return getToken(SqrParserGrammar.INT, 0); }
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
		enterRule(_localctx, 0, RULE_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_VAR) | (1L << COL_VAR) | (1L << INT))) != 0)) ) {
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
		enterRule(_localctx, 2, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR_VAR) | (1L << NUM_VAR) | (1L << COL_VAR))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(SqrParserGrammar.OPERATOR, 0); }
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			operand();
			setState(41);
			match(OPERATOR);
			setState(42);
			operand();
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
		enterRule(_localctx, 6, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==CONCAT || _la==EXPONENT) ) {
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
		enterRule(_localctx, 8, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_program, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			procedure();
			setState(50);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
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
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53);
					procedure();
					}
					} 
				}
				setState(58);
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
		enterRule(_localctx, 12, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(BEGIN_PROCEDURE);
			setState(60);
			procedureName();
			setState(61);
			procedureArguments();
			setState(62);
			procedureBody();
			setState(63);
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
		enterRule(_localctx, 14, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		enterRule(_localctx, 16, RULE_procedureArguments);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(LPAREN);
				setState(68);
				arguments(0);
				setState(69);
				match(RPAREN);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(LOCAL);
				}
				break;
			case ADD:
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
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
		return arguments(0);
	}

	private ArgumentsContext arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, _parentState);
		ArgumentsContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76);
				arg();
				}
				break;
			case 2:
				{
				setState(77);
				arg();
				setState(78);
				match(COMMA);
				setState(79);
				arguments(3);
				}
				break;
			case 3:
				{
				setState(81);
				returnArg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arguments);
					setState(84);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(85);
					match(COMMA);
					setState(86);
					returnArg();
					}
					} 
				}
				setState(91);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode STR_VAR() { return getToken(SqrParserGrammar.STR_VAR, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqrParserGrammarListener ) ((SqrParserGrammarListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 22, RULE_returnArg);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(RETVAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(RETVAR);
				setState(96);
				match(COMMA);
				setState(97);
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
		enterRule(_localctx, 24, RULE_procedureBody);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				sqrCommand();
				setState(101);
				procedureBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				sqrCommand();
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
		enterRule(_localctx, 26, RULE_sqrCommand);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				add();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				let();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				stop();
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 4);
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
		enterRule(_localctx, 28, RULE_add);
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
		enterRule(_localctx, 30, RULE_stop);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(STOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(STOP);
				setState(129);
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
		enterRule(_localctx, 32, RULE_subtract);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(SUBTRACT);
				setState(133);
				numeric();
				setState(134);
				match(FROM);
				setState(135);
				match(NUM_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(SUBTRACT);
				setState(138);
				numeric();
				setState(139);
				match(FROM);
				setState(140);
				match(NUM_VAR);
				setState(141);
				match(ROUND);
				setState(142);
				match(EQ);
				setState(143);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(SqrParserGrammar.LET, 0); }
		public TerminalNode NUM_VAR() { return getToken(SqrParserGrammar.NUM_VAR, 0); }
		public TerminalNode EQ() { return getToken(SqrParserGrammar.EQ, 0); }
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
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
		enterRule(_localctx, 34, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LET);
			setState(148);
			match(NUM_VAR);
			setState(149);
			match(EQ);
			setState(150);
			numeric();
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
		case 5:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 9:
			return arguments_sempred((ArgumentsContext)_localctx, predIndex);
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
	private boolean arguments_sempred(ArgumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nL\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"U\n\13\3\13\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\re\n\r\3\16\3\16\3\16\3\16\5\16k\n\16\3\17\3\17\3\17\3\17\5\17"+
		"q\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0080\n\20\3\21\3\21\3\21\5\21\u0085\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0094\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\2\4\f\24\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\6\4\2+,//\3\2*,\3\2\3\4\3\2*+\2\u0096\2&\3\2\2\2\4(\3\2\2\2\6*"+
		"\3\2\2\2\b.\3\2\2\2\n\60\3\2\2\2\f\62\3\2\2\2\16=\3\2\2\2\20C\3\2\2\2"+
		"\22K\3\2\2\2\24T\3\2\2\2\26^\3\2\2\2\30d\3\2\2\2\32j\3\2\2\2\34p\3\2\2"+
		"\2\36\177\3\2\2\2 \u0084\3\2\2\2\"\u0093\3\2\2\2$\u0095\3\2\2\2&\'\t\2"+
		"\2\2\'\3\3\2\2\2()\t\3\2\2)\5\3\2\2\2*+\5\n\6\2+,\7\23\2\2,-\5\n\6\2-"+
		"\7\3\2\2\2./\t\4\2\2/\t\3\2\2\2\60\61\3\2\2\2\61\13\3\2\2\2\62\63\b\7"+
		"\1\2\63\64\5\16\b\2\64\65\7\2\2\3\65:\3\2\2\2\66\67\f\4\2\2\679\5\16\b"+
		"\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2=>\7"+
		"!\2\2>?\5\20\t\2?@\5\22\n\2@A\5\32\16\2AB\7\"\2\2B\17\3\2\2\2CD\7\60\2"+
		"\2D\21\3\2\2\2EF\7\26\2\2FG\5\24\13\2GH\7\27\2\2HL\3\2\2\2IL\7#\2\2JL"+
		"\3\2\2\2KE\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\23\3\2\2\2MN\b\13\1\2NU\5\26\f"+
		"\2OP\5\26\f\2PQ\7\24\2\2QR\5\24\13\5RU\3\2\2\2SU\5\30\r\2TM\3\2\2\2TO"+
		"\3\2\2\2TS\3\2\2\2U[\3\2\2\2VW\f\4\2\2WX\7\24\2\2XZ\5\30\r\2YV\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\25\3\2\2\2][\3\2\2\2^_\t\5\2\2_\27\3"+
		"\2\2\2`e\7.\2\2ab\7.\2\2bc\7\24\2\2ce\5\30\r\2d`\3\2\2\2da\3\2\2\2e\31"+
		"\3\2\2\2fg\5\34\17\2gh\5\32\16\2hk\3\2\2\2ik\5\34\17\2jf\3\2\2\2ji\3\2"+
		"\2\2k\33\3\2\2\2lq\5\36\20\2mq\5$\23\2nq\5 \21\2oq\5\"\22\2pl\3\2\2\2"+
		"pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\35\3\2\2\2rs\7\34\2\2st\5\2\2\2tu\7\35"+
		"\2\2uv\7+\2\2v\u0080\3\2\2\2wx\7\34\2\2xy\5\2\2\2yz\7\35\2\2z{\7+\2\2"+
		"{|\7\36\2\2|}\7\16\2\2}~\7/\2\2~\u0080\3\2\2\2\177r\3\2\2\2\177w\3\2\2"+
		"\2\u0080\37\3\2\2\2\u0081\u0085\7%\2\2\u0082\u0083\7%\2\2\u0083\u0085"+
		"\7&\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0085!\3\2\2\2\u0086\u0087"+
		"\7\'\2\2\u0087\u0088\5\2\2\2\u0088\u0089\7(\2\2\u0089\u008a\7+\2\2\u008a"+
		"\u0094\3\2\2\2\u008b\u008c\7\'\2\2\u008c\u008d\5\2\2\2\u008d\u008e\7("+
		"\2\2\u008e\u008f\7+\2\2\u008f\u0090\7\36\2\2\u0090\u0091\7\16\2\2\u0091"+
		"\u0092\7/\2\2\u0092\u0094\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u008b\3\2"+
		"\2\2\u0094#\3\2\2\2\u0095\u0096\7$\2\2\u0096\u0097\7+\2\2\u0097\u0098"+
		"\7\16\2\2\u0098\u0099\5\2\2\2\u0099%\3\2\2\2\f:KT[djp\177\u0084\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}