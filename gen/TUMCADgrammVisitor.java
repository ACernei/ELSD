// Generated from C:/Users/KATCO/PycharmProjects/PBL\TUMCADgramm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TUMCADgrammParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TUMCADgrammVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TUMCADgrammParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TUMCADgrammParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TUMCADgrammParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(TUMCADgrammParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(TUMCADgrammParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#alpha_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_string(TUMCADgrammParser.Alpha_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(TUMCADgrammParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#int_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_lit(TUMCADgrammParser.Int_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#double_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_lit(TUMCADgrammParser.Double_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#char_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_lit(TUMCADgrammParser.Char_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#string_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lit(TUMCADgrammParser.String_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(TUMCADgrammParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#param_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_in(TUMCADgrammParser.Param_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(TUMCADgrammParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TUMCADgrammParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(TUMCADgrammParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TUMCADgrammParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(TUMCADgrammParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TUMCADgrammParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(TUMCADgrammParser.LocContext ctx);
}