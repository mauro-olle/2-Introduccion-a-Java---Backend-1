package ejercicio1guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String DNI, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", perro=" + perro + '}';
    }
}
