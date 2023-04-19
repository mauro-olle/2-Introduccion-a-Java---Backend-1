/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int acumulador = 0, cont = 0;
        
        System.out.println("Ingrese la cantidad de familias");
        int familias = sc.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("¿Cuantos miembros tiene su familia?");
            int miembros = sc.nextInt();
            
            for (int j = 0; j < miembros; j++) {
                System.out.println("Ingrese la edad del " + (j+1) + "° miembro");
                int edad = sc.nextInt();
                acumulador += edad;
                cont++;
            }
        }
        System.out.println("La edad promedio de todos los hijos es " + acumulador / cont);
    }
}
