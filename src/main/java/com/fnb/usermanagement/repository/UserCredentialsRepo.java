package com.fnb.usermanagement.repository;

import com.fnb.usermanagement.enitity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepo extends JpaRepository<UserCredentials, Long> {
}
