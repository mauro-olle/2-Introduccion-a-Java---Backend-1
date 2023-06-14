package Entidades;

/**
 *
 * @author mauro
 */
public abstract class Edificio {
    protected Double Ancho;
    protected Double Alto;
    protected Double Largo;

    public Edificio() {
    }

    public Edificio(Double Ancho, Double Largo) {
        this.Ancho = Ancho;
        this.Largo = Largo;
    }

    public Edificio(Double Ancho, Double Alto, Double Largo) {
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Largo = Largo;
    }

    public Double getAncho() {
        return Ancho;
    }

    public void setAncho(Double Ancho) {
        this.Ancho = Ancho;
    }

    public Double getAlto() {
        return Alto;
    }

    public void setAlto(Double Alto) {
        this.Alto = Alto;
    }

    public Double getLargo() {
        return Largo;
    }

    public void setLargo(Double Largo) {
        this.Largo = Largo;
    }
    
    
    protected abstract double calcularSuperficie();
    
    protected abstract double calcularVolumen();

    @Override
    public String toString() {
        return "\nAncho: " + String.format("%.2f", Ancho) + "m \nAlto: " + String.format("%.2f", Alto) + "m \nLargo: " + String.format("%.2f", Largo) + "m";
    }
    
    
}
