package practica;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class CalculadoraConVentanasEmergentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        
        int suma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "La suma es "+suma);
        */
        int opcion;
        do{
        String [] arreglo = {"Sumar","Restar","Multiplicar","Dividir","Cerrar"};
        opcion = JOptionPane.showOptionDialog(null, "Elige una Opcion", "Calculadora", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
        
        switch (opcion) {
            case 0:
                int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            
                JOptionPane.showMessageDialog(null, "La suma es " + (num1+num2));
                break;
            case 1:
                int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                int num4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            
                JOptionPane.showMessageDialog(null, "La Resta es " + (num3-num4));
                break;
            case 2:
                int num5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                int num6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            
                JOptionPane.showMessageDialog(null, "El Producto es " + (num5*num6));
                break;
                
            case 3:
                float num7 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                float num8 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
            
                JOptionPane.showMessageDialog(null, "La Division es " + (num7/num8));
                break;
        }
        }while (opcion != 4);
    }
    
}
