print("<>----<> TEMA 5 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 1 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")


def areaTriangulo(base, altura):
    return base*altura/2

def areaCirculo(radio):
    return (radio**2)*3.14

print("\nCalculo del area del triangulo"+
      "\n*********************************")
base: int=int(input("Base del Triangulo: "))
altura: int=int(input("Altura del Triangulo: "))
print("Area del triangulo: ", str(areaTriangulo(base, altura)))

print("\nCalculo del area del Circulo"+
      "\n*********************************")
radio: float=float(input("Radio del Circulo: "))
print("Area del circulo: ", str(areaCirculo(radio)))
