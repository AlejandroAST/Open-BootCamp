package impl.Tema789;

import impl.Tema789.models.Laptop;
import impl.Tema789.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Tema789Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Tema789Application.class, args);

		System.out.print("""
                <>-------<> TEMA 7-8-9 <>------<>
                +-------------------------------+
                |  Ejercicios 1-2-3 Spring      |
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
