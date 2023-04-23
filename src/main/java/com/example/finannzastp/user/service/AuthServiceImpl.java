package com.example.finannzastp.user.service;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.domain.persistence.UserRepository;
import com.example.finannzastp.user.domain.service.AuthService;
import com.example.finannzastp.user.resource.AuthCredentialsResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;

    public User login(AuthCredentialsResource credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Wrong password");
        }
        return user;
    }

}
