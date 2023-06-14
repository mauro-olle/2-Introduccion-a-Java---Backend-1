package ejercicio2guia12;

import Entidades.Electrodomestico;
import Entidades.Lavarropas;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauro
 */
public class Ejercicio2Guia12 {

    public static void main(String[] args) {
        Lavarropas lav = new Lavarropas();
        Televisor tel = new Televisor();
        List<Electrodomestico> el = new ArrayList();
        
        double acumulador = 0d;
        
        for (int i = 0; i < 2; i++) {
            el.add(lav.CrearLavarropas());
            el.add(tel.CrearTelevisor());
        }
        
        for (Electrodomestico aux : el) {
            if (aux instanceof Lavarropas) {
                Lavarropas l = (Lavarropas) aux;
                
                l.PrecioFinal();
                System.out.println(l);
                acumulador += l.getPrecio();
                
            } else if (aux instanceof Televisor) {
                Televisor t = (Televisor) aux;
                
                t.PrecioFinal();
                System.out.println(t);
                acumulador += t.getPrecio();
            }
        }
        System.out.println("La suma de total de los electrodomesticos es: $" + acumulador);
    }
    
}
