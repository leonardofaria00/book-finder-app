package br.edu.infnet.model.bookfinder.service.impl;

import br.edu.infnet.model.bookfinder.data.Book;
import br.edu.infnet.model.bookfinder.repository.BookRepository;
import br.edu.infnet.model.bookfinder.repository.impl.BookRepositoryImpl;
import br.edu.infnet.model.bookfinder.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(final BookRepositoryImpl bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
