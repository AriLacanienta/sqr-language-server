parser grammar SqrParserGrammar;

@header {
package dev.arilac.sqrparsing;
}

options { tokenVocab=SqrLexerGrammar; }

program
: program procedure
| procedure EOF
;
    
procedure 
: BEGIN_PROCEDURE procedureName procedureArguments procedureBody END_PROCEDURE
;

procedureName
: IDENTIFIER
;

procedureArguments
: '(' proc_arguments ')'
| LOCAL
| 
;

proc_arguments
: proc_arg
| proc_arg ',' proc_arguments
| proc_arguments ',' returnArg
| returnArg
;

proc_arg
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
|
;

sqrCommand
: add
| if_statement
| let
| stop
| subtract
;

add 
: ADD numeric TO NUM_VAR
| ADD numeric TO NUM_VAR ROUND '=' INT
;

if_statement
: IF expression procedureBody END_IF
;

let 
: LET variable EQ expression
;

expression
: operand
| NOT expression
| operand operator operand
| operand operator expression
;

operator
: CONCAT
| EXPONENT
| MULT
| DIV
| MOD
| PLUS
| MINUS
| GT
| LT
| GTE
| LTE
| NEQ
| EQ
| NOT
| AND
| OR
| XOR
;

operand
: variable
| literal
| function
;

variable
: STR_VAR
| NUM_VAR
| COL_VAR
;

literal
: num_lit
| STR_LIT
;

number
: INT
| FLT
| DEC
;

num_lit
: number
| PLUS number
| MINUS number
;

numeric
: NUM_VAR
| COL_VAR
| num_lit
;

function 
: func_keyword '(' func_arg ')'
;

func_arg
: expression
| expression COMMA func_arg
;

func_keyword
: FNC_ABS
| FNC_ACOS
| FNC_ASIN
| FNC_ATAN
| FNC_CEIL
| FNC_COS
| FNC_COSH
| FNC_DEG
| FNC_E10
| FNC_EXP
| FNC_FLOOR
| FNC_LOG
| FNC_LOG10
| FNC_MOD
| FNC_POWER
| FNC_RAD
| ROUND // Note: ROUND is not always used as a function keyword (see: ADD)
| FNC_SIGN
| FNC_SIN
| FNC_SINH
| FNC_SQRT
| FNC_TAN
| FNC_TANH
| FNC_TRUNC
| FNC_DELETE
| FNC_EXISTS
| FNC_RENAME
| FNC_ARRAY
| FNC_ASCII
| FNC_ASCIIC
| FNC_CHR
| FNC_COND
| FNC_DATEADD
| FNC_DATEDIFF
| FNC_DATENOW
| FNC_DATETOSTR
| FNC_EDIT
| FNC_GETENV
| FNC_INSTR
| FNC_INSTRB
| FNC_ISBLANK
| FNC_ISNULL
| FNC_LENGTH
| FNC_LENGTHB
| FNC_LENGTHP
| FNC_LENGTHT
| FNC_LOWER
| FNC_LPAD
| FNC_LTRIM
| FNC_NVL
| FNC_RANGE
| FNC_REPLACE
| FNC_ROMAN
| FNC_RPAD
| FNC_RTRIM
| FNC_STRTODATE
| FNC_SUBSTR
| FNC_SUBSTRB
| FNC_SUBSTRP
| FNC_SUBSTRT
| FNC_TO_CHAR
| FNC_TO_MULTI_BYTE
| FNC_TO_NUMBER
| FNC_TO_SINGLE_BYTE
| FNC_TRANSLATE
| FNC_TRANSFORM
| FNC_UNICODE
| FNC_UPPER
| FNC_WRAPDEPTH
;

stop
: STOP
| STOP QUIET
;

subtract 
: SUBTRACT numeric FROM NUM_VAR
| SUBTRACT numeric FROM NUM_VAR ROUND '=' INT
;
