package impl;

import impl.device.*;

public class Ejercicio1_Main {
    public static void main(String[] args) {
        System.out.printf("" +
                "<>---------<> TEMA 4 <>---------<>\n" +
                "+-------------------------------+\n" +
                "|          Ejercicio 1          |\n"+
                "+-------------------------------+\n");

        //1-Crear dos dispositivo inteligente
        SmartDevice telefonoInteligente;
        SmartDevice relojInteligente;

        System.out.println("Instanciamos el telefono Inteligente");
        telefonoInteligente=new SmartPhone(1, "Movil Inteligente", 666448855);
        System.out.println("Mostrar el toString del padre y el hijo");
        System.out.println(telefonoInteligente.toString());

        System.out.println("------------------------------------" +
                "\nInstanciamos el reloj Inteligente");
        relojInteligente=new SmartWatch(1, "Reloj inteligente", 10,25);
        System.out.println("Mostrar el toString del padre y el hijo");
        System.out.println(relojInteligente.toString());


    }
}
