def main():
    """
    Metodo Principal, muestra las opciones al usuario
    """
    print("<>----<> TEMA 9 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 1 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    listaPaises=input("Escribe la lista de paises separados por ',': ")
    paises=listaPaises.replace(',', '').lower().split()
    print(",".join(sorted(paises)))

if __name__ == '__main__':
    main()