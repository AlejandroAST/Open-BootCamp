print("<>----<> TEMA 6 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 1 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

class Vehiculo:
    color:  str
    ruedas: int
    puertas: int

    def __init__(self, color: str, ruedas: int, puertas: int):
        self.color=color
        self.ruedas=ruedas
        self.puertas=puertas


class Coche(Vehiculo):
    velocidad: float
    cilindrada: int

    def __init__(self, velocidadInicial: float, cilindrada: int, colorCoche: str, ruedasCoche: int, puertasCoche: int):
        #Pasamos los parametros al construcctor de vehiculo
        super().__init__(colorCoche, ruedasCoche, puertasCoche)
        self.velocidad=velocidadInicial
        self.cilindrada=cilindrada

#Creamos la instancia del coche con los parametros iniciales de coche y vehiculo
coche=Coche(200.0, 145, "Rojo", 4, 4)

print("Caracteristicas de nuestro coche:"
      +f"\nColor: {coche.color} - Ruedas: {coche.ruedas} - Puertas: {coche.puertas}"
      +f"\nVelocidad: {coche.velocidad} - Cilindrada: {coche.cilindrada}")
