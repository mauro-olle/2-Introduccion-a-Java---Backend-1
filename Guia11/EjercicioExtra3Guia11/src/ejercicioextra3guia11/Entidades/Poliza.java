package ejercicioextra3guia11.Entidades;

import java.util.Date;

/**
 *
 * @author mauro
 */
public class Poliza {
    private Vehiculo Vehiculo;
    private Cliente Cliente;
    private String NumeroDePoliza;
    private Date FechaDeInicio;
    private Date FechaVencimiento;
    private Cuotas CantidadDeCuotas;
    private String FormaDePago;
    private Double MontoTotalAsegurado;
    private Boolean IncluyeGranizo;
    private Double MontoMaximoGranizo;
    private String TipoDeCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo Vehiculo, Cliente Cliente, String NumeroDePoliza, Date FechaDeInicio, Date FechaVencimiento, Cuotas CantidadDeCuotas, String FormaDePago, Double MontoTotalAsegurado, Boolean IncluyeGranizo, Double MontoMaximoGranizo, String TipoDeCobertura) {
        this.Vehiculo = Vehiculo;
        this.Cliente = Cliente;
        this.NumeroDePoliza = NumeroDePoliza;
        this.FechaDeInicio = FechaDeInicio;
        this.FechaVencimiento = FechaVencimiento;
        this.CantidadDeCuotas = CantidadDeCuotas;
        this.FormaDePago = FormaDePago;
        this.MontoTotalAsegurado = MontoTotalAsegurado;
        this.IncluyeGranizo = IncluyeGranizo;
        this.MontoMaximoGranizo = MontoMaximoGranizo;
        this.TipoDeCobertura = TipoDeCobertura;
    }

    

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public String getNumeroDePoliza() {
        return NumeroDePoliza;
    }

    public void setNumeroDePoliza(String NumeroDePoliza) {
        this.NumeroDePoliza = NumeroDePoliza;
    }

    public Date getFechaDeInicio() {
        return FechaDeInicio;
    }

    public void setFechaDeInicio(Date FechaDeInicio) {
        this.FechaDeInicio = FechaDeInicio;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public Cuotas getCantidadDeCuotas() {
        return CantidadDeCuotas;
    }

    public void setCantidadDeCuotas(Cuotas CantidadDeCuotas) {
        this.CantidadDeCuotas = CantidadDeCuotas;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }

    public void setFormaDePago(String FormaDePago) {
        this.FormaDePago = FormaDePago;
    }

    public Double getMontoTotalAsegurado() {
        return MontoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double MontoTotalAsegurado) {
        this.MontoTotalAsegurado = MontoTotalAsegurado;
    }

    public Boolean getIncluyeGranizo() {
        return IncluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean IncluyeGranizo) {
        this.IncluyeGranizo = IncluyeGranizo;
    }

    public Double getMontoMaximoGranizo() {
        return MontoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Double MontoMaximoGranizo) {
        this.MontoMaximoGranizo = MontoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return TipoDeCobertura;
    }

    public void setTipoDeCobertura(String TipoDeCobertura) {
        this.TipoDeCobertura = TipoDeCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "Vehiculo=" + Vehiculo + ", Cliente=" + Cliente + ", NumeroDePoliza=" + NumeroDePoliza + ", FechaDeInicio=" + FechaDeInicio + ", FechaVencimiento=" + FechaVencimiento + ", CantidadDeCuotas=" + CantidadDeCuotas + ", FormaDePago=" + FormaDePago + ", MontoTotalAsegurado=" + MontoTotalAsegurado + ", IncluyeGranizo=" + IncluyeGranizo + ", MontoMaximoGranizo=" + MontoMaximoGranizo + ", TipoDeCobertura=" + TipoDeCobertura + '}';
    }
    
    
}
