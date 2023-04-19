/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que
nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25
es divisible entre 5, sin embargo, 17 si es primo.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        long num = sc.nextInt();
        
        for (int i = 2; i < num; i++) {
            if (NumeroPrimo(i) == true) {
                System.out.println(i + " es un numero primo.");
        }   else {
                System.out.println(i + " no es un numero primo.");
        }  
        }

    }

    private static boolean NumeroPrimo(long numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) primo = false; 
            contador++;
        }
        return primo;
    }
}