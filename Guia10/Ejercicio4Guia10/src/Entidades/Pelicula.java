package Entidades;

import java.util.Date;

/**
 *
 * @author mauro
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Date horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Date horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }
   
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas.getHours() + ':' + horas.getMinutes() + '}';
    }
}
