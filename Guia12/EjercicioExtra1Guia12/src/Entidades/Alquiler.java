package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Alquiler {
    private String Nombre;
    private Integer DNI;
    private LocalDate FechaAlquiler;
    private LocalDate FechaDevolucion;
    private Integer PosicionAmarre;
    private Barco Barco;

    public Alquiler() {
    }

    public Alquiler(String Nombre, Integer DNI, LocalDate FechaAlquiler, LocalDate FechaDevolucion, Integer PosicionAmarre, Barco Barco) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.FechaAlquiler = FechaAlquiler;
        this.FechaDevolucion = FechaDevolucion;
        this.PosicionAmarre = PosicionAmarre;
        this.Barco = Barco;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return PosicionAmarre;
    }

    public void setPosicionAmarre(Integer PosicionAmarre) {
        this.PosicionAmarre = PosicionAmarre;
    }

    public Barco getBarco() {
        return Barco;
    }

    public void setBarco(Barco Barco) {
        this.Barco = Barco;
    }
        
    public Double Alquilar(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su nombre");
        Nombre = sc.next();
        
        System.out.println("Ingrese su DNI");
        this.DNI = sc.nextInt();
        
        System.out.println("Ingrese fecha de alquiler (año-mes-dia)");
        FechaAlquiler = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        System.out.println("Ingrese fecha de devolucion (año-mes-dia)");
        FechaDevolucion = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        System.out.println("Ingrese el tipo de barco que desea alquilar \n1.-Velero\n2.- A Motor\n3.- Yate de Lujo");
        int tipo = sc.nextInt();
        
        PosicionAmarre = (int)((Math.random()*20)+1);
        System.out.println("Su Barco se encuentra en el muelle " + PosicionAmarre);
        
        switch(tipo){
            case 1 -> {
                Velero v = new Velero();
                this.Barco = v.CrearVelero();
                System.out.println(Barco);
                return PrecioAlquiler();
            }
            case 2 -> {
                AMotor am = new AMotor();
                Barco = am.CrearBarcoAMotor();
                System.out.println(Barco);
                return PrecioAlquiler();
            }
            case 3 -> {
                YateDeLujo yl = new YateDeLujo();
                Barco = yl.CrearYateDeLujo();
                System.out.println(Barco);
                return PrecioAlquiler();
            }
            default -> {
                System.out.println("Ingrese una opcion correcta");
                return 0d;
            }
        }
    }
 
    private Double PrecioAlquiler(){
        double precio = 0d;
        
        int diasOcupacion = (int) ChronoUnit.DAYS.between(FechaAlquiler, FechaDevolucion);
        precio += diasOcupacion * Barco.getMetrosEslora() * 10;
        
        System.out.println("Usted alquilo por " + diasOcupacion + " dias");
        
        if (Barco instanceof Velero){
            Velero vel = (Velero) Barco;
            precio += vel.getNumeroMastiles() * 10;
        }else if (Barco instanceof AMotor){
            AMotor amot = (AMotor) Barco;
            precio += amot.getCV() * 10;
        }else if (Barco instanceof YateDeLujo){
            YateDeLujo ydl = (YateDeLujo) Barco;
            precio += ydl.getCV() * 10 + ydl.getCamarote() * 100;
        }
           
        return precio;
    }
    
    @Override
    public String toString() {
        return "Alquiler{" + "Nombre=" + Nombre + ", DNI=" + DNI + ", FechaAlquiler=" + FechaAlquiler + ", FechaDevolucion=" + FechaDevolucion + ", PosicionAmarre=" + PosicionAmarre + ", Barco=" + Barco + '}';
    }
    
    
}
