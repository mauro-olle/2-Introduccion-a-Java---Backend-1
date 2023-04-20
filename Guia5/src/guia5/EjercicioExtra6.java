/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sopaDeLetras[][] = new String [20][20];
        int longitud, fila, columna;
        int pos = 0;
        String palabra;
        boolean bandera = true;
        
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese la " + (i+1) + "° palabra");
                palabra = sc.next();
            
                longitud = palabra.length();
                if (longitud < 3 || longitud > 5) System.out.println("Debe tener entre 3 y 5 caracteres");
            } while (longitud < 3 || longitud > 5);
            
            do {
                fila = (int) (Math.random() * 20);
                columna = (int) (Math.random() * 15);
                
                for (int j = columna; j < columna+longitud; j++) {
                    if (sopaDeLetras[fila][j] != null) bandera = false;
                }
            } while (bandera == false);

            
            for (int j = columna; j < longitud+columna; j++) {
                sopaDeLetras[fila][j] = palabra.substring(pos,pos+1);
                pos ++;
            }
            pos = 0;
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == null) sopaDeLetras[i][j] = "*"; //String.valueOf((int) (Math.random() * 9 + 1));
            }
        }
        
        
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
