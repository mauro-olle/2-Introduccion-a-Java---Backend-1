package ejercicioextra2.Servicios;

import ejercicioextra2.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class NIFServicios {
    NIF m = new NIF();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public long getDNI() {
        return m.DNI;
    }

    public void setDNI(long DNI) {
        m.DNI = DNI;
    }

    public String getLetra() {
        return m.letra;
    }

    public void setLetra(String letra) {
        m.letra = letra;
    }
    
    public NIF crearNIF(){
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.println("Ingrese su DNI");
        m.DNI = sc.nextLong();
        
        int resto = (int) (m.DNI % 23);
        
        m.letra = letras[resto];
        
        return m;
    }
    
    public void Mostrar(NIF m){
        
        System.out.println("NIF: " + m.DNI+"-"+m.letra);
    }
}
