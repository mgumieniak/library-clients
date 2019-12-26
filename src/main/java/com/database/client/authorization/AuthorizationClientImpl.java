package com.database.client.authorization;

import com.database.models.UserPrincipalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class AuthorizationClientImpl {
    private AuthorizationClient authorizationClient;

    @Autowired
    public AuthorizationClientImpl(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public Optional<UserPrincipalDto> getUser(String username) {
        Objects.requireNonNull(username);
        return Optional.ofNullable(authorizationClient.getUser(username));
    }
}
