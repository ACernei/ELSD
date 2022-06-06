import sys
import tkinter
import tkinter as tk
import tkinter.scrolledtext as scrolledtext
from tkinter import *
from tkinter import filedialog as fd
from tkinter import ttk
from tkinter.filedialog import asksaveasfile
from tkinter.messagebox import showinfo

import matplotlib.pyplot as plt
from antlr4 import *
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
from ttkthemes import *

import functions as funcs
import Parsing as Pars
from gen.TUMCADgrammLexer import TUMCADgrammLexer
from gen.TUMCADgrammParser import TUMCADgrammParser
from gen.TUMCADgrammVisitor import TUMCADgrammVisitor
from MyVisit import parseProgram

window = Tk()
window.minsize(width=600, height=500)

widthsc = 32

global filewrited
filewrited = None


def select_file():
    DSLExplorer.config(state='normal')
    DSLExplorer.delete("3.0", "end")
    DSLExplorer.config(state='disabled')
    FileInput.delete("1.0", "end")
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
    DSLExplorer.config(state='normal')
    DSLExplorer.insert(INSERT, '\n')
    DSLExplorer.insert(INSERT, filename)
    FileInput.insert('end', open(filename, 'r').read())
    DSLExplorer.config(state='disabled')
    filewrited = filename


def save_button():
    data = FileInput.get("1.0", 'end-1c')
    files = [('All Files', '*.*'),
             ('Python Files', '*.py'),
             ('Text Document', '*.txt')]
    filename = fd.asksaveasfilename(filetypes=files, defaultextension=files)
    myfile = open(filename, "w+")
    myfile.write(data)
    myfile.close()


def pressedEnter(name):
    name = UserInput.get("1.0", 'end-1c')
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
                UserInput.insert(tk.INSERT, funcs.lla_to_ecef_2(
                    numbers[0], numbers[1], numbers[2]))

                # ECEF TO LLA
                # ex : ECEF_LLA(652954.1006, 4774619.7919, -2217647.7937)
            if (words[0] == "ECEF_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.ecef_to_lla(
                    numbers[0], numbers[1], numbers[2]))

                # LLA TO ENU
                # ex : LLA_ENU(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_ENU"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.lla_to_enu(
                    numbers[0], numbers[1], numbers[2]))

                # ENU TO LLA
                # ex : ENU_LLA(-7134.75719598, -4556.32151385,  2852.39042395)
            if (words[0] == "ENU_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.enu_to_lla(
                    numbers[0], numbers[1], numbers[2]))

                # LLA TO AER
                # ex : LLA_AER(37.4001100556,  -79.1539111111,  208.38)
            if (words[0] == "LLA_AER"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.lla_to_aer(
                    numbers[0], numbers[1], numbers[2]))

                # AER TO LLA
                # ex : AER_LLA(12,22,424)
            if (words[0] == "AER_LLA"):
                nmrs = words[1].split(')')
                numbers = nmrs[0].split(',')
                if len(numbers) > 3:
                    raise Exception('We need 3 args not ' + str(len(numbers)))
                UserInput.insert(tk.INSERT, '\n')
                UserInput.insert(tk.INSERT, funcs.aer_to_lla(
                    numbers[0], numbers[1], numbers[2]))

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
                UserInput.insert(
                    tk.INSERT, funcs.compute_3D_polygon_area(numbers))

        except Exception as error:
            UserInput.insert(
                tk.INSERT, " \n The error is " + repr(error) + "\n")
        except:
            UserInput.insert(
                tk.INSERT, '\n Eroare la indicarea coordonatelor incercati repetat \n')
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


def plot_normal(values):
    for widget in ToolBox.winfo_children():
        widget.destroy()
    numbers = [','.join([str(v) for v in values])]
    UserInput.insert('end', '\n Plot Was Done \n')
    Plot = FigureCanvasTkAgg(funcs.plot(numbers), ToolBox)
    Plot.draw()
    Plot.get_tk_widget().pack(expand=True, fill=BOTH, side=BOTTOM)


def compileCode():
    data = FileInput.get("1.0", 'end-1c')
    print('Enter tapped :\n'+data)
    parseProgram(data, onPlot=plot_normal)
    UserInput.insert('end', "\n")
    UserInput.insert('end', str(Pars.parse(data)))


window.title("Python GUI App")
window.configure(width=500, height=300)
window.configure(bg='white')
window.tk.call('lappend', 'auto_path', '/tkBreeze/breeze-dark/breeze-dark.tcl')
window.tk.call('ttk::themes')
s = ttk.Style()
# s.theme_use('vista')

frm = ttk.Frame(window, padding=10)
frm.pack(expand=True, fill=BOTH)


Buttons_Frm = ttk.Frame(frm, padding=5)
Buttons_Frm.pack()

Add_file = Button(Buttons_Frm, text='File', command=select_file)
Add_file.pack(side=LEFT)

Save_file = Button(Buttons_Frm, text='Save File', command=save_button)
Save_file.pack(side=LEFT)

Compile = Button(Buttons_Frm, text='Compile', command=compileCode)
Compile.pack(side=LEFT)

Tools_Frm = ttk.Frame(frm, padding=5)
Tools_Frm.pack(side=LEFT)

ToolBox = tkinter.LabelFrame(Tools_Frm, height=15, width=widthsc, text='Plot')

ToolBox.pack(expand=True, fill=BOTH, side=BOTTOM)

DSLExplorer = scrolledtext.ScrolledText(
    Tools_Frm, bg='#d9d9d9', height=15, width=widthsc)
DSLExplorer.config(state='normal')
DSLExplorer.insert(INSERT, '---DSLExplorer---\n')
DSLExplorer.config(state='disabled')

DSLExplorer.pack(expand=True, fill=BOTH, side=BOTTOM)

User_Frm = ttk.Frame(frm, padding=5)
User_Frm.pack(side=LEFT)

FileInput = scrolledtext.ScrolledText(User_Frm, height=20, width=5*widthsc)
FileInput.pack(expand=True, fill=BOTH)


UserInput = scrolledtext.ScrolledText(User_Frm, height=10, width=5*widthsc)
UserInput.pack(expand=True, fill=BOTH, side=BOTTOM)
UserInput.bind('<Return>', pressedEnter)

Prop_Frm = ttk.LabelFrame(frm, padding=5, text='Properties')
Prop_Frm.pack(side=LEFT)

ProPeryties = Label(Prop_Frm, height=30, width=widthsc)
ProPeryties.pack(expand=True, fill=BOTH, side=BOTTOM)

for widget in frm.winfo_children():
    widget.pack(padx=3, pady=3)


window.mainloop()
