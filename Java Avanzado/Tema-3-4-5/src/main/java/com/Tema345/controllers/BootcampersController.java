package com.Tema345.controllers;


import com.Tema345.services.BootcamperService;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;
    }
}
