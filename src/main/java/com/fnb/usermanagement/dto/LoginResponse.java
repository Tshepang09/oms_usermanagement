package com.fnb.usermanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private Long customerId;
    private String token;
    private String email;
    private String role;
}
