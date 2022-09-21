package impl.Tema789.controller;

import impl.Tema789.models.Laptop;
import impl.Tema789.repository.LaptopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * Se encarga de las operaciones CRUD para LaptopRepository
 */
@RestController
public class LaptopController {
    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    private LaptopRepository repositorioPortatiles;

    public LaptopController(LaptopRepository repositorioPortatiles) {
        this.repositorioPortatiles = repositorioPortatiles;
    }

    /**
     * Devuelve la lista de los portatiles
     * @return List
     */
    @GetMapping("/api/laptops")
    public ResponseEntity<List<Laptop>> findAll(){
        //List<Laptop> Retorno antiguo
        log.info("REST Request for get all laptops");
        //return repositorioPortatiles.findAll();

        Optional<List<Laptop>> listaPortatilesOpt = Optional.of(repositorioPortatiles.findAll());

        return ResponseEntity.ok(listaPortatilesOpt.get());
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
        log.info("REST Request for get by id laptop");
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
     * Metodo que añade Portati mediante un request POST a api/laptops.
     * Los objetos portatil deben tener todos los campos menos el id que es autogenerado
     * @param portatil Portatil nuevo
     */
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop portatil){
        log.info("REST Request for create laptop");
        //return repositorioPortatiles.save(portatil);

        Laptop portatilModificado=null;

        return ResponseEntity.ok(portatilModificado);
    }

    /**
     * Metodo para actualizar un portatil mediante request PUT
     * @param portatil Portatil actualizado
     */
    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop portatil){
        log.info("REST Request for put laptop");
        Laptop portatilModificado=null;

        return ResponseEntity.ok(portatilModificado);
    }

    /**
     * Metodo para eliminar un portatil mendiante request DELETE
     * @param id Long del Portatil que se borra
     */
    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        log.info("REST Request for delete by id laptop");
        return ResponseEntity.noContent().build();
    }

    /**
     * Metodo que elimina todos los portatiles mediante una request
     */
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST Request for delete all laptops");
        return ResponseEntity.noContent().build();
    }
}
