# Temas 10-11-12

Spring Open-BootCamp

## Enunciado 🚀

### Ejercicio 1 

* Probar a empaquetar la aplicación con maven package desde Intellij IDEA

* Desde terminal en Intellij IDEA verificar que se se ejecuta correctamente con el comando:
```
java -jar target/spring-deploy-1.0.jar
```

* Crear un perfil para dev y otro para test con una propiedad nueva que carguemos en el controlador.

### Ejercicio 2
_Desplegar el API REST de Laptops en Heroku y verificar funcionamiento desde POSTMAN._


### Ejercicio 3
_Añadir Spring Security sobre el proyecto API REST de Laptops y configurar 2 usuarios en memoria utilizando una clase WebSecurityConfig._


### Solución
#### Ejercicio 1
_Desplegar Maven en el intellij -> Pestaña de lifecycle: Package y genera el jar._

_Desde la terminal del intellij lanzar:_

_Nota: comprobar que la aplicación está parada_
```
java --version
java -jar .\target\Tema-10-11-12-1.0.jar
```
_Añadidos dos application.properties, uno correspondiente a desarrollo y otro a test. En el generico se cambia cual se utiliza_

## Autores ✒️

* **Alejandro Fernández** - *Spring* - [mi cuenta github](https://github.com/AlejandroAST)

