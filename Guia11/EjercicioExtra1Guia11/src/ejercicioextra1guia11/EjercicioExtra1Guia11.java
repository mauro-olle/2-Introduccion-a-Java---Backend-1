package ejercicioextra1guia11;

import ejercicioextra1guia11.Entidades.Perro;
import ejercicioextra1guia11.Entidades.Persona;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author mauro
 */
public class EjercicioExtra1Guia11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Set<Perro> perros = new HashSet();
        Set<Persona> personas = new HashSet();
        
        while (perros.size() != 15) {
            perros.add(new Perro());
        }
        
        while (personas.size() != 5) {
            personas.add(new Persona());
        }
        
        for (Persona persona : personas) {
            System.out.println("Hola " + persona.getNombre() + " " + persona.getApellido());
            System.out.println("Ingrese el nombre del perro que desea adoptar\nLas opciones disponibles son:");
            int i = 1;
            for (Perro perro : perros) {
                System.out.println(i + ".- " + perro.getNombre() + " de raza " + perro.getRaza());
                i++;
            }
            
            String respuesta = sc.next();
            i = 1;
                    
            for (Perro perro : perros) {
                if (respuesta.equalsIgnoreCase(perro.getNombre())) {
                    System.out.println("\nFelicitaciones usted adopto a " + perro.getNombre() + "\n\n\n\n");
                    perros.remove(perro);
                    persona.setMascota(perro);
                    break;
                }
                if (i == perros.size()){
                    System.out.println("Ese perro no estaba disponible, escribi bien pelotudo\n\n\n\n");
                }
                i++;
            }
        }
        
        for(Persona persona : personas){
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " adopto un perro de raza " + persona.getMascota().getRaza() + " que se llama " + persona.getMascota().getNombre() + "\n");
        }
        
        System.out.println("\n\n\nLos perros que siguen sin adoptar son:");
        
        for(Perro p : perros){
            System.out.println(p.getNombre());
        }
        
        System.out.println("\nADOPTAR Y CASTRAR AYUDA A REDUCIR LOS PERROS SIN HOGAR");
    }
    
}
