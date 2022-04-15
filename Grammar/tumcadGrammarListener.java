// Generated from tumcadGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tumcadGrammarParser}.
 */
public interface tumcadGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tumcadGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tumcadGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#program_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_body(tumcadGrammarParser.Program_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#program_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_body(tumcadGrammarParser.Program_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#set_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSet_of_statements(tumcadGrammarParser.Set_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#set_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSet_of_statements(tumcadGrammarParser.Set_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#basic_statements}.
	 * @param ctx the parse tree
	 */
	void enterBasic_statements(tumcadGrammarParser.Basic_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#basic_statements}.
	 * @param ctx the parse tree
	 */
	void exitBasic_statements(tumcadGrammarParser.Basic_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(tumcadGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(tumcadGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(tumcadGrammarParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(tumcadGrammarParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#read_excelfile}.
	 * @param ctx the parse tree
	 */
	void enterRead_excelfile(tumcadGrammarParser.Read_excelfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#read_excelfile}.
	 * @param ctx the parse tree
	 */
	void exitRead_excelfile(tumcadGrammarParser.Read_excelfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#read_textfile}.
	 * @param ctx the parse tree
	 */
	void enterRead_textfile(tumcadGrammarParser.Read_textfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#read_textfile}.
	 * @param ctx the parse tree
	 */
	void exitRead_textfile(tumcadGrammarParser.Read_textfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#calculate_area}.
	 * @param ctx the parse tree
	 */
	void enterCalculate_area(tumcadGrammarParser.Calculate_areaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#calculate_area}.
	 * @param ctx the parse tree
	 */
	void exitCalculate_area(tumcadGrammarParser.Calculate_areaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#sketch}.
	 * @param ctx the parse tree
	 */
	void enterSketch(tumcadGrammarParser.SketchContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#sketch}.
	 * @param ctx the parse tree
	 */
	void exitSketch(tumcadGrammarParser.SketchContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(tumcadGrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(tumcadGrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#variable_initialization}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initialization(tumcadGrammarParser.Variable_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#variable_initialization}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initialization(tumcadGrammarParser.Variable_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(tumcadGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(tumcadGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(tumcadGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(tumcadGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#list_name}.
	 * @param ctx the parse tree
	 */
	void enterList_name(tumcadGrammarParser.List_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#list_name}.
	 * @param ctx the parse tree
	 */
	void exitList_name(tumcadGrammarParser.List_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(tumcadGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(tumcadGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void enterInteger_value(tumcadGrammarParser.Integer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#integer_value}.
	 * @param ctx the parse tree
	 */
	void exitInteger_value(tumcadGrammarParser.Integer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#double_value}.
	 * @param ctx the parse tree
	 */
	void enterDouble_value(tumcadGrammarParser.Double_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#double_value}.
	 * @param ctx the parse tree
	 */
	void exitDouble_value(tumcadGrammarParser.Double_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(tumcadGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(tumcadGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(tumcadGrammarParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(tumcadGrammarParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(tumcadGrammarParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(tumcadGrammarParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(tumcadGrammarParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(tumcadGrammarParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void enterList_declaration(tumcadGrammarParser.List_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#list_declaration}.
	 * @param ctx the parse tree
	 */
	void exitList_declaration(tumcadGrammarParser.List_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tumcadGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tumcadGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expression(tumcadGrammarParser.Number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expression(tumcadGrammarParser.Number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(tumcadGrammarParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(tumcadGrammarParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(tumcadGrammarParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(tumcadGrammarParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(tumcadGrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(tumcadGrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#string_value}.
	 * @param ctx the parse tree
	 */
	void enterString_value(tumcadGrammarParser.String_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#string_value}.
	 * @param ctx the parse tree
	 */
	void exitString_value(tumcadGrammarParser.String_valueContext ctx);
}