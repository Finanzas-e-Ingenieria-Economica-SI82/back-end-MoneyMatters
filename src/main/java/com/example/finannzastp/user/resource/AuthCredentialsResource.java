package com.example.finannzastp.user.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AuthCredentialsResource {
    private String username;
    private String password;
}
