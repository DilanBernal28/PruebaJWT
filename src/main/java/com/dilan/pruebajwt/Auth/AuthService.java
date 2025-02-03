package com.dilan.pruebajwt.Auth;

import com.dilan.pruebajwt.Jwt.JwtService;
import com.dilan.pruebajwt.User.IUserRepository;
import com.dilan.pruebajwt.User.Role;
import com.dilan.pruebajwt.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;
    private final JwtService jwtService;

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }

    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
