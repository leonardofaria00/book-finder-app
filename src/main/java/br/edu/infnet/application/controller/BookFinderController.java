package br.edu.infnet.application.controller;

import br.edu.infnet.domain.model.data.Book;
import br.edu.infnet.domain.service.BookServiceImpl;
import br.edu.infnet.domain.service.interfaces.BookService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book/v1/books")
public class BookFinderController implements BookFinder {

    private final BookService bookService;

    public BookFinderController(final BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(bookService.getBooks());
    }
}
