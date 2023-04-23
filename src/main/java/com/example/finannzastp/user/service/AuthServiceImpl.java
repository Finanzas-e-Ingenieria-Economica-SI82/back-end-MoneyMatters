package com.example.finannzastp.user.service;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.domain.persistence.UserRepository;
import com.example.finannzastp.user.domain.service.AuthService;
import com.example.finannzastp.user.resource.AuthCredentialsResource;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    private PasswordEncoder passwordEncoder;



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

    @Override
    public User register(AuthCredentialsResource registration) {
        User user = new User();
        user.setUsername(registration.getUsername());
        user.setPassword(registration.getPassword());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
