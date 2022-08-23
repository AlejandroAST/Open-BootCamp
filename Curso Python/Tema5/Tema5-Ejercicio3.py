print("<>----<> TEMA 5 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 3 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

def añoBisiesto(año):
  if año % 4 != 0:
    return False
  elif año % 100 != 0:
    return True 
  elif año % 400 != 0:
    return False 
  else:
    return True

año: int=int(input("Escribe el año que quieres comprobar: "))

if añoBisiesto(año): print("El año ",str(año), " es bisiesto")
else: print("El año ",str(año), " no es bisiesto")
