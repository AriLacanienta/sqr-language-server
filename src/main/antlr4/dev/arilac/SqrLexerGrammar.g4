lexer grammar SqrLexerGrammar;

@header {
package dev.arilac.sqrparsing;
}

CONCAT : '||' ;
EXPONENT : '^' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%';
PLUS : '+' ;
MINUS : '-' ;

GT : '>' ;
LT : '<' ;
GTE : '>=' ;
LTE : '<=' ;
NEQ : '!=' | '<>' ;
EQ : '=' ;

NOT : 'not' ;
AND : 'and' ;
OR : 'or' ;
XOR: 'xor';

COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
COLON: ':' ;

ABS : A B S;
ACOS : A C O S;
ASIN : A S I N;
ATAN : A T A N;
CEIL : C E I L;
COS : C O S;
COSH : C O S H;
DEG : D E G;
E10 : E'10';
SIN : S I N;
TAN : T A N;


INCLUDE: '#' I N C L U D E;
ADD : A D D;
TO : T O;
ROUND : R O U N D;
BEGIN_PROG : BEGIN '-' PROGRAM;
END_PROG : END '-' PROGRAM;
BEGIN_PROCEDURE : BEGIN '-' P R O C E D U R E;
END_PROCEDURE : END '-' P R O C E D U R E;
LOCAL : L O C A L;
LET : L E T;
STOP : S T O P;
QUIET : Q U I E T;
SUBTRACT : S U B T R A C T;
FROM : F R O M;

LOCAL_LOCAL : L O C A L '-' L O C A L;

STR_VAR : '$'IDENTIFIER;
NUM_VAR : '#'IDENTIFIER;
COL_VAR : '&'IDENTIFIER;
LST_VAR : '%'IDENTIFIER;


RETVAR
: ':'STR_VAR
| ':'NUM_VAR;

fragment BEGIN : B E G I N;
fragment END : E N D;
fragment PROCEDURE : P R O C E D U R E;
fragment PROGRAM : P R O G R A M | R E P O R T;


INT : [-+]?[0-9]+ ;
// TODO: Can you have multiple digits before the '.' ?
DEC : [-+]?[0-9] '.' [0-9]+ E [0-9]+;
FLT : [-+]?[0-9]* '.' [0-9]+;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9-]* ;
WS: [ \t\r\n\f-]+ -> channel(HIDDEN) ;
LINE_COMMENT : '!'~[\r\n]* -> channel(HIDDEN);

STR_LIT : '\''.*?'\'';


fragment A : [Aa];
fragment B : [Bb];
fragment C : [Cc];
fragment D : [Dd];
fragment E : [Ee];
fragment F : [Ff];
fragment G : [Gg];
fragment H : [Hh];
fragment I : [Ii];
fragment J : [Jj];
fragment K : [Kk];
fragment L : [Ll];
fragment M : [Mm];
fragment N : [Nn];
fragment O : [Oo];
fragment P : [Pp];
fragment Q : [Qq];
fragment R : [Rr];
fragment S : [Ss];
fragment T : [Tt];
fragment U : [Uu];
fragment V : [Vv];
fragment W : [Ww];
fragment X : [Xx];
fragment Y : [Yy];
fragment Z : [Zz];





