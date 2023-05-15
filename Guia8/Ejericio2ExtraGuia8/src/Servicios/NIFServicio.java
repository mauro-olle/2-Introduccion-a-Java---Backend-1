package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class NIFServicio {
    
    public NIF crearNIF(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su DNI");
        
        long DNI = sc.nextLong();
        String letra = AsignarLetra(DNI);
        
        return new NIF(DNI,letra);
    }
    
    public void MostrarNIF(NIF m){
        System.out.printf("Su NIF es: %08d-%S",m.getDNI(), m.getLetra());
    }
    
    
    public String AsignarLetra(double m){
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int posicion = (int) (m % 23);
        return letras[posicion];
    }
}
