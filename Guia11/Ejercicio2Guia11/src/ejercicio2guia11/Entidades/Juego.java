package ejercicio2guia11.Entidades;

import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class Juego {
    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }
}
