package ejercicio2guia11.Servicios;

import ejercicio2guia11.Entidades.Revolver;
import java.util.Objects;

/**
 *
 * @author mauro
 */
public class RevolverServicio {
    public Revolver LlenarRevolver(){
        int posAgua = (int)((Math.random() * 10) + 1);
        int posActual = (int)((Math.random() * 10) + 1);
        
        return new Revolver(posActual,posAgua);
    }
    
    public boolean Mojar(Revolver r){
        return Objects.equals(r.getPosicionActual(), r.getPosicionDelAgua());
    }
    
    public void SiguienteChorro(Revolver r){
        if (Objects.equals(r.getPosicionActual(), 10)) {
            r.setPosicionActual(1);
        } else {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }
    }
    
    public void MostrarPosiciones(Revolver r){
        System.out.println("La posicion actual es:   " + r.getPosicionActual());
        System.out.println("La posicion del agua es: " + r.getPosicionDelAgua());
    }
}
