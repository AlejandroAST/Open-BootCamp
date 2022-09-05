package impl.device;

public abstract class SmartDevice {

    private int ID = 0;
    private String nombre = "";

    /**
     * Constructor sin parametros
     */
    public SmartDevice() {
    }

    /**
     * Constructor con parametros
     * @param ID Identificador del dispositivo
     * @param nombre Nombre del dispositivo
     */
    public SmartDevice(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "ID=" + ID +
                ", nombre=" + nombre +
                '}';
    }
}
