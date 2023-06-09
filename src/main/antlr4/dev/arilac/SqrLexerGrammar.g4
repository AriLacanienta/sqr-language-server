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

// Numeric functions
FNC_ABS : A B S;
FNC_ACOS : A C O S;
FNC_ASIN : A S I N;
FNC_ATAN : A T A N;
FNC_CEIL : C E I L;
FNC_COS : C O S;
FNC_COSH : C O S H;
FNC_DEG : D E G;
FNC_E10 : E'10';
FNC_EXP : E X P;
FNC_FLOOR : F L O O R;
FNC_LOG : L O G;
FNC_LOG10 : L O G'10';
FNC_MOD : M O D;
FNC_POWER : P O W E R;
FNC_RAD : R A D;
// Note: ROUND is not always used as a function keyword (see: ADD)
FNC_SIGN : S I G N;
FNC_SIN : S I N;
FNC_SINH : S I N H;
FNC_SQRT : S Q R T;
FNC_TAN : T A N;
FNC_TANH : T A N H;
FNC_TRUNC: T R U N C;

// File functions
FNC_DELETE : D E L E T E;
FNC_EXISTS : E X I S T S;
FNC_RENAME : R E N A M E;

// Misc functions
FNC_ARRAY : A R R A Y;
FNC_ASCII : A S C I I;
FNC_ASCIIC : A S C I I C;
FNC_CHR : C H R;
FNC_COND : C O N D;
FNC_DATEADD : D A T E A D D;
FNC_DATEDIFF : D A T E D I F F;
FNC_DATENOW : D A T E N O W;
FNC_DATETOSTR : D A T E T O S T R;
FNC_EDIT : E D I T;
FNC_GETENV : G E T E N V;
FNC_INSTR : I N S T R;
FNC_INSTRB : I N S T R B;
FNC_ISBLANK : I S B L A N K;
FNC_ISNULL : I S N U L L;
FNC_LENGTH : L E N G T H;
FNC_LENGTHB : L E N G T H B;
FNC_LENGTHP : L E N G T H P;
FNC_LENGTHT : L E N G T H T;
FNC_LOWER : L O W E R;
FNC_LPAD : L P A D;
FNC_LTRIM : L T R I M;
FNC_NVL : N V L; 
FNC_RANGE : R A N G E;
FNC_REPLACE : R E P L A C E;
FNC_ROMAN : R O M A N;
FNC_RPAD : R P A D;
FNC_RTRIM : R T R I M;
FNC_STRTODATE : S T R T O D A T E;
FNC_SUBSTR : S U B S T R;
FNC_SUBSTRB : S U B S T R B;
FNC_SUBSTRP : S U B S T R P;
FNC_SUBSTRT : S U B S T R T;
FNC_TO_CHAR : T O U_S C H A R;
FNC_TO_MULTI_BYTE : T O U_S M U L T I U_S B Y T E;
FNC_TO_NUMBER : T O U_S N U M B E R;
FNC_TO_SINGLE_BYTE : T O U_S S I N G L E U_S B Y T E;
FNC_TRANSLATE : T R A N S L A T E;
FNC_TRANSFORM : T R A N S F O R M;
FNC_UNICODE : U N I C O D E;
FNC_UPPER : U P P E R;
FNC_WRAPDEPTH : W R A P D E P T H;


INCLUDE: '#' I N C L U D E;
ADD : A D D;
TO : T O;
ROUND : R O U N D;
BEGIN_PROG : BEGIN '-' PROGRAM;
END_PROG : END '-' PROGRAM;
BEGIN_PROCEDURE : BEGIN '-' P R O C E D U R E;
END_PROCEDURE : END '-' P R O C E D U R E;
LOCAL : L O C A L;
IF : I F;
END_IF : E N D '-' I F;
LET : L E T;
STOP : S T O P;
QUIET : Q U I E T;
SUBTRACT : S U B T R A C T;
FROM : F R O M;

LOCAL_LOCAL : L O C A L '-' L O C A L;

STR_VAR : '$'IDENTIFIER;
NUM_VAR : '#'IDENTIFIER;
COL_VAR : '&'IDENTIFIER('.'IDENTIFIER)?;
LST_VAR : '%'IDENTIFIER;


RETVAR
: ':'STR_VAR
| ':'NUM_VAR;

fragment BEGIN : B E G I N;
fragment END : E N D;
fragment PROCEDURE : P R O C E D U R E;
fragment PROGRAM : P R O G R A M | R E P O R T;

INT : [0-9]+ ;
// TODO: Can you have multiple digits before the '.' ?
DEC : [0-9] '.' [0-9]+ E [0-9]+;
FLT : [0-9]* '.' [0-9]+;
STR_LIT : '\''.*?'\'';
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9-]* ;
WS: [ \t\r\n\f-]+ -> channel(HIDDEN) ;
LINE_COMMENT : '!'~[\r\n]* -> channel(HIDDEN);


fragment U_S : '_';
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





