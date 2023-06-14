package Entidades;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author mauro
 */
public class Hotel extends Alojamiento{

    protected Integer NumeroHabitaciones;
    protected Integer NumeroCamas;
    protected Integer CantDePisos;
    protected Double PrecioDeHabitaciones;

    public Hotel() {
    }

    public Hotel(Integer NumeroHabitaciones, Integer NumeroCamas, Integer CantDePisos, Double PrecioDeHabitaciones, String Nombre, String Direccion, String Localidad, String Gerente) {
        super(Nombre, Direccion, Localidad, Gerente);
        this.NumeroHabitaciones = NumeroHabitaciones;
        this.NumeroCamas = NumeroCamas;
        this.CantDePisos = CantDePisos;
        this.PrecioDeHabitaciones = PrecioDeHabitaciones;
    }

    public Integer getNumeroHabitaciones() {
        return NumeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer NumeroHabitaciones) {
        this.NumeroHabitaciones = NumeroHabitaciones;
    }

    public Integer getNumeroCamas() {
        return NumeroCamas;
    }

    public void setNumeroCamas(Integer NumeroCamas) {
        this.NumeroCamas = NumeroCamas;
    }

    public Integer getCantDePisos() {
        return CantDePisos;
    }

    public void setCantDePisos(Integer CantDePisos) {
        this.CantDePisos = CantDePisos;
    }

    public Double getPrecioDeHabitaciones() {
        return PrecioDeHabitaciones;
    }

    public void setPrecioDeHabitaciones(Double PrecioDeHabitaciones) {
        this.PrecioDeHabitaciones = PrecioDeHabitaciones;
    }

    public void crearHotel() {
        crearAlojamiento();
        Random rand = new Random();

        NumeroHabitaciones = rand.nextInt(100) + 1;
        NumeroCamas = rand.nextInt(2) + 1;
        CantDePisos = rand.nextInt(10) + 3;
        PrecioDeHabitaciones = 0d;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "\nNumeroHabitaciones: " + NumeroHabitaciones + "\nNumeroCamas: " + NumeroCamas + "\nCantDePisos: " + CantDePisos + "\nPrecioDeHabitaciones=" + PrecioDeHabitaciones;
    }

    public static Comparator<Hotel> ordenarPorPrecioHabitacion = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o1.PrecioDeHabitaciones.compareTo(o2.PrecioDeHabitaciones);
        }
    };
}
