package ejercicioextra4guia11.Entidades;

import java.util.Comparator;


/**
 *
 * @author mauro
 */
public class Alumno {
    private String NombreCompleto;
    private Integer Documento;
    private Integer Votos;

    public Alumno() {
    }

    public Alumno(String NombreCompleto, Integer Documento) {
        this.NombreCompleto = NombreCompleto;
        this.Documento = Documento;
        this.Votos = 0;
    }

    public Alumno(String NombreCompleto, Integer Documento, Integer Votos) {
        this.NombreCompleto = NombreCompleto;
        this.Documento = Documento;
        this.Votos = Votos;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer Documento) {
        this.Documento = Documento;
    }

    public Integer getVotos() {
        return Votos;
    }

    public void setVotos(Integer Votos) {
        this.Votos = Votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NombreCompleto=" + NombreCompleto + ", Documento=" + Documento + ", Votos=" + Votos + '}';
    }
    
    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getVotos().compareTo(o1.getVotos());
        }
    };
            
}
