package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class PersonaServicio {
    public Persona CrearPersona(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Scanner sc2 = new Scanner(System.in).useDelimiter("-");
        
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        
        System.out.println("Ingrese su fecha de nacimiento separado por un -");
        int dia = sc2.nextInt();
        int mes = sc2.nextInt()-1;
        int anio = sc2.nextInt()-1900;
        
        Date fecha = new Date(anio,mes,dia);

        return new Persona(nombre, fecha);
    }
    
    public int CalcularEdad(Persona p){
        Date hoy = new Date();
        
        int edad = hoy.getYear() - p.getFechaDeNaciemiento().getYear();
        hoy.setYear(p.getFechaDeNaciemiento().getYear());
        
        if (hoy.compareTo(p.getFechaDeNaciemiento()) == 1) {
            return edad;
        } else {
            return (edad-1);
        }
    }
    
    public boolean MenorQue(Persona p, int edad){
        return CalcularEdad(p) < edad;
    }
    
    public void MostrarPersona(Persona p){
        System.out.println("Nombre:              " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaDeNaciemiento());
        System.out.println("Edad:                " + CalcularEdad(p));
    }
}
