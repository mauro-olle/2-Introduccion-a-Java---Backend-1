package Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Televisor extends Electrodomestico{
    private Integer Resolucion;
    private Boolean SintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer Resolucion, Boolean SintonizadorTDT, Double Precio, String Color, char ConsumoEnergetico, Double Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Resolucion = Resolucion;
        this.SintonizadorTDT = SintonizadorTDT;
    }

    public Integer getResolucion() {
        return Resolucion;
    }

    public void setResolucion(Integer Resolucion) {
        this.Resolucion = Resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return SintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean SintonizadorTDT) {
        this.SintonizadorTDT = SintonizadorTDT;
    }
    
    public Televisor CrearTelevisor(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Vamos a cargar los datos de un Televisor");
        crearElectrodomestico();
        
        System.out.println("Ingrese el tamaño en pulgadas");
        int resolucion = sc.nextInt();
        
        System.out.println("¿Tiene sintonizador TDT?");
        boolean sintonizadorTDT = sc.next().equalsIgnoreCase("si");
        
        return new Televisor(resolucion, sintonizadorTDT, Precio, Color, ConsumoEnergetico, Peso);
    }
    
    public void PrecioFinal(){
        super.precioFinal();
        
        if(Resolucion > 40) Precio *= 1.3;
        
        if(SintonizadorTDT) Precio += 500;
    }

    @Override
    public String toString() {
        return "Televisor{"+ super.toString() + "Resolucion=" + Resolucion + ", SintonizadorTDT=" + SintonizadorTDT + '}';
    }
    
    
}
