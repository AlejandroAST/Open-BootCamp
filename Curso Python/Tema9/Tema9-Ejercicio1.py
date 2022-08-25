def main():
    """
    Metodo Principal, muestra las opciones al usuario
    """
    print("<>----<> TEMA 9 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 1 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    opciones= None
    listaPaises=[]
    while opciones != "salir":
        pais=input("Escribe un pais o escribe salir para concluir: ")
        listaPaises.append(pais)

    print(listaPaises)
if __name__ == '__main__':
    main()