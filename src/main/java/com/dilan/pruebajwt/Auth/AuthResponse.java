package com.dilan.pruebajwt.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class AuthResponse {
    String token;
}
