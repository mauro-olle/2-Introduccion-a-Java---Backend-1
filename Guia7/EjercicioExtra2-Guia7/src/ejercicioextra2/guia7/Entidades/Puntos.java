package ejercicioextra2.guia7.Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Puntos {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Puntos(){
        
    }
    
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese x1");
        x1 = sc.nextInt();
        System.out.println("Ingrese y1");
        y1 = sc.nextInt();
        System.out.println("Ingrese x2");
        x2 = sc.nextInt();
        System.out.println("Ingrese y2");
        y2 = sc.nextInt();
    }
    
    public double calcularDistancia(){
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return distancia;
    }
}
