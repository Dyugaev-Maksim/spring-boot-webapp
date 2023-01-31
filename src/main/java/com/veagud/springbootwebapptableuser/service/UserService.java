package com.veagud.springbootwebapptableuser.service;

import com.veagud.springbootwebapptableuser.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUser(long id);

    User showUserById(long id);

    void updateUser(User user);
}

