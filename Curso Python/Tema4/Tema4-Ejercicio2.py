print("<>----<> TEMA 4 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 2 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")


numero_inicial: int=int(input("Especifica el numero inicial de la lista de impares: "))
numero_final: int=int(input("Especifica el numero final de la lista de impares: "))
listaImpares: [int]=[]#Lista vacia

#Comprobar que el numero inicial no se mayor que el final
while numero_inicial >= numero_final:
    numero_inicial=int(input("Vuelve a escribir el numero inicial de la lista de impares: "))
    numero_final=int(input("Vuelve a escribir  el numero final de la lista de impares: "))

                      
for valor in range(numero_inicial,numero_final+1):
    if(valor%2) != 0:
        listaImpares.append(valor)

print("Lista IMPARES desde "+str(numero_inicial)
      +" hasta el "+str(numero_final)
      +" ---> ", end="")
print(listaImpares)
                      
