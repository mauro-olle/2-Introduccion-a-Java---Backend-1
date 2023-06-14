package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public final class PersonalServicio extends Empleado{
    private String Seccion; //(biblioteca, secretaria, decanato)

    public PersonalServicio() {
    }

    public PersonalServicio(String Seccion, Year AñoDeIncorporacion, Integer NumeroDespacho, String Nombre, String Apellido, Integer Identificacion, String EstadoCivil) {
        super(AñoDeIncorporacion, NumeroDespacho, Nombre, Apellido, Identificacion, EstadoCivil);
        this.Seccion = Seccion;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    public void trasladoDeSeccion(String seccion){
        this.Seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio" + super.toString() + "\nSeccion: " + Seccion;
    }
    
    
}
