grammar Fn;
/*
 * Parser Rules
 */
start: expression;

expression: (operation | parentheses | if_statement);

operation: (mult | add | power | nestpower);
operant: (fraction | integer | parentheses);
parentheses: '(' expression ')';

mult:  operant '*' operant;
add: operant '+' operant;
power: operant '^' integer;
nestpower: integer '^@';
fraction: '[' operant '|' operant ']';
integer: ( NUMBER | '0');

comparation: (operant_comp | boolean_comp);

operant_comp: operant ('<' | '>' | '==') operant;
boolean_comp: BOOLEAN '==' BOOLEAN;

if_statement: 'if' '(' (comparation|BOOLEAN) ')' '{' expression '}' 'else' '{' expression '}';

/*
 * Lexer Rules
 */
fragment DIGIT: ([0-9] | '?');
fragment NONZERODIGIT: ([1-9] | '?');
fragment TRUE: ('True' | 'true');
fragment FALSE: ('False' | 'false');
fragment MAYBE: ('Maybe' | 'maybe');
BOOLEAN: (TRUE | FALSE | MAYBE);
NUMBER: NONZERODIGIT (DIGIT+)?;

WHITESPACE          : (' ' | '\t') -> skip;
NEWLINE             : ('\r'? '\n' | '\r')+ -> skip;
