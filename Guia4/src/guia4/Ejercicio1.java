/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y
dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados
para imprimirlos en el main. 
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float resultado = 0;
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        System.out.println("¿Que operacion desea realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int respuesta = leer.nextInt();
        
        switch (respuesta) {
            case 1: 
                resultado = Sumar(num1,num2);
                break;
            case 2: 
                resultado = Restar(num1,num2);
                break;
            case 3: 
                resultado = Multiplicar(num1,num2);
                break;
            case 4:
                if (num2 != 0) resultado = Dividir(num1,num2);
                else System.out.println("No se puede realizar la operacion");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
        }
        
        System.out.println("Resultado: " + resultado);
    }
    
    public static int Sumar (int a, int b) {
    
        int resultado = a + b;
    
    return resultado;
    }
    
    public static int Restar (int a, int b) {
        
        int resultado = a - b;
        
        return resultado;
    }
    
    public static int Multiplicar (int a, int b) {
        
        int resultado = a * b;
        
        return resultado;
    }
    
    public static float Dividir (float a, float b){
        
        float resultado = a / b;
        
        return resultado;
    }
}
