package Entidades;

import java.util.Random;

/**
 *
 * @author mauro
 */
public class Alojamiento {

    protected String Nombre;
    protected String Direccion;
    protected String Localidad;
    protected String Gerente;

    public Alojamiento() {
    }

    public Alojamiento(String Nombre, String Direccion, String Localidad, String Gerente) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Localidad = Localidad;
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) {
        this.Gerente = Gerente;
    }

    protected void crearAlojamiento() {
        Random rand = new Random();

        String[] alojamientos = {"Plaza", "Sol", "Luna", "Bosque", "Estrella", "Río", "Carretera", "Mar", "Montaña", "Playa"};
        String[] direcciones = {"Calle Mayor 10", "Avenida del Sol 20", "Paseo de la Luna 30", "Camino del Bosque 40", "Plaza de la Estrella 50", "Calle del Río 60", "Carretera Nacional 70", "Paseo Marítimo 80", "Calle de la Montaña 90", "Avenida de la Playa 100"};
        String[] localidades = {"Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao", "Zaragoza", "Málaga", "Murcia", "Palma de Mallorca", "Las Palmas de Gran Canaria"};
        String[] gerentes = {"Juan Pérez", "María García", "Carlos López", "Ana Martínez", "Pedro Sánchez", "Laura Rodríguez", "Javier González", "Sofía Fernández", "Luis Gómez", "Carmen Torres"};

        Nombre = alojamientos[rand.nextInt(10)];
        Direccion = direcciones[rand.nextInt(10)];
        Localidad = localidades[rand.nextInt(10)];
        Gerente = gerentes[rand.nextInt(10)];
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + "\nDireccion: " + Direccion + "\nLocalidad: " + Localidad + "\nGerente: " + Gerente;
    }

}
