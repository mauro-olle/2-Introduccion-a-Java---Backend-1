/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
package ejercicio3;

import ejercicio3.Entidades.Persona;
import ejercicio3.Servicios.PersonaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        ArrayList<Persona> personas = new ArrayList();
        
        System.out.println("¿Cuantas personas desea ingresar?");
        int cantPersonas = sc.nextInt();
        
        for (int i = 0; i < cantPersonas; i++) {
            personas.add(ps.CrearPersonaAleatoria());
        }
        
        ps.PorcentajeMayoresDeEdad(ps.crearArrayMayorEdad(personas));
        ps.PorcentajeIMC(ps.crearArrayIMC(personas));
        
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
//        Persona p1 = ps.CrearPersona();
//        Persona p2 = ps.CrearPersona();
//        Persona p3 = ps.CrearPersona();
//        Persona p4 = ps.CrearPersona();
//        
//        boolean MayorEdad[] = new boolean[4];
//        int IMC[] = new int[4];
//        
//        MayorEdad[0] = ps.EsMayorDeEdad(p1);
//        IMC[0] = ps.CalcularIMC(p1);
//        
//        MayorEdad[1] = ps.EsMayorDeEdad(p2);
//        IMC[1] = ps.CalcularIMC(p2);
//        
//        MayorEdad[2] = ps.EsMayorDeEdad(p3);
//        IMC[2] = ps.CalcularIMC(p3);
//        
//        MayorEdad[3] = ps.EsMayorDeEdad(p4);
//        IMC[3] = ps.CalcularIMC(p4);
//        
//        ps.PorcentajeMayoresDeEdad(MayorEdad);
//        ps.PorcentajeIMC(IMC);
//        
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
    }
    
}
