package ejercicio1.Servicios;

import ejercicio1.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class CuentaBancariaServicios {
    
    private Scanner sc = new Scanner(System.in);
    
    
    
    public CuentaBancaria CrearCuenta(){
        System.out.println("Ingrese el numero de cuenta");
        int numero = sc.nextInt();
        
        System.out.println("Ingrese el numero de DNI");
        long dni = sc.nextLong();
        
        System.out.println("Ingrese su saldo");
        double saldo = sc.nextDouble();
        
        return new CuentaBancaria(numero,dni,saldo);
    }
    
    public void Ingresar(CuentaBancaria m){
        System.out.println("Ingrese el monto a ingresar");
        m.setSaldo(sc.nextDouble()+m.getSaldo());
    }
    
    public void Retirar(CuentaBancaria m){
        System.out.println("Ingrese el monto a retirar");
        double monto = sc.nextDouble();
        
        if (m.getSaldo() < monto) {
            monto = m.getSaldo();
        }
        System.out.println("Usted retiro $" + monto);
        m.setSaldo(m.getSaldo()-monto);
    }
    
    public void ExtraccionRapida(CuentaBancaria m){
        System.out.println("Ingrese el monto a retirar, recuerde que no debe exceder el 20% de su saldo total");
        double monto = sc.nextDouble();
        
        if (m.getSaldo()*0.2 < monto) {
            System.out.println("El monto excede el limite");
        } else {
            System.out.println("Monto extraido $" + monto);
            m.setSaldo(m.getSaldo()-monto);
            System.out.println("Saldo Restante $" + m.getSaldo());
        }
    }
    
    public void ConsultarSaldo(CuentaBancaria m){
        System.out.println("Su saldo es $" + m.getSaldo());
    }
    
    public void ConsultarDatos(CuentaBancaria m){
        System.out.println("Numero de cuenta: " + m.getNumeroCuenta());
        System.out.println("DNI:              " + m.getDNICliente());
        System.out.println("Saldo:            " + m.getSaldo());
    }
    
}
