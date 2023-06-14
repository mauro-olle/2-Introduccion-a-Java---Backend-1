package ejercicioextra2guia12;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class EjercicioExtra2Guia12 {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        Polideportivo p = new Polideportivo();
        EdificioDeOficinas eo = new EdificioDeOficinas();

        for (int i = 0; i < 10; i++) {
            edificios.add(p.crearPolideportivo());
            edificios.add(eo.crearEdificio());
        }

        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                Polideportivo pol = (Polideportivo) edificio;

                System.out.println(pol);
                System.out.println("Superficie: " + String.format("%.2f", pol.calcularSuperficie()) + "m2\n\n");
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edof = (EdificioDeOficinas) edificio;

                System.out.println(edof);
                edof.cantPersonas(edof);
                System.out.println("Superficie: " + String.format("%.2f", edof.calcularSuperficie()) + "m2");
                System.out.println("Volumen: " + String.format("%.2f", edof.calcularVolumen()) + "m3\n\n");
            }
        }
    }

}
