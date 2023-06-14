package ejercicio2guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Revolver {
    private Integer PosicionActual;
    private Integer PosicionDelAgua;

    public Revolver() {
    }

    public Revolver(Integer PosicionActual, Integer PosicionDelAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionDelAgua = PosicionDelAgua;
    }

    public Integer getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(Integer PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public Integer getPosicionDelAgua() {
        return PosicionDelAgua;
    }

    public void setPosicionDelAgua(Integer PosicionDelAgua) {
        this.PosicionDelAgua = PosicionDelAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosicionActual=" + PosicionActual + ", PosicionDelAgua=" + PosicionDelAgua + '}';
    }
}
