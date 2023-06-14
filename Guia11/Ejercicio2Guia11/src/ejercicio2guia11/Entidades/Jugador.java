package ejercicio2guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Jugador {
    private Integer ID;
    private String Nombre;
    private Boolean Mojado;

    public Jugador() {
    }

    public Jugador(Integer ID) {
        this.ID = ID;
        this.Nombre = "Jugador" + String.valueOf(ID);
        this.Mojado = false;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Boolean getMojado() {
        return Mojado;
    }

    public void setMojado(Boolean Mojado) {
        this.Mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", Nombre=" + Nombre + ", Mojado=" + Mojado + '}';
    }
    
    
}
