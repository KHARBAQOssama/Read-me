package com.devoc.readme.services.impl;

import com.devoc.readme.domain.dtos.AuthResponse;
import com.devoc.readme.domain.dtos.CreateUserRequest;
import com.devoc.readme.domain.dtos.LoginRequest;
import com.devoc.readme.domain.entities.User;
import com.devoc.readme.repositories.UserRepository;
import com.devoc.readme.services.AuthenticationService;
import com.devoc.readme.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationService authenticationService;

    public AuthResponse createUser(CreateUserRequest user) {
        User newUser = User
                .builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(passwordEncoder.encode(user.getPassword()))
                .build();
        userRepository.save(newUser);
        LoginRequest loginRequest = new LoginRequest(user.getEmail(), user.getPassword());
        return authenticationService.login(loginRequest);
    }
}
