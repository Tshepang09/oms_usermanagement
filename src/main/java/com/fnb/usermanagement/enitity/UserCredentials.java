package com.fnb.usermanagement.enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "user_credentials")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long credentialId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private User user;

    private String password;

    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}