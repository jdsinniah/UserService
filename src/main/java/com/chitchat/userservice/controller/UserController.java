package com.chitchat.userservice.controller;

import com.chitchat.userservice.model.User;
import com.chitchat.userservice.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "user/")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class UserController {

    private final UserService userService;

    @RequestMapping(method = {RequestMethod.POST})
    public User registerUser(@RequestBody User user) {
        userService.createUser(user);
        return user;
    }

    @RequestMapping(value = "user/{id}", method = {RequestMethod.DELETE})
    public void deleteUser(@PathVariable(value = "id") Long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "user/{id}", method = {RequestMethod.GET})
    public User findUserById(@PathVariable(value = "id") Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = {RequestMethod.GET})
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
