print("<>----<> TEMA 5 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 1 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

import math

def areaTriangulo(base: float, altura: float) -> float:
    return ((base*altura)/2)

def areaCirculo(radio: float) -> float:
    return ((radio**2)*math.pi)

print("\nCalculo del area del triangulo"+
      "\n*********************************")
base: int=int(input("Base del Triangulo: "))
altura: int=int(input("Altura del Triangulo: "))
#Con conversion de tipos
print("Area del triangulo: ", str(areaTriangulo(base, altura)))

print("\nCalculo del area del Circulo"+
      "\n*********************************")
radio: float=float(input("Radio del Circulo: "))
#Sin conversion de tipos
print(f"Area del circulo: {areaCirculo(radio)}")


