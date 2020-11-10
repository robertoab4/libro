
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
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean esUnLibroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = esUnLibroDeTexto;
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
        System.out.println();
    } 
    // Imprime por pantalla el titulo
    public void imprimeTitulo(){
        System.out.println(titulo);
        System.out.println();
    } 
    // Devulve el numero de paginas que tiene el libro
    public int getNumeroDePaginas(){
        return numeroPaginas;
    }
    // Imprime por pantalla los detalles del libro
    public void imprimirDetalles(){
        String castellano;
        String numeroDeReferencia;
        if (esLibroDeTexto == true){
            castellano = "Sí";
        }
        else{
            castellano = "No";
        }
        if (numeroReferencia == ""){
            numeroDeReferencia = "ZZZ";
        }
        else{
            numeroDeReferencia = numeroReferencia;
        }
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: " + numeroDeReferencia + " | Número de veces prestado: " + vecesPrestado + " | Es un libro de texto: " + castellano);
        System.out.println();
    } 
    // Devuelve los detalles del libro
    public String getDetalles(){
        String castellano;
        String numeroDeReferencia;
        String getDetalles;
        if (esLibroDeTexto == true){
            castellano = "Sí";
        }
        else{
            castellano = "No";
        }
        if (numeroReferencia == ""){
            numeroDeReferencia = "ZZZ";
        }
        else{
            numeroDeReferencia = numeroReferencia;
        }
        getDetalles = "Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numeroPaginas + " Numero de referencia: " + numeroDeReferencia + " | Número de veces prestado: " + vecesPrestado + " | Es un libro de texto: " + castellano;
        return getDetalles;
    }
    // Introduce el numero de referencia
    public void setNumeroReferencia(String introducirNumeroDeReferencia){
        if (introducirNumeroDeReferencia.length() >= 3){
            numeroReferencia = introducirNumeroDeReferencia;
        }
        else {
            System.out.println("Error. El número de referencia es menor de 3 cifras");
            System.out.println();
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
    // Devuelve si es un libro de texto o no
    public boolean getEsUnLibroDeTexto(){
        return esLibroDeTexto;
    }
}
