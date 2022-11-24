package impl.Tema101112;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String mensaje;

    @GetMapping("/holaMundo")
    public String holaMundo() {
        System.out.println(mensaje);
        return "Hola Mundo";
    }
}
