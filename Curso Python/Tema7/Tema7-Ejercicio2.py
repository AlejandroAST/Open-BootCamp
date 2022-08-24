import time

def tiempoRestante(hora: int, minutos: int):
    if hora >= 19:
        print("\nHa finalizado la jornada \nEs hora de ir a casa, la hora de salida es las 7 o 19 de la tarde")
    else:
        minutosRestantes: int=60-minutos
        horasRestantes: int=0
        if minutosRestantes == 60:
            horasRestantes=19-hora
            minutosRestantes=0
            print("Falta para la hora de salida {} horas - {} minutos".format(horasRestantes, minutosRestantes))
        else:
            horasRestantes=19-hora-1
            print("Falta para la hora de salida {} horas - {} minutos".format(horasRestantes, minutosRestantes))

def main():
    print("<>----<> TEMA 7 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 2 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    print("Fecha del sistema: "+time.strftime("%c"))
    print("Dia: "  + time.strftime("%x"))
    print("Hora: "+time.strftime("%X"))

    hora: int=int(time.strftime("%H"))
    minutos: int=int(time.strftime("%M"))

    tiempoRestante(hora, minutos)

    #Test de menos de 1 hora
    #tiempoRestante(18, 35)
    #Test de mas de 1 hora
    #tiempoRestante(18, 35)



if __name__ == '__main__':
    main()

