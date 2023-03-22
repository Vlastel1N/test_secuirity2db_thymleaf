package com.example.test_secuirity2db_thymleaf.repository;

import com.example.test_secuirity2db_thymleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
