package br.edu.infnet.domain.service.bookfinder;

import br.edu.infnet.domain.model.data.bookfinder.Book;
import br.edu.infnet.domain.repository.bookfinder.BookRepository;
import br.edu.infnet.infrastructure.repository.bookfinder.BookRepositoryImpl;
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
