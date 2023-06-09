package com.example.jwtappdemo.service;

import com.example.jwtappdemo.models.User;

import java.util.List;

public interface UserService {
    User register(User user);
    List<User>getAll();
    User findByUsername(String name);
    User findById(Long id);
    void delete(Long id);
}
