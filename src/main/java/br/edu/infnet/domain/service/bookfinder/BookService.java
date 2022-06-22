package br.edu.infnet.domain.service.bookfinder;

import br.edu.infnet.domain.model.data.bookfinder.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();
}
