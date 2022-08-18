public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************\n" +
                "Tema 8 Ejercicio 1:\n" );
        Persona persona=new Persona();
        persona.setNombre("Alejandro");
        persona.setEdad(30);
        persona.setTelefono(985806094);
        System.out.println("Persona:\n" +
                "Nombre:"+persona.getNombre()+
                "\nEdad:"+persona.getEdad()+
                "\nTelefono:"+persona.getTelefono());
    }

}
class Persona{
    private int edad, telefono;
    private String nombre;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}