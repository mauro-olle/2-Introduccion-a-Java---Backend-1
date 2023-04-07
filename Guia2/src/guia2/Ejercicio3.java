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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        String minusculas = frase.toLowerCase();
        
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Frase en minusculas: " + minusculas);
    }
    
}
