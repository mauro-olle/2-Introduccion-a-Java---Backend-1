package ejercicio2guia11.Servicios;

import ejercicio2guia11.Entidades.Jugador;
import ejercicio2guia11.Entidades.Revolver;

/**
 *
 * @author mauro
 */
public class JugadorServicio {
    public void Disparo(Revolver r, Jugador j){
        RevolverServicio rs = new RevolverServicio();
        r = rs.LlenarRevolver();
        
        if (rs.Mojar(r)) {
            j.setMojado(Boolean.TRUE);
            System.out.println("Jugador Muerto\n\n");
        } else {
            System.out.println("Sobreviviste\n\n");
        }
        rs.SiguienteChorro(r);
    }
}
