print("<>----<> TEMA 3 <>----<>")
print("+" + 13 * "-" + "+")
print(("|" + " Ejercicio 1 "+ "|\n"), end="")
print("+" + 13 * "-" + "+")

nombre: str='Alejandro'
apellidos: str='Fernández F'
edad: int=30
email: str='correo@gmail.com'
casado: bool=False
conHijos: bool=False
listaAmigos: list=('Carlos', 'Gustavo', 'Lucia')
peliculas={
    "cod01":"Regreso al Futuro",
    "cod02":"Indina Jones: La última cruzada"}

print("Nombre: "+nombre+" | Apellidos: "+apellidos+" | Edad: "+str(edad)+
      "\nEmail: "+email+" | Casado: "+ str(casado)+" | Con Hijos: "+str(conHijos)+
      "\nLista Amigos: "+str(listaAmigos)+
      "\nDiccionario de Peliculas: "+str(peliculas))

