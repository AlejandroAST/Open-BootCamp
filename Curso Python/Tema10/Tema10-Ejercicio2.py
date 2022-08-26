
import tkinter
from tkinter import ttk

print("<>----<> TEMA 10 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 2 " + "|\n"), end="")
print("+" + 13 * "-" + "+")

window = tkinter.Tk()
window.title("Tema 10 Ejercicio 2")
window.geometry("350x150")

window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=4)

elementos=('Rojo', 'Verde', 'Azul', 'Amarillo')
elementosLista = tkinter.StringVar(value=elementos)


titulo_opciones = ttk.Label(window, text="Elige una de las siguientes opciones:")
titulo_opciones.grid(column=0, sticky=tkinter.W, row=1, pady=5, padx=5)

lista = tkinter.Listbox(window, listvariable=elementosLista, height=6)
lista.grid(column=0, sticky=tkinter.W, row=2, pady=5, padx=5)

window.mainloop()