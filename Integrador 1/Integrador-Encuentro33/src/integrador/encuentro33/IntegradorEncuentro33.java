package integrador.encuentro33;

import integrador.encuentro33.Entidades.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class IntegradorEncuentro33 {

    public static void main(String[] args) {
        Estudiante[] est = new Estudiante[8];
        ArrayList<String> estPro = new ArrayList<>();
        
        est[0] = new Estudiante();
        est[1] = new Estudiante();
        est[2] = new Estudiante();
        est[3] = new Estudiante();
        est[4] = new Estudiante();
        est[5] = new Estudiante();
        est[6] = new Estudiante();
        est[7] = new Estudiante();
        
        double nota = 0;
        double promedio;
        
        for (Estudiante e : est) {
            nota += e.getNota();
        }
        
        promedio = nota/8;
        
        for (Estudiante e : est) {
            if (e.getNota() > promedio) {
                estPro.add(e.getNombre());
                System.out.println(e.getNombre());
            }
        }
    }
}
