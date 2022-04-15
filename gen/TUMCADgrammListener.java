// Generated from C:/Users/KATCO/PycharmProjects/PBL\TUMCADgramm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TUMCADgrammParser}.
 */
public interface TUMCADgrammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TUMCADgrammParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TUMCADgrammParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TUMCADgrammParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TUMCADgrammParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TUMCADgrammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TUMCADgrammParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(TUMCADgrammParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(TUMCADgrammParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TUMCADgrammParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TUMCADgrammParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#alpha_string}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_string(TUMCADgrammParser.Alpha_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#alpha_string}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_string(TUMCADgrammParser.Alpha_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(TUMCADgrammParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(TUMCADgrammParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit(TUMCADgrammParser.Int_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit(TUMCADgrammParser.Int_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void enterDouble_lit(TUMCADgrammParser.Double_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void exitDouble_lit(TUMCADgrammParser.Double_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void enterChar_lit(TUMCADgrammParser.Char_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#char_lit}.
	 * @param ctx the parse tree
	 */
	void exitChar_lit(TUMCADgrammParser.Char_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void enterString_lit(TUMCADgrammParser.String_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void exitString_lit(TUMCADgrammParser.String_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(TUMCADgrammParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(TUMCADgrammParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#param_in}.
	 * @param ctx the parse tree
	 */
	void enterParam_in(TUMCADgrammParser.Param_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#param_in}.
	 * @param ctx the parse tree
	 */
	void exitParam_in(TUMCADgrammParser.Param_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(TUMCADgrammParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(TUMCADgrammParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TUMCADgrammParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TUMCADgrammParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(TUMCADgrammParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(TUMCADgrammParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TUMCADgrammParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TUMCADgrammParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(TUMCADgrammParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(TUMCADgrammParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TUMCADgrammParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(TUMCADgrammParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TUMCADgrammParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(TUMCADgrammParser.LocContext ctx);
}