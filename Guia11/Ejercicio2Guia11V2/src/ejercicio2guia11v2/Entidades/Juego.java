package ejercicio2guia11v2.Entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mauro
 */
public class Juego {
    private ArrayList<Jugador> Jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, Revolver revolver) {
        this.Jugadores = Jugadores;
        this.revolver = revolver;
    }
    
    public void LlenarJuego(){
        Jugadores = new ArrayList<>();
        revolver = new Revolver();
      /*  Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("¿Cuantas personas jugaran?");
        int cantJug = sc.nextInt();
        
        if (cantJug > 6) {
            cantJug = 6;
        }
        
        for (int i = 1; i <= cantJug; i++) {
            Jugadores.add(new Jugador(i));
        } 
        */
      
        Jugadores.add(new Jugador("Mauro"));
        Jugadores.add(new Jugador("Mayra"));
        Jugadores.add(new Jugador("Ely"));
        
        revolver.LlenarRevolver();
    }
    
    public void Jugar() throws InterruptedException {
        LlenarJuego();

        int cont = 1;

        do {
            System.out.println("Ronda "+ cont);
            
            Iterator<Jugador> iterator = Jugadores.iterator();
            while (iterator.hasNext()) {
                Jugador j = iterator.next();
                System.out.println(j.getNombre());
             //   Thread.sleep(500);
                if (j.Disparo(revolver)) {
                    iterator.remove();
                    revolver.setPosicionActual((int) ((Math.random() * 10) + 1));
                }
            //    Thread.sleep(1500);
            }
            
            cont++;
        } while (Jugadores.size() != 1);

        System.out.println("Sobreviviente " + Jugadores.get(0).getNombre());
        
    }
}
