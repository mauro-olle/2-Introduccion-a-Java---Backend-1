package Entidades;

/**
 *
 * @author mauro
 */
public class Hotel4Estrellas extends Hotel {

    private String Gimnasio;
    private String NombreDelRestaurante;
    private Integer CapacidadDelRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String Gimnasio, String NombreDelRestaurante, Integer CapacidadDelRestaurante, Integer NumeroHabitaciones, Integer NumeroCamas, Integer CantDePisos, Double PrecioDeHabitaciones, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(NumeroHabitaciones, NumeroCamas, CantDePisos, PrecioDeHabitaciones, Nombre, Direccion, Localidad, Gerente);
        this.Gimnasio = Gimnasio;
        this.NombreDelRestaurante = NombreDelRestaurante;
        this.CapacidadDelRestaurante = CapacidadDelRestaurante;
    }

    public String getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasio(String Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    public String getNombreDelRestaurante() {
        return NombreDelRestaurante;
    }

    public void setNombreDelRestaurante(String NombreDelRestaurante) {
        this.NombreDelRestaurante = NombreDelRestaurante;
    }

    public Integer getCapacidadDelRestaurante() {
        return CapacidadDelRestaurante;
    }

    public void setCapacidadDelRestaurante(Integer CapacidadDelRestaurante) {
        this.CapacidadDelRestaurante = CapacidadDelRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel\n" + super.toString() + "\nGimnasio: " + Gimnasio + "\nNombreDelRestaurante: " + NombreDelRestaurante + "\nCapacidadDelRestaurante: " + CapacidadDelRestaurante;
    }

}
