package com.soma.library_management_system.serviceImpl;

import com.soma.library_management_system.Entity.Author;
import com.soma.library_management_system.payload.AuthorCreateRequest;
import com.soma.library_management_system.repository.AuthorRepository;
import com.soma.library_management_system.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author create(AuthorCreateRequest authorCreateRequest) {
        Author author = authorCreateRequest.toAuthor();
        return authorRepository.save(author);
    }

    @Override
    public Author create(Author author) {
        Author author1 = authorRepository.findByEmail(author.getEmail());
        if (author1 == null)
            return authorRepository.save(author);
        else
            return author1;
    }

    private Author checkAuthorIfExists(Author author){
        Author author1 = authorRepository.findByEmail(author.getEmail());
        return author1;
    }
}
