package com.example.finannzastp.user.api.rest;

import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.domain.service.AuthService;
import com.example.finannzastp.user.resource.AuthCredentialsResource;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    @Operation(summary = "Login", tags = {"Auth"})
    public ResponseEntity<User> login(@RequestBody AuthCredentialsResource credentials) {
        return ResponseEntity.ok(authService.login(credentials));
    }

}
