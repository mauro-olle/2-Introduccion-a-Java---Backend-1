package Entidades;

import Interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Rectangulo implements CalculosFormas{
    private Double Base;
    private Double Altura;

    public Rectangulo() {
    }

    public Rectangulo(Double Base, Double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Double getBase() {
        return Base;
    }

    public void setBase(Double Base) {
        this.Base = Base;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double Altura) {
        this.Altura = Altura;
    }

    public Rectangulo CrearRectangulo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la base del rectangulo");
        double base = sc.nextDouble();
        
        System.out.println("Ingrese la altura");
        double altura = sc.nextDouble();
        
        return new Rectangulo(base, altura);
    }
    
    @Override
    public Double CalcularArea() {
        return Base * Altura;
    }

    @Override
    public Double CalcularPerimetro() {
        return 2 * (Base + Altura);
    }
    
    
}
