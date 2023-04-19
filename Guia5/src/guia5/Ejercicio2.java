/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        
        int vector [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random() * 11);
        }
        
        System.out.println("Ingrese el numero a buscar");
        int num = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) System.out.println("El numero se encuentra en la posicion " + i);
        }
    }
}
