/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int digitos = 0;
        
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        
        while (num > 0) {
            num /= 10;
            digitos++;
        }
        
        System.out.println("La cantidad de digitos es " + digitos);
    }
}
