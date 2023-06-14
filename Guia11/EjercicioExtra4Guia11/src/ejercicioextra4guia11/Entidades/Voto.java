package ejercicioextra4guia11.Entidades;

import java.util.ArrayList;

/**
 *Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 * @author mauro
 */
public class Voto {
    private Alumno Alumno;
    private ArrayList<Alumno> AlumnosVotados;

    public Voto() {
    }

    public Voto(Alumno Alumno, ArrayList<Alumno> AlumnosVotados) {
        this.Alumno = Alumno;
        this.AlumnosVotados = AlumnosVotados;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return AlumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> AlumnosVotados) {
        this.AlumnosVotados = AlumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "Alumno=" + Alumno + ", AlumnosVotados=" + AlumnosVotados + '}';
    }
    
    
}
