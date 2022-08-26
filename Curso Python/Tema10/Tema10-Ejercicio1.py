import tkinter
from tkinter import ttk

def eleccionEscogida():
    mostrar.config(text="{}".format(seleccionado.get()))

def reinicio():
    mostrar.config(text="Reinicio")
    seleccionado.set(None)

print("<>----<> TEMA 10 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 1 " + "|\n"), end="")
print("+" + 13 * "-" + "+")

window = tkinter.Tk()
window.title("Tema 10 Ejercicio 1")
window.geometry("350x150")

window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=4)

titulo_opt = ttk.Label(window, text="Opciones:")
titulo_opt.grid(column=0, sticky=tkinter.W, row=1, pady=5, padx=5)

seleccionado = tkinter.StringVar()

titulo_eleccion = ttk.Label(window, text="Escogida:")
titulo_eleccion.grid(column=1, sticky=tkinter.W, row=2, pady=5, padx=5)
mostrar = ttk.Label(window, text="")
mostrar.grid(column=1, sticky=tkinter.W, row=3, pady=5, padx=5)

r1 = ttk.Radiobutton(window, text='Opcion 1', value='Elegido 1', variable=seleccionado, command=eleccionEscogida)
r2 = ttk.Radiobutton(window, text='Opcion 2', value='Elegido 2', variable=seleccionado, command=eleccionEscogida)
r3 = ttk.Radiobutton(window, text='Opcion 3', value='Elegido 3', variable=seleccionado, command=eleccionEscogida)

r1.grid(column=0, sticky=tkinter.W, row=2, pady=5, padx=5)
r2.grid(column=0, sticky=tkinter.W, row=3, pady=5, padx=5)
r3.grid(column=0, sticky=tkinter.W, row=4, pady=5, padx=5)

boton= tkinter.Button(window, text='Reiniciar', command=reinicio)
boton.grid(column=1, sticky=tkinter.W, row=4, pady=5, padx=5)

window.mainloop()



