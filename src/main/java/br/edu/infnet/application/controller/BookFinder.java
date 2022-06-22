package br.edu.infnet.application.controller;

import br.edu.infnet.domain.model.data.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookFinder {

    ResponseEntity<List<Book>> getBooks();
}
