/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String respuesta = "si";
        Personas ();

        while (!respuesta.equals("no")){
            System.out.println("¿Desea ingresar otra persona?");
            respuesta = leer.next().toLowerCase();
        
            if (respuesta.equals("si")) Personas ();
            else if (respuesta.equals("no")) System.out.println("Muchas gracias");
            else System.out.println("Ingrese una opcion correcta");
        }
    }
    
    public static void Personas () {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        
        if (edad >= 18) System.out.println(nombre + "tiene " + edad + " años, por lo tanto es mayor de edad");
        else System.out.println(nombre + "tiene " + edad + " años, por lo tanto es menor de edad");
    }
}
