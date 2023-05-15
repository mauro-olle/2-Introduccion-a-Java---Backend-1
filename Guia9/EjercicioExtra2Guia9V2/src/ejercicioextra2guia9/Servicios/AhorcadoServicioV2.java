package ejercicioextra2guia9.Servicios;

import ejercicioextra2guia9.Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class AhorcadoServicioV2 {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado CrearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = "casamiento";

        System.out.println("Ingrese la cantidad de intentos que tendra para adivinar la palabra");
        int intentos = sc.nextInt();

        String palabraVector[] = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            palabraVector[i] = String.valueOf(palabra.charAt(i));
        }

        return new Ahorcado(palabraVector, intentos);
    }

    private void MostrarLongitud(Ahorcado a) {
        System.out.println("La palabra a adivinar tiene " + a.getPalabra().length + " letras");
    }

    private boolean Buscar(Ahorcado a, String l) {
        boolean bandera = false;

        for (String elemento : a.getPalabra()) {
            if (elemento.equals(l)) {
                System.out.println("La letra pertenece a la palabra");
                bandera = true;
                break;
            }
        }

        if (bandera == false) {
            System.out.println("La letra no pertenece a la palabra");
        }
        return bandera;
    }
    
    private boolean LetraRepetida(ArrayList<String> a, String l) {
        for (String elemento : a) {
            if (elemento.equals(l)) {
                System.out.println("Usted ya ingreso esa letra");
                return true;
            }
        }

        a.add(l);
        return false;
    }
    
    private void IntentosRestantes(Ahorcado a, String l) {
        boolean bandera = Buscar(a, l);

        if (!bandera) {
            a.setIntentos(a.getIntentos() - 1);
        }

        System.out.println("A usted le quedan " + a.getIntentos() + " intentos");
    }
    
    private void MostrarLetrasAdivinadas(String[] palabra, ArrayList<String> a){
        boolean bandera;
        
        for (String elemento1 : palabra) {
            bandera = false;
            for (String elemento2 : a) {
                if (elemento1.equals(elemento2)) {
                    System.out.print(elemento1 + " ");
                    bandera = true;
                }
            }
            if (!bandera) System.out.print("_ ");
        }
        System.out.println("");
    }
    
    public void Jugar(){
        Ahorcado juego = CrearJuego();
        ArrayList<String> letrasIngresadas = new ArrayList();
        
        MostrarLongitud(juego);
                
        do {
            System.out.println("\n\nIngrese la letra a buscar");
            String letra = sc.next();

            if (!LetraRepetida(letrasIngresadas, letra)) {
                IntentosRestantes(juego, letra);
                MostrarLetrasAdivinadas(juego.getPalabra(), letrasIngresadas);
                
            }
        } while (juego.getLetrasEncontradas() != juego.getPalabra().length && juego.getIntentos() != 0);
    }
}