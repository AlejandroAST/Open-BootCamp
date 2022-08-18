public class Main {
    public static void main(String[] args) {

        int numeroIf=0;//Inicialmente es 0
        int numeroWhile=0;//Inicialmente es 0
        var estacion="Verano";//Inicialmente verano

        System.out.println("******************************************\n" +
                "Ejercicios Tema 4\n" +
                "******************************************");
        System.out.println("Parte 1 Comprobar si numeroIf es positivo, negativo o 0");
        if(numeroIf>0){
            System.out.println("Es un número positivo valor contenido en la variable: "+numeroIf);
        }else if(numeroIf<0){
            System.out.println("Es un número negativo valor contenido en la variable: "+numeroIf);
        }else{
            System.out.println("El número es 0 o un valor inválido valor contenido en la variable: "+numeroIf);
        }
        System.out.println("******************************************\n" +
                "Parte 2 Bucle while ");
        while(numeroWhile<3){
            numeroWhile++;//incremento de 1
            System.out.println("numeroWhile="+numeroWhile);
        }
        numeroWhile=2;//Do while =2 para ejecucion una vez
        System.out.println("******************************************\n" +
                "Parte 3  Bucle do while \n" +
                "numeroWhile modificamos su contenido a 2 para que la condicion de " +
                "parada del while se ejecute despues del primer do\n" +
                "numeroWhile contenido="+numeroWhile);
        do{
            numeroWhile++;//incremento de 1
            System.out.println("Do while -> numeroWhile="+numeroWhile);
        }while(numeroWhile<3);
        System.out.println("******************************************\n" +
                "Parte 4 Bucle for ");
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("numeroFor="+numeroFor);
        }
        System.out.println("******************************************\n" +
                "Parte 5 Switch");
        switch (estacion){
            case "Invierno":
                System.out.println("1-Estación de invierno, valor de la variable:"+estacion);
                break;
            case "Privamera":
                System.out.println("2-Estación de primavera, valor de la variable:"+estacion);
                break;
            case "Verano":
                System.out.println("3-Estación de verano, valor de la variable:"+estacion);
                break;
            case "Otoño":
                System.out.println("4-Estación de otoño, valor de la variable:"+estacion);
                break;
            default:
                System.out.println("5-Caso por defecto, el contenido de la variable estación no coincide");
        }
    }
}