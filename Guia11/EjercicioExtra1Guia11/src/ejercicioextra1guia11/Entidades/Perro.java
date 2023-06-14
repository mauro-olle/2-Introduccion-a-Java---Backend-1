package ejercicioextra1guia11.Entidades;

import java.util.Objects;

/**
 *
 * @author mauro
 */
public class Perro {
    private String Nombre;
    private String Raza;
    private Integer Edad;
    private String Tamanio;

    public Perro() {
        String[] nombresDePerros = {"Fido", "Rex", "Toby", "Lassie", "Buddy", "Duke", "Sadie", "Bella", "Lucy", "Max", "Charlie", "Bailey", "Rocky", "Molly", "Daisy", "Coco", "Roxy", "Luna", "Zeus", "Jack"};
        int n = (int)(Math.random()*15);
        this.Nombre = nombresDePerros[n];
        
        String[] razasDePerros = {"Labrador Retriever", "Pastor Alemán", "Golden Retriever", "Bulldog Francés", "Beagle", "Poodle", "Rottweiler", "Yorkshire Terrier", "Boxer", "Dachshund"};
        n = (int)(Math.random()*10);
        this.Raza = razasDePerros[n];
        
        this.Edad = (int)(Math.random()*10)+1;
        
        String[] tamanios = {"Pequeño","Mediano","Grande"};
        n = (int)(Math.random()*3);
        this.Tamanio = tamanios[n];
        
    }

    public Perro(String Nombre, String Raza, Integer Edad, String Tamanio) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
        this.Tamanio = Tamanio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Raza=" + Raza + ", Edad=" + Edad + ", Tamanio=" + Tamanio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        return Objects.equals(this.Nombre, other.Nombre);
    }

  
    
    
}
