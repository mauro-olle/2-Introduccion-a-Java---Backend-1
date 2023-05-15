package ejercicio1.Entidades;

/**
 *
 * @author mauro
 */
public class CuentaBancaria {
    private int NumeroCuenta;
    private long DNICliente;
    private double Saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, long DNICliente, double Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNICliente = DNICliente;
        this.Saldo = Saldo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DNICliente=" + DNICliente + ", Saldo=" + Saldo + '}';
    }
    
    
}
