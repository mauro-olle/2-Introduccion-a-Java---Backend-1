package ejercicio3guia11.Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mauro
 */
public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList();;
    private ArrayList<Carta> cartasDescartadas;
    
    public Baraja(){

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                String palo = "";
                switch (j) {
                    case 0:
                        palo = "Basto";
                        break;
                    case 1:
                        palo = "Oro";
                        break;
                    case 2:
                        palo = "Espada";
                        break;
                    case 3:
                        palo = "Copa";
                        break;
                }
                baraja.add(new Carta(i+1,palo));
            }
        }
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
    
    public void MezclarCartas(){
        Collections.shuffle(baraja);
    }
    
    public ArrayList<Carta> RepartirCartas(int cantidad){
        ArrayList<Carta> mano = new ArrayList();
        
        for (int i = 0; i < cantidad; i++) {
            mano.add(baraja.get(0));
            baraja.remove(0);
        }
        return mano;
    }
    
    public Carta SiguienteCarta(){
        Carta aux = baraja.get(0);
        baraja.remove(0);
        return aux;
    }
    
    public void CartasDescartadas(Carta c){
        cartasDescartadas = new ArrayList();
        cartasDescartadas.add(c);
    }
}
