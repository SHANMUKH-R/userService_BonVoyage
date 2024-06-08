package com.gl.userService_BonVoyage.controller;

import com.gl.userService_BonVoyage.dto.UserDTO;
import com.gl.userService_BonVoyage.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class UserController {
    @Autowired
    UserService userService;
    // Add a user
    @PostMapping("/users")
    public UserDTO addUser(@Valid @RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }
}
