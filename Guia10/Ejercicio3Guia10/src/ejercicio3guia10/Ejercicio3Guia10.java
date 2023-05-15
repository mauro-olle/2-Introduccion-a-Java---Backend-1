package ejercicio3guia10;

import Servicios.AlumnoServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio3Guia10 {
    
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        
        as.CrearAlumnos();
        as.NotaFinal();
        as.CrearAlumnos();
        System.out.println(as.alumnos.toString());
    }
    
}
