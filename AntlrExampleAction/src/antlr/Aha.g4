grammar Aha; 

/* file and this grammar name must be the same*/

@header {
	package antlr; 
}

/*this part is import antlr generae every java class place to antlr package */

prog: (decl | expr) + EOF;


decl: ID ':' INT_TYPE '=' NUM;


/* ANTLR resolves ambiguities in favor of the alternative given first. */
expr : expr '*' expr | expr '+' expr | ID | NUM ;

/*Tokens*/
ID : [a-z][a-zA-Z0-9_]*; //identifiers
NUM : '0'|'-'?[1-9][0-9]*;  // first cant present 0 its mean 0 can come alone but cant come like this(012)
INT_TYPE: 'INT';
COMMENT : '--'~[\r\n]* ->skip;
WS: [ \t\n\r]+ -> skip ;
