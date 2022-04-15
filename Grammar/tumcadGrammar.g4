grammar tumcadGrammar ;

program : 'START TUMCAD' program_body 'FINISH' ;

program_body : set_of_statements* ;

set_of_statements : basic_statements
        | variable_initialization 
        | variable_declaration 
        | function_declaration 
        | function_call
        | expression
        | operator
        | 'Return' expression ;

basic_statements : if_statement
        | for_each
        | read_excelfile
        | read_textfile
        | calculate_area
        | sketch ;

if_statement : 'if' '(' boolean_expression ')' '{' set_of_statements+ '}' ( 'else' '{' set_of_statements+ '}')* ;
for_each : 'foreach' variable_declaration 'in' list_name '{' set_of_statements '}' ;

read_excelfile : 'readXLS' '(' string_value ')' ;
read_textfile : 'readTXT' '(' string_value ')' ;

calculate_area : 'area' '(' (read_excelfile | read_textfile | list_name) ')' ;

sketch : 'sketch' '(' (read_excelfile | read_textfile | list_name) ')' ;


variable_declaration : type name ;

variable_initialization : name '=' expression ;

function_call : name '(' function_parameters ')' ;

name : ( Letter | '_')+ (Letter | Digit | '_')* ;
list_name : ( Letter | '_' )+ (Letter | Digit | '_')* '[]' ;

Letter : [a-z] | [A-Z] ;
Digit : [0-9] ;

value : integer_value | double_value | string_value | Boolean_value ;

integer_value : Digit+ ;

double_value : integer_value '.' integer_value ;

Boolean_value : 'True' | 'False' ;

type : 'Int' | 'Double' | 'String' | 'Bool'  | 'Void' ;

function_declaration : 'Func' ( type | 'void' ) name '(' function_parameters* ')' '{'function_body'}' ;

function_body : set_of_statements* 'Return' expression ;

function_parameters : (variable_declaration | list_declaration) (',' variable_declaration | ',' list_declaration)* ;

list_declaration : variable_declaration ('[' number_expression? ']' | '[' number_expression? ']' '[' number_expression? ']') ;

expression : number_expression
        | string_expression
        | boolean_expression ;

number_expression : (name | integer_value | double_value) (Arithmetic_operator number_expression)* ;

string_expression : (name | string_value) (Arithmetic_operator string_expression)* ;

boolean_expression : (number_expression | string_expression) (Comparison_operator | Logical_operator) (number_expression | string_expression) ;

operator : Arithmetic_operator 
        | Comparison_operator 
        | Logical_operator 
        | Assignment_operator ;

Arithmetic_operator : '+' | '-' | '*' | '/' | '%' ;

Comparison_operator : '<' | '>' | '<=' | '>=' | '==' | '!=' ;

Logical_operator : '&&' | '||' | 'And' | 'Or' ;

Assignment_operator : '=' | '+=' | '-=' ;


WS : (' '| '\t' | '\n' | '\r') -> channel(HIDDEN) ;

string_value : (TEXT | WS)+ ;

TEXT : ('"') ~["]+ ('"') ;
