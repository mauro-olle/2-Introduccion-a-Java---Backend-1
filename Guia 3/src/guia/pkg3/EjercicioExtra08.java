/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y 
mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Al 
igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra08{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int par = 0, impar = 0, total = 0;
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        while (num % 5 != 0) {
            if (num > 0) {
                total++;
                if (num % 2 == 0) par++;
                else if (num % 2 == 1) impar++;
            }
            System.out.println("Ingrese otro numero");
            num = leer.nextInt();
        }
        
        System.out.printf("Cantidad de numeros ingresados %d, impares %d y pares %d",total,impar,par);
    }
}
