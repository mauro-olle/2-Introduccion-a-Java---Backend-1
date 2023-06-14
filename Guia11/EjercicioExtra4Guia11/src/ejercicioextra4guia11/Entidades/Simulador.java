package ejercicioextra4guia11.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mauro
 */
public class Simulador {
    Set<String> nombreCompleto = new TreeSet();
    
    private String NombresYApellidos() {
        String[] nombresDePersona = {"Juan", "María", "Pedro", "Ana", "Carlos", "Lucía", "Javier", "Sofía", "Miguel", "Laura", "David", "Carmen", "José", "Marta", "Francisco", "Isabel", "Antonio", "Pilar", "Jorge", "Teresa"};
        String[] apellidos = {"García", "Fernández", "González", "Rodríguez", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Ruiz", "Hernández", "Díaz", "Moreno", "Álvarez", "Jiménez", "Romero", "Navarro", "Torres", "Domínguez", "Vázquez"};

        do {
            int m = (int) (Math.random() * 20);
            int n = (int) (Math.random() * 20);

            String nombreyApellido = nombresDePersona[m] + " " + apellidos[n];

            if (!nombreCompleto.contains(nombreyApellido)) {
                nombreCompleto.add(nombreyApellido);
                return nombreyApellido;
            }
        } while (true);

    }
    
    private Integer GenerarDNI(){
        return (int)(Math.random()*40000000)+10000000;
    }
    
    public ArrayList<Alumno> CrearAlumnos(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();
        
        System.out.println("¿Cuantos alumnos desea ingresar?");
        int cant = sc.nextInt();
        
        for (int i = 0; i < cant; i++) {
            alumnos.add(new Alumno(NombresYApellidos(),GenerarDNI()));
        }
        
        for(Alumno a : alumnos){
            System.out.println(a);
        }
        
        return alumnos;
    }
    
    public ArrayList<Voto> Votacion(ArrayList<Alumno> al) {
        
        ArrayList<Alumno> alAux = new ArrayList();
        ArrayList<Voto> votos = new ArrayList();
        
        alAux.addAll(al);

        for (Alumno alumno : al) {
            ArrayList<Alumno> alumnosVotados = new ArrayList();
            Collections.shuffle(alAux);
            int i = 0;

            do {
                if (!alumno.getNombreCompleto().equals(alAux.get(i).getNombreCompleto())) {
                    alumnosVotados.add(alAux.get(i));
                }
                i++;
            } while (alumnosVotados.size() != 3);
            votos.add(new Voto(alumno, alumnosVotados));
        }
        return votos;
    }

    public void MostrarAlumnos(ArrayList<Voto> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Alumno que voto: " + v.get(i).getAlumno().getNombreCompleto());
            System.out.println("1° Voto: " + v.get(i).getAlumnosVotados().get(0).getNombreCompleto());
            System.out.println("2° Voto: " + v.get(i).getAlumnosVotados().get(1).getNombreCompleto());
            System.out.println("3° Voto: " + v.get(i).getAlumnosVotados().get(2).getNombreCompleto() + "\n\n\n\n");
        }
    }

    public void RecuentoVotos(ArrayList<Voto> v, ArrayList<Alumno> a) {
        for (Voto votos : v) {
            for (Alumno alumnos : a) {
                for (int i = 0; i < 3; i++) {
                    if(votos.getAlumnosVotados().get(i).getNombreCompleto().equals(alumnos.getNombreCompleto())){
                        alumnos.setVotos(alumnos.getVotos()+1);
                    }
                }
            }
        }
    }
    
    public void CrearFacilitadores(ArrayList<Alumno> a){
        Collections.sort(a,Alumno.compararVotos);
        
        System.out.println("Lista de facilitadores:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ".- " + a.get(i));
        }
        
        System.out.println("\n\nLista de suplentes de facilitadores:");
        for (int i = 5; i < 10; i++) {
            System.out.println((i-4) + ".- " + a.get(i));
        }
    }
}
