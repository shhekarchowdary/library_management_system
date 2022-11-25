package com.soma.library_management_system.Entity;

import com.soma.library_management_system.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private AccountStatus accountStatus;

    @Column(unique = true)
    private String email;

    @Column(unique = true, nullable = false)
    private String contact;

    private String address;

    @OneToMany(mappedBy = "student")
    private List<Book> listOfBooks;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Transaction> listOfTransactions;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;




}
