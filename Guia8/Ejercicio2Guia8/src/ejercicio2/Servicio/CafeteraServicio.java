package ejercicio2.Servicio;

import ejercicio2.Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class CafeteraServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void LlenarCafetera(Cafetera m){
        m.setCantidadActual(m.getCapacidadMaxima());
        System.out.println("Cafetera llena");
    }
    
    public void ServirTaza(Cafetera m){
        System.out.println("¿Cual es el tamaño de la taza?");
        int tamano = sc.nextInt();

        if (tamano < m.getCantidadActual()) {
            System.out.println("Taza llena");
            m.setCantidadActual(m.getCantidadActual() - tamano);
        } else {
            System.out.println("Solo quedan " + m.getCantidadActual() + "ml");
            m.setCantidadActual(0);
        }
    }
    
    public void VaciarCafetera(Cafetera m) {
        System.out.println("Cafetera Vacia");
        m.setCantidadActual(0);
    }
    
    public void AgregarCafe(Cafetera m){
        System.out.println("¿Cuanto cafe desea agregar?");
        int cantidad = sc.nextInt();
        
        if (m.getCantidadActual()+cantidad < m.getCapacidadMaxima()) {
            m.setCantidadActual(m.getCantidadActual()+cantidad);
            System.out.println("La cafetera ahora contiene " + m.getCantidadActual() + "ml");
        } else {
            System.out.println("Solo se agregaron " + (m.getCapacidadMaxima()-m.getCantidadActual()) + "ml por que llego a su capacidad maxima");
            m.setCantidadActual(m.getCapacidadMaxima());
        }
    }
}
