/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa 
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario
se vuelve a mostrar el menú.
 */
package guia.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author mauro
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int opcion;
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero positivo"));

        String [] opciones = {"Sumar","Restar","Multiplicar","Dividir","Salir"};
        
        do {
        opcion = JOptionPane.showOptionDialog(null, "Elige una Opcion", "Calculadora", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Cerrar");
        
        double resultado = 0;
        switch (opcion) {
            case 0:
                resultado = num1 + num2;
                break;
            case 1:
                resultado = num1 - num2;
                break;
            case 2:
                resultado = num1 * num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
        }
        if (opcion != 4) JOptionPane.showMessageDialog(null,"El resultado es " + resultado);
        } while (opcion != 4);
       }
}
