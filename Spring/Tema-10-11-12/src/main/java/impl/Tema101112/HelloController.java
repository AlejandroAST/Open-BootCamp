package impl.Tema101112;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/holaMundo")
    public String holaMundo() { return "Hola Mundo"; }
}
