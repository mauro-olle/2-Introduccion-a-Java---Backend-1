/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías 
y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
package ejercicioextra1.guia7;

import ejercicioextra1.guia7.Entidades.Cancion;

/**
 *
 * @author mauro
 */
public class EjercicioExtra1Guia7 {

    public static void main(String[] args) {
        Cancion temon = new Cancion("El tio Alberto en el dia de la bicicleta","Indio Solari");
        
        System.out.println(temon.toString());
    }
    
}
