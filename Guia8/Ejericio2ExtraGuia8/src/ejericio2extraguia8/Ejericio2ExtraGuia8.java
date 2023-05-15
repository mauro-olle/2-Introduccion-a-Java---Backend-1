package ejericio2extraguia8;

import Entidades.NIF;
import Servicios.NIFServicio;

/**
 *
 * @author mauro
 */
public class Ejericio2ExtraGuia8 {

    public static void main(String[] args) {
        NIFServicio nf = new NIFServicio();
        
        NIF usuario1 = nf.crearNIF();
        System.out.println(usuario1);
        
        nf.MostrarNIF(usuario1);
    }
}
