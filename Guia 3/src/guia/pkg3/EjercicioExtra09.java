/*
Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int resultado = 0;
        
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();
        int aux = num1;
        
        while (num1 > num2) {
            num1 -= num2;
            resultado ++;
        }
        
        System.out.printf("%d / %d = %d y el resto es %d",aux,num2,resultado,num1);
    }
}
