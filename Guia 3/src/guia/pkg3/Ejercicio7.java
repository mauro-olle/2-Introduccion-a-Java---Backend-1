/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String clave;
        int contCorrecto = 0;
        int contIncorrecto = 0;
        
        do {                
            System.out.println("Ingrese su clave");
            clave = leer.next().toLowerCase();
            
            if (clave.substring(0,1).equals("x") && clave.substring(4,5).equals("o") &&clave.length() == 5) contCorrecto++;
            else contIncorrecto ++;
        } while (!clave.equals("&&&&&"));
                
        System.out.println("Intentos correctos " + contCorrecto);
        System.out.println("Intentos incorrectos " + contIncorrecto);    
                
    }
}
