package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author mauro
 */
public class CalculadoraV2 {

    public static void main(String[] args) {
        
        String [] arreglo = {"Sumar","Restar","Multiplicar","Dividir"};
        
        String opcion = JOptionPane.showInputDialog(null, "Elige una opcion", "Calculadora", 0, null, arreglo, null).toString();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "0"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero", "0"));
        int resultado = 0;
        
        switch (opcion) {
            case "Sumar":
                resultado = num1 + num2;
                break;
            case "Restar":
                resultado = num1 - num2;
                break;
            case "Multiplicar":
                resultado = num1 * num2;
                break;
            case "Dividir":
                resultado = num1 / num2;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado, opcion, 0);
    }
    
}
