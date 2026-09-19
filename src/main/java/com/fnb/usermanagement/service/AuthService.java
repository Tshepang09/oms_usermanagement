package com.fnb.usermanagement.service;

import com.fnb.usermanagement.dto.RegisterRequest;
import com.fnb.usermanagement.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthService{
    UserResponseDTO register(RegisterRequest registerRequest);
}
