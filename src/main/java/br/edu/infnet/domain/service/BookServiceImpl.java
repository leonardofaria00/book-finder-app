package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.data.Book;
import br.edu.infnet.domain.repository.BookRepository;
import br.edu.infnet.domain.service.interfaces.BookService;
import br.edu.infnet.infrastructure.repository.BookRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(final BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
