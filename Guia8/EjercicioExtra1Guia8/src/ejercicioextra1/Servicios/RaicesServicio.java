package ejercicioextra1.Servicios;

import ejercicioextra1.Entidades.Raices;

/**
 *
 * @author mauro
 */
public class RaicesServicio {
    
    public double getDiscriminante(Raices m){
        return Math.pow(m.getB(), 2) - 4 * m.getA() * m.getC();
    }
    
    public boolean tieneRaices(Raices m){
        return getDiscriminante(m) > 0;
    }
    
    public boolean tieneRaiz(Raices m){
        return getDiscriminante(m) == 0;
    }
    
    public void obtenerRaices(Raices m){
        double x1 = -m.getB()+Math.sqrt(getDiscriminante(m))/(2*m.getA());
        double x2 = -m.getB()-Math.sqrt(getDiscriminante(m))/(2*m.getA());
   
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
        
    public void obtenerRaiz(Raices m){
        double x = -m.getB()+Math.sqrt(getDiscriminante(m))/(2*m.getA());
        
        System.out.println("x = " + x);

    } 
    
    public void calcular(Raices m){
        if (tieneRaices(m)) obtenerRaices(m);
        else if (tieneRaiz(m)) obtenerRaiz(m);
        else System.out.println("No tiene solucion");
    }
}
