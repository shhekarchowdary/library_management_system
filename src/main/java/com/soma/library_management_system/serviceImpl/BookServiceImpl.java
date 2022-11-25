package com.soma.library_management_system.serviceImpl;

import com.soma.library_management_system.Entity.Author;
import com.soma.library_management_system.Entity.Book;
import com.soma.library_management_system.enums.BookFilterType;
import com.soma.library_management_system.payload.BookCreateRequest;
import com.soma.library_management_system.repository.BookRepository;
import com.soma.library_management_system.service.AuthorService;
import com.soma.library_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorService authorService;

    @Override
    public Book create(BookCreateRequest bookCreateRequest) {
        Book book = bookCreateRequest.toBook();

        Author author = authorService.create(book.getAuthor());

        book.setAuthor(author);

        return bookRepository.save(book);
    }

    @Override
    public void get(BookFilterType bookFilterType, String value) {

    }
}
