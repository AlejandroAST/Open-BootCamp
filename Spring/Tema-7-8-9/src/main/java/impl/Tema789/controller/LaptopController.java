package impl.Tema789.controller;



import impl.Tema789.models.Laptop;
import impl.Tema789.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository repositorioPortatiles;

    public LaptopController(LaptopRepository repositorioPortatiles) {
        this.repositorioPortatiles = repositorioPortatiles;
    }

    /**
     * Devuelve la lista de los portatiles
     * @return List
     */
    @GetMapping("/api/laptops")
    public List<Laptop> devolverLaptops(){
        return repositorioPortatiles.findAll();
    }

    /**
     * Busca por el id del portatil
     * Request
     * Response
     * @param id Long
     * @return ResponseEntity
     */
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){

        Optional<Laptop> portatilOpt = repositorioPortatiles.findById(id);
        // opcion 1
        if(portatilOpt.isPresent())
            return ResponseEntity.ok(portatilOpt.get());
        else
            return ResponseEntity.notFound().build();

        // opcion 2
        //return portatilOpt.orElse(null);
        // return portatilOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * EJERCICIO 3
     * Metodo que añade Portati mediante un POST a api/laptops.
     * Los objetos portatil deben tener todos los campos menos el id que es autogenerado
     * @param portatil Portatil nuevo
     */
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop portatil){
        return repositorioPortatiles.save(portatil);
    }


}
