package com.fnb.usermanagement.dto;

import com.fnb.usermanagement.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private Long customerId;
    private String firstname;
    private UserRoles userRole;
    private String surname;
    private String email;
    private LocalDateTime createdAt;
}
