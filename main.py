import tkinter as tk
import tkinter.scrolledtext as scrolledtext
from tkinter import ttk
from tkinter import *
import sys
from antlr4 import *
from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammParser import TUMCADgrammParser
from gen.TUMCADgrammVisitor import TUMCADgrammVisitor
from ttkthemes import *
import MyVisit as Visiter

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

def pressedEnter(name):
    name = UserInput.get("1.0",'end-1c')
    print('Enter tapped :\n'+name)

def compileCode():
    data = FileInput.get("1.0",'end-1c')
    print('Enter tapped :\n'+data)
    lexer = TUMCADgrammLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = TUMCADgrammParser(stream)
    tree = parser.expr()
    visitor = Visiter()
    output = visitor.visit(tree)
    print(output)


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

Add_file = Button(Buttons_Frm, text='File')
Add_file.pack(side=LEFT)
#Add_file.grid(column=0,row=0)

Save_file = Button(Buttons_Frm, text='Save File')
Save_file.pack(side=LEFT)
#Save_file.grid(column=0,row=0)

Compile = Button(Buttons_Frm, text='Compile' , command=compileCode)
Compile.pack(side=LEFT)
#add_file.grid(column=1,row=0)

Tools_Frm = ttk.Frame(frm, padding=5)
Tools_Frm.pack(side=LEFT)

ToolBox = scrolledtext.ScrolledText(Tools_Frm, height = 15, width = widthsc)
#ToolBox.grid(column=0, row=1,rowspan=2)
ToolBox.insert(INSERT,'ToolBox')
ToolBox.pack(expand=True, fill=BOTH, side=BOTTOM)
#ToolBoxlabel = Label(frm, height = 3, width = 32,text='ToolBox').grid(column=0, row=0,)

DSLExplorer = scrolledtext.ScrolledText(Tools_Frm, height = 15, width = widthsc)
#DSLExplorer.grid(column=0,row=3, rowspan=2)
DSLExplorer.insert(INSERT,'DSLExplorer')
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