package br.edu.infnet.domain.model.data.bookfinder;

public class Book {

    private final String author;
    private final String title;
    private final String description;
    private final BookCategory bookCategory;

    public Book(
            final String author,
            final String title,
            final String description,
            final BookCategory bookCategory) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.bookCategory = bookCategory;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }
}
