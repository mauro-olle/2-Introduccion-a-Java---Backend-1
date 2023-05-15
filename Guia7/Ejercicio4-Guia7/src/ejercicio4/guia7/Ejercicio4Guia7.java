/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo 
y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4.guia7;

import ejercicio4.guia7.Entidades.Rectangulo;

/**
 *
 * @author mauro
 */
public class Ejercicio4Guia7 {

    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(5,7);
        
        System.out.println("Superficie: " + rect1.Superficie());
        
        System.out.println("Perimetro: " + rect1.Perimetro());
        
        rect1.DibujarRectangulo();
    }
}
