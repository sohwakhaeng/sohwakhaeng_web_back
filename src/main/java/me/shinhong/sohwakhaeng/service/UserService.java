package me.shinhong.sohwakhaeng.service;

import me.shinhong.sohwakhaeng.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();

}
