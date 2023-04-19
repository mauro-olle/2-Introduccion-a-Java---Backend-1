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
public class EjercicioExtra07A {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuantos numeros desea ingresar?");
        int n = leer.nextInt();
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int max = num; 
        int min = num;
        float cont = 1; 
        float acumulador = num;
        
        while (cont < n) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            max = Math.max(max,num);
            min = Math.min(min,num);
            acumulador += num;
            cont ++;
        }
        
        float promedio = acumulador / cont;
        
        System.out.println("El numero maximo ingresado es " + max);
        System.out.println("El numero minimo ingresado es " + min);
        System.out.println("El promedio es " + promedio);
    }
}
