package ejercicioextra1.guia7.Entidades;

/**
 *
 * @author mauro
 */
public class Cancion {
    private String tiitulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String tiitulo, String autor) {
        this.tiitulo = tiitulo;
        this.autor = autor;
    }

    public String getTiitulo() {
        return tiitulo;
    }

    public void setTiitulo(String tiitulo) {
        this.tiitulo = tiitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "tiitulo=" + tiitulo + ", autor=" + autor + '}';
    }
    
    
}
