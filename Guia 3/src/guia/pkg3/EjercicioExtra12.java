/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package guia.pkg3;

/**
 *
 * @author mauro
 */
public class EjercicioExtra12 {
    public static void main(String[] args) {
        
        String p,s,t;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    
                    if (i == 3) p = "E";
                    else p = String.valueOf(i);
                    
                    if (j == 3) s = "E";
                    else s = String.valueOf(j);
                    
                    if (k == 3) t = "E";
                    else t = String.valueOf(k);
                    
                    System.out.printf("%S - %S - %S",p,s,t);
                    System.out.println("");
                }
            }
        }
        
        
        
    }
}
