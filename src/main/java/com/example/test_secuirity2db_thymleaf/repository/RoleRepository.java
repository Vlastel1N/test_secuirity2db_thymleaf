package com.example.test_secuirity2db_thymleaf.repository;

import com.example.test_secuirity2db_thymleaf.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
