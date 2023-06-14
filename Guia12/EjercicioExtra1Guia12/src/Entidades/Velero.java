package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public class Velero extends Barco{
    private Integer NumeroMastiles;

    public Velero() {
    }

    public Velero(Integer NumeroMastiles, Integer Matricula, Integer MetrosEslora, Year AñoFabricacion) {
        super(Matricula, MetrosEslora, AñoFabricacion);
        this.NumeroMastiles = NumeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return NumeroMastiles;
    }

    public void setNumeroMastiles(Integer NumeroMastiles) {
        this.NumeroMastiles = NumeroMastiles;
    }

    public Velero CrearVelero(){
        int nm = (int)(Math.random()*6)+1;
        int m = (int)(Math.random()*5000)+1;
        int me = (int)(Math.random()*50)+1;
        Year af = Year.of((int)(Math.random()*23)+2000);
        
        return new Velero(nm, m, me, af);
    }
    
    @Override
    public String toString() {
        return "Velero{" + super.toString() + "NumeroMastiles=" + NumeroMastiles + '}';
    }
}
