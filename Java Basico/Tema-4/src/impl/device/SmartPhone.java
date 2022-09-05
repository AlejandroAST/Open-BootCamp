package impl.device;

public class SmartPhone extends SmartDevice{
    private int numero = 0;

    public SmartPhone() {
        super();
    }

    /**
     * Constructor con parametros
     * @param ID Identificador del dispositivo
     * @param nombre Nombre del dispositivo
     * @param numero Numero de telefono asociado al dispositivo
     */
    public SmartPhone(int ID, String nombre, int numero) {
        super(ID, nombre);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return super.toString() + "\nSmartPhone{" +
                "numero Telefono=" + numero +
                '}';
    }
}
