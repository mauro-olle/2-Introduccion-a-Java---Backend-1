/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600
minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        
        int horas = min / 60;
        int dias = horas / 24;
        horas %= 24;
        
        System.out.println(min + " minutos equivalen a " + dias + " dias y " + horas + " horas.");
        System.out.printf("%d minutos equivalen a %d dias y %d horas.", min, dias, horas);
    }
}
