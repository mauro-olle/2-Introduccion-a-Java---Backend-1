package ejercicio3guia11.Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mauro
 */
public class Jugador {
    private ArrayList<Carta> mano;

    public Jugador() {
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }
    
    public void Robar(Baraja b){
        mano.add(b.SiguienteCarta());
    }
    
    public Carta Tirar(){
        Collections.sort(mano, Carta.ComparadorDeCartasPorNumero);
        int azar = (int) (Math.random() * mano.size());
        
        Carta aux = mano.get(azar);
        mano.remove(aux);
        System.out.println(aux);
        return aux;
    }
}
