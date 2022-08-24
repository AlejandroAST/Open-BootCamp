print("<>----<> TEMA 6 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 2 " + "|\n"), end="")
print("+" + 13 * "-" + "+")


class Alumno:
    nombre: str
    nota: int

    def __init__(self, nombre: str, nota: int):
        self.nombre = nombre
        self.nota = nota

    def aprobado(self) -> bool:
        """
        Comprueba la nota
        :return True Aprobado False Suspenso
        """
        if self.nota >= 5:
            return True
        else:
            return False

    def __str__(self):
        if self.aprobado():
            return "Nombre alumno: {}, nota= {}, APROBADO".format(self.nombre, self.nota)
        else:
            return "Nombre alumno: {}, nota= {}, SUSPENSO".format(self.nombre, self.nota)


alumno = Alumno("Alejandro", 7)
alumno2 = Alumno("Diego", 4)

print(alumno)
print(alumno2)
