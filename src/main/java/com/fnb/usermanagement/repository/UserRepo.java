package com.fnb.usermanagement.repository;

import com.fnb.usermanagement.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,  Long> {
    boolean existsByEmail(String email);
}
