package ejercicio2guia11v2.Entidades;

import java.util.Objects;

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

    public Integer getPosicionDelAgua() {
        return PosicionDelAgua;
    }
    
    public void LlenarRevolver(){
        PosicionActual = (int) ((Math.random()*10)+1);
        PosicionDelAgua = (int) ((Math.random()*10)+1);
    }
    
    public boolean Matar(){
        return Objects.equals(this.PosicionActual, this.PosicionDelAgua);
    }

    public void setPosicionActual(Integer PosicionActual) {
        this.PosicionActual = PosicionActual;
    }
    
    public void SiguienteBala(){
        if (PosicionActual!=10) {
            PosicionActual += 1;
        } else {
            PosicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "PosicionActual=" + PosicionActual + ", PosicionDelAgua=" + PosicionDelAgua + '}';
    }
}
