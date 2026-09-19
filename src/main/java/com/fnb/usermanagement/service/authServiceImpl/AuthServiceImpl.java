package com.fnb.usermanagement.service.authServiceImpl;

import com.fnb.usermanagement.dto.RegisterRequest;
import com.fnb.usermanagement.dto.UserResponseDTO;
import com.fnb.usermanagement.enitity.User;
import com.fnb.usermanagement.enitity.UserCredentials;
import com.fnb.usermanagement.exception.EmailAlreadyExistsException;
import com.fnb.usermanagement.mapper.UserMapper;
import com.fnb.usermanagement.repository.UserCredentialsRepo;
import com.fnb.usermanagement.repository.UserRepo;
import com.fnb.usermanagement.service.AuthService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepo userRepo;
//    private final PasswordEncoder passwordEncoder;
private final UserCredentialsRepo userCredentialsRepo;
private final PasswordEncoder passwordEncoder;
private final UserMapper userMapper;

@Override
@Transactional
   public UserResponseDTO register(RegisterRequest registerRequest){
       //---TEST IF USER EXISTS--
       if(userRepo.existsByEmail(registerRequest.getEmail())){
           throw new EmailAlreadyExistsException(registerRequest.getEmail());
       }
        //Build the User entity from the Request
        User user = User.builder()
                .firstName(registerRequest.getFirstname())
                .surname(registerRequest.getSurname())
                .userRole(registerRequest.getUserRole())
                .email(registerRequest.getEmail())
                .build();

        //Persist the User to the database
        userRepo.save(user);

        //Build the UserCredentials entity
       UserCredentials userCredentials = UserCredentials.builder()
               .user(user)
               .password(passwordEncoder.encode(registerRequest.getPassword()))
               .build();

//Persist the UserCredentials to the database
       userCredentialsRepo.save(userCredentials);

        //Return RegisterResponse for client
        return userMapper.toResponse(user);
    }
    }

