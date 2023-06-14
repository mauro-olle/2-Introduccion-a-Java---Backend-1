package ejercicioextra4guia11;

import ejercicioextra4guia11.Entidades.Alumno;
import ejercicioextra4guia11.Entidades.Simulador;
import ejercicioextra4guia11.Entidades.Voto;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class EjercicioExtra4Guia11 {

    public static void main(String[] args) {
        Simulador s = new Simulador();
        ArrayList<Alumno> al = s.CrearAlumnos();
        ArrayList<Voto> votos = s.Votacion(al);
        
        s.MostrarAlumnos(votos);
        s.RecuentoVotos(votos,al);
        s.CrearFacilitadores(al);
    }
}
