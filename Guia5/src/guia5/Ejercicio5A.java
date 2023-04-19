/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrizA [][] = new int [3][3];
        int matrizB [][] = new int [3][3];
        boolean bandera = false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Ingrese el elemento [%d] [%d]",i,j);
                matrizA [i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB [i][j] = matrizA [j][i];
            }
        }
        
        MostrarMatriz (matrizA,3,3);
        MostrarMatriz (matrizB,3,3);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == -matrizB[i][j]) {
                    bandera = true;
                } else {
                    bandera = false;
                    break;
                }

            }
        }
        if (bandera = true) System.out.println("La matriz A es antisimetrica");
        else System.out.println("La matriz A no es antisimetrica");
    }
    
    public static void MostrarMatriz(int matriz[][],int n, int m) {
        System.out.println("Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
