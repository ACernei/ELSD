# Generated from C:/Users/KATCO/PycharmProjects/PBL\TUMCADgramm.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TUMCADgrammParser import TUMCADgrammParser
else:
    from TUMCADgrammParser import TUMCADgrammParser

# This class defines a complete listener for a parse tree produced by TUMCADgrammParser.
class TUMCADgrammListener(ParseTreeListener):

    # Enter a parse tree produced by TUMCADgrammParser#program.
    def enterProgram(self, ctx:TUMCADgrammParser.ProgramContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#program.
    def exitProgram(self, ctx:TUMCADgrammParser.ProgramContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#block.
    def enterBlock(self, ctx:TUMCADgrammParser.BlockContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#block.
    def exitBlock(self, ctx:TUMCADgrammParser.BlockContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#statement.
    def enterStatement(self, ctx:TUMCADgrammParser.StatementContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#statement.
    def exitStatement(self, ctx:TUMCADgrammParser.StatementContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#method_call.
    def enterMethod_call(self, ctx:TUMCADgrammParser.Method_callContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#method_call.
    def exitMethod_call(self, ctx:TUMCADgrammParser.Method_callContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#name.
    def enterName(self, ctx:TUMCADgrammParser.NameContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#name.
    def exitName(self, ctx:TUMCADgrammParser.NameContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#alpha_string.
    def enterAlpha_string(self, ctx:TUMCADgrammParser.Alpha_stringContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#alpha_string.
    def exitAlpha_string(self, ctx:TUMCADgrammParser.Alpha_stringContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#field_declaration.
    def enterField_declaration(self, ctx:TUMCADgrammParser.Field_declarationContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#field_declaration.
    def exitField_declaration(self, ctx:TUMCADgrammParser.Field_declarationContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#int_lit.
    def enterInt_lit(self, ctx:TUMCADgrammParser.Int_litContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#int_lit.
    def exitInt_lit(self, ctx:TUMCADgrammParser.Int_litContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#double_lit.
    def enterDouble_lit(self, ctx:TUMCADgrammParser.Double_litContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#double_lit.
    def exitDouble_lit(self, ctx:TUMCADgrammParser.Double_litContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#char_lit.
    def enterChar_lit(self, ctx:TUMCADgrammParser.Char_litContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#char_lit.
    def exitChar_lit(self, ctx:TUMCADgrammParser.Char_litContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#string_lit.
    def enterString_lit(self, ctx:TUMCADgrammParser.String_litContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#string_lit.
    def exitString_lit(self, ctx:TUMCADgrammParser.String_litContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#method_declaration.
    def enterMethod_declaration(self, ctx:TUMCADgrammParser.Method_declarationContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#method_declaration.
    def exitMethod_declaration(self, ctx:TUMCADgrammParser.Method_declarationContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#param_in.
    def enterParam_in(self, ctx:TUMCADgrammParser.Param_inContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#param_in.
    def exitParam_in(self, ctx:TUMCADgrammParser.Param_inContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#var_declaration.
    def enterVar_declaration(self, ctx:TUMCADgrammParser.Var_declarationContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#var_declaration.
    def exitVar_declaration(self, ctx:TUMCADgrammParser.Var_declarationContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#expr.
    def enterExpr(self, ctx:TUMCADgrammParser.ExprContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#expr.
    def exitExpr(self, ctx:TUMCADgrammParser.ExprContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#bin_op.
    def enterBin_op(self, ctx:TUMCADgrammParser.Bin_opContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#bin_op.
    def exitBin_op(self, ctx:TUMCADgrammParser.Bin_opContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#literal.
    def enterLiteral(self, ctx:TUMCADgrammParser.LiteralContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#literal.
    def exitLiteral(self, ctx:TUMCADgrammParser.LiteralContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#callout_arg.
    def enterCallout_arg(self, ctx:TUMCADgrammParser.Callout_argContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#callout_arg.
    def exitCallout_arg(self, ctx:TUMCADgrammParser.Callout_argContext):
        pass


    # Enter a parse tree produced by TUMCADgrammParser#loc.
    def enterLoc(self, ctx:TUMCADgrammParser.LocContext):
        pass

    # Exit a parse tree produced by TUMCADgrammParser#loc.
    def exitLoc(self, ctx:TUMCADgrammParser.LocContext):
        pass



del TUMCADgrammParser