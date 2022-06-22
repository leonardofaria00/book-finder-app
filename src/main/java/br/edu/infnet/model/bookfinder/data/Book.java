package br.edu.infnet.model.bookfinder.data;

public class Book {

    private String autor;
    private String titulo;
    private String descricao;
    private CategoriaBook categoriaBook;

    public Book(
            final String autor,
            final String titulo,
            final String descricao,
            final CategoriaBook categoriaBook) {
        this.autor = autor;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoriaBook = categoriaBook;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public CategoriaBook getCategoriaBook() {
        return categoriaBook;
    }
}
