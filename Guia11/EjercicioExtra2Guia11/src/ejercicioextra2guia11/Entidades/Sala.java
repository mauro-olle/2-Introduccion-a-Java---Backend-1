package ejercicioextra2guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Sala {
    private Pelicula Pelicula;
    private Espectador[][] Espectadores;
    private Double PrecioEntrada;

    public Sala() {
        this.Espectadores = new Espectador[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                Espectadores = null;
            }
        }
    }

    public Sala(Pelicula Pelicula, Espectador[][] Espectadores, Double PrecioEntrada) {
        this.Pelicula = Pelicula;
        this.Espectadores = Espectadores;
        this.PrecioEntrada = PrecioEntrada;
    }

    public Pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(Pelicula Pelicula) {
        this.Pelicula = Pelicula;
    }

    public Espectador[][] getEspectadores() {
        return Espectadores;
    }

    public void setEspectadores(Espectador[][] Espectadores) {
        this.Espectadores = Espectadores;
    }

    public Double getPrecioEntrada() {
        return PrecioEntrada;
    }

    public void setPrecioEntrada(Double PrecioEntrada) {
        this.PrecioEntrada = PrecioEntrada;
    }

    @Override
    public String toString() {
        return "Sala{" + "Pelicula=" + Pelicula + ", Espectadores=" + Espectadores + ", PrecioEntrada=" + PrecioEntrada + '}';
    }
    
    
}
