package practica;

import javax.swing.JOptionPane;

public class CalculadoraConVentanasEmergentes {

    public static void main(String[] args) {

        int opcion;
        do{
        String [] arreglo = {"Sumar","Restar","Multiplicar","Dividir","Cerrar"};
        opcion = JOptionPane.showOptionDialog(null, "Elige una Opcion", "Calculadora", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Cerrar");
        
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
