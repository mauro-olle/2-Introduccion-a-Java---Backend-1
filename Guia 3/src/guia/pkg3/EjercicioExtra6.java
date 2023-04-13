/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cont1 = 0;
        int cont2 = 0;
        double acumuladorMenor = 0;
        double acumuladorMayor = 0;
        
        System.out.println("¿Cuantas personas desea ingresar?");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su estatura");
            double estatura = leer.nextDouble();
            
            if (estatura < 1.6) {
                acumuladorMenor += estatura;
                cont1 ++;
            } else {
                acumuladorMayor += estatura;
                cont2 ++;
            }
        }
        
        double promedioMenor = acumuladorMenor / cont1;
        double promedioTotal = (acumuladorMenor + acumuladorMayor) / (cont1 + cont2);
        
        System.out.println("El promedio de estatura menor a 1,60m es " + promedioMenor);
        System.out.println("El promedio total de estaturas es " + promedioTotal);
    }
}
