print("<>----<> TEMA 5 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 2 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

def esPrimo(numero: int) -> bool:
    for i in range(2, numero):
        if numero % i ==0:
            return False
        
    return True

numero: int=int(input("Escribe el numero: "))

if esPrimo(numero): print("El número ",str(numero), " es primo")
else: print("El número ",str(numero), " no es primo")
