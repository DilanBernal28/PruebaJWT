package com.dilan.pruebajwt.Auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    String username;
    String password;
    String firstName;
    String lastName;
    String country;
}
