package ejercicio3guia11.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author mauro
 */
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> descartadas;

    public void crearBaraja() {
        cartas = new ArrayList<>();
        String palo = "";

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    palo = "Basto";
                    break;
                case 1:
                    palo = "Espada";
                    break;
                case 2:
                    palo = "Oro";
                    break;
                case 3:
                    palo = "Copa";
                    break;
            }
            for (int j = 1; j <= 10; j++) {
                int numero = j;
                if (j > 7) {
                    numero += 2;
                }
                cartas.add(new Carta(numero, palo));
            }
        }
        
        for(Carta carta : cartas){
            System.out.println(carta);
        }
        
        System.out.println(cartas.size());
    }
    
    public void Barajar(){
        Collections.shuffle(cartas);
        
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }
    
    public void SiguienteCarta(){
        descartadas = new ArrayList();
        
        if (cartas.isEmpty()){
            System.out.println("No quedan mas cartas");
        } else {
            System.out.println(cartas.get(0));
            descartadas.add(cartas.get(0));
            cartas.remove(0);
        }
    }
    
    public void CartasDisponibles(){
        System.out.println("La cantidad de cartas disponibles es: " + cartas.size());
    }
    
    public void DarCartas(){
        ArrayList<Carta> jugada = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("¿Cuantas cartas desea repartir?");
        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++) {
            jugada.add(cartas.get(0));
            cartas.remove(0);
        }
        
        for(Carta carta : jugada){
            System.out.println(carta);
        }
    }

    public void CartasMonton() {
        if (descartadas.isEmpty()) {
            System.out.println("Aun no se tiro ninguna carta");
        } else {
            for (Carta obj : descartadas) {
                System.out.println(obj);
            }
        }
    }
    
    public void MostrarBaraja(){
        for (Carta obj : cartas) {
            System.out.println(obj);
        }
    }
}
