# Generated from C:/Users/KATCO/PycharmProjects/PBL\TUMCADgramm.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TUMCADgrammParser import TUMCADgrammParser
else:
    from TUMCADgrammParser import TUMCADgrammParser

# This class defines a complete generic visitor for a parse tree produced by TUMCADgrammParser.

class TUMCADgrammVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by TUMCADgrammParser#program.
    def visitProgram(self, ctx:TUMCADgrammParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#block.
    def visitBlock(self, ctx:TUMCADgrammParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#statement.
    def visitStatement(self, ctx:TUMCADgrammParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#method_call.
    def visitMethod_call(self, ctx:TUMCADgrammParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#name.
    def visitName(self, ctx:TUMCADgrammParser.NameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#alpha_string.
    def visitAlpha_string(self, ctx:TUMCADgrammParser.Alpha_stringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#field_declaration.
    def visitField_declaration(self, ctx:TUMCADgrammParser.Field_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#int_lit.
    def visitInt_lit(self, ctx:TUMCADgrammParser.Int_litContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#double_lit.
    def visitDouble_lit(self, ctx:TUMCADgrammParser.Double_litContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#char_lit.
    def visitChar_lit(self, ctx:TUMCADgrammParser.Char_litContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#string_lit.
    def visitString_lit(self, ctx:TUMCADgrammParser.String_litContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#method_declaration.
    def visitMethod_declaration(self, ctx:TUMCADgrammParser.Method_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#param_in.
    def visitParam_in(self, ctx:TUMCADgrammParser.Param_inContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#var_declaration.
    def visitVar_declaration(self, ctx:TUMCADgrammParser.Var_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#expr.
    def visitExpr(self, ctx:TUMCADgrammParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#bin_op.
    def visitBin_op(self, ctx:TUMCADgrammParser.Bin_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#literal.
    def visitLiteral(self, ctx:TUMCADgrammParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#callout_arg.
    def visitCallout_arg(self, ctx:TUMCADgrammParser.Callout_argContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TUMCADgrammParser#loc.
    def visitLoc(self, ctx:TUMCADgrammParser.LocContext):
        return self.visitChildren(ctx)



del TUMCADgrammParser