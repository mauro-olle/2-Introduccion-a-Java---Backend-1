/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double acumulador = 0;
        int aprobados = 0, desaprobados = 0;
        double notas[] = new double [10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("INGRESAR LAS NOTAS DEL " + (i+1) + "° ALUMNO");
            
            System.out.println("Ingrese la nota del primer trabajo practico");
            acumulador += sc.nextDouble() * 0.1;
            
            System.out.println("Ingrese la nota del segundo trabajo practico");
            acumulador += sc.nextDouble() * 0.15;
            
            System.out.println("Ingrese la nota del primer integrador");
            acumulador += sc.nextDouble() * 0.25;
            
            System.out.println("Ingrese la nota del segundo integrador");
            acumulador += sc.nextDouble() * 0.5;
            
            System.out.println("Promedio del alumno: " + acumulador);
            
            notas[i] = acumulador;

            acumulador = 0;
            System.out.println("");
        }
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 7) aprobados ++;
            else desaprobados ++; 
        }
        
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
