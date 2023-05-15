package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class FechaServicio {
    
    public Date FechaNacimiento(){
        Scanner sc = new Scanner(System.in).useDelimiter("-");
        System.out.println("Ingrese la fecha de nacimiento con el siguente formato DD-MM-AAAA-");
        int dia = sc.nextInt();
        int mes = sc.nextInt()-1;
        int anio = sc.nextInt()-1900;
        
        return new Date(anio, mes, dia);
    }
    
    public Date FechaActual(){
        return new Date();
    }
    
    public int Diferencia(Date a, Date b){
        int edad = a.getYear() - b.getYear();
        a.setYear(b.getYear());
        
        if (a.compareTo(b) == -1) {
            return edad - 1;
        } else {
            return edad;
        }
    }
}
