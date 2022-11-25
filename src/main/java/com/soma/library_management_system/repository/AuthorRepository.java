package com.soma.library_management_system.repository;

import com.soma.library_management_system.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    //@Query("select a from Author a where a.email=:email")
    //@Query(value = "select * from author a where a.email=:email", nativeQuery = true)
    Author findByEmail(String email);

    //find the authors above age 30 living in india and name starts with p
    List<Author> findByAgeGreaterThanEqualAndCountryAndNameStartingWith(
            int age, String country, String prefix);
}
