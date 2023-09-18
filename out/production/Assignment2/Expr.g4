grammar Expr;

prog:	stat+ EOF;  //EOF ensures the whole input file is parsed till the end
stat:   IF LPAREN condition=boolExpr RPAREN thenBlock=block ELSE elseBlock=block NEWLINE+   #ifElseStat
    |   IF LPAREN condition=boolExpr RPAREN thenBlock=block NEWLINE+                        #ifThenStat
    |   WHILE LPAREN condition=boolExpr RPAREN block NEWLINE+                               #whileStat
    |   expr NEWLINE+                   #printStat
    |   type? ID ASSIGN expr NEWLINE+   #assignStat
    |   type ID NEWLINE+                #declareStat
    |   arithAssign NEWLINE+            #arithAssignStat
    |   DEF ID LPAREN (arg (COMMA arg)*)? RPAREN block NEWLINE+ #defineFunction
    |   ID LPAREN (atom (COMMA atom)*)? RPAREN NEWLINE+           #callFunction
    ;
type:   INT_DT
    |   FLOAT_DT
    ;
arg :   type ID
    ;
block:  LBRAC NEWLINE stat+ RBRAC
     ;
arithAssign: left=ID op=(ADD_EQ|SUB_EQ|MUL_EQ|DIV_EQ|MOD_EQ) right=expr
           ;
boolExpr: left=expr op=EQUALS right=expr        #equals
        | left=expr op=NOT_EQ right=expr        #notEquals
        | left=expr op=GREATER right=expr       #greater
        | left=expr op=LESS right=expr          #less
        | left=expr op=GREAT_EQ right=expr      #greaterEquals
        | left=expr op=LESS_EQ right=expr       #lessEquals
        | left=boolExpr op=AND right=boolExpr   #and
        | left=boolExpr op=OR right=boolExpr    #or
        | LPAREN boolExpr RPAREN                #boolParen
        ;
expr:	left=expr op=(MUL|DIV|MOD) right=expr   #MulDivMod
    |	left=expr op=(ADD|SUB) right=expr       #AddSub
    |   atom                                    #atomExpr
    |	LPAREN expr RPAREN                      #paren
    ;
atom:   SUB (FLOAT|INT)                         #negativeNum
	|   INT                                     #int
    |   FLOAT                                   #float
    |   ID                                      #id
    ;
NEWLINE : [\r\n]+ ;
INT     : DIGIT+ ;
FLOAT  : DIGIT+ '.' DIGIT*
        |        '.' DIGIT+
        ;
IF      : 'if' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
INT_DT  : 'int' ;
FLOAT_DT: 'float' ;
DEF     : 'def' ;
ID      : [a-zA-Z]+ ;
ADD     : '+' ;
SUB     : '-' ;
MUL     : '*' ;
DIV     : '/' ;
MOD     : '%' ;
ASSIGN  : '=' ;
ADD_EQ  : '+=' ;
SUB_EQ  : '-=' ;
MUL_EQ  : '*=' ;
DIV_EQ  : '/=' ;
MOD_EQ  : '%=' ;
LPAREN  : '(' ;
RPAREN  : ')' ;
LBRAC   : '{' ;
RBRAC   : '}' ;
EQUALS  : '==' ;
NOT_EQ  : '!=' ;
GREATER : '>' ;
LESS    : '<' ;
AND     : '&&' ;
OR      : '||' ;
GREAT_EQ: '>=' ;
LESS_EQ : '<=' ;
COMMA   : ',' ;

WS      : [ \t]+ -> skip ; // Ignore tabs and spaces
COMMENT : '//' ~[\r\n]* -> skip ;

fragment
DIGIT   : [0-9] ;
