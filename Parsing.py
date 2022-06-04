from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg

INTEGER, PLUS, MINUS, MUL, DIV, LPAREN, RPAREN, EOF, FUNC, LBPAREN, RBPAREN, CHAR, BOOLEAN, STRING, BOOL, VAR, OPERATORS, TYPE= (
    'INTEGER', 'PLUS', 'MINUS', 'MUL', 'DIV', '(', ')', 'EOF', 'FUNC', '{', '}', 'CHAR', 'BOOLEAN', 'STRING', 'BOOL', 'VAR', 'OPERATORS', 'TYPE'
)


class Token(object):
    def __init__(self, type, value):
        self.type = type
        self.value = value

    def __str__(self):
        return 'Token({type}, {value})'.format(
            type=self.type,
            value=repr(self.value)
        )

    def __repr__(self):
        return self.__str__()


class Lexer(object):
    def __init__(self, text):
        self.text = text
        self.pos = 0
        self.current_char = self.text[self.pos]

    def error(self):
        raise Exception('Invalid character')

    def advance(self):
        self.pos += 1
        if self.pos > len(self.text) - 1:
            self.current_char = None  # Indicates end of input
        else:
            self.current_char = self.text[self.pos]

    def skip_whitespace(self):
        while self.current_char is not None and self.current_char.isspace():
            self.advance()

    def integer(self):
        result = ''
        while self.current_char is not None and self.current_char.isdigit():
            result += self.current_char
            self.advance()
        return int(result)

    def char(self):
        result = ''
        while self.current_char is not None and self.current_char.ischar():
            result += self.current_char
            self.advance()
        if result[0].isupper():
            if result == "Func":
                return "MethodCall"
            else:
                if result == "Int":
                    return "INTEGER"
                if result == "Bool":
                    return "BOOLEAN"
                if result == "Double":
                    return "DOUBLE"
                if result == "False":
                    return "BOOL False"
                if result == "True":
                    return "BOOL True"
        return result

    def get_next_token(self):
        while self.current_char is not None:

            if self.current_char.isspace():
                self.skip_whitespace()
                continue

            if self.current_char.isdigit():
                return Token(INTEGER, self.integer())

            if self.current_char.isalpha():
                if self.char() == "MethodCall":
                    return Token(FUNC, "METHODCALL")
                elif self.char() == "BOOL False":
                    return Token(BOOL, "BOOL False")
                elif self.char() == "BOOL True":
                    return Token(BOOL, "BOOL True")
                elif self.char()[0].isupper():
                    return Token(TYPE,self.char())
                return Token(CHAR, self.char())



            if self.current_char == '+':
                self.advance()
                return Token(PLUS, '+')

            if self.current_char == '-':
                self.advance()
                return Token(MINUS, '-')

            if self.current_char == '*':
                self.advance()
                return Token(MUL, '*')

            if self.current_char == '/':
                self.advance()
                return Token(DIV, '/')

            if self.current_char == '(':
                self.advance()
                return Token(LPAREN, '(')

            if self.current_char == ')':
                self.advance()
                return Token(RPAREN, ')')

            if self.current_char == '{':
                self.advance()
                return Token(LBPAREN, '{')

            if self.current_char == '}':
                self.advance()
                return Token(RBPAREN, '}')



            self.error()

        return Token(EOF, None)


class AST(object):
    pass


class BinOp(AST):
    def __init__(self, left, op, right):
        self.left = left
        self.token = self.op = op
        self.right = right


class Num(AST):
    def __init__(self, token):
        self.token = token
        self.value = token.value


