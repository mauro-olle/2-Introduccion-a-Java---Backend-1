package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author mauro
 */
public class ParDeNumerosServicio {
    
    public void MostrarValores(ParDeNumeros par){
        System.out.println("Numero 1: " + par.getNum1());
        System.out.println("Numero 2: " + par.getNum2());
    }
    
    public void DevolverMayor(ParDeNumeros par){
        System.out.println("El numero mayor es " + Math.max(par.getNum1(), par.getNum2()));
    }
    
    public void CalcularPotencia(ParDeNumeros par){
        System.out.println(Math.pow((Math.round(Math.max(par.getNum1(), par.getNum2()))), (Math.round(Math.min(par.getNum1(), par.getNum2())))));
    }
    
    public void CalcularRaiz(ParDeNumeros par){
        double num = Math.abs(Math.min(par.getNum1(), par.getNum2()));
        
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
    }
}
