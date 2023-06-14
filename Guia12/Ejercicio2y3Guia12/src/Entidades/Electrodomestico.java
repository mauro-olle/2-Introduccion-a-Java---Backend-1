package Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Electrodomestico {
    protected Double Precio;
    protected String Color;
    protected char ConsumoEnergetico;
    protected Double Peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double Precio, String Color, char ConsumoEnergetico, Double Peso) {
        this.Precio = Precio;
        this.Color = Color;
        this.ConsumoEnergetico = ConsumoEnergetico;
        this.Peso = Peso;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public char getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public void setConsumoEnergetico(char ConsumoEnergetico) {
        this.ConsumoEnergetico = ConsumoEnergetico;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        return switch (letra) {
            case 'a', 'A' -> 'A';
            case 'b', 'B' -> 'B';
            case 'c', 'C' -> 'C';
            case 'd', 'D' -> 'D';
            case 'e', 'E' -> 'E';
            case 'f', 'F' -> 'F';
            default -> 'F';
        };
    }

    private String comprobarColor(String color){
        return switch(color.toLowerCase()){
            case "blanco" -> "Blanco";
            case "negro"  -> "Negro";
            case "rojo"   -> "Rojo";
            case "azul"   -> "Azul";
            case "gris"   -> "Gris";
            default -> "Blanco";
        };
    }

    protected void crearElectrodomestico(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color");
        Color = comprobarColor(sc.next());
        
        System.out.println("Ingrese el peso");
        Peso = sc.nextDouble();
        
        System.out.println("Ingrese la eficiencia energetica");
        ConsumoEnergetico = comprobarConsumoEnergetico(sc.next().charAt(0));
        
        Precio = 1000d;
    }
    
    protected void precioFinal(){
        switch(ConsumoEnergetico){
            case 'A' -> Precio += 1000;
            case 'B' -> Precio += 800;
            case 'C' -> Precio += 600;
            case 'D' -> Precio += 500;
            case 'E' -> Precio += 300;
            case 'F' -> Precio += 100;
        }
        
        if(Peso < 20) Precio += 100;
        else if(Peso >= 20 && Peso < 50) Precio += 500;
        else if(Peso >= 50 && Peso < 80) Precio += 800;
        else if(Peso >= 80) Precio += 1000;
    }

    @Override
    public String toString() {
        return "Precio=" + Precio + ", Color=" + Color + ", ConsumoEnergetico=" + ConsumoEnergetico + ", Peso=" + Peso + ", ";
    }

    
    
    
}
