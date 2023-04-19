/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        
        int vector1 [] = new int [n];
        int vector2 [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 4);
            vector2[i] = (int) (Math.random() * 4);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("El elemento " + i + " no coincide");
                break;
            } else if (i == n-1) {
                System.out.println("Los vectores son iguales");
            }
        }
    }
}
