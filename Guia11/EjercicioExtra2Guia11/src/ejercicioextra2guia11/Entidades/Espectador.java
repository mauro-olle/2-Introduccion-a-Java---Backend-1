package ejercicioextra2guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Espectador {
    private String Nombre;
    private Integer Edad;
    private Double Dinero;

    public Espectador() {
        String[] nombresDePersona = {"Juan", "María", "Pedro", "Ana", "Carlos", "Lucía", "Javier", "Sofía", "Miguel", "Laura", "David", "Carmen", "José", "Marta", "Francisco", "Isabel", "Antonio", "Pilar", "Jorge", "Teresa", "Luis", "Sara", "Fernando", "Elena", "Pablo", "Raquel", "Manuel", "Rosa", "Daniel", "Cristina", "Rafael", "Lourdes", "Alberto", "Natalia", "Mario", "Mercedes", "Sergio", "Beatriz", "Ramón", "Silvia","Jesús","Julia","Enrique","Irene","Víctor","Patricia","Ángel","Susana","Óscar","Andrea","Adrián","Esther","Marcos","Mónica","Rubén","Alicia","Roberto","Inés","Jaime","Eva","Hugo","Clara","Ignacio","Paula","Alejandro","Alba","Emilio","Cecilia","Diego","Gloria","Ricardo","Yolanda","Joaquín","Noelia","Agustín","Marina","Félix","Nerea"};
        int n = (int)(Math.random()*78);
        this.Nombre = nombresDePersona[n];
        
        this.Edad = (int)(Math.random()*59)+6;
        
        int aux = (int)(Math.random()*500000);
        this.Dinero = (double)aux/100;
    }

    public Espectador(String Nombre, Integer Edad, Double Dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Double getDinero() {
        return Dinero;
    }

    public void setDinero(Double Dinero) {
        this.Dinero = Dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Dinero=" + Dinero + '}';
    }
    
    
}
