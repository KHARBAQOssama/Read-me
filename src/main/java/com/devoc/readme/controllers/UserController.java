package com.devoc.readme.controllers;

import com.devoc.readme.domain.dtos.AuthResponse;
import com.devoc.readme.domain.dtos.CreateUserRequest;
import com.devoc.readme.repositories.UserRepository;
import com.devoc.readme.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;
    @PostMapping("/create")
    public ResponseEntity<AuthResponse> createUser(@RequestBody CreateUserRequest user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
