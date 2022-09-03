package impl;

public class Tipos {
    //Enteros
    byte tipoByte=0;
    short tipoShort=0;
    int tipoInt=10;
    long tipoLong=20;

    //Punto flotante
    float tipoFloat = 4.9f;
    double tipoDouble = 9.99d;

    //Caracter
    char tipoChar='X';

    //Boolean
    boolean tipoBooleanTrue=true;
    boolean tipoBooleanFalse=false;

    //Cadenas de texto
    String tipoStringNombre="Alejandro";

    Integer tipoInteger=5;
    Long tipoLongL=2L;

    @Override
    public String toString() {
        return "Tipos{" +
                "tipoByte=" + tipoByte +
                ", tipoShort=" + tipoShort +
                ", tipoInt=" + tipoInt +
                ", tipoLong=" + tipoLong +
                ", tipoFloat=" + tipoFloat +
                ", tipoDouble=" + tipoDouble +
                ", tipoChar=" + tipoChar +
                ", tipoBooleanTrue=" + tipoBooleanTrue +
                ", tipoBooleanFalse=" + tipoBooleanFalse +
                ", tipoStringNombre='" + tipoStringNombre + '\'' +
                ", tipoInteger=" + tipoInteger +
                ", tipoLongL=" + tipoLongL +
                '}';
    }
}
