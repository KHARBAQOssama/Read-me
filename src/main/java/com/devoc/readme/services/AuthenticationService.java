package com.devoc.readme.services;

import com.devoc.readme.domain.dtos.AuthResponse;
import com.devoc.readme.domain.dtos.LoginRequest;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthenticationService {
    UserDetails authenticate(String email, String password);
    String generateToken(UserDetails userDetails);
    UserDetails validateToken(String token);
    AuthResponse login(LoginRequest loginRequest);
}
