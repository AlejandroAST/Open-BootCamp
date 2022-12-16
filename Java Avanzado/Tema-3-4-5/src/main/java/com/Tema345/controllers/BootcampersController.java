package com.Tema345.controllers;


import com.Tema345.models.Bootcamper;
import com.Tema345.services.BootcamperService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Juan", Math.random()));
        this.bootcamperService.add(new Bootcamper("Marcos", Math.random()));
        this.bootcamperService.add(new Bootcamper("Pedro", Math.random()));


    }

    @GET
    @Path("/")
    public String portada() {
        String pagina_inicial= "<!DOCTYPE html>\n" +
                "<html lang=\"es\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>HTML</title>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <link rel=\"stylesheet\" href=\"estilo.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "  <p>Pagina Inicial del servicio REST </p>\n" +
                "  <p>Tema 3 , 4 y 5  </p>\n" +
                "  <p><a href=http://localhost:8080/bootcampers>Enlace a bootcampers </a> </p>\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";
        return pagina_inicial;
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }


    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }

    @PUT
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response modificarValorDeBootcamper(Bootcamper bootcamper) {
        if (bootcamperService.modificar(bootcamper.getNombre(), bootcamper.getValor()) != null) {
            return Response.ok(
                    URI.create("/bootcampers/" + bootcamper.getNombre())
            ).build();
        }

        return Response.notModified().build();

    }

}
