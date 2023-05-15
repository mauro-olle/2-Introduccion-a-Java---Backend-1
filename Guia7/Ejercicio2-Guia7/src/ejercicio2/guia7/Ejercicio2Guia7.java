/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package ejercicio2.guia7;

import ejercicio2.guia7.Entidades.Circunferencia;
import ejercicio2.guia7.Servicios.CircunferenciaServicios;

/**
 *
 * @author mauro
 */
public class Ejercicio2Guia7 {

    public static void main(String[] args) {
        
        CircunferenciaServicios sc = new CircunferenciaServicios();
        
        Circunferencia circulo1 = sc.crearCincurferencia();
        
        System.out.println("El area es: " + sc.area(circulo1.getRadio()));
        System.out.println("El perimetro es: " + sc.perimetro(circulo1.getRadio()));
        
    }
    
}
