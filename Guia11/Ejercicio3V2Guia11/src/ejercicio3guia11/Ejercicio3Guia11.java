package ejercicio3guia11;

import ejercicio3guia11.Entidades.Baraja;
import ejercicio3guia11.Entidades.Carta;
import ejercicio3guia11.Entidades.Jugador;

/**
 *
 * @author mauro
 */
public class Ejercicio3Guia11 {

    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Baraja b = new Baraja();
        int x = 0, y = 0, z = 0;

        b.MezclarCartas();

        ///REPARTIR///
        j1.setMano(b.RepartirCartas(7));
        j2.setMano(b.RepartirCartas(7));

        System.out.println("Cartas Jugador 1");
        for (Carta obj : j1.getMano()) {
            System.out.println(obj);
        }

        System.out.println("\n\nCartas Jugador 2");
        for (Carta obj : j2.getMano()) {
            System.out.println(obj);
        }

        System.out.println("\n\n\n\n");

        do {
            if (!b.getBaraja().isEmpty()) {
                j1.Robar(b);
                j2.Robar(b);
            }
            int carta1 = j1.Tirar().getNumero();
            int carta2 = j2.Tirar().getNumero();

            if (carta1 > carta2) {
                x += z + 1;
                z = 0;
                System.out.println("Gano jugador 1, tiene " + x + " puntos");
            } else if (carta1 < carta2) {
                y += z + 1;
                z = 0;
                System.out.println("Gano jugador 2, tiene " + y + " puntos");
            } else {
                System.out.println("Empate, el punto ira para el que gane la proxima ronda");
                z++;
            }
            System.out.println("\n\n");
        } while (!j1.getMano().isEmpty());

        System.out.println("El jugador 1 gano " + x + " veces");
        System.out.println("El jugador 2 gano " + y + " veces");
    }

}
