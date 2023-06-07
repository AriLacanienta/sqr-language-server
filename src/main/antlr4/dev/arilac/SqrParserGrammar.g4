parser grammar SqrParserGrammar;

@header {
package dev.arilac.sqrparsing;
}

options { tokenVocab=SqrLexerGrammar; }

numeric
: NUM_VAR
| COL_VAR
| INT
;

variable
: STR_VAR
| NUM_VAR
| COL_VAR
;

expression
: operand OPERATOR operand;

operator
: CONCAT
| EXPONENT
;

operand
:
;

program
    : program procedure
    | procedure EOF
    ;
    
procedure 
: BEGIN_PROCEDURE procedureName procedureArguments procedureBody END_PROCEDURE;

procedureName: IDENTIFIER;

procedureArguments
: '(' arguments ')'
| LOCAL
| 
;

arguments
: arg
| arg ',' arguments
| arguments ',' returnArg
| returnArg
;

arg
: STR_VAR
| NUM_VAR
;

returnArg
: RETVAR
| RETVAR',' returnArg
;

procedureBody
: sqrCommand procedureBody
| sqrCommand
;

sqrCommand
: add
| let
| stop
| subtract
;

add 
: ADD numeric TO NUM_VAR
| ADD numeric TO NUM_VAR ROUND '=' INT;

stop
: STOP
| STOP QUIET
;

subtract 
: SUBTRACT numeric FROM NUM_VAR
| SUBTRACT numeric FROM NUM_VAR ROUND '=' INT;


let 
: LET NUM_VAR '=' numeric
;

