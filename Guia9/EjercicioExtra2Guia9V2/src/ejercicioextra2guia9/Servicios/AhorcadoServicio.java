package ejercicioextra2guia9.Servicios;

import ejercicioextra2guia9.Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class AhorcadoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado CrearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = sc.next();

        System.out.println("Ingrese la cantidad de intentos que tendra para adivinar la palabra");
        int intentos = sc.nextInt();

        String palabraVector[] = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            palabraVector[i] = String.valueOf(palabra.charAt(i));
        }

        return new Ahorcado(palabraVector, intentos);
    }

    private void MostrarLongitud(Ahorcado a) {
        System.out.println("La palabra a adinar tiene " + a.getPalabra().length + " letras");
    }

    private void Buscar(Ahorcado a, String l) {
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
    }

    private boolean Encontradas(Ahorcado a, String l) {
        int cont = 0;

        for (String elemento : a.getPalabra()) {
            if (elemento.equals(l)) {
                cont++;
            }
        }

        a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);

        System.out.println("Letras encontradas: " + a.getLetrasEncontradas());
        System.out.println("Letras restantes:   " + (a.getPalabra().length - a.getLetrasEncontradas()));

        return cont != 0;
    }

    private void IntentosRestantes(Ahorcado a, String l) {
        boolean bandera = Encontradas(a, l);

        if (!bandera) {
            a.setIntentos(a.getIntentos() - 1);
        } else {
        }

        System.out.println("A usted le quedan " + a.getIntentos() + " intentos");
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

    public void Jugar() {
        Ahorcado juego = CrearJuego();
        ArrayList<String> letrasIngresadas = new ArrayList();

        do {
            MostrarLongitud(juego);
            System.out.println("Ingrese una letra para verificiar si se encuentra en la palabra");
            String letra = sc.next();

            if (!LetraRepetida(letrasIngresadas, letra)) {
                Buscar(juego, letra);
                IntentosRestantes(juego, letra);
            }
        } while (juego.getLetrasEncontradas() != juego.getPalabra().length && juego.getIntentos() != 0);
        
        String palabra = "";
        
        for (String letra : juego.getPalabra()){
                palabra = palabra + letra;
            }
        
        if (juego.getLetrasEncontradas() == juego.getPalabra().length) {
            System.out.println("Felicitaciones, encontro toda la palabra.\nLa palabra oculta era " + palabra);
        } else {
            System.out.println("Se agotaron los intentos.\nLa palabra oculta era " + palabra);
            
        }

    }
}
