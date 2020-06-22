package com.github.bnubruno.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static java.util.Optional.ofNullable;

@RestController
@AllArgsConstructor
public class OAuthController {

    private TokenStore tokenStore;

    @GetMapping("/oauth/revoke_token")
    public void logout(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
            String tokenValue = authHeader.replace("Bearer", "").trim();
            ofNullable(tokenStore.readAccessToken(tokenValue)).ifPresent(tokenStore::removeAccessToken);
        }
    }
}