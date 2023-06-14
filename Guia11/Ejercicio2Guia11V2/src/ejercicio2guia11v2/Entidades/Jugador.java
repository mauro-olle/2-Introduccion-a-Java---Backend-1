package ejercicio2guia11v2.Entidades;

/**
 *
 * @author mauro
 */
public class Jugador {
    private Integer Id;
    private String Nombre;
    private Boolean Muerto;

    public Jugador() {
    }

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        Muerto = false;
    }

    public Jugador(Integer Id) {
        this.Id = Id;
        Nombre = "Jugador " + String.valueOf(Id);
        Muerto = false;
    }

    public Jugador(Integer Id, String Nombre, Boolean Muerto) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Muerto = Muerto;
    }

    public String getNombre() {
        return Nombre;
    }

    public Boolean getMuerto() {
        return Muerto;
    }

    public void setMuerto(Boolean Muerto) {
        this.Muerto = Muerto;
    }
    
    public boolean Disparo(Revolver r){
        if (r.Matar()) {
            System.out.println("Has Muerto\n");
            Muerto = true;
        } else {
            System.out.println("Sobreviviste\n");
        }
        r.SiguienteBala();
        return Muerto;
    }
}
