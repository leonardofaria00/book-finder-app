package br.edu.infnet.controller.bookfinder;

import br.edu.infnet.model.bookfinder.data.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookFinder {

    ResponseEntity<List<Book>> getBooks();
}
