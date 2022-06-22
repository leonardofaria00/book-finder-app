package br.edu.infnet.model.bookfinder.repository;

import br.edu.infnet.model.bookfinder.data.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();
}
