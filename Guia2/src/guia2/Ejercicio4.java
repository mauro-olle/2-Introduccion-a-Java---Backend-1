/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados en Celsius");
        float gradoCentigrado = leer.nextShort();
        
        float Fahrenheit = 32 + (9 * gradoCentigrado / 5);
        
        System.out.println(gradoCentigrado + "° centigrados equivale a " + Fahrenheit + "° Fahrenheit");
    }
    
}
