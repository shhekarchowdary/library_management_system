package com.soma.library_management_system.repository;

import com.soma.library_management_system.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
