package ejercicio5guia10.Entidades;

import java.util.Objects;

/**
 *
 * @author mauro
 */
public class Pais implements Comparable<Pais> {
    private String Nombre;
    private Integer Habitantes;
    private Integer Superficie;

    public Pais() {
    }

    public Pais(String Nombre, Integer Habitantes, Integer Superficie) {
        this.Nombre = Nombre;
        this.Habitantes = Habitantes;
        this.Superficie = Superficie;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getHabitantes() {
        return Habitantes;
    }

    public void setHabitantes(Integer Habitantes) {
        this.Habitantes = Habitantes;
    }

    public Integer getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(Integer Superficie) {
        this.Superficie = Superficie;
    }

    @Override
    public String toString() {
        return "Nombre=" + "Pais{" + Nombre + ", Habitantes=" + Habitantes + ", Superficie=" + Superficie + "km2}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        hash = 89 * hash + Objects.hashCode(this.Habitantes);
        hash = 89 * hash + Objects.hashCode(this.Superficie);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Habitantes, other.Habitantes)) {
            return false;
        }
        if (!Objects.equals(this.Superficie, other.Superficie)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return this.Nombre.compareTo(t.getNombre());
    }
    
    
}
