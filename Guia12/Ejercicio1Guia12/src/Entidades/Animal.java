package Entidades;

/**
 *
 * @author mauro
 */
public class Animal {
    protected String Nombre;
    protected String Alimento;
    protected Integer Edad;
    protected String Raza;

    public Animal(String Nombre, String Alimento, Integer Edad, String Raza) {
        this.Nombre = Nombre;
        this.Alimento = Alimento;
        this.Edad = Edad;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    public void Alimentarse(){
        System.out.println(Nombre + " se alimenta de " + Alimento);
    }
}
