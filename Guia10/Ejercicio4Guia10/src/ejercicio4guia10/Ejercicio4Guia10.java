package ejercicio4guia10;

import Servicios.PeliculaServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio4Guia10 {

    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        
        ps.CrearPelicula();
        
        System.out.println("\n\n Metodo Mostrar Peliculas");
        ps.MostrarPeliculas();
        
        System.out.println("\n\n Metodo Mostrar Peliculas Mayores a Una Hora");
        ps.MostrarPeliculasMayorAUnaHora();
        
        System.out.println("\n\n Metodo Mostrar Peliculas Ordenadas Por Duracion En Orden Ascendente");
        ps.OrdenarPorDuracionAscendenteYMostrar();
        
        System.out.println("\n\n Metodo Mostrar Peliculas Ordenadas Por Duracion En Orden Descendente");
        ps.OrdenarPorDuracionDescendenteYMostrar();
        
        System.out.println("\n\n Metodo Mostrar Peliculas Ordenadas Alfabeticamente por Titulo");
        ps.OrdenarAlfabeticamentePorTituloYMostrar();
        
        System.out.println("\n\n Metodo Mostrar Peliculas Ordenadas Alfabeticamente por Director");
        ps.OrdenarAlfabeticamentePorDirectorYMostrar();
    }
}
