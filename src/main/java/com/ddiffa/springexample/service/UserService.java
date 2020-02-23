package com.ddiffa.springexample.service;

import com.ddiffa.springexample.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    void delete(long userId);

    User getUser(long id);
}
