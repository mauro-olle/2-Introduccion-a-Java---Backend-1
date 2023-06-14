package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
class Barco {
    protected Integer Matricula;
    protected Integer MetrosEslora;
    protected Year AñoFabricacion;

    public Barco() {
    }

    public Barco(Integer Matricula, Integer MetrosEslora, Year AñoFabricacion) {
        this.Matricula = Matricula;
        this.MetrosEslora = MetrosEslora;
        this.AñoFabricacion = AñoFabricacion;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public void setMatricula(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public Integer getMetrosEslora() {
        return MetrosEslora;
    }

    public void setMetrosEslora(Integer MetrosEslora) {
        this.MetrosEslora = MetrosEslora;
    }

    public Year getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(Year AñoFabricacion) {
        this.AñoFabricacion = AñoFabricacion;
    }

    @Override
    public String toString() {
        return "Matricula=" + Matricula + ", MetrosEslora=" + MetrosEslora + ", A\u00f1oFabricacion=" + AñoFabricacion + ", ";
    }
    
    
}
