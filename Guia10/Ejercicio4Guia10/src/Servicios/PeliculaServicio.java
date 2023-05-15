package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class PeliculaServicio {
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void CrearPelicula(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
       
        do {
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = sc.next();

            System.out.println("Ingrese el director");
            String director = sc.next();

            System.out.println("Ingrese la duracion en minutos");
            int minutostotales = sc.nextInt();
            
            Date duracion = new Date(0);
            duracion.setHours((int) (minutostotales/60));
            duracion.setMinutes(minutostotales % 60);

            peliculas.add(new Pelicula(nombre, director, duracion));

            System.out.println("¿Desea Ingresar otra Pelicula?");
            respuesta = sc.next();
        } while (!respuesta.equalsIgnoreCase("no"));
    }
    
    public void MostrarPeliculas(){
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }
    
    public void MostrarPeliculasMayorAUnaHora(){
        for(Pelicula p : peliculas){
            Date date = new Date(0);
            date.setHours(1);
            
            if (date.before(p.getHoras())) {
                System.out.println(p);
            }
        }
    }
    
    public void OrdenarPorDuracionAscendenteYMostrar(){
        Collections.sort(peliculas, Comparadores.OrdenarPorDuracionAscendente);
        MostrarPeliculas();
    }
    
    public void OrdenarPorDuracionDescendenteYMostrar(){
        Collections.sort(peliculas, Comparadores.OrdenarPorDuracionDescendente);
        MostrarPeliculas();
    }
    
    public void OrdenarAlfabeticamentePorTituloYMostrar(){
        Collections.sort(peliculas, Comparadores.OrdenarPorTitulo);
        MostrarPeliculas();
    }
    
    public void OrdenarAlfabeticamentePorDirectorYMostrar(){
        Collections.sort(peliculas, Comparadores.OrdenarPorDirector);
        MostrarPeliculas();
    }
}
