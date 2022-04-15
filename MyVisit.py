from antlr4 import *
from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammParser import TUMCADgrammParser
from gen.TUMCADgrammVisitor import TUMCADgrammVisitor


class MyVisit(TUMCADgrammVisitor):
    def visitInfixExpr(self, ctx):
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)

        op = ctx.op.text
        operation =  {
        '+': lambda: l + r,
        '-': lambda: l - r,
        '*': lambda: l * r,
        '/': lambda: l / r,
        }
        return operation.get(op, lambda: None)()

    def assignStatement(self, ctx):
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)
        return (l+" assigned to "+r)