
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
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
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
    // Imprime por pantalla los detalles del libro
    public void imprimirDetalles(){
        if (numeroReferencia == ""){
            System.out.println("Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: ZZZ") ;
        }
        else{
            System.out.println("Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: " + numeroReferencia);
        }        
    } 
    // Devuelve los detalles del libro
    public String getDetalles(){
        String getDetalles;
        if (numeroReferencia == ""){
            getDetalles = ("Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: ZZZ") ;
        }
        else{
            getDetalles = ("Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: " + numeroReferencia);
        }   
        return getDetalles;
    }
    // Introduce el numero de referencia
    public void setNumeroReferencia(String introducirNumeroDeReferencia){
        if (introducirNumeroDeReferencia.length() >= 3){
            numeroReferencia = introducirNumeroDeReferencia;
        }
        else {
            System.out.println("Error. El número de referencia es menor de 3 cifras");
        }
    }
    // Devuelve el numero de referencia
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
}
