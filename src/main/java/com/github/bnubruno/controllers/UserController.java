package com.github.bnubruno.controllers;

import com.github.bnubruno.entities.User;
import com.github.bnubruno.services.UserDetailsService;
import com.github.bnubruno.dtos.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserDetailsService userDetailsService;

    @GetMapping("/api/users")
    public List<User> finalAll() {
        return userDetailsService.findAll();
    }

    @GetMapping("/api/me")
    public Object me() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    @PostMapping("/api/users")
    public UserDTO create(@RequestBody UserDTO dto) {
        return dto;
    }

}
