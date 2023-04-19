/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        
        int vector[] = new int [n];
        
        LlenarVector(vector,n);
        MostrarVector(vector, n);
    }
    
    public static void LlenarVector(int vector[], int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }
    
    public static void MostrarVector(int vector[], int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) System.out.print("[" + vector[i]);
            else if (i == tamaño - 1) System.out.print("," + vector[i] + "]");
            else System.out.print("," + vector[i]);
        }
        System.out.println("");
    }
}
