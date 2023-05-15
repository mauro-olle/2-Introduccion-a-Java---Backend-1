package ejercicioextra3.guia7.Entidades;

import java.util.Scanner;



/**
 *
 * @author mauro
 */
public class Juego {
    private int numero;
    
    public Juego(){
        
    }
    
    public void iniciarJuego(){
        System.out.println("");
    }
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void IngresarNumero(){
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
    }
    
    public void AdivinarNumero(){
        for (int i = 5; i > 0; i--) {
            System.out.println("Ingrese un numero para intentar adivinar el anterior");
            int numeroAd = sc.nextInt();
        
            if (numeroAd == numero) {
                System.out.println("Correcto. Felicitaciones");
                break;
            } else if (numeroAd > numero) System.out.printf("Incorrecto. El numero es menor a %d. Te quedan %d intentos\n",numeroAd,i);
              else System.out.printf("Incorrecto. El numero es mayor a %d. Le quedan %d intentos\n",numeroAd,(i-1));
            
            if(i==1) System.out.println("LOOSER");
        }
    }
}
