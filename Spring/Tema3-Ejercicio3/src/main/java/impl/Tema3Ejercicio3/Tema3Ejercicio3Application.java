package impl.Tema3Ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.List;

@SpringBootApplication
public class Tema3Ejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Tema3Ejercicio3Application.class, args);

		ClienteRepository repositorioClientes = context.getBean(ClienteRepository.class);

		//Clientes
		Cliente cliente1 = new Cliente(null, "Alejandro", "alejandro@correo.com", 554433);
		Cliente cliente2 = new Cliente(null, "Fernando", "fernando@correo.com", 443355);
		Cliente cliente3 = new Cliente(null, "Maria", "maria@correo.com", 667799);

		//Meter datos en el repositorioClientes

		repositorioClientes.save(cliente1);
		repositorioClientes.save(cliente2);
		repositorioClientes.save(cliente3);

		//Salida por pantalla
		System.out.print("""
                <>-------<> TEMA 1-2-3 <>------<>
                +-------------------------------+
                |      Ejercicio 3 Spring       |
                +-------------------------------+
                """);

		System.out.println("Numero de clientes almacenados: "+ repositorioClientes.count());
		List<Cliente> lista=repositorioClientes.findAll();
		for(Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}

		System.out.println("__________________________________________________________");
	}

}
