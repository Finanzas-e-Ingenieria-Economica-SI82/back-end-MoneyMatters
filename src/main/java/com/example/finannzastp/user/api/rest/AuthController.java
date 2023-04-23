package com.example.finannzastp.user.api.rest;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.domain.service.AuthService;
import com.example.finannzastp.user.mapping.UserMapper;
import com.example.finannzastp.user.resource.AuthCredentialsResource;
import com.example.finannzastp.user.resource.UserResource;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<UserResource> getAllUsers(){
        return userMapper.toResourceList(authService.getAll());
    }

    @PostMapping("/register")
    public String registerUserAccount(@ModelAttribute("user") @Valid AuthCredentialsResource registration, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        authService.register(registration);
        return "redirect:/login";
    }

    @PostMapping("/login")
    @Operation(summary = "Login", tags = {"Auth"})
    public ResponseEntity<User> login(@RequestBody AuthCredentialsResource credentials) {
        return ResponseEntity.ok(authService.login(credentials));
    }

}
