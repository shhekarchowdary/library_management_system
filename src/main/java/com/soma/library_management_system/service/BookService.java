package com.soma.library_management_system.service;

import com.soma.library_management_system.Entity.Book;
import com.soma.library_management_system.enums.BookFilterType;
import com.soma.library_management_system.payload.BookCreateRequest;

public interface BookService {
    Book create(BookCreateRequest bookCreateRequest);

    void get(BookFilterType bookFilterType, String value);
}
