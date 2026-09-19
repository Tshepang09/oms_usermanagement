package com.fnb.usermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EmailAlreadyExistsException extends RuntimeException{

   public  EmailAlreadyExistsException(String email){
        super("User with email: " + email + " already exists.");
    }
}
