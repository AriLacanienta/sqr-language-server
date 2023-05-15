// Generated from ./src/main/java/dev/arilac/Parsing/SqrParserGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqrParserGrammar}.
 */
public interface SqrParserGrammarListener extends ParseTreeListener {
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