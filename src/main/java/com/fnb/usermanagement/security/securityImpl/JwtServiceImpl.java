package com.fnb.usermanagement.security.securityImpl;

import com.fnb.usermanagement.enitity.User;
import com.fnb.usermanagement.security.JwtService;

public class JwtServiceImpl implements JwtService {

    @Override
    public String generateToken(User user) {
        return "";
    }

    @Override
    public boolean validateToken(String token) {
        return false;
    }

    @Override
    public String extractEmailFromToken(String token) {
        return "";
    }
}
