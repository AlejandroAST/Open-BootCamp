import pickle


def main():
    """
    Metodo Principal
    """
    print("<>----<> TEMA 8 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 1  " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    datos: str = None
    nombreFichero: str = 'Tema8-Ejercicio1-fichero.txt'

    while datos == None:
        datos = input("Que quieres escribir en el fichero: ")
        escribirArchivo(nombreFichero, datos)

    print("El archivo " + nombreFichero + " contiene: \n" + leerArchivo(nombreFichero))


def escribirArchivo(nombreFichero: str, datos: str):
    fichero = open('Tema8-Ejercicio1-fichero.txt', 'w')
    fichero.write(datos)
    fichero.close()


def leerArchivo(nombreFichero: str) -> str:
    datos: str = ''
    fichero = open(nombreFichero, 'r')
    datos = fichero.read()
    fichero.close()
    return datos


if __name__ == '__main__':
    main()
