package br.edu.infnet.model.bookfinder.repository.impl;

import br.edu.infnet.model.bookfinder.data.Book;
import br.edu.infnet.model.bookfinder.data.CategoriaBook;
import br.edu.infnet.model.bookfinder.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> getBooks() {
        final List<Book> books = new ArrayList<>();
        books.add(new Book("Robert C. Martin", "Código Limpo", "Habilidades Práticas do Agile Software", CategoriaBook.TECNOLOGIA));
        books.add(new Book("Evans, Eric", "Domain-Driven Design", "Atacando as complexidades no coração do software", CategoriaBook.TECNOLOGIA));
        return books;
    }
}
