/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = true;
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int m = sc.nextInt();
        
        int matriz [][] = new int [m][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Ingrese el elemento [%d][%d] \n",i,j);
                matriz [i][j] = sc.nextInt();
            }
        }
        
        int acumuladorGuia = SumarDiagonal(matriz,m);
        int acumuladorFila, acumuladorColumna;
        
        for (int i = 0; i < m; i++) {
            acumuladorFila = SumarFilas(matriz,i,m);
            acumuladorColumna = SumarColumnas(matriz,m,i);
            if (acumuladorFila != acumuladorGuia || acumuladorColumna != acumuladorGuia) {
                bandera = false;
                break;
            }
        }
        
        if (acumuladorGuia != SumarContradiagonal(matriz, m)) bandera = false;
            
        MostrarMatrizCuadrada(matriz,m);
        
        if (bandera == true) System.out.println("Es una matriz magica");
        else System.out.println("No es una matriz magica");
    }
    
    
    
    public static int SumarFilas(int matriz[][],int fila,int columna) {
        int acumulador = 0;
        
        for (int i = 0; i < columna; i++) {
            acumulador += matriz[fila][i];
        }
        return acumulador;
    }
    
    public static int SumarColumnas(int matriz[][],int fila,int columna) {
        int acumulador = 0;
        
        for (int i = 0; i < fila; i++) {
            acumulador += matriz[i][columna];
        }
        return acumulador;
    }
    
    public static int SumarDiagonal(int matriz[][], int m) {
        int acumulador = 0;
        
        for (int i = 0; i < m; i++) {
            acumulador += matriz[i][i];
        }
        return acumulador;
    }
    
    public static int SumarContradiagonal(int matriz[][], int m) {
        int acumulador = 0;
        
        for (int i = 0; i < m; i++) {
            acumulador += matriz[i][m-i-1];
        }
        return acumulador;
    }
    
    public static void MostrarMatrizCuadrada(int matriz[][], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");     
        }
    }
}
