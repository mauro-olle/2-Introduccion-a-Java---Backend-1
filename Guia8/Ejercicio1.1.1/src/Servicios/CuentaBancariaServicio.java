package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class CuentaBancariaServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = sc.nextInt();
        
        System.out.println("Ingrese el DNI");
        long DNI = sc.nextLong();
        
        System.out.println("Ingrese su saldo");
        double saldo = sc.nextDouble();
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta,DNI,saldo);
        
        return cuenta;
    }
    
    public void Ingresar(CuentaBancaria cb){
        System.out.println("¿Cuanto dinero desea ingresar?");
        double monto = sc.nextDouble();
        
        cb.setSaldoActual(cb.getSaldoActual()+monto);
    }
    
    public void Retirar(CuentaBancaria cb){
        System.out.println("¿Cuanto dinero desea retirar?");
        double monto = sc.nextDouble();
        
        if (monto <= cb.getSaldoActual()) {
            cb.setSaldoActual(cb.getSaldoActual() - monto);
        } else {
            System.out.println("Usted solo pudo retirar $" + (cb.getSaldoActual()));
            cb.setSaldoActual(0);
        }
    }
    
    public void ExtraccionRapida(CuentaBancaria cb){
        System.out.println("¿Cuanto dinero desea extraer? \nRecuerde que solo puede extraer el 20% de su saldo actual. \nSu saldo actual es: $" + cb.getSaldoActual());
        double monto = sc.nextDouble();
        
        if ((cb.getSaldoActual()*0.2) >= monto) {
            cb.setSaldoActual(cb.getSaldoActual()-monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void ConsultarSaldo(CuentaBancaria cb){
        System.out.println("Su saldo actual es $" + cb.getSaldoActual());
    }
    
    public void ConsultarDatos(CuentaBancaria cb){
        System.out.println("Su numero de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("Su DNI es :             " + cb.getDNICliente());
        System.out.println("Su saldo actual es:     $" + cb.getSaldoActual());
    }
}
