/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. Realice 
dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra07B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float cont = 0;
        float acumulador = 0;
        int min = 0;
        int max = 0;
        
        System.out.println("¿Cuantos numeros desea ingresar");
        int n = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            
            if (cont == 0) {
                max = num;
                min = num;
            }
            
            if (num < min) min = num;
            if (num > max) max = num;
            acumulador += num;
            cont ++;
        } while (cont < n);
        
        float promedio = acumulador / cont;
        
        System.out.println("El numero maximo ingresado es " + max);
        System.out.println("El numero minimo ingresado es " + min);
        System.out.println("El promedio es " + promedio);
    }
}
