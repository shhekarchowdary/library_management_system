package com.soma.library_management_system.service;

import com.soma.library_management_system.Entity.Author;
import com.soma.library_management_system.payload.AuthorCreateRequest;

public interface AuthorService {

    Author create(AuthorCreateRequest authorCreateRequest);

    Author create(Author author);
}
