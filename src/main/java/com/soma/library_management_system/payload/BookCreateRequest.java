package com.soma.library_management_system.payload;

import com.soma.library_management_system.Entity.Author;
import com.soma.library_management_system.Entity.Book;
import com.soma.library_management_system.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@Builder
@AllArgsConstructor
public class BookCreateRequest {

    @NotBlank
    private String name;

    @Positive
    private Double cost;

    @NotNull
    private Genre genre;

    @NotNull
    private Author author;

    public Book toBook(){
        return Book.builder()
                .name(this.name)
                .cost(this.cost)
                .genre(this.genre)
                .author(this.author).build();
    }
}
