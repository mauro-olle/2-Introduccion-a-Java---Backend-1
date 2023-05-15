package ejercicio5guia10;

import ejercicio5guia10.Servicios.PaisServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio5Guia10 {

    public static void main(String[] args) {
        PaisServicio ps = new PaisServicio();
        
        ps.CargarPaises();
        ps.EliminarPais();
    }
    
}
