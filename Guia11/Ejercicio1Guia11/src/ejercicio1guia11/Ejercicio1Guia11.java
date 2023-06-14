package ejercicio1guia11;

import ejercicio1guia11.Entidades.Perro;
import ejercicio1guia11.Entidades.Persona;

/**
 *
 * @author mauro
 */
public class Ejercicio1Guia11 {

    public static void main(String[] args) {
        Perro P1 = new Perro("Africa","Mestiza",7,"Pequeño");
        Perro P2 = new Perro("Lolo","Pseudocaniche",3,"Pequeño");
        
        Persona p1 = new Persona("Mauro","Olle","37103072",P1);
        Persona p2 = new Persona("Mauro","Duarte","000000000",P2);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
