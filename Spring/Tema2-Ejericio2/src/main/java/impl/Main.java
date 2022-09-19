package impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");

        UserService servicio= (UserService) context.getBean("userService");

        servicio.notificationService.imprimirSaludo();
    }
}
