/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int acumulador = 0;
        
        System.out.println("¿Cuantos numeros desea ingresar?");
        int n = sc.nextInt();
        
        int vector [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el " + (i+1) + "° elemento");
            vector[i] = sc.nextInt();
            acumulador += vector[i];
        }
        System.out.println("La suma de todos los elementos es " + acumulador);
    }
    
}
