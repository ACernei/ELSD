from antlr4 import *
from antlr4.tree.Tree import TerminalNodeImpl

from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammParser import TUMCADgrammParser
from gen.TUMCADgrammVisitor import TUMCADgrammVisitor


class MyVisit(TUMCADgrammVisitor):

    def visitProgram(self, ctx: TUMCADgrammParser.ProgramContext):
        print('Start program')
        self.memory = {}
        return self.visitChildren(ctx)

    def visitStatement(self, ctx: TUMCADgrammParser.StatementContext):
        if ctx.loc() and ctx.Assign_op():
            loc_name = self.visit(ctx.loc())
            val = self.visit(ctx.expr()[0])
            self.memory[loc_name] = val
            return
        if type(ctx.children[0]) == TerminalNodeImpl \
                and ctx.children[0].symbol.text == 'Plot':
            values = self.visit(ctx.multiple_values_last())
            if self.plot_callback:
                self.plot_callback(values)
            return
        return self.visitChildren(ctx)

    def visitMultiple_values_last(self, ctx: TUMCADgrammParser.Multiple_values_lastContext):
        return [self.visit(child) for child in ctx.expr()]

    def visitAlpha_string(self, ctx: TUMCADgrammParser.Alpha_stringContext):
        str_val = ''.join([c.symbol.text for c in ctx.children])
        return str_val

    def visitExpr(self, ctx: TUMCADgrammParser.ExprContext):
        if ctx.loc():
            var_name = self.visit(ctx.loc())
            return self.memory.get(var_name)
        if len(ctx.children) == 1:
            return self.visitChildren(ctx)
        if len(ctx.children) == 3:
            l_val = self.visit(ctx.children[0])
            op = self.visit(ctx.children[1])
            r_val = self.visit(ctx.children[2])

        operation_dict = {
            '-': lambda: l_val - r_val,
            '+': lambda: l_val + r_val,
            '*': lambda: l_val * r_val,
            '/': lambda: l_val / r_val,
        }
        return operation_dict.get(op, lambda: None)()

    def visitBin_op(self, ctx: TUMCADgrammParser.Bin_opContext):
        return ctx.children[0].symbol.text

    def visitInt_lit(self, ctx: TUMCADgrammParser.Int_litContext):
        str_val = ''.join([c.symbol.text for c in ctx.children])
        return int(str_val)


def parseProgram(programText, onPlot = None):
    lexer = TUMCADgrammLexer(InputStream(programText))
    stream = CommonTokenStream(lexer)
    parser = TUMCADgrammParser(stream)
    tree = parser.program()
    visitor = MyVisit()
    visitor.plot_callback = onPlot
    visitor.visit(tree)
    return visitor


if __name__ == '__main__':
    testProgram = \
    '''{
    a = 1
    b = 4
    c = 2
    Plot(a, b ,c)
    }'''
    visitor = parseProgram(testProgram)
    print(visitor.memory)
