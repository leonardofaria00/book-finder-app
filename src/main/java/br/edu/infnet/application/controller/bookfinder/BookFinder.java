package br.edu.infnet.application.controller.bookfinder;

import br.edu.infnet.domain.model.data.bookfinder.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookFinder {

    ResponseEntity<List<Book>> getBooks();
}
