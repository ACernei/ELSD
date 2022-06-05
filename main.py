import tkinter
import tkinter as tk
import tkinter.scrolledtext as scrolledtext
import Parsing as Pars
from tkinter import ttk
from tkinter import *
import sys
from tkinter.filedialog import asksaveasfile
from antlr4 import *
from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammParser import TUMCADgrammParser
from gen.TUMCADgrammVisitor import TUMCADgrammVisitor
from ttkthemes import *
import MyVisit as Visiter
import functions as funcs
from tkinter import filedialog as fd
from tkinter.messagebox import showinfo
import matplotlib.pyplot as plt
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg

window = Tk()
window.minsize(width=600, height=500)
widthsc = 32

#Grid.rowconfigure(window, 0,weight=1)
#Grid.columnconfigure(window,0,weight=1)
#Grid.rowconfigure(window, 1,weight=1)
#Grid.columnconfigure(window,1,weight=1)
#Grid.rowconfigure(window, 2,weight=1)
#Grid.columnconfigure(window,2,weight=1)
#Grid.rowconfigure(window, 3,weight=1)
#Grid.columnconfigure(window,3,weight=1)
#Grid.rowconfigure(window, 4,weight=1)
#Grid.columnconfigure(window,4,weight=1)
global filewrited
filewrited = None

def select_file():
    DSLExplorer.delete("3.0","end")
    FileInput.delete("1.0","end")
    filetypes = (
        ('text files', '*.txt'),
        ('All files', '*.*')
    )

    filename = fd.askopenfilename(
        title='Open a file',
        initialdir='/',
        filetypes=filetypes)

    showinfo(
        title='Selected File',
        message=filename
    )
    from treelib import Node, Tree
    maps = filename.split('/')
    DSLExplorer.insert(INSERT, '\n')
    DSLExplorer.insert(INSERT, filename)
    FileInput.insert('end',open(filename,'r').read())
    filewrited = filename

def save_button():
    data = FileInput.get("1.0", 'end-1c')
    files = [('All Files', '*.*'),
			('Python Files', '*.py'),
			('Text Document', '*.txt')]
    filename = fd.asksaveasfilename(filetypes = files,defaultextension = files)
    myfile = open(filename, "w+")
    myfile.write(data)
    myfile.close()


