package com.abdel.myproject.dao.impl;

import java.util.List;

import com.abdel.myproject.dao.entity.User;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
