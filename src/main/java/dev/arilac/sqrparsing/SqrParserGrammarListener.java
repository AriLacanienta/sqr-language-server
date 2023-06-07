// Generated from c:\Users\arire\Repos\sqrls\sqr-language-server\src\main\antlr4\dev\arilac\SqrParserGrammar.g4 by ANTLR 4.9.2

package dev.arilac.sqrparsing;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqrParserGrammar}.
 */
public interface SqrParserGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(SqrParserGrammar.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(SqrParserGrammar.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqrParserGrammar.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqrParserGrammar.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SqrParserGrammar.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SqrParserGrammar.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#func_keyword}.
	 * @param ctx the parse tree
	 */
	void enterFunc_keyword(SqrParserGrammar.Func_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#func_keyword}.
	 * @param ctx the parse tree
	 */
	void exitFunc_keyword(SqrParserGrammar.Func_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SqrParserGrammar.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SqrParserGrammar.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SqrParserGrammar.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SqrParserGrammar.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(SqrParserGrammar.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(SqrParserGrammar.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqrParserGrammar.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqrParserGrammar.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SqrParserGrammar.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SqrParserGrammar.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(SqrParserGrammar.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(SqrParserGrammar.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(SqrParserGrammar.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(SqrParserGrammar.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#procedureArguments}.
	 * @param ctx the parse tree
	 */
	void enterProcedureArguments(SqrParserGrammar.ProcedureArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#procedureArguments}.
	 * @param ctx the parse tree
	 */
	void exitProcedureArguments(SqrParserGrammar.ProcedureArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SqrParserGrammar.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SqrParserGrammar.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SqrParserGrammar.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SqrParserGrammar.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#returnArg}.
	 * @param ctx the parse tree
	 */
	void enterReturnArg(SqrParserGrammar.ReturnArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#returnArg}.
	 * @param ctx the parse tree
	 */
	void exitReturnArg(SqrParserGrammar.ReturnArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(SqrParserGrammar.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(SqrParserGrammar.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#sqrCommand}.
	 * @param ctx the parse tree
	 */
	void enterSqrCommand(SqrParserGrammar.SqrCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#sqrCommand}.
	 * @param ctx the parse tree
	 */
	void exitSqrCommand(SqrParserGrammar.SqrCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SqrParserGrammar.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SqrParserGrammar.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#stop}.
	 * @param ctx the parse tree
	 */
	void enterStop(SqrParserGrammar.StopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#stop}.
	 * @param ctx the parse tree
	 */
	void exitStop(SqrParserGrammar.StopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#subtract}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(SqrParserGrammar.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#subtract}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(SqrParserGrammar.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqrParserGrammar#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(SqrParserGrammar.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqrParserGrammar#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(SqrParserGrammar.LetContext ctx);
}