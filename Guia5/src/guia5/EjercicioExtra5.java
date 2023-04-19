/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int acumulador = 0;
        
        System.out.println("Ingrese la cantidad de filas");
        int m = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas");
        int n = sc.nextInt();
        
        int matriz[][] = new int [m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
                acumulador += matriz[i][j];
            }
        }
        System.out.println("La suma de sus elementos es: " + acumulador);
    }
}
