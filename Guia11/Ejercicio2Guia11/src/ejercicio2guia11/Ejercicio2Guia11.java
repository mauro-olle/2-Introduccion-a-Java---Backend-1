package ejercicio2guia11;

import ejercicio2guia11.Entidades.Juego;
import ejercicio2guia11.Servicios.JuegoServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio2Guia11 {

    public static void main(String[] args) throws InterruptedException{
        JuegoServicio js = new JuegoServicio();
        
        Juego j = js.LlenarJuego();
        
        js.Ronda(j);
        
    }
    
}
