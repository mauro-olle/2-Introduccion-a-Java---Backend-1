package ejercicioextra4guia12;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra4Guia12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int respuesta;
        String respuesta2;
        
        HashMap<String,Persona> personas = new HashMap<>();
                
        Profesor p1 = new Profesor("Matematicas", Year.of(2015), 15, "Mauro", "Olle", 37103072, "Soltero");
        PersonalServicio ps1 = new PersonalServicio("Decanato", Year.of(2000), 25, "Eliana", "Fleita", 32698425, "Casado");
        Estudiante e1 = new Estudiante("Ingenieria en Sitemas", "Pedro", "Juarez", 43569125, "Soltero");

        personas.put(p1.getNombre() + " " + p1.getApellido(), p1);
        personas.put(ps1.getNombre() + " " + ps1.getApellido(), ps1);
        personas.put(e1.getNombre() + " " + e1.getApellido(), e1);
        
        
        do {
            System.out.println("¿Que accion desea Realizar?");
            System.out.println("1.-  Cambiar el estado civil de una persona");
            System.out.println("2.-  Reasignar el despacho a un empleado");
            System.out.println("3.-  Matricular un estudiante en un nuevo curso");
            System.out.println("4.-  Cambiar de departamento a un profesor");
            System.out.println("5.-  Trasladar de sección a un empleado del personal de servicio");
            System.out.println("6.- Salir");

            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("¿A quien desea cambiar el estado civil?");

                    for (Map.Entry<String, Persona> entry : personas.entrySet()) {
                        String key = entry.getKey();
                        Persona value = entry.getValue();
                        System.out.println(key);
                    }
                    
                    respuesta2 = sc.next();
                    
                    System.out.println("Ingrese el nuevo estado civil");
                    String estado = sc.next();
                    
                    personas.get(respuesta2).setEstadoCivil(estado);
                    
                    System.out.println(personas.get(respuesta2));
                    break;
                
                case 2:
                    System.out.println("¿A quien desea cambiar de despacho?");
                    
                    for (Map.Entry<String, Persona> entry : personas.entrySet()) {
                        String key = entry.getKey();
                        Persona value = entry.getValue();
                        
                        if(value instanceof Empleado){
                            System.out.println(key);
                        }
                    }
                    
                    respuesta2 = sc.next();
                    
                    System.out.println("Ingrese el nuevo despacho");
                    int numDesp = sc.nextInt();
                    
                    Empleado aux = (Empleado) personas.get(respuesta2);
                    
                    aux.setNumeroDespacho(numDesp);
                    
                    System.out.println(personas.get(respuesta2));
                    break;
                
                case 3:
                    System.out.println("¿A que estudiante desea matricular en un nuevo curso");
                    
                    for (Map.Entry<String, Persona> entry : personas.entrySet()) {
                        String key = entry.getKey();
                        Persona value = entry.getValue();
                        
                        if(value instanceof Estudiante){
                            System.out.println(key);
                        }
                    }
                    
                    respuesta2 = sc.next();
                    
                    System.out.println("Ingrese el nombre del curso");
                    String nomCurso = sc.next();
                    
                    Estudiante aux2 = (Estudiante) personas.get(respuesta2);
                    
                    aux2.setCurso(nomCurso);
                    
                    System.out.println(personas.get(respuesta2));
                    break;
                    
                case 4:
                    System.out.println("¿A que profesor desea cambiar de departamento");
                    
                    for (Map.Entry<String, Persona> entry : personas.entrySet()) {
                        String key = entry.getKey();
                        Persona value = entry.getValue();
                        
                        if (value instanceof Profesor) {
                            System.out.println(key);
                        }
                    }
                    
                    respuesta2 = sc.next();
                    
                    System.out.println("Ingrese el nuevo departamento");
                    String dpto = sc.next();
                    
                    Profesor aux3 = (Profesor) personas.get(respuesta2);
                    
                    aux3.setDepartamento(dpto);
                    
                    System.out.println(personas.get(respuesta2));
                    break;
                    
                
                case 5:
                    System.out.println("¿A quien desea trasladar de sección");
                    
                    for (Map.Entry<String, Persona> entry : personas.entrySet()) {
                        String key = entry.getKey();
                        Persona value = entry.getValue();
                        
                        if (value instanceof PersonalServicio) {
                            System.out.println(key);
                        }
                    }
                    
                    respuesta2 = sc.next();
                    
                    System.out.println("Ingrese la seccion a la que sera trasladado");
                    String seccion = sc.next();
                    
                    PersonalServicio aux4 = (PersonalServicio) personas.get(respuesta2);
                    
                    aux4.setSeccion(seccion);
                    
                    System.out.println(personas.get(respuesta2));
                    break;
                case 6:
                    System.out.println("Muchas Gracias");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                

            }

        } while (respuesta != 6);
    }

}
