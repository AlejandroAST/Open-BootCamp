public class Main {
    public static void main(String[] args) {
        int resultado=0;//Recoger el valor devuelto de la funcion suma
        System.out.println("*********************************\n" +
                "Primera Parte:\n" +
                "Sumar 3 numeros en la funcion suma\n" +
                "Valores que se pasan por parametos 1, 2, 3");
        resultado=suma(1,2,3);//Resultado esperado 6
        System.out.println("Resultado de la suma: "+resultado+"\n" +
                "*********************************\n" );
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}