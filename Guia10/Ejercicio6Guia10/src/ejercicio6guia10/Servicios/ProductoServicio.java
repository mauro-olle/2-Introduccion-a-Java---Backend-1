package ejercicio6guia10.Servicios;

import ejercicio6guia10.Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class ProductoServicio {
    HashMap<String, Producto> productos = new HashMap();
    
    public void AgregarProducto(){
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.next();
        
        System.out.println("Ingrese el precio del producto en enteros");
        int precio = sc.nextInt();
        
        productos.put(nombre, new Producto(nombre,precio));
    }
    
    public void MostrarProductos(){
        for(Map.Entry<String,Producto> aux : productos.entrySet()){
            System.out.println(aux.getValue());
        }
    }
    
    public void ModificarPrecio(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el producto a modificar");
        String producto = sc.next();
        
        System.out.println("Ingrese el nuevo precio del producto");
        Integer precio = sc.nextInt();
        
        productos.replace(producto, new Producto(producto,precio));
    }
    
    public void EliminarProducto(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("¿Que producto desea eliminar?");
        String producto = sc.next();

        productos.remove(producto);
    }
}
