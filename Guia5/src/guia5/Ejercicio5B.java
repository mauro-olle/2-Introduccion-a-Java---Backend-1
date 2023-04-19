/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        
        LlenarMatriz(matrizA,3);
        LlenarMatriz(matrizB,3);
       
        
        if (Verificacion(matrizA,matrizB,3) == true) System.out.println("Es una matriz antisimetrica");
        else System.out.println("No es una matriz antisimetrica");
    }
    
    public static void LlenarMatriz(int matriz[][], int tamaño) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.printf("Ingrese el elemento [%d][%d]",i,j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    public static boolean Verificacion(int matriz1[][], int matriz2[][], int tamaño) {
        boolean bandera = true;
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matriz1[i][j] != -matriz2[i][j]) {
                    bandera = false;
                    break;
                }
            }
        }
        return bandera;
    }
}
