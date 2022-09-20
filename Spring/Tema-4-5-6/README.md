# Temas 4, 5 y 6

Spring Open-BootCamp

## Enunciado 🚀

### Ejercicio 1 

_Crear un proyecto Spring Boot con las dependencias:_

* H2
* Spring Data JPA
* Spring Web
* Spring Boot dev tools

_Crear una clase HelloController que sea un controlador REST. Dentro de la clase crear un método que retorne un saludo. Probar que retorna el saludo desde el navegador y desde Postman._

### Ejercicio 2
_Dentro de la misma app crear las clases necesarias para trabajar con "ordenadores":_

* Laptop (entidad)
* LaptopRepository (repositorio)
* LaptopController (controlador)

_Desde LaptopController crear un método que devuelva una lista de objetos Laptop._
_Probar que funciona desde Postman._
_Los objetos Laptop se pueden insertar desde el método main de la clase principal._

### Ejercicio 3
_Crear un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y persistirlo en la base de datos.
Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado._

## Ejecutando las pruebas ⚙️

### Ejercicio 1
_Direccion para la conexion del saludo_
```
http://localhost:8080/saludo
```
### Ejercicio 2
_Mostrar la lista de laptops_
```
http://localhost:8080/api/laptops
```
_Para buscar por id sustituir la '?' por el numero long id correspondiente_
```
http://localhost:8080/api/laptops/?
```

### Ejercicio 3
#### Nota: Ejercicio 3 - se usa el mismo LaptopController del ejercicio 2

_Para insertar un nuevo portatil, usamos el metodo POST en la siguiente direccion_

```
http://localhost:8080/api/laptops
```
_Plantilla del JSON Nota:'ID no es necesario se autogenera'_

```
{
    "nombre": "NOMBRE_PORTATIL",
    "marca": "MARCA_PORTATIL",
    "precio": 1234
}
```



## Autores ✒️

* **Alejandro Fernández** - *Spring* - [mi cuenta github](https://github.com/AlejandroAST)

