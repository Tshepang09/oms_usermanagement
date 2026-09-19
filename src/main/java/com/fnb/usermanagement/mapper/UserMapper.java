package com.fnb.usermanagement.mapper;

import com.fnb.usermanagement.dto.UserResponseDTO;
import com.fnb.usermanagement.enitity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

        public UserResponseDTO toResponse(User user){
            return UserResponseDTO.builder()
                    .customerId(user.getCustomerId())
                    .firstname(user.getFirstName())
                    .surname(user.getSurname())
                    .email(user.getEmail())
                    .userRole(user.getUserRole())
                    .createdAt(user.getCreatedAt())
                    .build();
        }
    }

