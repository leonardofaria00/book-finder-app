package br.edu.infnet.infrastructure.repository;

import br.edu.infnet.domain.model.data.Book;
import br.edu.infnet.domain.model.data.BookCategory;
import br.edu.infnet.domain.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> getBooks() {
        final List<Book> books = new ArrayList<>();
        books.add(new Book("Robert C. Martin", "Código Limpo", "Habilidades Práticas do Agile Software", BookCategory.TECHNOLOGY));
        books.add(new Book("Evans, Eric", "Domain-Driven Design", "Atacando as complexidades no coração do software", BookCategory.TECHNOLOGY));
        return books;
    }
}
