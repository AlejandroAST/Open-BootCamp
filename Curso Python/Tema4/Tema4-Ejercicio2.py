print("<>----<> TEMA 4 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 2 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")


numero_inicial: int=int(input("Especifica el numero inicial de la lista de impares: "))
numero_final: int=int(input("Especifica el numero final de la lista de impares: "))
listaImpares: int=[]#Lista vacia
                      
for valor in range(numero_inicial,numero_final+1):
    if(valor%2) != 0:
        listaImpares.append(valor)

print("Lista IMPARES ---> ", end="")
print(listaImpares)
                      
