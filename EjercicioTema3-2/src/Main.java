public class Main {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        System.out.println("*********************************\n" +
                "Segunda Parte:\n" +
                "Implementar clase coche, con una variable que almacene el numero de puertas\n" +
                "Funcion que incremente puertas\n" +
                "Crea objeto miCoche, añadir puerta y mostrar numero de puertas" );
        System.out.println("Numero de puertas actuales: "+miCoche.numero_puertas+
                "\nIncrementar numero puertas en 1");
        miCoche.incrementarPuertas();
        System.out.println("Numero de puertas actuales: "+miCoche.numero_puertas+
                "\n*********************************\n");

    }
}

class Coche{
    public int numero_puertas=3;//Inicialmente tiene 3

    /**
     * Función que incrementa en 1 el numero de puertas
     */
    public void incrementarPuertas(){
        this.numero_puertas++;
    }
}