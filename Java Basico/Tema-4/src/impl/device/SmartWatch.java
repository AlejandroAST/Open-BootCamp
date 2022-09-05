package impl.device;

public class SmartWatch extends SmartDevice{
    private int hora=0;
    private int minutos=0;

    public SmartWatch(){
        super();
    }

    /**
     * Constructor con parametros
     * @param ID Identificador del dispositivo
     * @param nombre Nombre del dispositivo
     * @param hora Hora que marca el reloj Inteligente
     * @param minutos Minutos que marca el reloj Inteligente
     */
    public SmartWatch(int ID, String nombre, int hora, int minutos) {
        super(ID, nombre);
        this.hora = hora;
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSmartWatch{" +
                "Hora que marca el reloj Inteligente=" + hora +
                ":" + minutos +
                '}';
    }
}
