public class ClaseLibro {
    String titulo;
    String autor;
    int anoDePublicacion;
    String editorial;
    int isbn;

    public ClaseLibro(String titulo, String autor, int anoDePublicacion, String editorial, int isbn) {
        this.anoDePublicacion = anoDePublicacion;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;

    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacion() {
        return anoDePublicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }
    @Override
    public String toString() {
        return titulo + autor + anoDePublicacion + editorial +  isbn;
    }
}
