package com.soma.library_management_system.payload;

import com.soma.library_management_system.Entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@Builder
@AllArgsConstructor
public class AuthorCreateRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String country;

    @Positive
    private int age;

    @Email
    private String email;

    public Author toAuthor(){
        return Author.builder()
                .name(this.name)
                .country(this.country)
                .age(this.age)
                .email(this.email).build();
    }
}
