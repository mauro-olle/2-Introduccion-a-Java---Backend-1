/*
Convierte un numero a Romano entre 1 y 3999
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra04B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int aux = num;
        
        String unidades [] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String decenas [] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String centenas [] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
        String uDeMil [] = {"","M","MM","MMM"};
        
        int unidad = num % 10;
        int decena = ((num-unidad)/10) % 10;
        int centena = ((num-decena*10-unidad)/100) % 10;
        int unidadDeMil = ((num-centena*100-decena*10-unidad)/1000) % 10;
        
        if (aux < 1 || aux > 3999) {
            System.out.println("Numero Invalido");
        } else {
            System.out.print("El numero " + aux + " en romano es ");
            System.out.print(uDeMil[unidadDeMil]);
            System.out.print(centenas[centena]);
            System.out.print(decenas[decena]);
            System.out.print(unidades[unidad]);
            System.out.println("");
        }
    }
}

