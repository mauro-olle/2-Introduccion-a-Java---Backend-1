package Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Lavarropas extends Electrodomestico{
    private Integer Carga;

    public Lavarropas() {
    }
    
    public Lavarropas(Integer Carga, Double Precio, String Color, char ConsumoEnergetico, Double Peso) {
        super(Precio, Color, ConsumoEnergetico, Peso);
        this.Carga = Carga;
    }

    public Integer getCarga() {
        return Carga;
    }

    public void setCarga(Integer Carga) {
        this.Carga = Carga;
    }
    
    public Lavarropas CrearLavarropas(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Vamos a ingresar los datos de nuestro lavarropas");
        crearElectrodomestico();
        
        System.out.println("Ingrese la capacidad de carga");
        int carga = sc.nextInt();
        
        return new Lavarropas(carga, Precio, Color, ConsumoEnergetico, Peso);
    }
    
    public void PrecioFinal(){
        super.precioFinal();
        if(Carga > 30) Precio += 500;
    }

    @Override
    public String toString() {
        return "Lavarropas{" + super.toString() + "Carga=" + Carga + '}';
    }

    
    
}
