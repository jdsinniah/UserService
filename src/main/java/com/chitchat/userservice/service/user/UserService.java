package com.chitchat.userservice.service.user;

import com.chitchat.userservice.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUser(Long id);

    User updateUser(User user);

    void deleteUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
