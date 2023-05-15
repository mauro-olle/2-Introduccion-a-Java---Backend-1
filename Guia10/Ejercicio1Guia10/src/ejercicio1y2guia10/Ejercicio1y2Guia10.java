package ejercicio1y2guia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio1y2Guia10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> razasPerros = new ArrayList();

        String respuesta = "";
        
        do {
            System.out.println("Ingrese una raza");
            razasPerros.add(sc.next());
            
            System.out.println("¿Desea ingresar otra raza?");
            respuesta = sc.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        
        System.out.println("Las razas ingresadas son " + razasPerros);
        
        System.out.println("Ingrese una raza a eliminar");
        respuesta = sc.next();
        
        boolean bandera = false;
        
        
        Iterator<String> it = razasPerros.iterator();
        while (it.hasNext()){
            if (it.next().equals(respuesta)) {
                it.remove();
                bandera = true;
            }
        }
        
        if (!bandera) {
            System.out.println("La raza no se encontraba en el ArrayList");
        }
        
        Collections.sort(razasPerros);
        System.out.println(razasPerros);
        

    }
    
}

/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada*/