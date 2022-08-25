def main():
    """
    Metodo Principal
    """
    print("<>----<> TEMA 8 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 2 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    datos: str = None
    nombreFichero: str = 'Tema8_Ejercicio2_fichero.txt'

    print("Creamos el objeto vehiculo")
    v1 = Vehiculo('Rojo', 4, 5)
    print(v1)
    #Almacenar en el fichero
    escribirArchivo(nombreFichero, v1)
    print("\nLeemos el fichero " + nombreFichero + " que contiene: ")
    #Contiene el vehiculo del fichero
    v2 = leerArchivo(nombreFichero)
    print(v2)

class Vehiculo:
    color:  str
    ruedas: int
    puertas: int

    def __init__(self, color: str, ruedas: int, puertas: int):
        self.color=color
        self.ruedas=ruedas
        self.puertas=puertas
    def __str__(self):
        return f'El vehiculo es de color {self.color} tiene {self.ruedas} ruedas y {self.puertas} ventanas'



def escribirArchivo(nombreFichero: str, datos: Vehiculo):
    fichero = open(nombreFichero, 'w')
    fichero.write(datos.__str__())
    fichero.close()
    print("Fichero CREADO")


def leerArchivo(nombreFichero: str) -> Vehiculo:
    datos: str = ''
    fichero = open(nombreFichero, 'r')
    datos = fichero.read()
    fichero.close()
    return datos



if __name__ == '__main__':
    main()
