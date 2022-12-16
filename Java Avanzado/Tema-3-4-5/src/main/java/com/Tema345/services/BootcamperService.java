package com.Tema345.services;


import com.Tema345.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private final List<Bootcamper> bootcampers= new ArrayList<Bootcamper>();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }

        return null;
    }

    public Bootcamper modificar(String nombre, double valor) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                bootcamper.setValor(valor);
                return bootcamper;
            }
        }

        return null;
    }

}
