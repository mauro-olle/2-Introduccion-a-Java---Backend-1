package ejercicioextra2guia9.Servicios;

import ejercicioextra2guia9.Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class AhorcadoServicioV3 {
    private Ahorcado CrearAhorcado(){
        
        String[] palabras = {"abogado", "abrazar", "absoluto", "abundar", "acceder", "bailarín", "bailarina", "balcón", "bancarrota", "bandeja", "caballo", "caballero", "caballos", "cabecera", "cabellera", "dama", "danza", "darle", "deberes", "decisión","elefante","elegante","elemento","elevar","eliminar","familia","fantasma","farmacia","favorito","fenómeno","gama","ganador","ganancia","garantía","gasolina","hacer","hallazgo","hamburguesa","herencia","hermano","idioma","igualdad","iluminar","imagen","imaginación","jamaica","jamón","jardín","kilómetro","kilogramo","laboral","laboratorio","lamentablemente","lámpara","magnífico","maíz","maldición","nacionalidad","nacimiento","obligación","paciencia","quemadura","radiación","sabiduría","tablero","vacaciones","wafle","xilófono"};
        
        String palabra = palabras[(int)(Math.random()*68)];
        
        String[] palabraVector = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            palabraVector[i] = String.valueOf(palabra.charAt(i));
        }

        return new Ahorcado(palabraVector);
    }

    private void MostrarLongitud(Ahorcado a) {
        int cantCaract = a.getPalabra().length;
        
        System.out.println("La palabra contiene " + cantCaract + " letras.");
        for (int i = 0 ; i < cantCaract ; i++){
            System.out.print("_ ");
        }
    }

    private boolean BuscarLetra(Ahorcado a, String l) {
        for (String letra : a.getPalabra()) {
            if (l.equalsIgnoreCase(letra)) {
                System.out.println("\nLa letra pertenece a la palabra");
                return true;
            } 
        }
        System.out.println("\nLa letra no pertenece a la palabra");
        return false;
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
    
    private void IntentosRestantes(Ahorcado a, String l){
        if (!BuscarLetra(a, l)) {
            a.setIntentos(a.getIntentos()-1);
        }
        
        System.out.println("A usted le quedan " + a.getIntentos() + " intentos restantes");
    }
    
    private void MostrarPalabra(Ahorcado a,ArrayList<String> al){
        boolean bandera;
        
        
        for (String aux : a.getPalabra()) {
            bandera = false;
            
            for (String aux2 : al) {
                if (aux.equals(aux2)) {
                    System.out.print(aux.toUpperCase());
                    bandera = true;
                }
            }
            
            if (!bandera) {
                System.out.print("_ ");
            }
        }
    }
    
    private void LetrasEncontradas(Ahorcado a, String l){
        int cont = 0;
        
        for (String aux : a.getPalabra()) {
            if (aux.equals(l)) {
                cont++;
            }
        }
        a.setLetrasEncontradas(a.getLetrasEncontradas()+cont);
    }
    
    public void Jugar(){
        Ahorcado juego = CrearAhorcado();
        ArrayList<String> letrasIngresadas = new ArrayList();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        MostrarLongitud(juego);
        
        do {
            System.out.println("\n\nIngrese una letra para intentar adivinar la palabra");
            String letra = sc.next();
            
            if (!LetraRepetida(letrasIngresadas, letra)) {
                MostrarPalabra(juego,letrasIngresadas);
                IntentosRestantes(juego, letra);
                LetrasEncontradas(juego, letra);
                
            }
            
        } while (juego.getIntentos()!=0 && juego.getLetrasEncontradas()!=juego.getPalabra().length);
        
        StringBuilder palabra = new StringBuilder();
        
        for (String aux : juego.getPalabra()) {
            palabra.append(aux.toUpperCase());
        }
        
        if(juego.getIntentos() == 0){
            System.out.println("LOSER!!\nLa palabra era " + palabra);
            
        } else {
            System.out.println("Felicitaciones");
        }
    }
}
