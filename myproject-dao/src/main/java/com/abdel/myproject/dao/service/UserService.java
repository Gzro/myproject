package com.abdel.myproject.dao.service;

import java.util.List;

import com.abdel.myproject.dao.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
