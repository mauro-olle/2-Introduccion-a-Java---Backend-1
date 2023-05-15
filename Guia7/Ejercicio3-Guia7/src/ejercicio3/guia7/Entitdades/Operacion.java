package ejercicio3.guia7.Entitdades;

/**
 *
 * @author mauro
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void CrearOperacion (double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double Sumar (){
        double resultado = numero1 + numero2;
        return resultado;
    }
    
    public double Restar (){
        double resultado = numero1 - numero2;
        return resultado;
    }
    
    public double Multiplicar (){
        double resultado = numero1 * numero2;
        if (numero1 == 0 || numero2 == 0) System.out.println("Ingresar un numero distinto de cero");
        return resultado;
    }
    
    public double Dividir () {
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            return resultado;
        } else {
            System.out.println("No se puede dividir por 0");
            return 0;
        }
    }
}
