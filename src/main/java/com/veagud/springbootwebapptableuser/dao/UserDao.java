package com.veagud.springbootwebapptableuser.dao;

import com.veagud.springbootwebapptableuser.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(long id);

    User getUserById(long id);

    void updateUser(User user);
}
