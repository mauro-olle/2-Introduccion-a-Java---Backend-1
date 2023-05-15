package ejercicioextra4.guia7.Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Cuenta {
    private double saldo;
    private String titular;
    
    public Cuenta(){
        
    }
    
    public Cuenta(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void retirarDinero(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a retirar");
        double dineroARetirar = sc.nextDouble();
        
        if (saldo < dineroARetirar) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= dineroARetirar;
        }
    }
}
