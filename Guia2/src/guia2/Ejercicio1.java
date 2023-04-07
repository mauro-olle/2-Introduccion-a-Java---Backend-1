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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        short num1 = leer.nextShort();
        
        System.out.println("Ingrese otro numero");
        short num2 = leer.nextShort();
        
        short suma = (short) (num1 + num2);
        
        System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma);
        
    }
    
}
