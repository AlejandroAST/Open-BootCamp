package impl.Tema101112.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;


/**
 * Configuración Swagger para la generación de documentación de la API REST
 * Configuración por defecto para el puerto y direccion
 * HTML: http://localhost:8080/swagger-ui/
 * JSON: http://localhost:8080/v2/api-docs
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Spring Boot Laptops API REST",
                "Tienda de Laptops Api rest docs",
                "1.0",
                "http://www.google.com",
                new Contact("Alejandro", "http://www.google.com", "correoTiendaLaptops@example.com"),
                "MIT",
                "http://www.google.com",
                Collections.emptyList());
    }

}
