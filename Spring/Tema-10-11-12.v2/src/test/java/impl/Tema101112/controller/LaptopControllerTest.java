package impl.Tema101112.controller;

import impl.Tema101112.models.Laptop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder=null;

    @LocalServerPort
    private int port;


    /**
     * Comprobar conexion inicial
     */
    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @AfterEach
    void tearDown() {
        restTemplateBuilder=null;
        testRestTemplate=null;
    }

    @Test
    void findAll() {
        ResponseEntity<Laptop[]> response  =  testRestTemplate.getForEntity("/api/laptops", Laptop[].class);
        //Comprobar que inicialmente esta vacia
        assertEquals(HttpStatus.OK, response.getStatusCode());

        //Meter un portatil
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);
        testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        response  =  testRestTemplate.getForEntity("/api/laptops", Laptop[].class);

        List<Laptop> portatiles = Arrays.asList(response.getBody());
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(portatiles.size(), 2);

    }

    @Test
    void findOneById() {
        ResponseEntity<Laptop> response  = testRestTemplate.getForEntity("/api/laptops/1", Laptop.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

        //Meter un portatil
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {
                    
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);
        testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        response  =  testRestTemplate.getForEntity("/api/laptops/2", Laptop.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());

    }

    @Test
    void create() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);

        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        Laptop result = response.getBody();

        assertEquals(1L, result.getId());
        assertEquals("Portatil Prueba", result.getNombre());
        assertEquals("marca prueba", result.getMarca());
        assertEquals((Integer) 100, result.getPrecio());

    }

    @Test
    void update() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);
        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/laptops", HttpMethod.PUT, request, Laptop.class);

        //No existe el portatil con ese id
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());

        //Creamos un portatil
        response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);

        Laptop result = response.getBody();
        assertEquals(4L, result.getId());
        assertEquals("Portatil Prueba", result.getNombre());
        assertEquals("marca prueba", result.getMarca());
        assertEquals((Integer) 100, result.getPrecio());
        assertEquals(HttpStatus.OK, response.getStatusCode());


        //intentamos modificar con un id que no existe
        json = """
                {
                    "id": 5,
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        request = new HttpEntity<>(json,headers);
        response = testRestTemplate.exchange("/api/laptops", HttpMethod.PUT, request, Laptop.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

        //intentamos modificar con un id si esta
        json = """
                {
                    "id": 2,
                    "nombre": "Portatil Prueba MODIFICADO",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        request = new HttpEntity<>(json,headers);
        response = testRestTemplate.exchange("/api/laptops", HttpMethod.PUT, request, Laptop.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        result = response.getBody();
        assertEquals("Portatil Prueba MODIFICADO", result.getNombre());

    }

    @Test
    void delete() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {

                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);
        //Intentar borrar portatil que no existe
        ResponseEntity<Laptop> response= testRestTemplate.exchange("/api/laptops/55", HttpMethod.DELETE, request, Laptop.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        //Insertar portatil
        json = """
                {
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        request = new HttpEntity<>(json,headers);
        response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);
        Laptop result = response.getBody();
        assertEquals(2L, result.getId());
        //Borrar portatil
        json = """
                
                """;

        request = new HttpEntity<>(json,headers);
        response= testRestTemplate.exchange("/api/laptops/1", HttpMethod.DELETE, request, Laptop.class);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }

    @Test
    void deleteAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json = """
                {

                }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);

        //Intentar borrar repositorio vacio
        ResponseEntity<Laptop> response= testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, request, Laptop.class);
        //assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

        //Insertar portatil
        json = """
                {
                    "nombre": "Portatil Prueba",
                    "marca": "marca prueba",
                    "precio": 100
                }
                """;

        request = new HttpEntity<>(json,headers);
        response = testRestTemplate.exchange("/api/laptops", HttpMethod.POST, request, Laptop.class);
        Laptop result = response.getBody();
        assertEquals(6L, result.getId());
        //Borramos todos los portatiles
        json = """
                
                """;

        request = new HttpEntity<>(json,headers);
        response= testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, request, Laptop.class);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());

        response= testRestTemplate.exchange("/api/laptops", HttpMethod.DELETE, request, Laptop.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
}