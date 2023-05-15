package ejercicio3.Servicios;

import ejercicio3.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona CrearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese el sexo, H M O");
        String sexo = sc.next().toUpperCase();
        
        System.out.println("Ingrese el peso");
        double peso = sc.nextDouble();
        
        System.out.println("Ingrese la altura");
        double altura = sc.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public Persona CrearPersonaAleatoria(){
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        
        int edad = (int) (Math.random() * (65 - 1) + 1);
        
        String sexo = "";
        int sexoRandom = (int) (Math.random() * 3);
        switch (sexoRandom){
            case 0:
                sexo = "H";
                break;
            case 1:
                sexo = "M";
                break;
            case 2:
                sexo = "O";
                break;
        }
        
        int peso = (int) (Math.random() * (100 - 30) + 30);
        
        double altura = Math.round((Math.random() * (2.1 - 1.4) + 1.4)*100);
        altura /= 100;
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public boolean EsMayorDeEdad(Persona m){
        return m.getEdad() >= 18;
    }
    
    public int CalcularIMC(Persona m){
        double IMC = m.getPeso() / (Math.pow(m.getAltura(), 2));
        
        if (IMC < 20) return -1;
        else if (IMC >= 20 && IMC <= 25) return 0;
        else return 1;
    }
    
    public void PorcentajeMayoresDeEdad(boolean[] array){
        double contTrue = 0, contFalse = 0, cant = 0;
        
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                contTrue += 1;
            } else {
                contFalse += 1;
            }
            cant += 1;
        }
        
        System.out.println("Porcentaje de Mayores :" + (contTrue/cant) * 100);
        System.out.println("Porcentaje de Menores :" + (contFalse/cant) * 100);
    }
    
    public void PorcentajeIMC(int[] array){
        double contmin = 0, contmed = 0, contmax = 0, cant = 0;
        
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case -1:
                    contmin += 1;
                    break;
                case 0:
                    contmed += 1;
                    break;
                case 1:
                    contmax += 1;
                    break;
            }
            
            cant += 1;
        }
        
        System.out.println("Porcentaje de IMC menores a 20 :" + (contmin/cant) * 100);
        System.out.println("Porcentaje de IMC entre 20 y 25 :" + (contmed/cant) * 100);
        System.out.println("Porcentaje de IMC mayores a 25 :" + (contmax/cant) * 100);
    }
    
    public boolean[] crearArrayMayorEdad(ArrayList<Persona> personas){
        int cont = 0;
        boolean MayorEdad[] = new boolean[personas.size()];
        
        for (Persona p : personas) {
            MayorEdad[cont] = EsMayorDeEdad(p);
            cont += 1;
        }
        return MayorEdad;
    }
    
    public int[] crearArrayIMC(ArrayList<Persona> personas){
        int cont = 0;
        int IMC[] = new int[personas.size()];
        
        for (Persona p : personas) {
            IMC[cont] = CalcularIMC(p);
            cont += 1;
        }
        return IMC;
    }
}
