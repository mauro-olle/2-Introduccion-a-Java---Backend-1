/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package ejercicioextra2.guia7;

import ejercicioextra2.guia7.Entidades.Puntos;

/**
 *
 * @author mauro
 */
public class EjercicioExtra2Guia7 {

    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        
        puntos.crearPuntos();
        
        System.out.printf("Distancia: %.3f \n",puntos.calcularDistancia());
    }
    
}
