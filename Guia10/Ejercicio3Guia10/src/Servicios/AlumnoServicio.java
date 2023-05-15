package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class AlumnoServicio {
    public ArrayList<Alumno> alumnos = new ArrayList();
    
    public void CrearAlumnos() {
        String respuesta;

        do {
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.next();

            System.out.println("Ingrese las notas");

            notas.add(sc.nextInt());
            notas.add(sc.nextInt());
            notas.add(sc.nextInt());

            alumnos.add(new Alumno(nombre, notas));
            
            System.out.println("¿Desea ingresar otro usuario?");
            respuesta = sc.next();

        } while (!respuesta.equalsIgnoreCase("no"));
    }
    
    public void NotaFinal(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = false;
        double acumulador = 0;
        double cont = 0;
        
        System.out.println("Ingrese el alumno del que quiera calcular su nota");
        String nombre = sc.next();
        
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer b : a.getNotas()) {
                    acumulador += b;
                    cont ++;
                }
                System.out.println("Las notas del alumno son " + a.getNotas());
                bandera = true;
            }
        }
        if (bandera) {
            System.out.println("El promedio es " + (acumulador/cont));
        }else{
            System.out.println("El alumno no se encuentra ingresado");
        }
        
    }
}
