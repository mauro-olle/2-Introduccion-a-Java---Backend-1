package ejercicio1.Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void CargarLibro(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN");
        ISBN = sc.nextInt();
        System.out.println("Ingrese el titulo");
        titulo = sc.next();
        System.out.println("Ingrese el autor");
        autor = sc.next();
        System.out.println("Ingrese el numero de paginas");
        numeroDePaginas = sc.nextInt();
        System.out.println("Es un entero? " + sc.hasNextInt());
    }
    
    public void MostrarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas: " + numeroDePaginas);
    }
}


