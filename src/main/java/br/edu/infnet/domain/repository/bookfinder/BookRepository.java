package br.edu.infnet.domain.repository.bookfinder;

import br.edu.infnet.domain.model.data.bookfinder.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();
}
