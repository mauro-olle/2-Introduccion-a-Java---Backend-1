package Entidades;

import java.util.Random;

/**
 *
 * @author mauro
 */
public class EdificioDeOficinas extends Edificio{
    private Integer NumeroDeOficinasPorPiso;
    private Integer CantidadDePersonasPorOficina;
    private Integer NumeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer NumeroDeOficinasPorPiso, Integer CantidadDePersonasPorOficina, Integer NumeroDePisos, Double Ancho, Double Alto, Double Largo) {
        super(Ancho, Alto, Largo);
        this.NumeroDeOficinasPorPiso = NumeroDeOficinasPorPiso;
        this.CantidadDePersonasPorOficina = CantidadDePersonasPorOficina;
        this.NumeroDePisos = NumeroDePisos;
    }

    public Integer getNumeroDeOficinasPorPiso() {
        return NumeroDeOficinasPorPiso;
    }

    public void setNumeroDeOficinasPorPiso(Integer NumeroDeOficinasPorPiso) {
        this.NumeroDeOficinasPorPiso = NumeroDeOficinasPorPiso;
    }

    public Integer getCantidadDePersonasPorOficina() {
        return CantidadDePersonasPorOficina;
    }

    public void setCantidadDePersonasPorOficina(Integer CantidadDePersonasPorOficina) {
        this.CantidadDePersonasPorOficina = CantidadDePersonasPorOficina;
    }

    public Integer getNumeroDePisos() {
        return NumeroDePisos;
    }

    public void setNumeroDePisos(Integer NumeroDePisos) {
        this.NumeroDePisos = NumeroDePisos;
    }

    public EdificioDeOficinas crearEdificio(){
        Random rand = new Random();
        int a = rand.nextInt(15)+1;
        int b = rand.nextInt(4)+1;
        int c = rand.nextInt(20)+3;
        double d = rand.nextDouble(5d)+10d;
        double e = 3.57 * c;
        double f = rand.nextDouble(5d)+10d;
        
        return new EdificioDeOficinas(a, b, c, d, e, f);
    }
    
    public void cantPersonas(EdificioDeOficinas e){
        System.out.println("Personas por piso: " + (e.getNumeroDeOficinasPorPiso()*e.getCantidadDePersonasPorOficina()));
        System.out.println("Personas por edificio: " + (e.getNumeroDeOficinasPorPiso()*e.getCantidadDePersonasPorOficina())*e.getNumeroDePisos()); 
    }

    @Override
    public double calcularSuperficie() {
        return Ancho * Largo;
    }

    @Override
    public double calcularVolumen() {
        return Ancho * Largo * Alto;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas" + super.toString() + "\nNumeroDeOficinas: " + NumeroDeOficinasPorPiso + "\nCantidadDePersonasPorOficina: " + CantidadDePersonasPorOficina + "\nNumeroDePisos: " + NumeroDePisos;
    }
}
