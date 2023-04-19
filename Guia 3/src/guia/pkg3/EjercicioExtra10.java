/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comparar;
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int resultado = num1 * num2;

        do {
            System.out.println("Ingrese un resultado");
            comparar = sc.nextInt();

            if (resultado == comparar) System.out.println("Correcto");
            else System.out.println("Incorrecto");
        } while (resultado != comparar);
    }
}
