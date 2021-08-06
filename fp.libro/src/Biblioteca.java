import java.util.HashSet;


public class Biblioteca {
    HashSet<Libro> biblioteca = new HashSet<>();

    public Biblioteca() { //creamos el conjunto vacío.
        biblioteca = new HashSet<>();
    }

    public Biblioteca(HashSet<Libro> b) {
        biblioteca = b;
    }

    public void addLibro(Libro libro) {
        biblioteca.add(libro);
    }

    public Integer getNumLibros() {
        return biblioteca.size();
    }

    public HashSet<Libro> getLibrosGenero(GeneroLibro genero) {
        HashSet<Libro> libroGenero = new HashSet<>();
        for (Libro libro:biblioteca) if (libro.getGenero() == genero) libroGenero.add(libro);
        return libroGenero;
    }

    public HashSet<Libro> getLibrosAutor(String autor) {
        HashSet<Libro> libroAutor = new HashSet<>();
        for (Libro libro:biblioteca) if (libro.getAutor() == autor) libroAutor.add(libro);
        return libroAutor;
    }

    public String toString( ) {
        return "Biblioteca: " + biblioteca;
    }

}