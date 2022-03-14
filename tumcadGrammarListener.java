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
	 * Enter a parse tree produced by {@link tumcadGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(tumcadGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(tumcadGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tumcadGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tumcadGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(tumcadGrammarParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(tumcadGrammarParser.Method_callContext ctx);
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
	 * Enter a parse tree produced by {@link tumcadGrammarParser#alpha_string}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_string(tumcadGrammarParser.Alpha_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#alpha_string}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_string(tumcadGrammarParser.Alpha_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(tumcadGrammarParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(tumcadGrammarParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit(tumcadGrammarParser.Int_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit(tumcadGrammarParser.Int_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void enterDouble_lit(tumcadGrammarParser.Double_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void exitDouble_lit(tumcadGrammarParser.Double_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void enterChar_lit(tumcadGrammarParser.Char_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void exitChar_lit(tumcadGrammarParser.Char_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void enterString_lit(tumcadGrammarParser.String_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void exitString_lit(tumcadGrammarParser.String_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(tumcadGrammarParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(tumcadGrammarParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#param_in}.
	 * @param ctx the parse tree
	 */
	void enterParam_in(tumcadGrammarParser.Param_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#param_in}.
	 * @param ctx the parse tree
	 */
	void exitParam_in(tumcadGrammarParser.Param_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(tumcadGrammarParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(tumcadGrammarParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tumcadGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tumcadGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(tumcadGrammarParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(tumcadGrammarParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(tumcadGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(tumcadGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(tumcadGrammarParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(tumcadGrammarParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link tumcadGrammarParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(tumcadGrammarParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link tumcadGrammarParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(tumcadGrammarParser.LocContext ctx);
}