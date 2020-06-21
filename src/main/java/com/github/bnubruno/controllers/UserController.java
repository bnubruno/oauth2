package com.github.bnubruno.controllers;

import com.github.bnubruno.dtos.request.CreateUserDTO;
import com.github.bnubruno.dtos.response.UserDTO;
import com.github.bnubruno.mappers.UserMapper;
import com.github.bnubruno.services.UserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserController {

    private UserDetailsService userDetailsService;
    private UserMapper userMapper;

    @GetMapping("/api/users")
    public List<UserDTO> finalAll() {
        return userDetailsService.findAll().stream().map(userMapper::map).collect(Collectors.toList());
    }

    @PostMapping("/api/users")
    public UserDTO create(@RequestBody @Valid CreateUserDTO userDTO) {
        return userMapper.map(userDetailsService.create(userDTO));
    }

    @GetMapping("/api/me")
    public UserDTO me() {
        return userDetailsService.findByUsername(getLoggedUsername()).map(userMapper::map).orElse(null);
    }

    private String getLoggedUsername() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
    }

}
