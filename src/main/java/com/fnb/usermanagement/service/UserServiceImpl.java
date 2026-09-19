package com.fnb.usermanagement.service;

import com.fnb.usermanagement.dto.UserResponseDTO;
import com.fnb.usermanagement.mapper.UserMapper;
import com.fnb.usermanagement.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;

    public List<UserResponseDTO> getAllUsers() {
        return userRepo.findAll().stream()
                .map(userMapper::toResponse)
                    .toList();
    }
}
