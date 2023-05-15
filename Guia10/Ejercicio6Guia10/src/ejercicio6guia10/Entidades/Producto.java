package ejercicio6guia10.Entidades;

/**
 *
 * @author mauro
 */
public class Producto {
    private String Nombre;
    private Integer PrecioCosto;
    private Integer PrecioVenta;
    
    public Producto(){
    }

    public Producto(String Nombre, Integer PrecioCosto) {
        this.Nombre = Nombre;
        this.PrecioCosto = PrecioCosto;
        PrecioVenta = (int) (PrecioCosto * 1.4);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getPrecioCosto() {
        return PrecioCosto;
    }

    public void setPrecioCosto(Integer PrecioCosto) {
        this.PrecioCosto = PrecioCosto;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", PrecioCosto=" + PrecioCosto + ", PrecioVenta=" + PrecioVenta + '}';
    }
}
