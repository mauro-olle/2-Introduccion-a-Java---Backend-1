package Entidades;

/**
 *
 * @author mauro
 */
public class Hotel5Estrellas extends Hotel4Estrellas {

    private Integer CantidadDeSalones;
    private Integer CantidadDeSuites;
    private Integer CantidadDeLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer CantidadDeSalones, Integer CantidadDeSuites, Integer CantidadDeLimosinas, String Gimnasio, String NombreDelRestaurante, Integer CapacidadDelRestaurante, Integer NumeroHabitaciones, Integer NumeroCamas, Integer CantDePisos, Double PrecioDeHabitaciones, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(Gimnasio, NombreDelRestaurante, CapacidadDelRestaurante, NumeroHabitaciones, NumeroCamas, CantDePisos, PrecioDeHabitaciones, Nombre, Direccion, Localidad, Gerente);
        this.CantidadDeSalones = CantidadDeSalones;
        this.CantidadDeSuites = CantidadDeSuites;
        this.CantidadDeLimosinas = CantidadDeLimosinas;
    }

    public Integer getCantidadDeSalones() {
        return CantidadDeSalones;
    }

    public void setCantidadDeSalones(Integer CantidadDeSalones) {
        this.CantidadDeSalones = CantidadDeSalones;
    }

    public Integer getCantidadDeSuites() {
        return CantidadDeSuites;
    }

    public void setCantidadDeSuites(Integer CantidadDeSuites) {
        this.CantidadDeSuites = CantidadDeSuites;
    }

    public Integer getCantidadDeLimosinas() {
        return CantidadDeLimosinas;
    }

    public void setCantidadDeLimosinas(Integer CantidadDeLimosinas) {
        this.CantidadDeLimosinas = CantidadDeLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidadDeSalones: " + CantidadDeSalones + "\nCantidadDeSuites: " + CantidadDeSuites + "\nCantidadDeLimosinas: " + CantidadDeLimosinas;
    }

}
