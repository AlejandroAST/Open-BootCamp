import sqlite3

def main():
    """
    Metodo Principal Tema 11
    """
    print("<>----<> TEMA 11 <>----<>")
    print("+" + 13 * "-" + "+")
    print(("|" + " Ejercicio 1 " + "|\n"), end="")
    print("+" + 13 * "-" + "+")

    print("Crear Tabla Alumnos")
    # creaTablaAlumnos()
    print("Insertar Datos")
    insertarAlumno(1, "Alejandro", "Fernandez")

    #alumno: str=input("Que alumno quieres buscar: ")
    #mostrarAlumno(alumno)

def mostrarAlumno(nombre: str):
    pass

def insertarAlumno(id: int, nombre: str, apellido: str):
    #El isolation_level es para permitir insertar datos deletes o updates, si quieres evitar el commit
    conn = sqlite3.connect('BBDD_Alumnos.db')
    cursor = conn.cursor()

    query = '''INSERT INTO alumnos(id, nombre, apellido) VALUES(?,?,?)'''
    print("Query: ", query)

    row = cursor.execute(query, (id, nombre, apellido))

    conn.commit()

    cursor.close()
    conn.close()

def creaTablaAlumnos():
    conn = sqlite3.connect('BBDD_Alumnos.db')
    cursor = conn.cursor()

    query = f'CREATE TABLE alumnos(id INT PRIMARY KEY, nombre TEXT, apellido TEXT);'

    print("Query: ", query)

    row = cursor.execute(query)

    conn.commit()
    cursor.close()
    conn.close()

if __name__ == '__main__':
    main()