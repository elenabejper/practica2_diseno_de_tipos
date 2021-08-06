import java.time.*;

public class Libro {

    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private LocalDate fechaAdquisicion;
    private GeneroLibro genero;

    //Método constructor
    public Libro(String titulo, String autor, Integer numeroPaginas, LocalDate fechaAdquisicion, GeneroLibro genero) {
        this.titulo = titulo;
        this.autor = autor;
        if (numeroPaginas <= 0) throw new IllegalArgumentException("Debe tener más de 0 páginas");
        this.numeroPaginas = numeroPaginas;
        if (fechaAdquisicion.getYear() <= 1900) throw new IllegalArgumentException("El año de adquisición debe de ser posterior a 1900");
        this.fechaAdquisicion = fechaAdquisicion;
        this.genero = genero;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String t) {
        titulo = t;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        autor = a;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(Integer np) {
        if (numeroPaginas <= 0) throw new IllegalArgumentException("Debe tener más de 0 páginas");
        numeroPaginas = np;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(LocalDate fa) {
        if (fechaAdquisicion.getYear() <= 1900) throw new IllegalArgumentException("El año de adquisición debe de ser posterior a 1900");
        fechaAdquisicion = fa;
    }

    public GeneroLibro getGenero() {
        return genero;
    }
    public void setGenero(GeneroLibro g) {
        genero = g;
    }

    //toString
    public String toString() {
        return "Libro[titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + ", fechaAdquisicion=" + fechaAdquisicion + ", genero=" + genero + "]";
    }

    //Propiedad derivada
    public Integer getAñoAdquisicion() {
        return fechaAdquisicion.getYear();
    }

    //Equals y hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (fechaAdquisicion == null) {
            if (other.fechaAdquisicion != null)
                return false;
        } else if (!fechaAdquisicion.equals(other.fechaAdquisicion))
            return false;
        if (genero != other.genero)
            return false;
        if (numeroPaginas == null) {
            if (other.numeroPaginas != null)
                return false;
        } else if (!numeroPaginas.equals(other.numeroPaginas))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((fechaAdquisicion == null) ? 0 : fechaAdquisicion.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((numeroPaginas == null) ? 0 : numeroPaginas.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }

    //compareTo (para orden natural)
    public int compareTo (Libro libro) {
        int res;
        if (libro == null) {
            throw new NullPointerException();
        }
        res = getTitulo().compareTo(libro.getTitulo());
        if (res == 0) {
            res = getAutor().compareTo(libro.getAutor());
        }
        return res;
    }



}