package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author mauro
 */
public class Comparadores {
    public static Comparator<Pelicula> OrdenarPorDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getHoras().compareTo(p2.getHoras());
        }
    };
    
    public static Comparator<Pelicula> OrdenarPorDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getHoras().compareTo(p1.getHoras());
        }
    };
    
    public static Comparator<Pelicula> OrdenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
    public static Comparator<Pelicula> OrdenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
}
