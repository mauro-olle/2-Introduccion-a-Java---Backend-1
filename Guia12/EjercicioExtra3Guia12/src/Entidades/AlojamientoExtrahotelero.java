package Entidades;

import java.util.Random;

/**
 *
 * @author mauro
 */
public class AlojamientoExtrahotelero extends Alojamiento {

    protected String EsPrivado;
    protected Integer SuperficieMetrosCuadrados;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(String EsPrivado, Integer SuperficieMetrosCuadrados, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(Nombre, Direccion, Localidad, Gerente);
        this.EsPrivado = EsPrivado;
        this.SuperficieMetrosCuadrados = SuperficieMetrosCuadrados;
    }

    public String getEsPrivado() {
        return EsPrivado;
    }

    public void setEsPrivado(String EsPrivado) {
        this.EsPrivado = EsPrivado;
    }

    public Integer getSuperficieMetrosCuadrados() {
        return SuperficieMetrosCuadrados;
    }

    public void setSuperficieMetrosCuadrados(Integer SuperficieMetrosCuadrados) {
        this.SuperficieMetrosCuadrados = SuperficieMetrosCuadrados;
    }

    public void crearAlojamientoExtrahotelero() {
        crearAlojamiento();
        Random rand = new Random();
        EsPrivado = rand.nextBoolean() ? "Si" : "No";
        SuperficieMetrosCuadrados = rand.nextInt(5000);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEsPrivado: " + EsPrivado + "\nSuperficieMetrosCuadrados: " + SuperficieMetrosCuadrados;
    }

}
