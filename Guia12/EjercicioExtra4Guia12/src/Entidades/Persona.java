package Entidades;

/**
 *
 * @author mauro
 */
public class Persona {
    protected String Nombre;
    protected String Apellido;
    protected Integer Identificacion;
    protected String EstadoCivil;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, Integer Identificacion, String EstadoCivil) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Identificacion = Identificacion;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(Integer Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
    
    public void cambiarEstadoCivil(String estado){
        this.EstadoCivil = estado;
    }

    @Override
    public String toString() {
        return "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\nIdentificacion: " + Identificacion + "\nEstadoCivil: " + EstadoCivil;
    }
}
