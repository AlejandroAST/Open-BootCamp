import calculadora.operacionesBasicas as op
def main():
    """
    Metodo Principal, muestra las opciones al usuario
    """
    print("<>----<> TEMA 7 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 1 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    valor1: int = 0
    valor2: int = 0
    operacion: str = None

    while "salir" != operacion:

        valor1 = int(input("Escribe el primer valor: "))
        valor2 = int(input("Escribe el segundo valor: "))
        operacion = input("Que operacion básica quieres hacer(Suma, Resta, Multiplicacion o Division): ")

        match operacion:
            case "suma":
                print(f"Suma de los {valor1} + {valor2} = {op.suma(valor1, valor2)}")
            case "resta":
                print(f"Resta de los {valor1} - {valor2} = {op.resta(valor1, valor2)}")
            case "multiplicacion":
                print(f"Multiplicación de los {valor1} * {valor2} = {op.multiplicacion(valor1, valor2)}")
            case "division":
                print(f"Division de los {valor1} / {valor2} = {op.division(valor1, valor2)}")


        operacion = input("Para realizar otra operacion pulsa cualquier tecla y para salir escribe 'salir'").lower()

    print("FIN DEL PROGRAMA")

if __name__ == '__main__':
    main()
