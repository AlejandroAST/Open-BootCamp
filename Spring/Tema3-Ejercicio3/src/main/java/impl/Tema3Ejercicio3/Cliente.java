package impl.Tema3Ejercicio3;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;//clave primaria
    private String nombre;
    private String correo;
    private int numero_tarjeta;


    public Cliente() {
    }

    public Cliente(Long id, String nombre, String correo, int numero_tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.numero_tarjeta = numero_tarjeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", numero_tarjeta=" + numero_tarjeta +
                '}';
    }
}
