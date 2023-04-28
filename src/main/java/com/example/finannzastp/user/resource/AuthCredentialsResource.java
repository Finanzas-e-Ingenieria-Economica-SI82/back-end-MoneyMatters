package com.example.finannzastp.user.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AuthCredentialsResource {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
