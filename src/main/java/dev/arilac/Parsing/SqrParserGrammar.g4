parser grammar SqrParserGrammar;

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

program
    : procedure EOF
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
: variable
| variable ',' arguments
| returnArg
| variable ',' returnArg
;

returnArg
: RETVAR
| RETVAR',' returnArg
;

procedureBody
: procedureBody sqrCommand
| sqrCommand
|
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


let : LET variable '=' INT ;

