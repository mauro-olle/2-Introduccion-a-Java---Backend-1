package Entidades;

/**
 *
 * @author mauro
 */
public class Residencia extends AlojamientoExtrahotelero {

    private Integer CantidadDeHabitaciones;
    private String DescuentosAGremios;
    private String CampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer CantidadDeHabitaciones, String DescuentosAGremios, String CampoDeportivo, String EsPrivado, Integer SuperficieMetrosCuadrados, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(EsPrivado, SuperficieMetrosCuadrados, Nombre, Direccion, Localidad, Gerente);
        this.CantidadDeHabitaciones = CantidadDeHabitaciones;
        this.DescuentosAGremios = DescuentosAGremios;
        this.CampoDeportivo = CampoDeportivo;
    }

    public Integer getCantidadDeHabitaciones() {
        return CantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer CantidadDeHabitaciones) {
        this.CantidadDeHabitaciones = CantidadDeHabitaciones;
    }

    public String getDescuentosAGremios() {
        return DescuentosAGremios;
    }

    public void setDescuentosAGremios(String DescuentosAGremios) {
        this.DescuentosAGremios = DescuentosAGremios;
    }

    public String getCampoDeportivo() {
        return CampoDeportivo;
    }

    public void setCampoDeportivo(String CampoDeportivo) {
        this.CampoDeportivo = CampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia\n" + super.toString() + "\nCantidadDeHabitaciones: " + CantidadDeHabitaciones + "\nDescuentosAGremios: " + DescuentosAGremios + "\nCampoDeportivo: " + CampoDeportivo;
    }

}
