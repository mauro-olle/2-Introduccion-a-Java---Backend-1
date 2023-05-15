/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package ejercicioextra6.guia7;

import ejercicioextra6.guia7.Entidades.Rectangulo;

/**
 *
 * @author mauro
 */
public class EjercicioExtra6Guia7 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        
        rectangulo1.CalcularArea();
    }
    
}
