package Servicios;

import Entidades.Curso;
import java.util.Scanner;


/**
 *
 * @author mauro
 */
public class CursoServicio {
    public String[] CargarAlumnos(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] array = new String[5];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el nombre del " + (i+1) + "° alumno");
            array[i] = sc.next();
        }
        
        return array;
    }
    
    public Curso CrearCurso(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del curso");
        String curso = sc.next();
        
        System.out.println("Ingrese la cantidad de horas por dia");
        int hsXDia = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de horas por semana");
        int hsXSemana = sc.nextInt();
        
        System.out.println("Ingrese el turno");
        String turno = sc.next();
        
        System.out.println("Ingrese el precio por hora");
        double precio = sc.nextInt();
        
        String[] array = CargarAlumnos();
        
        return new Curso(curso,hsXDia,hsXSemana,turno,precio,array);
    }
    
    public void CalcularGananciaSemanal(Curso c){
        double ganancia = c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length;
        
        System.out.println("Usted cobrara $" + ganancia + " semanales");
    }
}
