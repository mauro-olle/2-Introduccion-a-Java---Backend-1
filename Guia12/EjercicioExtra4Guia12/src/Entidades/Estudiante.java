package Entidades;

/**
 *
 * @author mauro
 */
public final class Estudiante extends Persona{
    private String Curso;

    public Estudiante() {
    }

    public Estudiante(String Curso, String Nombre, String Apellido, Integer Identificacion, String EstadoCivil) {
        super(Nombre, Apellido, Identificacion, EstadoCivil);
        this.Curso = Curso;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
    public void matricularEnUnNuevoCurso(String curso){
        this.Curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante" + super.toString() + "\nCurso: " + Curso;
    }
}
