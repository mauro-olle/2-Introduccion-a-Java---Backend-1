package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public final class Profesor extends Empleado {

    private String Departamento; //(Lenguajes, Arquitectura, Matematicas)

    public Profesor() {
    }

    public Profesor(String Departamento, Year AñoDeIncorporacion, Integer NumeroDespacho, String Nombre, String Apellido, Integer Identificacion, String EstadoCivil) {
        super(AñoDeIncorporacion, NumeroDespacho, Nombre, Apellido, Identificacion, EstadoCivil);
        this.Departamento = Departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public void cambiarDepartamento(String dep) {
        this.Departamento = dep;
    }

    @Override
    public String toString() {
        return "Profesor"+ super.toString() + "\nDepartamento: " + Departamento;
    }
}
