package impl.Tema101112;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tema101112Application {

	public static void main(String[] args) {
		SpringApplication.run(Tema101112Application.class, args);

		System.out.print("""
                <>-------<> TEMA 10-11-12 <>------<>
                +-------------------------------+
                |  Ejercicios 1-2-3 Spring      |
                +-------------------------------+
                """);
	}

}
