/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package ejercicio5guia9;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio5Guia9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1 = ps.CrearPersona();
        System.out.println(p1);
        ps.CalcularEdad(p1);
        
        System.out.println("Ingrese la edad a comparar");
        if (ps.MenorQue(p1, sc.nextInt())) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }
        
        ps.MostrarPersona(p1);
    }
    
}
