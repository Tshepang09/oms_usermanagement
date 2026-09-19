package com.fnb.usermanagement.repository;

import com.fnb.usermanagement.enitity.User;
import com.fnb.usermanagement.enitity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,  Long> {
        User findByEmail(String email);
//    UserCredentials findByEmail(String email);
}
