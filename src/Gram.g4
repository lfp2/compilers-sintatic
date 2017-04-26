grammar Gram;

/* This will be the entry point of our parser. */
eval:    Goal;
Number: [0-9]+ ('.' [0-9]+)?;

WS : [ \t\r\n\f]+ -> skip ;

Goal
	:	MainClass '(' ClassDeclaration ')'* '$'
	;
MainClass
	:	'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' 
		'[' ']' Identifier ')' '{' Statement '}' '}'
	;
ClassDeclaration
	:	'class' Identifier ( 'extends' Identifier )? '{' ( VarDeclaration )* 
		( MethodDeclaration )* '}' 	
	;
VarDeclaration 
	: 
		Type Identifier ';'
	;
MethodDeclaration
	: 'public' Type Identifier '(' ( Type Identifier (',' Type Identifier)*)? ')' '{'
		( VarDeclaration )* (Statement)* 'return' Expression ';''}'
	;
Type
	:	'int' '[' ']'  
	|	'boolean'
	|	'int'
	|	Identifier
	;
Statement
	:	'{'(Statement)* '}'
	|	'if' '(' Expression ')' Statement 'else' Statement
	|	'while' '(' Expression ')' Statement
	|	'System.out.println' '(' Expression ')'';'
	|	Identifier '=' Expression ';'
	|	Identifier '[' Expression ']' '=' Expression ';'
	;
Expression
	:/* 
		Expression ( '&&' | '<' | '+' | '-' | '*' ) Expression
	|
		Expression '[' Expression ']'
	|
		Expression '.' 'length'
	|
		Expression '.' Identifier '(' ( Expression ( ',' Expression )* )? ')'
	|*/
		[1-9][0-9]*|[0] //INTEGER_LITERAL
	|
		'true' Expr
	|
		'false' Expr
	|
		Identifier
	|
		'this' Expr
	|
		'new' 'int' '[' Expression ']'
	|
		'new' Identifier '(' ')'
	|
		'!' Expression
	|
		'(' Expression ')'
	;
Expr
	:
		( '&&' | '<' | '+' | '-' | '*' ) Expression Expr
	|	
		'[' Expression ']' Expr
	|
		'.' 'length' Expr
	|
		'.' Identifier '(' ( Expression ( ',' Expression )* )? ')' Expr
	;
Alphanumeric
	:	[a-zA-Z]|[0-9];
Identifier
	:
		[a-zA-Z]({Alphanumeric})*
	;
Comment_line
	:
		'//'.* -> skip
	;
Comment_ext
	:
		[/][*][^*]*[*]+([^*/][^*]*[*]+)*[/] -> skip
	;
