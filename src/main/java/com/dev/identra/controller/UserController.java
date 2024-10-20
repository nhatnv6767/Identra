package com.dev.identra.controller;

import com.dev.identra.dto.request.UserCreationRequest;
import com.dev.identra.entity.User;
import com.dev.identra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
        // @RequestBody map data cua body vao object nay
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable String userId) {
        return null;
    }

}
