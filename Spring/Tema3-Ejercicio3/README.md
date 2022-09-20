# Tema 3 Ejercicio 3

Spring Open-BootCamp

## Enunciado 🚀

_<UL>-Crear un proyecto Spring Boot con las dependencias:_

<LI>Spring Data JPA</LI>
<LI>H2</LI>
</UL>

_-En caso de querer que la base de datos se guarde en disco habrá que añadir las siguientes propiedades en el archivo application.properties:_

```
spring.jpa.show-sql=true

spring.datasource.url=jdbc:h2:file:C:/data/sample

spring.datasource.username=sa

spring.datasource.password=

spring.datasource.driverClassName=org.h2.Driver

#spring.jpa.hibernate.ddl-auto=creat

spring.jpa.hibernate.ddl-auto=update

spring.sql.init.mode=always

spring.jpa.defer-datasource-initialization=true
```

## Autores ✒️

* **Alejandro Fernández** - *Spring* - [mi cuenta github](https://github.com/AlejandroAST)

