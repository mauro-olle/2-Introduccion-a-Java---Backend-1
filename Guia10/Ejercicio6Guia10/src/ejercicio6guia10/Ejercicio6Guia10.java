package ejercicio6guia10;

import ejercicio6guia10.Servicios.ProductoServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio6Guia10 {

    public static void main(String[] args) {
        ProductoServicio ps = new ProductoServicio();
        
        ps.AgregarProducto();
        ps.AgregarProducto();
        ps.MostrarProductos();
        ps.EliminarProducto();
        ps.MostrarProductos();
        ps.ModificarPrecio();
        ps.MostrarProductos();
    }
    
}