def pressedEnter(name):
    name = UserInput.get("1.0",'end-1c')
    lines = name.split('\n')
    words = lines[-1].split('(')
    letters = list(words[0])
    if(len(letters) == 0):
        letters = " "
    if(letters[0].isupper()):
        try:
            if (name == "Coord"):
                funcs.makeCoord(1, 2)

                # LLA TO ECEF
                # ex : LLA_ECEF(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_ECEF"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.lla_to_ecef_2(numbers[0], numbers[1], numbers[2]))

                # ECEF TO LLA
                # ex : ECEF_LLA(652954.1006, 4774619.7919, -2217647.7937)
            if (words[0] == "ECEF_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.ecef_to_lla(numbers[0], numbers[1], numbers[2]))

                # LLA TO ENU
                # ex : LLA_ENU(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_ENU"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.lla_to_enu(numbers[0], numbers[1], numbers[2]))

                # ENU TO LLA
                # ex : ENU_LLA(-7134.75719598, -4556.32151385,  2852.39042395)
            if (words[0] == "ENU_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.enu_to_lla(numbers[0], numbers[1], numbers[2]))

                # LLA TO AER
                # ex : LLA_AER(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_AER"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.lla_to_aer(numbers[0], numbers[1], numbers[2]))

                # AER TO LLA
                # ex : AER_LLA(12,22,424)
            if (words[0] == "AER_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.aer_to_lla(numbers[0], numbers[1], numbers[2]))

                # Ploting
                # ex : Plot(1,1,1)
            if (words[0] == "Plot"):
                for widget in ToolBox.winfo_children():
                    widget.destroy()
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(';')
                UserInput.insert(tk.INSERT, '\n Was Done \n')
                Plot = FigureCanvasTkAgg(funcs.plot(numbers), ToolBox)
                Plot.draw()
                Plot.get_tk_widget().pack(expand=True, fill=BOTH, side=BOTTOM)

                # Area of  any polygon
                # ex : Area()
            if (words[0] == "Area"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(';')
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.compute_3D_polygon_area(numbers))

        except Exception as error:
            UserInput.insert(tk.INSERT, " \n The error is " + repr(error) + "\n")
        except:
            UserInput.insert(tk.INSERT, '\n Eroare la indicarea coordonatelor incercati repetat \n')
        print('Enter tapped :\n' + name)
    elif lines[-1] != '':
        text = lines[-1]
        try:
            result = eval(text)
            print(f'Operation:\n{text}\nResult:\n{result}')
            UserInput.insert('end', '\n' + str(result) + '\n')
        except:
            print(f'Operation:\n{text}\nResult:\nError')
            UserInput.insert('end', '\nError\n')


def compileCode():
    data = FileInput.get("1.0",'end-1c')
    print('Enter tapped :\n'+data)
    """
    lexer = TUMCADgrammLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = TUMCADgrammParser(stream)
    tree = parser.expr()
    visitor = Visiter()
    output = visitor.visit(tree)
    lines = output.split('\n')
    for indexline in lines:
    """
    UserInput.insert(tk.INSERT , "\n")
    UserInput.insert(tk.INSERT , str(Pars.parse(data)))


window.title("Python GUI App")
window.configure(width=500, height=300)
window.configure(bg='white')
window.tk.call('lappend', 'auto_path', '/tkBreeze/breeze-dark/breeze-dark.tcl')
window.tk.call('ttk::themes')
s=ttk.Style()
s.theme_use('vista')

frm = ttk.Frame(window, padding=10)
#frm.bind('<Button-2>',pressedEnter)
frm.pack(expand=True,fill=BOTH)
#frm.grid()

#frm.rowconfigure(window,0,weight=1)
#frm.rowconfigure(window,1,weight=1)
#frm.rowconfigure(window,2,weight=1)

Buttons_Frm = ttk.Frame(frm, padding=5)
Buttons_Frm.pack()
#Buttons_Frm.grid()

Add_file = Button(Buttons_Frm, text='File', command = select_file)
Add_file.pack(side=LEFT)
#Add_file.grid(column=0,row=0)

Save_file = Button(Buttons_Frm, text='Save File', command = save_button)
Save_file.pack(side=LEFT)
#Save_file.grid(column=0,row=0)

Compile = Button(Buttons_Frm, text='Compile' , command=compileCode)
Compile.pack(side=LEFT)
#add_file.grid(column=1,row=0)

Tools_Frm = ttk.Frame(frm, padding=5)
Tools_Frm.pack(side=LEFT)

ToolBox = tkinter.LabelFrame(Tools_Frm, height = 15, width = widthsc,text='Plot')
#ToolBox.grid(column=0, row=1,rowspan=2)
#ToolBox.insert(INSERT,'Ploting')
ToolBox.pack(expand=True, fill=BOTH, side=BOTTOM)
#ToolBoxlabel = Label(frm, height = 3, width = 32,text='ToolBox').grid(column=0, row=0,)

DSLExplorer = scrolledtext.ScrolledText(Tools_Frm, height = 15, width = widthsc)
#DSLExplorer.grid(column=0,row=3, rowspan=2)
DSLExplorer.insert(INSERT,'DSLExplorer \n')
DSLExplorer.pack(expand=True, fill=BOTH, side=BOTTOM)

User_Frm = ttk.Frame(frm, padding=5)
#User_Frm.bind('<Return>',pressedEnter)
User_Frm.pack(side=LEFT)

FileInput=scrolledtext.ScrolledText(User_Frm, height = 20, width = 5*widthsc)
#FileInput.grid(column=1, row=1,rowspan=3)
FileInput.pack(expand=True, fill=BOTH)


UserInput=scrolledtext.ScrolledText(User_Frm, height = 10, width = 5*widthsc)
#UserInput.grid(column=1, row=4)
UserInput.pack(expand=True, fill=BOTH, side=BOTTOM)
UserInput.bind('<Return>',pressedEnter)

Prop_Frm = ttk.LabelFrame(frm, padding=5, text='Properties')
Prop_Frm.pack(side=LEFT)

ProPeryties = Label(Prop_Frm, height = 30, width = widthsc)
#ProPeryties.grid(column=2, row=1,rowspan=5)
#ProPeryties.insert(INSERT,'Properties')
ProPeryties.pack(expand=True, fill=BOTH, side=BOTTOM)

for widget in frm.winfo_children():
      widget.pack(padx=3, pady=3)



window.mainloop()