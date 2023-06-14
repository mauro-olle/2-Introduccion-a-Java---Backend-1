package ejercicioextra3guia11.Entidades;

/**
 *Marca, 
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). 
 * @author mauro
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String NumeroDeMotor;
    private String NumeroDeChasis;
    private String Color;
    private String Tipo;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Modelo, String NumeroDeMotor, String NumeroDeChasis, String Color, String Tipo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.NumeroDeMotor = NumeroDeMotor;
        this.NumeroDeChasis = NumeroDeChasis;
        this.Color = Color;
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getNumeroDeMotor() {
        return NumeroDeMotor;
    }

    public void setNumeroDeMotor(String NumeroDeMotor) {
        this.NumeroDeMotor = NumeroDeMotor;
    }

    public String getNumeroDeChasis() {
        return NumeroDeChasis;
    }

    public void setNumeroDeChasis(String NumeroDeChasis) {
        this.NumeroDeChasis = NumeroDeChasis;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", NumeroDeMotor=" + NumeroDeMotor + ", NumeroDeChasis=" + NumeroDeChasis + ", Color=" + Color + ", Tipo=" + Tipo + '}';
    }
    
    
    
}
