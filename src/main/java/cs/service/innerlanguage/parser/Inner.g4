grammar Inner;

// Fragements
fragment DIGIT          : '0' .. '9';  
fragment UPPER          : 'A' .. 'Z';
fragment LOWER          : 'a' .. 'z';
fragment LETTER         : LOWER | UPPER;
fragment WORD           : LETTER | '_' | '$' | '#' | '.';
fragment ALPHANUM       : WORD | DIGIT;  
fragment DATAFR         : 'DATA'        | 'data';
fragment CONSTANTFR     : 'CONSTANT'    | 'constant';
fragment SYSTEMFR       : 'SYSTEM'      | 'system';
fragment COLON          :  ':';
fragment PLUS           : '+';
fragment MINUS          : '-';
fragment INC            : '++';
fragment DEC            : '--';
fragment MULTIPLICATION : '*';
fragment DIVISION       : '/';
fragment POWER          : '^';
fragment MOD            : '%';
fragment NOTEQ          : '<>';
fragment MOREOP         : '>';
fragment MOREOREQ       : '>=';
fragment LESSOP         : '<';
fragment LESSOREQ       : '<=';
fragment DEQ            : '==';
fragment AND            : 'AND'     | 'and';
fragment OR             : 'OR'      | 'or';
fragment NOT            : 'NOT'     | 'not';
fragment TRUE           : 'TRUE'    | 'true';
fragment FALSE          : 'FALSE'   | 'false';

// Tokens
BOOLEAN         : (TRUE | FALSE);
NUMBER          : DIGIT+ ('.' DIGIT+)? (('e'|'E')('+'|'-')? DIGIT+)?;
DQ_STRING       : '"' ('\\"')* '"';
DATE            : '\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT (' ' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT ('.' DIGIT+)?)? '\'';
WS              : [ \t\n\r]+ -> skip ;
COMMENTS        : ('/*' .*? '*/' | '//' ~'\n'* '\n' ) -> skip;

OPENBRACKET         : '(';
CLOSEBRACKET        : ')';
COMMA               : ',';
ENDCOMMAND          : '.' ;
EQ                  : '=';
MINUSEQ             : '-=';
PLUSEQ              : '+=';
TYPE                : 'TYPE'        | 'type';
STARTSTATEMENT      : 'START'       | 'start';
ENDSTATEMENT        : 'END'         | 'end';
FUNCTION            : 'FUNCTION'    | 'function';
VALUES              : 'VALUES'      | 'values';
IF                  : 'IF'          | 'if';
ELSE                : 'ELSE'        | 'else';
WHILE               : 'WHILE'       | 'while' ;
RETURN              : 'RETURN'      | 'return';
CONTINUE            : 'CONTINUE'    | 'continue';
BREAK               : 'BREAK'       | 'break';
STATIC              : 'STATIC'      | 'static' ; 
CALL                : 'CALL'        | 'call' ;
WRITE               : 'WRITE'       | 'write' ;


OPERATOR                :    (PLUS | MINUS | MULTIPLICATION | DIVISION | MOD | POWER);

UNARYOPERATOR           : (PLUS | MINUS | INC | DEC);

CONDITIONBOOLOPERATOR   : (AND | OR | DEQ);

CONDITIONOPERATOR       : (DEQ | NOTEQ | MOREOP | MOREOREQ | LESSOP | LESSOREQ | AND | OR);

CONDITIONUNARYPERATOR   : (NOT) ;

TYPENAME                : UPPER (LOWER | UPPER | DIGIT)* ;

DATANAME                : LOWER (LOWER | UPPER | DIGIT)* ;



DATADEF     : DATAFR COLON;
CONSTANTDEF : CONSTANTFR COLON;
SYSTEMDEF   : SYSTEMFR COLON;

// Parser
varValue            : (DATANAME | BOOLEAN | NUMBER | DQ_STRING | DATE | callStatement | expression | condition);

condition           : condition CONDITIONBOOLOPERATOR condition
                        | boolExpression 
                        | OPENBRACKET (condition | boolExpression) CLOSEBRACKET
                        | CONDITIONUNARYPERATOR condition
                        | boolExpression CONDITIONBOOLOPERATOR condition
                        | condition CONDITIONBOOLOPERATOR boolExpression
                        | (BOOLEAN | DATANAME | callStatement);
                        

boolExpression      :   OPENBRACKET boolExpression CLOSEBRACKET
                        | expression CONDITIONOPERATOR expression
                        | (DQ_STRING | NUMBER | DATE | DATANAME | callStatement);

expression          : OPENBRACKET expression CLOSEBRACKET
                        | expression OPERATOR expression
                        | UNARYOPERATOR expression
                        | (DQ_STRING | NUMBER | DATE | DATANAME | callStatement);

ifStatement         : IF OPENBRACKET condition CLOSEBRACKET
                        (
                          STARTSTATEMENT ENDCOMMAND
                            (statement)*
                          ENDSTATEMENT ENDCOMMAND
                        )
                        ( ELSE
                          STARTSTATEMENT ENDCOMMAND
                            (statement)*
                          ENDSTATEMENT ENDCOMMAND
                        )?;

whileStatement      : WHILE OPENBRACKET condition CLOSEBRACKET
                        (
                          STARTSTATEMENT ENDCOMMAND
                            (statement)*
                          ENDSTATEMENT ENDCOMMAND
                        );

eqStatement         : DATANAME EQ varValue ENDCOMMAND;

plusEqStatemet      : DATANAME PLUSEQ  varValue ENDCOMMAND;

minusEqStatemet     : DATANAME MINUSEQ varValue ENDCOMMAND;

returnStatement     : RETURN varValue ENDCOMMAND;

continueStatement   : CONTINUE ENDCOMMAND;

breakStatement      : BREAK ENDCOMMAND;

callStatement       : CALL TYPENAME ENDCOMMAND DATANAME 
                      OPENBRACKET
                      (varValue (COMMA varValue)*)? 
                      CLOSEBRACKET;

writeStatement      : WRITE OPENBRACKET (varValue (COMMA varValue)*)? CLOSEBRACKET ENDCOMMAND;

statement   :   (ifStatement
                | returnStatement
                | continueStatement
                | breakStatement
                | whileStatement
                | dataDef
                | constantDef
                | systemDef
                | eqStatement
                | plusEqStatemet
                | minusEqStatemet
                | callStatement ENDCOMMAND
                | writeStatement);

function    : 
                FUNCTION TYPENAME DATANAME 
                        OPENBRACKET 
                        ((TYPENAME DATANAME COMMA)* TYPENAME DATANAME)?
                        CLOSEBRACKET
                STARTSTATEMENT ENDCOMMAND
                    (statement)+ 
                ENDSTATEMENT ENDCOMMAND;

staticBlock : STATIC OPENBRACKET (varDefinition)+ CLOSEBRACKET;

type        :   
            TYPE TYPENAME ENDCOMMAND 
                staticBlock?
                (function)+ 
                ENDSTATEMENT ENDCOMMAND;

varDefinition   : dataDef | constantDef | systemDef;

dataDef         : DATADEF TYPENAME DATANAME (VALUES OPENBRACKET varValue (COMMA varValue)* CLOSEBRACKET)? ENDCOMMAND ;

constantDef     : CONSTANTDEF TYPENAME DATANAME VALUES OPENBRACKET varValue (COMMA varValue)* CLOSEBRACKET ENDCOMMAND;

systemDef       : SYSTEMDEF TYPENAME DATANAME ENDCOMMAND;

inner           : type EOF ;