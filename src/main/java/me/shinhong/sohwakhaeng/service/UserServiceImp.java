package me.shinhong.sohwakhaeng.service;


import me.shinhong.sohwakhaeng.model.User;
import me.shinhong.sohwakhaeng.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.delete(id);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


}
