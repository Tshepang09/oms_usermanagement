package com.fnb.usermanagement.dto;

import com.fnb.usermanagement.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
    private Long customerId;
    private String firstname;
    private UserRoles userRole;
    private String surname;
    private String email;
    private LocalDateTime createdAt;
}
