package ejercicio5guia10.Servicios;

import ejercicio5guia10.Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;



/**
 *
 * @author mauro
 */
public class PaisServicio {
    TreeSet<Pais> paises = new TreeSet<>();
    
    public void CargarPaises() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        
        do {
            System.out.println("Ingrese el nombre del pais");
            String nombre = sc.next();

            Integer habitantes = (int) (Math.random() * (100000000 - 40000000) + 40000000);
            Integer superficie = (int) (Math.random() * (1000000 - 100000) + 1000000);

            paises.add(new Pais(nombre, habitantes, superficie));

            System.out.println("¿Desea ingresar otro pais?");
            respuesta = sc.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        
        MostrarPaises();
    }
    
    public void MostrarPaises(){
        for(Pais p : paises){
            System.out.println(p);
        }
    }
    
    public void EliminarPais(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bandera  = false;
        
        System.out.println("Ingrese el pais que desea eliminar");
        String nombre = sc.next();
        
        Iterator it = paises.iterator();
        while(it.hasNext()){
            Pais aux = (Pais) it.next();
            if (aux.getNombre().equals(nombre)) {
                it.remove();
                MostrarPaises();
                bandera = true;
            }
        }
        
        if (!bandera) {
            System.out.println("El pais no se encontraba en la coleccion");
            MostrarPaises();
        }
        
    }
    
}
