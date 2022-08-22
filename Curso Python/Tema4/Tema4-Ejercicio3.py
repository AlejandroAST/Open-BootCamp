print("<>----<> TEMA 4 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 3 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

listaNumeros: [int]=[]    #Lista Vacia

for i in range(1,101):
    listaNumeros.append(101-i)

print("Lista descendente desde 100 a 1\n-------------------------------")
print(listaNumeros)
