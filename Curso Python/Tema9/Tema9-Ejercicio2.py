from functools import reduce

def main():
    """
    Metodo Principal
    """
    print("<>----<> TEMA 9 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 2 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    listaNumeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    print(f'Lista numeros inicial: {listaNumeros}')

    listaImpares = list(filter(impares, listaNumeros))
    # Version lambda
    # listaImpares = list(filter((lambda a: a % 2 != 0), listaNumeros))

    print(f'Lista numeros impares filtrada con filter: {listaImpares}')

    resultado= reduce(suma, listaImpares)
    # Version lambda
    # resultado = reduce((lambda a, b: a+b), listaImpares)

    print(f'Suma de los elementos con reduce: {resultado}')


def impares(numero:int) -> bool:
    if numero % 2 != 0:
        return True

    return False

def suma(a: int, b: int) -> int:
    return a+b

if __name__ == '__main__':
    main()
