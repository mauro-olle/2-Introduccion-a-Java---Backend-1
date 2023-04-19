/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1) System.out.print("* ");
                else if (j == 0 || j == n-1 || i == j || i == n-(j+1)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
