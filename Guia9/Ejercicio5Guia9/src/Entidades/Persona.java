package Entidades;

import java.util.Date;

/**
 *
 * @author mauro
 */
public class Persona {
    private String Nombre;
    private Date FechaDeNaciemiento;

    public Persona() {
    }

    public Persona(String Nombre, Date FechaDeNaciemiento) {
        this.Nombre = Nombre;
        this.FechaDeNaciemiento = FechaDeNaciemiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaDeNaciemiento() {
        return FechaDeNaciemiento;
    }

    public void setFechaDeNaciemiento(Date FechaDeNaciemiento) {
        this.FechaDeNaciemiento = FechaDeNaciemiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", FechaDeNaciemiento=" + FechaDeNaciemiento + '}';
    }
    
}
