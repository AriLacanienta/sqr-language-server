parser grammar SqrParserGrammar;

options { tokenVocab=SqrLexerGrammar; }

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

variable
: STR_VAR
| NUM_VAR
| COL_VAR
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
: sqrCommand
| sqrCommand procedureBody
;

sqrCommand
: add
| let
;

add : ADD INT TO NUM_VAR;

let : LET VAR '=' INT ;

