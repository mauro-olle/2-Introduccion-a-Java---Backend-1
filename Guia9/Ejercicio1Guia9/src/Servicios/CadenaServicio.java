package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class CadenaServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void ContarVocales(Cadena c){
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }
        System.out.println(c.getFrase() + " contiene " + cont + " vocales.");
    }
    
    public void InvertirFrase(Cadena c){
        for (int i = c.getLongitud()-1; i >= 0; i--) {
            System.out.print(c.getFrase().charAt(i));
        }
        System.out.println();
    }
    
    public void VecesRepetido(Cadena c){
        System.out.println("Ingrese el caracter a buscar");
        char letra = sc.next().toLowerCase().charAt(0);
        
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().toLowerCase().charAt(i) == letra) {
                cont++;
            }
        }
        
        System.out.println("La letra " + letra + " aparece " + cont + " vez/veces.");
    }
    
    public void CompararLongitud(Cadena c){
        System.out.println("Ingrese una frase para comparar su longitud");
        String frase = sc.next();
        
        if (frase.length() > c.getLongitud()) {
            System.out.println("La frase ingresada es mas larga");
        } else if (frase.length() < c.getLongitud()) {
            System.out.println("La frase ingresada es mas corta");
        } else {
            System.out.println("La dos frases tienen la misma longitud");
        }
    }
    
    public void UnirFrases(Cadena c){
        System.out.println("Ingrese una frase");
        String fraseCompleta = c.getFrase() + ". " + sc.next();
        
        System.out.println(fraseCompleta);
    }
    
    public void Reemplazar(Cadena c){
        System.out.println("Ingrse el caracter con el cual reemplazara la vocal a");
        String letra = sc.next().toLowerCase();
        
        String aux = "";
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == 'a') {
                aux = aux + letra;
            } else {
                aux = aux + c.getFrase().charAt(i);
            }
        }
        System.out.println(aux);
    }
    
    public boolean Contiene(Cadena c){
        System.out.println("Ingrese la letra que desea saber si se encuentra en la frase");
        char letra = sc.next().charAt(0);
        boolean bandera = false;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == letra) {
                bandera = true;
            }
        }
        
        return bandera;
    }
}
