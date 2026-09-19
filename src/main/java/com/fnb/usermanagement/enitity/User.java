package com.fnb.usermanagement.enitity;

import com.fnb.usermanagement.enums.UserRoles;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import javax.management.relation.Role;
import java.time.LocalDateTime;

import static com.fnb.usermanagement.enums.UserRoles.CUSTOMER;

@Entity
@Table(name = "users")
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String surname;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRoles userRole;

    private LocalDateTime createdAt;
    private LocalDateTime  updatedAt;



    @PrePersist
    public void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;

        if(userRole == null){
            this.userRole = userRole.CUSTOMER;
        }
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = LocalDateTime.now();

    }
}
