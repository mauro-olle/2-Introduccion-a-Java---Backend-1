package ejercicio1.pkg1.pkg1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author mauro
 */
public class Ejercicio111 {


    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = new CuentaBancaria(6465465,46465,1000);

        System.out.println(cuenta1);
        
        cbs.Ingresar(cuenta1);
        System.out.println(cuenta1);

        
        cbs.Retirar(cuenta1);
        System.out.println(cuenta1);
        
        cbs.ExtraccionRapida(cuenta1);
        System.out.println(cuenta1);


        cbs.ExtraccionRapida(cuenta1);
        System.out.println(cuenta1);
        
        cbs.ConsultarSaldo(cuenta1);
        cbs.ConsultarDatos(cuenta1);
    }
    
}
