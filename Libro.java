
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
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
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
            System.out.println("T�tulo: " + titulo + " | Autor: " + autor + " | N�mero de p�ginas: " + numeroPaginas + " Numero de referencia: ZZZ" + " | N�mero de veces prestado: " + vecesPrestado);
        }
        else{
            System.out.println("T�tulo: " + titulo + " | Autor: " + autor + " | N�mero de p�ginas: " + numeroPaginas + " Numero de referencia: " + numeroReferencia + " | N�mero de veces prestado: " + vecesPrestado);
        }        
    } 
    // Devuelve los detalles del libro
    public String getDetalles(){
        String getDetalles;
        if (numeroReferencia == ""){
            getDetalles = ("T�tulo: " + titulo + " | Autor: " + autor + " | N�mero de p�ginas: " + numeroPaginas + " Numero de referencia: ZZZ" + " | N�mero de veces prestado: " + vecesPrestado) ;
        }
        else{
            getDetalles = ("T�tulo: " + titulo + " | Autor: " + autor + " | N�mero de p�ginas: " + numeroPaginas + " Numero de referencia: " + numeroReferencia + " | N�mero de veces prestado: " + vecesPrestado);
        }   
        return getDetalles;
    }
    // Introduce el numero de referencia
    public void setNumeroReferencia(String introducirNumeroDeReferencia){
        if (introducirNumeroDeReferencia.length() >= 3){
            numeroReferencia = introducirNumeroDeReferencia;
        }
        else {
            System.out.println("Error. El n�mero de referencia es menor de 3 cifras");
        }
    }
    // Devuelve el numero de referencia
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    // Se presta el libro 1 vez
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    // Devuelve el numero de veces que ha sido prestado el libro
    public int getNumeroDeVecesPrestado(){
        return vecesPrestado;
    }    
}
