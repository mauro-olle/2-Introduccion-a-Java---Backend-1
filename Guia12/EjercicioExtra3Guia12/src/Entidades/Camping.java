package Entidades;

/**
 *
 * @author mauro
 */
public class Camping extends AlojamientoExtrahotelero {

    private Integer CapacidadMaxCarpas;
    private Integer CantidadBanios;
    private String TieneRestaurante;

    public Camping() {
    }

    public Camping(Integer CapacidadMaxCarpas, Integer CantidadBanios, String TieneRestaurante, String EsPrivado, Integer SuperficieMetrosCuadrados, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(EsPrivado, SuperficieMetrosCuadrados, Nombre, Direccion, Localidad, Gerente);
        this.CapacidadMaxCarpas = CapacidadMaxCarpas;
        this.CantidadBanios = CantidadBanios;
        this.TieneRestaurante = TieneRestaurante;
    }

    public Integer getCapacidadMaxCarpas() {
        return CapacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer CapacidadMaxCarpas) {
        this.CapacidadMaxCarpas = CapacidadMaxCarpas;
    }

    public Integer getCantidadBanios() {
        return CantidadBanios;
    }

    public void setCantidadBanios(Integer CantidadBanios) {
        this.CantidadBanios = CantidadBanios;
    }

    public String getTieneRestaurante() {
        return TieneRestaurante;
    }

    public void setTieneRestaurante(String TieneRestaurante) {
        this.TieneRestaurante = TieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping\n" + super.toString() + "\nCapacidadMaxCarpas: " + CapacidadMaxCarpas + "\nCantidadBanios: " + CantidadBanios + "\nTieneRestaurante: " + TieneRestaurante;
    }

}
