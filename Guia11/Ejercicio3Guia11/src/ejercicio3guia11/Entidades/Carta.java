package ejercicio3guia11.Entidades;



/**
 *
 * @author mauro
 */
public class Carta{
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

    public String getPalo() {
        return Palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "Numero=" + Numero + ", Palo=" + Palo + '}';
    }
}
