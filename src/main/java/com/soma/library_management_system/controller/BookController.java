package com.soma.library_management_system.controller;

import com.soma.library_management_system.Entity.Book;
import com.soma.library_management_system.enums.BookFilterType;
import com.soma.library_management_system.payload.BookCreateRequest;
import com.soma.library_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public ResponseEntity saveBook(@Valid @RequestBody BookCreateRequest bookCreateRequest){
        Book insertedBook = bookService.create(bookCreateRequest);
        return new ResponseEntity(insertedBook, HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public List<Book> findBook(
            @RequestParam("filter") BookFilterType bookFilterType,
            @RequestParam("value") String value ){
        bookService.get(bookFilterType, value);
        return null;
    }

}
