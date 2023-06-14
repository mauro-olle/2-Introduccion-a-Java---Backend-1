package ejercicioextra3guia11.Entidades;

import java.util.Date;

/**
 *
 * @author mauro
 */
public class Cuotas {
    private Integer NumeroDeCuota;
    private Double MontoCuota;
    private Boolean PagoRealizado;
    private Date FechaVencimiento;
    private String FormaDePago;

    public Cuotas() {
    }

    public Cuotas(Integer NumeroDeCuota, Double MontoCuota, Boolean PagoRealizado, Date FechaVencimiento, String FormaDePago) {
        this.NumeroDeCuota = NumeroDeCuota;
        this.MontoCuota = MontoCuota;
        this.PagoRealizado = PagoRealizado;
        this.FechaVencimiento = FechaVencimiento;
        this.FormaDePago = FormaDePago;
    }

    public Integer getNumeroDeCuota() {
        return NumeroDeCuota;
    }

    public void setNumeroDeCuota(Integer NumeroDeCuota) {
        this.NumeroDeCuota = NumeroDeCuota;
    }

    public Double getMontoCuota() {
        return MontoCuota;
    }

    public void setMontoCuota(Double MontoCuota) {
        this.MontoCuota = MontoCuota;
    }

    public Boolean getPagoRealizado() {
        return PagoRealizado;
    }

    public void setPagoRealizado(Boolean PagoRealizado) {
        this.PagoRealizado = PagoRealizado;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }

    public void setFormaDePago(String FormaDePago) {
        this.FormaDePago = FormaDePago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "NumeroDeCuota=" + NumeroDeCuota + ", MontoCuota=" + MontoCuota + ", PagoRealizado=" + PagoRealizado + ", FechaVencimiento=" + FechaVencimiento + ", FormaDePago=" + FormaDePago + '}';
    }
    
    
}
