package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author mauro
 */
public class CalculadoraV2 {

    public static void main(String[] args) {
        
        String [] arreglo = {"Sumar","Restar","Multiplicar","Dividir","Salir"};
        
        String opcion = JOptionPane.showInputDialog(null, "Elige una opcion", "Calculadora", 0, null, arreglo, null).toString();
        
        JOptionPane.showMessageDialog(null, arreglo[Integer.parseInt(opcion)]);
        
    }
    
}
