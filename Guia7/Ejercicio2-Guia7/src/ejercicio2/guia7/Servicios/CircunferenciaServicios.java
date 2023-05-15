package ejercicio2.guia7.Servicios;

import ejercicio2.guia7.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class CircunferenciaServicios {
    
    Scanner sc = new Scanner(System.in);
    
    public Circunferencia crearCincurferencia() {
        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();
        
        return new Circunferencia(radio);
    }
    
    
    public double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
