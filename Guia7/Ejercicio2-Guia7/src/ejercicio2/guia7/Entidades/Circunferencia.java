package ejercicio2.guia7.Entidades;


/**
 *
 * @author mauro
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia(){
        
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
