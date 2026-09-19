package com.fnb.usermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler{
//    public GlobalExceptionHandler(String message) {
//        super(message);
//    }

@ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleEmailAlreadyExistsException(EmailAlreadyExistsException ex){
        return new ResponseEntity<>(Map.of("Message:", ex.getMessage()), HttpStatus.CONFLICT);
}
}
