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
        //return repositorioPortatiles.findAll();
        log.info("REST Request for get all laptops");
        //Si el repositorio portatiles tiene al menos 1 lo devuelve sino esta vacio
        if(repositorioPortatiles.count() >= 1){
            Optional<List<Laptop>> listaPortatilesOpt = Optional.of(repositorioPortatiles.findAll());

            return ResponseEntity.ok(listaPortatilesOpt.get());
        }else{
            log.warn("Trying to show a non existent list laptops");
            return ResponseEntity.notFound().build();
        }

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
        else {
            log.warn("Trying to show a non existent laptop");
            return ResponseEntity.notFound().build();
        }
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

        if(portatil.getId() != null){ // ese id ya existe
            log.warn("Trying to create a book with id, laptop not valid");
            return ResponseEntity.badRequest().build();
        }
        Laptop portatilModificado=repositorioPortatiles.save(portatil);

        return ResponseEntity.ok(portatilModificado);
    }

    /**
     * Metodo para actualizar un portatil mediante request PUT
     * @param portatil Portatil actualizado
     */
    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop portatil){
        log.info("REST Request for put laptop");

        if(portatil.getId() == null ){ //el id no puede ser nulo, para actualizar
            log.warn("Trying to update a non existent laptop");
            return ResponseEntity.badRequest().build();
        }
        if(!repositorioPortatiles.existsById(portatil.getId())){ //el id no esta en el repositorioPortatiles
            log.warn("Trying to update a non existent laptop");
            return ResponseEntity.notFound().build();
        }

        Laptop portatilModificado=repositorioPortatiles.save(portatil);

        return ResponseEntity.ok(portatilModificado);
    }

    /**
     * Metodo para eliminar un portatil mendiante request DELETE
     * @param id Long del Portatil que se borra
     */
    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        log.info("REST Request for delete by id laptop");

        if(!repositorioPortatiles.existsById(id)){
            log.warn("Trying to delete a non existent laptop");
            return ResponseEntity.notFound().build();
        }

        repositorioPortatiles.deleteById(id);


        return ResponseEntity.noContent().build();
    }

    /**
     * Metodo que elimina todos los portatiles mediante una request
     */
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST Request for delete all laptops");
        if(repositorioPortatiles.count() < 1){
            log.warn("Trying to delete empty repository");
            return ResponseEntity.notFound().build();
        }
        repositorioPortatiles.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
