package impl.Tema456.Ejercicio2.repository;

import impl.Tema456.Ejercicio2.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
