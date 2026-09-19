package com.fnb.usermanagement.dto;

import com.fnb.usermanagement.enums.UserRoles;
import lombok.Data;

import javax.management.relation.Role;

@Data

public class RegisterRequest {
    private String firstname;
    private String surname;
    private UserRoles userRole;
    private String email;
    private String password;

}
