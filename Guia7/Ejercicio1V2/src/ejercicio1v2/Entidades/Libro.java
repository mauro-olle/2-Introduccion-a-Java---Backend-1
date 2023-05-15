package ejercicio1v2.Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int NumDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int NumDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.NumDePaginas = NumDePaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumDePaginas() {
        return NumDePaginas;
    }

    public void setNumDePaginas(int NumDePaginas) {
        if (NumDePaginas == 0) System.out.println("Numero Invalido");
        else this.NumDePaginas = NumDePaginas;
    }

    
    public void CrearLibro (){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN");
        ISBN = sc.nextInt();
        System.out.println("Ingrese el titulo");
        titulo = sc.next();
        System.out.println("Ingrese el autor");
        autor = sc.next();
        System.out.println("Ingrese el Numero de paginas");
        NumDePaginas = sc.nextInt();
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", NumDePaginas=" + NumDePaginas + '}';
    }
    
}
