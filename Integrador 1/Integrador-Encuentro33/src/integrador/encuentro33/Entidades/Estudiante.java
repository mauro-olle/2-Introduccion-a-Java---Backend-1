package integrador.encuentro33.Entidades;

/**
 *
 * @author mauro
 */
public class Estudiante {
    private String Nombre;
    private Integer Nota;

    public Estudiante() {
    }

    public Estudiante(String Nombre, Integer Nota) {
        this.Nombre = Nombre;
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getNota() {
        return Nota;
    }

    public void setNota(Integer Nota) {
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Nota=" + Nota + '}';
    }
}
