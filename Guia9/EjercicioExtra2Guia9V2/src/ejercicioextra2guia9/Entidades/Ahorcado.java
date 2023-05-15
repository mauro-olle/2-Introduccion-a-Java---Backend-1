package ejercicioextra2guia9.Entidades;

import java.util.Arrays;

/**
 *
 * @author mauro
 */
public class Ahorcado {
    private String[] Palabra;
    private int LetrasEncontradas;
    private int Intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] Palabra, int Intentos) {
        this.Palabra = Palabra;
        this.Intentos = Intentos;
    }

    public String[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(String[] Palabra) {
        this.Palabra = Palabra;
    }

    public int getLetrasEncontradas() {
        return LetrasEncontradas;
    }

    public void setLetrasEncontradas(int LetrasEncontradas) {
        this.LetrasEncontradas = LetrasEncontradas;
    }

    public int getIntentos() {
        return Intentos;
    }

    public void setIntentos(int Intentos) {
        this.Intentos = Intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "Palabra=" + Arrays.toString(Palabra) + ", LetrasEncontradas=" + LetrasEncontradas + ", Intentos=" + Intentos + '}';
    }
}
