grammar tumcadGrammar;
program: block;

block:  '{'  statement*  ('Return' expr  )?  '}';

statement:
loc  Assign_op  expr
| var_declaration
| var_declaration  Assign_op  expr
| method_declaration
| field_declaration
| method_call
| 'If'  '('  expr  ')'  '{'  statement+  '}'  ( 'else'  '{'  statement+  '}')?
| 'Foreach'  expr  'in'  expr  '{'  statement+|'End'|'Continue'  '}'
| 'While'  '('  expr  ')'  '{'  statement+ |'End'  '}'
| 'Coord'  '('  expr+  ')'  '{'  statement  '}'
| 'Plot'  '('  expr+  ')'
| 'Area'   '('  expr+  ')'
| 'CreateBasement'  '('  expr+  ')'
;

method_call:  name  '('  expr*  ')' ;

name: alpha_string+;

alpha_string: Alpha+ Digit*;

Digit: ('0'..'9') ;

Alpha: ('a'..'z');

field_declaration:  Type  name
|Type name '[' int_lit ']' ('[' int_lit ']')? ;

int_lit: Digit+;

double_lit: int_lit* '.' int_lit*;

Bool_lit: 'True' | 'False' ;

char_lit : '\'' Char | WS'\'';

Char: ('a'..'z'|'A'..'Z');

string_lit : '\'' Char* WS? | WS?'\'';

Type: 'Int' | 'Double' | 'Bool' | 'Char' | 'String' | 'Void' | 'Map';

method_declaration: 'Func'  ( Type | 'void' )  name  '(' (param_in )* ')' block ;

param_in: var_declaration ( ',' name)*  ';'+ WS+
| field_declaration ( ',' name)*  ';'+ WS+ ;

var_declaration:  Type  name ;

expr: loc
|method_call
|literal
|expr bin_op expr
|'-' expr
|'!' expr
|'(' expr ')';

bin_op: Arith_op | Comp_op | Cond_op ;

Arith_op: '+' | '-' | '*' | '/' | '%';

Comp_op: '<' | '>' | '<=' | '>=' | '==' | '!=';

Cond_op: '&&' | '||' | 'And' | 'Or';

literal: int_lit | char_lit | double_lit | Bool_lit | string_lit;

callout_arg:expr | string_lit;


Assign_op: '=' | '+=' | '-=';

loc: name | name '[' expr ']' | name '[' expr ']' '[' expr ']';

WS: (' '| '\t' | '\n' | '\r') -> channel(HIDDEN);
