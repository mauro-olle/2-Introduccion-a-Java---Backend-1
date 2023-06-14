package ejercicioextra1guia11.Entidades;

import java.util.Objects;

/**
 *
 * @author mauro
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private Integer Edad;
    private Integer Documento;
    private Perro Mascota;

    public Persona() {
        String[] nombresDePersona = {"Juan", "María", "Pedro", "Ana", "Carlos", "Lucía", "Javier", "Sofía", "Miguel", "Laura"};
        int n = (int)(Math.random()*10);
        this.Nombre = nombresDePersona[n];
        
        String[] apellidos = {"González", "Rodríguez", "López", "Fernández", "García", "Pérez", "Martínez", "Gómez", "Díaz", "Sánchez"};
        n = (int)(Math.random()*10);
        this.Apellido = apellidos[n];
    
        this.Edad = (int)(Math.random()*65)+5;
        
        this.Documento = (int)(Math.random()*20000000)+20000000;
    }

    public Persona(String Nombre, String Apellido, Integer Edad, Integer Documento, Perro Mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Documento = Documento;
        this.Mascota = Mascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer Documento) {
        this.Documento = Documento;
    }

    public Perro getMascota() {
        return Mascota;
    }

    public void setMascota(Perro Mascota) {
        this.Mascota = Mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + ", Documento=" + Documento + ", Mascota=" + Mascota + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Nombre);
        hash = 29 * hash + Objects.hashCode(this.Apellido);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return Objects.equals(this.Apellido, other.Apellido);
    }
    
    
}
