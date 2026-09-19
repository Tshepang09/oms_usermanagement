package com.fnb.usermanagement.service;

import com.fnb.usermanagement.dto.UserResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> getAllUsers();
}
