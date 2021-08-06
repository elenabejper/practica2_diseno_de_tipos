import java.time.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestLibro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate fechaAdquisicion = LocalDate.of(2015, 1, 6);
        LocalDate fechaAdquisicion2 = LocalDate.of(2021, 5, 11);
        Libro libro1 = new Libro("Divergente", "Veronica Roth", 463, fechaAdquisicion, GeneroLibro.NOVELA );
        Libro libro2 = new Libro("Insurgente", "Veronica Roth", 463, fechaAdquisicion, GeneroLibro.NOVELA);
        System.out.println(libro1);
        libro1.setTitulo("Perdida en el cosmos");
        libro1.setNumeroPaginas(352);
        libro1.setAutor("Grizzly");
        libro1.setFechaAdquisicion(fechaAdquisicion2);
        System.out.println(libro1);
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        System.out.println(listaLibros);

        if (libro1.compareTo(libro2) > 0) {
            System.out.println(libro2 + " va después de " + libro1);
        }

        HashSet<Libro> meh = new HashSet<>();
        meh.add(libro1);
        meh.add(libro2);
        Biblioteca bib = new Biblioteca(meh);

        System.out.println(bib);

    }

}