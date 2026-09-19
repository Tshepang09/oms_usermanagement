package com.fnb.usermanagement.security;

import com.fnb.usermanagement.enitity.User;

public interface JwtService {
    //Once credentials are verified
    String generateToken(User user);

    //Once it is generated, it needs to be validated
    boolean validateToken(String token);

    //Extract username(email)
    String extractEmailFromToken(String token);
}
