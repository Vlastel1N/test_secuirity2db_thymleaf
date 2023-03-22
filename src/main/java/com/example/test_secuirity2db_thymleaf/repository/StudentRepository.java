package com.example.test_secuirity2db_thymleaf.repository;

import com.example.test_secuirity2db_thymleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
}
