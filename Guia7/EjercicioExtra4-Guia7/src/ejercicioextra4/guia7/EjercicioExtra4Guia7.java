/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ejercicioextra4.guia7;

import ejercicioextra4.guia7.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra4Guia7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta usuario1 = new Cuenta(50000, "Mauro");
        Cuenta usuario2 = new Cuenta(30000, "Maira");
        Cuenta usuario3 = new Cuenta(80000, "Ely");

        String respuesta;
        boolean a = true;
      
        System.out.println("Ingrese su nombre");
        String usuario = sc.nextLine();
        do {
            switch (usuario) {
                case "mauro.olle":
                    if (a == true) {
                        System.out.printf("Hola %s!\n", usuario1.getTitular());
                        a = false;
                    }
                    usuario1.retirarDinero();
                    System.out.println("Saldo: $" + usuario1.getSaldo());
                    break;
                case "may.p":
                    if (a == true) {
                        System.out.printf("Hola %s!\n", usuario2.getTitular());
                        a = false;
                    }
                    usuario2.retirarDinero();
                    System.out.println("Saldo: $" + usuario2.getSaldo());
                    break;
                case "ely.f":
                    if (a == true) {
                        System.out.printf("Hola %s!\n", usuario3.getTitular());
                        a = false;
                    }
                    usuario3.retirarDinero();
                    System.out.println("Saldo: $" + usuario3.getSaldo());
                    break;
                default:
                    System.out.println("Ingrese un usuario valido");
                    break;
            }
            
            System.out.println("¿Desea hacer otra extraccion?");
            respuesta = sc.next().toLowerCase();
        } while (!respuesta.equals("no"));

        System.out.println("Muchas Gracias");
    }
}
