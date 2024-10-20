package com.dev.identra.service;

import com.dev.identra.entity.User;
import com.dev.identra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(Object request) {

    }
}
