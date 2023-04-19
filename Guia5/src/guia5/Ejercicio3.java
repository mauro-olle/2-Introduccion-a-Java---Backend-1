/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int digitos = 0, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        
        int vector [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random() * 100000);
            System.out.println(vector [i]);

            while (vector [i] != 0) {
                vector [i] = (int) (vector [i] / 10);
                digitos ++;
            }
            
            switch (digitos) {
                case 1:
                    unDigito ++;
                    break;
                case 2:
                    dosDigitos ++;
                    break;
                case 3:
                    tresDigitos ++;
                    break;
                case 4:
                    cuatroDigitos ++;
                    break;
                case 5:
                    cincoDigitos ++;
                    break;
            }
            digitos = 0;
        }
        
        System.out.println("Numeros de 1 digito: " + unDigito);
        System.out.println("Numeros de 2 digitos: " + dosDigitos);
        System.out.println("Numeros de 3 digitos: " + tresDigitos);
        System.out.println("Numeros de 4 digitos: " + cuatroDigitos);
        System.out.println("Numeros de 5 digitos: " + cincoDigitos);
    }
}
