/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int MAX = leer.nextInt();
        
        int suma = 0;
        do {            
            System.out.println("Ingrese un numero");
             
            suma += leer.nextInt();
            
            System.out.println("La suma es " + suma);
        } while (suma < MAX);
        
        System.out.println("Usted supero el maximo");
    }
}
