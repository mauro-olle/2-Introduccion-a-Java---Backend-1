package ejercicio2guia11.Servicios;

import ejercicio2guia11.Entidades.Juego;
import ejercicio2guia11.Entidades.Jugador;
import ejercicio2guia11.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class JuegoServicio {
    public Juego LlenarJuego(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> al = new ArrayList<>();
        RevolverServicio rs = new RevolverServicio();
        
        Revolver revolver = rs.LlenarRevolver();
        
        
        System.out.println("Ingrese la cantidad de jugadores");
        int j = sc.nextInt();
        
        for (int i = 1; i <= j; i++) {
            al.add(new Jugador(i));
        }
        
        return new Juego(revolver,al);
    }
    
    public void Ronda(Juego j) throws InterruptedException{
        JugadorServicio js = new JugadorServicio();
        int i = 0;
        int cantJug = j.getJugadores().size();
        do {
            System.out.println("Ronda:   " + i);
            System.out.println("Jugador: " + j.getJugadores().get(i%cantJug).getNombre());
            js.Disparo(j.getRevolver(), j.getJugadores().get(i%cantJug));
            if (j.getJugadores().get(i%cantJug).getMojado()) {
                break;
            }
            i++;
            Thread.sleep(1000);
        } while (true);
        
    }
}
