lexer grammar SqrLexerGrammar;

AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
EQ : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
COLON: ':' ;

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

fragment VAR: STR_VAR
| NUM_VAR
| COL_VAR
;

RETVAR: ':'VAR;

fragment BEGIN : B E G I N;
fragment END : E N D;
fragment PROCEDURE : P R O C E D U R E;
fragment PROGRAM : P R O G R A M | R E P O R T;



INT : [0-9]+ ;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9-]* ;
WS: [ \t\r\n\f]+ -> channel(HIDDEN) ;
LINE_COMMENT : '!'~[\r\n]* -> channel(HIDDEN);

STR_LIT : '\''.*?'\'';


fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];





