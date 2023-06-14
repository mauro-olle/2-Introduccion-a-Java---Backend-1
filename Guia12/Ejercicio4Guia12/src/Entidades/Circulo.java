package Entidades;

import Interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Circulo implements CalculosFormas{
    private Double Radio;
    private Double Diametro;

    public Circulo() {
    }

    public Circulo(Double Radio, Double Diametro) {
        this.Radio = Radio;
        this.Diametro = Diametro;
    }

    public Double getRadio() {
        return Radio;
    }

    public void setRadio(Double Radio) {
        this.Radio = Radio;
    }

    public Double getDiametro() {
        return Diametro;
    }

    public void setDiametro(Double Diametro) {
        this.Diametro = Diametro;
    }
    
    public Circulo CrearCirculo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el radio del circulo");
        double r = sc.nextDouble();
        
        return new Circulo(r, (r*2));
    }
    
    @Override
    public Double CalcularArea() {
        return PI * Math.pow(Radio, 2);
    }

    @Override
    public Double CalcularPerimetro() {
        return PI * Diametro;
    }
    
}
