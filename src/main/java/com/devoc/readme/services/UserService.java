package com.devoc.readme.services;

import com.devoc.readme.domain.dtos.AuthResponse;
import com.devoc.readme.domain.dtos.CreateUserRequest;

public interface UserService {
    AuthResponse createUser(CreateUserRequest user);
}
