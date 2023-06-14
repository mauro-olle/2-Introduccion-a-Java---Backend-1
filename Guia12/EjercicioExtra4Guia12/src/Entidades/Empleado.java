package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public class Empleado extends Persona{
    protected Year AñoDeIncorporacion;
    protected Integer NumeroDespacho;

    public Empleado() {
    }

    public Empleado(Year AñoDeIncorporacion, Integer NumeroDespacho, String Nombre, String Apellido, Integer Identificacion, String EstadoCivil) {
        super(Nombre, Apellido, Identificacion, EstadoCivil);
        this.AñoDeIncorporacion = AñoDeIncorporacion;
        this.NumeroDespacho = NumeroDespacho;
    }

    public Year getAñoDeIncorporacion() {
        return AñoDeIncorporacion;
    }

    public void setAñoDeIncorporacion(Year AñoDeIncorporacion) {
        this.AñoDeIncorporacion = AñoDeIncorporacion;
    }

    public Integer getNumeroDespacho() {
        return NumeroDespacho;
    }

    public void setNumeroDespacho(Integer NumeroDespacho) {
        this.NumeroDespacho = NumeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAñoDeIncorporacion: " + AñoDeIncorporacion + "\nNumeroDespacho: " + NumeroDespacho;
    }
    
    
}
