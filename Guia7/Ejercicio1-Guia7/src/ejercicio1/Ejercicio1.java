/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejercicio1;

import ejercicio1.Entidades.Libro;

/**
 *
 * @author mauro
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Libro primerLibro = new Libro(45, "Hola", "Nico", 45);
        Libro segundoLibro = new Libro();
        
        primerLibro.CargarLibro();
        
        primerLibro.MostrarLibro();
        
        segundoLibro.CargarLibro();
        
        segundoLibro.MostrarLibro();
        
        System.out.println(segundoLibro);
    }
}
