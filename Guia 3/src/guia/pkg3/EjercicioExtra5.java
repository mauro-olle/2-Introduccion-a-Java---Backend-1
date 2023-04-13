/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que 
los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el 
costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double montoAPagar = 0;
       


        System.out.println("Ingrese su clase");
        String clase = leer.next().toUpperCase();
        
        while (!clase.equals("A") && !clase.equals("B") && !clase.equals("C")) {
            System.out.println("Ingrese una opcion correcta");
            clase = leer.next().toUpperCase();
        }
        
        System.out.println("Ingrese el costo de su tratamiento");
        double costoTratamiento = leer.nextDouble();        
                
        switch (clase) {
            case "A":
                montoAPagar = costoTratamiento * (1 - 0.5);
                break;
            case "B":
                montoAPagar = costoTratamiento * (1 - 0.35);
                break;
            case "C":
                montoAPagar = costoTratamiento;
                break;
        }
        
        System.out.println("El monto a pagar es " + montoAPagar);  
    }
}
