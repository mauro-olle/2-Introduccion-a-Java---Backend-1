package Entidades;

/**
 *
 * @author mauro
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long DNICliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNICliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", DNICliente=" + DNICliente + ", saldoActual=" + saldoActual + '}';
    }

}
