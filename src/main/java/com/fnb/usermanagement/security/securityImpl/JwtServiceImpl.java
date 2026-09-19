package com.fnb.usermanagement.security.securityImpl;

import com.fnb.usermanagement.enitity.User;
import com.fnb.usermanagement.security.JwtService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Date;

public class JwtServiceImpl implements JwtService {
//--@Value() is used to gain access to values/variables in our application.yaml config file
    @Value("${expiration-ms}")
    private Long expirationMs;

    @Value("${secret}")
    private String secret;

    private SecretKey signinKey(){
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String generateToken(User user) {
        Date now = new Date();

        //now.getTime() captures the current moment the token is created
        //expirationMs is the duration of the token in Ms
        Date expiryDate = new Date(now.getTime() + expirationMs); //Basically "From now until 1 hour(in ms)"

        //Building the token
        return Jwts.builder()
                .subject(user.getEmail())
                .claim("customerId", user.getCustomerId())
                .claim("role", user.getUserRole())
                .issuedAt(now)
                .expiration(expiryDate)
                .signWith(signinKey())
                .compact();

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
