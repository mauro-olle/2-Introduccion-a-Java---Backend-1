package ejercicioextra2guia11.Entidades;

import java.time.LocalTime;

/**
 *
 * @author mauro
 */
public class Pelicula {
    private String Titulo;
    private LocalTime Duracion;
    private Integer EdadMinima;
    private String Director;

    public Pelicula() {
        String[] peliculas = {"El último unicornio", "La montaña mágica", "El jardín secreto", "La isla del tesoro perdido", "El reino de las sombras", "La ciudad de cristal", "El laberinto del minotauro", "El bosque encantado", "La torre de marfil", "El castillo de las nubes"};
        int n = (int)(Math.random()*10);
        this.Titulo = peliculas[n];
    
        int m = (int)(Math.random()*3)+1;
        n = (int)(Math.random()*60);
        this.Duracion = LocalTime.of(m, n);
        
        int[] edadesRestriccion = {0,13, 16, 18};
        n = (int)(Math.random()*4);
        this.EdadMinima = edadesRestriccion[n];
        
        String[] directores = {"Sofía Martínez", "Lucas García", "Marta Pérez", "Carlos Gómez", "Isabel Fernández", "Javier López", "Ana Rodríguez", "Juan González", "Carmen Díaz", "José Sánchez"};
        n = (int)(Math.random()*10);
        this.Director = directores[n];
    }

    public Pelicula(String Titulo, LocalTime Duracion, Integer EdadMinima, String Director) {
        this.Titulo = Titulo;
        this.Duracion = Duracion;
        this.EdadMinima = EdadMinima;
        this.Director = Director;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public LocalTime getDuracion() {
        return Duracion;
    }

    public void setDuracion(LocalTime Duracion) {
        this.Duracion = Duracion;
    }

    public Integer getEdadMinima() {
        return EdadMinima;
    }

    public void setEdadMinima(Integer EdadMinima) {
        this.EdadMinima = EdadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Duracion=" + Duracion + ", EdadMinima=" + EdadMinima + ", Director=" + Director + '}';
    }
    
    
}
