package com.example.finannzastp.user.domain.service;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.resource.AuthCredentialsResource;

import java.util.List;

public interface AuthService {
    User login (AuthCredentialsResource credentials);
    User register (AuthCredentialsResource registration);
    List<User> getAll();
}
