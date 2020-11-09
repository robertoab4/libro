
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    // Devuelve el autor del libro
    public String getAutorDelLibro(){
        return autor;
    }
    // Devuelve el titulo del libro
    public String getTituloDelLibro(){
        return titulo;
    }
    // Imprime por pantalla el autor
    public void imprimeAutor(){
        System.out.println(autor);
    } 
    // Imprime por pantalla el titulo
    public void imprimeTitulo(){
        System.out.println(titulo);
    } 
    // Devulve el numero de paginas que tiene el libro
    public int getNumeroDePaginas(){
        return numeroPaginas;
    }
}
