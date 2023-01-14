parser grammar SqrParserGrammar;

options { tokenVocab=SqrLexerGrammar; }

program
    : procedure EOF
    ;
    
procedure 
: NEWLINE BEGIN_PROCEDURE procedureName procedureArguments procedureBody NEWLINE END_PROCEDURE;

procedureName: IDENTIFIER;

procedureArguments
: '(' arguments ')'
| LOCAL
| 
;

arguments
: VAR
| VAR ',' arguments
| returnArg
| VAR ',' returnArg
;

returnArg
: RETVAR
| RETVAR',' returnArg
;

procedureBody
: NEWLINE sqrCommand
| NEWLINE sqrCommand procedureBody
;

sqrCommand
: add
| let
;

add : ADD INT TO NUM_VAR;

let : LET VAR '=' INT ;