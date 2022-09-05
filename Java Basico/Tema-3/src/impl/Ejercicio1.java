package impl;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.printf("" +
                "<>---------<> TEMA 3 <>---------<>\n" +
                "+-------------------------------+\n" +
                "|          Ejercicio 1          |\n"+
                "+-------------------------------+\n");
        String[] nombres = {"Alejandro", "Fernando", "Carlos", "Gustavo"};

        String textoConcat="", textoAnidado="";

        System.out.println("Contenido array nombres");
        for (String nombre:nombres) {
            System.out.println("Nombre: " + nombre);
            textoAnidado+=nombre+" ";
            textoConcat=textoConcat.concat(nombre+" ");
        }
        System.out.println("Linea concatenada: "+textoConcat);
        System.out.println("Linea anidado: "+textoAnidado);
    }
}
