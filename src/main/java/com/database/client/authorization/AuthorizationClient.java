package com.database.client.authorization;

import com.database.UserPrincipalDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("authorization-service")
public interface AuthorizationClient {
    @GetMapping("/usersAccounts/{username}")
    UserPrincipalDto getUserByUsername(@PathVariable("username") String username);
}
