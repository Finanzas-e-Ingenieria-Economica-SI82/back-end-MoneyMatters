package com.example.finannzastp.user.domain.service;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.resource.AuthCredentialsResource;

public interface AuthService {
    User login (AuthCredentialsResource credentials);
}