class Parser(object):
    def __init__(self, lexer):
        self.lexer = lexer
        self.current_token = self.lexer.get_next_token()

    def error(self):
        raise Exception('Invalid syntax')

    def eat(self, token_type):
        if self.current_token.type == token_type:
            self.current_token = self.lexer.get_next_token()
        else:
            self.error()

    def factor(self):
        token = self.current_token
        if token.type == INTEGER:
            self.eat(INTEGER)
            return Num(token)
        elif token.type == LPAREN:
            self.eat(LPAREN)
            node = self.expr()
            self.eat(RPAREN)
            return node

    def term(self):
        node = self.factor()

        while self.current_token.type in (MUL, DIV):
            token = self.current_token
            if token.type == MUL:
                self.eat(MUL)
            elif token.type == DIV:
                self.eat(DIV)

            node = BinOp(left=node, op=token, right=self.factor())

        return node

    def expr(self):
        node = self.term()

        while self.current_token.type in (PLUS, MINUS):
            token = self.current_token
            if token.type == PLUS:
                self.eat(PLUS)
            elif token.type == MINUS:
                self.eat(MINUS)

            node = BinOp(left=node, op=token, right=self.term())

        return node

    def parse(self):
        return self.expr()

class NodeVisitor(object):
    def visit(self, node):
        method_name = 'visit_' + type(node).__name__
        visitor = getattr(self, method_name, self.generic_visit)
        return visitor(node)

    def generic_visit(self, node):
        raise Exception('No visit_{} method'.format(type(node).__name__))


class Interpreter(NodeVisitor):
    def __init__(self, parser):
        self.parser = parser

    def visit_BinOp(self, node):
        if node.op.type == PLUS:
            return self.visit(node.left) + self.visit(node.right)
        elif node.op.type == MINUS:
            return self.visit(node.left) - self.visit(node.right)
        elif node.op.type == MUL:
            return self.visit(node.left) * self.visit(node.right)
        elif node.op.type == DIV:
            return self.visit(node.left) / self.visit(node.right)

    def visit_Num(self, node):
        return node.value

    def interpret(self):
        tree = self.parser.parse()
        return self.visit(tree)

import functions as funcs
import tkinter as tk
import main as gl

def parse(text):
    words = text.split('(')
    letters = list(words[0])
    if (letters[0].isupper()):
        try:
            # LLA TO ECEF
            # ex : LLA_ECEF(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_ECEF"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.lla_to_ecef_2(numbers[0], numbers[1], numbers[2]))

                # ECEF TO LLA
                # ex : ECEF_LLA(652954.1006, 4774619.7919, -2217647.7937)
            if (words[0] == "ECEF_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.ecef_to_lla(numbers[0], numbers[1], numbers[2]))

                # LLA TO ENU
                # ex : LLA_ENU(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_ENU"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.lla_to_enu(numbers[0], numbers[1], numbers[2]))

                # ENU TO LLA
                # ex : ENU_LLA(-7134.75719598, -4556.32151385,  2852.39042395)
            if (words[0] == "ENU_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.enu_to_lla(numbers[0], numbers[1], numbers[2]))

                # LLA TO AER
                # ex : LLA_AER(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_AER"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.lla_to_aer(numbers[0], numbers[1], numbers[2]))

                # AER TO LLA
                # ex : AER_LLA(12,22,424)
            if (words[0] == "AER_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.aer_to_lla(numbers[0], numbers[1], numbers[2]))

                # Ploting
                # ex : Plot(1,1,1)
            if (words[0] == "Plot"):
                for widget in gl.ToolBox.winfo_children():
                    widget.destroy()
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(';')
                gl.UserInput.insert(tk.INSERT, '\n Was Done \n')
                Plot = FigureCanvasTkAgg(funcs.plot(numbers), gl.ToolBox)
                Plot.draw()
                Plot.get_tk_widget().pack(expand=True, fill=BOTH, side=BOTTOM)

                # Area of  any polygon
                # ex : Area()
            if (words[0] == "Area"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(';')
                gl.UserInput.insert(tk.INSERT, '\n')
                gl.UserInput.insert(tk.INSERT, funcs.compute_3D_polygon_area(numbers))

        except Exception as error:
            gl.UserInput.insert(tk.INSERT, " \n The error is " + repr(error) + "\n")
        except:
            gl.UserInput.insert(tk.INSERT, '\n Eroare la indicarea coordonatelor incercati repetat \n')
    else:
        text = str(text)
        lexer = Lexer(text)
        parser = Parser(lexer)
        interpreter = Interpreter(parser)
        result = interpreter.interpret()
        print(result)
        return result


if __name__ == '__main__':
    parse()