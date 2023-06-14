package Entidades;

import java.time.Year;

/**
 *
 * @author mauro
 */
public class AMotor extends Barco{
    private Integer CV;

    public AMotor() {
    }

    public AMotor(Integer CV, Integer Matricula, Integer MetrosEslora, Year AñoFabricacion) {
        super(Matricula, MetrosEslora, AñoFabricacion);
        this.CV = CV;
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }

    public AMotor CrearBarcoAMotor(){
        int cv = (int)(Math.random()*1000)+1;
        int m = (int)(Math.random()*5000)+1;
        int me = (int)(Math.random()*50)+1;
        Year af = Year.of((int)(Math.random()*23)+2000);
        
        return new AMotor(cv, m, me, af);
    }
    
    @Override
    public String toString() {
        return "AMotor{" + super.toString() + "CV=" + CV + '}';
    }
    
    
}
