package ejercicio1guia12;

import Entidades.Animal;
import Entidades.Perro;

/**
 *
 * @author mauro
 */
public class Ejercicio1Guia12 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carnivoro",15,"Doberman");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        
        Animal gato1 = new Perro("Pelusa","Galletas",15,"Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Perro("Spark","Pasto",25,"Fino");
        caballo1.Alimentarse();
    }
}
