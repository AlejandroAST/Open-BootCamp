# Temas 7-8-9

Spring Open-BootCamp

## Enunciado 🚀

### Ejercicio 1 

_Implementar los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores._
_os métodos CRUD:_
* findAll()
* findOneById()
* create()
* update()
* delete()
* deleteAll()

### Ejercicio 2
_Implementar swagger sobre el API REST de Laptop y verificar que funciona en la URL:_
```
http://localhost:8081/swagger-ui/
```

### Ejercicio 3
_Crear casos de test para el controlador de Laptop desde Spring Boot._
_Con click derecho dentro del código de la clase LaptopController utilizar la opción Generate > Test para crear la clase con todos los tests unitarios e implementarlos siguiente el proceso visto en clase._


## Ejecutando las pruebas ⚙️
NO ACABADO

### Ejercicio 1
_Direccion para la conexion de la listas laptops_
```
http://localhost:8080/api/laptops
```

## Arreglo 🛠️
_En el fichero application.properties de la carpeta de resources añadir:_
```
spring.mvc.pathmatch.matching-strategy=ant_path_matcher
```
_Evita errores con la version 3.0.0 del springfox-boot-starter_


## Autores ✒️

* **Alejandro Fernández** - *Spring* - [mi cuenta github](https://github.com/AlejandroAST)

