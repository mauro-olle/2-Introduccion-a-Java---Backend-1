package Entidades;

import java.util.Random;

/**
 *
 * @author mauro
 */
public final class Polideportivo extends Edificio{
    private String Nombre;
    private String TipoDeInstalacion; //(Techado o Abierto)

    public Polideportivo() {
    }

    public Polideportivo(String Nombre, String TipoDeInstalacion, Double Ancho, Double Largo) {
        super(Ancho, Largo);
        this.Nombre = Nombre;
        this.TipoDeInstalacion = TipoDeInstalacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoDeInstalacion() {
        return TipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String TipoDeInstalacion) {
        this.TipoDeInstalacion = TipoDeInstalacion;
    }
    
    public Polideportivo crearPolideportivo(){
        Random rand = new Random();
        String[] nombres = {"Olímpico", "Municipal", "Estrella", "Los Pinos", "El Sol", "La Luna", "Los Andes", "Las Nubes", "El Cielo", "Los Ángeles", "La Montaña", "El Mar", "La Playa", "Los Ríos", "La Selva"};
        
        String a = nombres[rand.nextInt(15)];
        String b = rand.nextBoolean() ? "Techado" : "Abierto";
        double c = rand.nextDouble(50d)+100d;
        double d = rand.nextDouble(50d)+100d;
        
        return new Polideportivo(a, b, c, d);
    }
    
    @Override
    public double calcularSuperficie() {
        return Ancho * Largo;
    }

    @Override
    public double calcularVolumen() {
        return Ancho * Largo * Alto;
    }

    @Override
    public String toString() {
        return "Polideportivo" + super.toString() + "\nNombre: " + Nombre + "\nTipoDeInstalacion: " + TipoDeInstalacion;
    }
}
