/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

 */
package ejercicio4guia12;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author mauro
 */
public class Ejercicio4Guia12 {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        
        Circulo c1 = c.CrearCirculo();
        System.out.println("El perimetro del circulo es " + c1.CalcularPerimetro());
        System.out.println("El area del circulo es " + c1.CalcularArea());
        
        System.out.println("\n\n\n");
        
        Rectangulo r1 = r.CrearRectangulo();
        System.out.println("El perimetro del rectangulo es " + r1.CalcularPerimetro());
        System.out.println("El area del rectangulo es " + r1.CalcularArea());
    }
    
}
