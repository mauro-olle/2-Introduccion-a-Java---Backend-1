package ejercicio3guia11.Entidades;

import java.util.Comparator;

/**
 *
 * @author mauro
 */
public class Carta {
    private Integer Numero;
    private String Palo;

    public Carta() {
    }

    public Carta(Integer Numero, String Palo) {
        this.Numero = Numero;
        this.Palo = Palo;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    @Override
    public String toString() {
        if (Numero < 10) {
            return "Carta{0" + Numero + " " + Palo + '}';
        }
        return "Carta{" + Numero + " " + Palo + '}';
    }

    public static Comparator<Carta> ComparadorDeCartasPorNumero = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getNumero().compareTo(c2.getNumero());
        }
    };
}
