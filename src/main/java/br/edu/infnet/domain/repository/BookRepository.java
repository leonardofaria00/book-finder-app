package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.data.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();
}
