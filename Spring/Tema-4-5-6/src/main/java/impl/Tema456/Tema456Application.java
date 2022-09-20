package impl.Tema456;

import impl.Tema456.Ejercicio2_3.models.Laptop;
import impl.Tema456.Ejercicio2_3.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Tema456Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Tema456Application.class, args);

		System.out.print("""
                <>-------<> TEMA 1-2-3 <>------<>
                +-------------------------------+
                |      Ejercicio 3 Spring       |
                +-------------------------------+
                """);

		//Creamos el repositorio
		LaptopRepository repositorioOrdenadores = context.getBean(LaptopRepository.class);

		//Creamos laptops
		Laptop pc1=new Laptop(null, "HP-OMEN", "Hewlett-Packard", 1200);
		Laptop pc2=new Laptop(null, "ALINWARE-N1", "IBM", 2000);
		Laptop pc3=new Laptop(null, "MSI-GF6", "Micro-Star International", 1500);

		//Guardar laptops

		repositorioOrdenadores.save(pc1);
		repositorioOrdenadores.save(pc2);
		repositorioOrdenadores.save(pc3);

		System.out.println("Numero de ordenadores almacenados: "+ repositorioOrdenadores.count());
		List<Laptop> lista=repositorioOrdenadores.findAll();
		for(Laptop cliente : lista) {
			System.out.println(cliente.toString());
		}

		System.out.println("__________________________________________________________");
	}

}
