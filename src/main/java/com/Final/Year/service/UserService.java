package com.Final.Year.service;

import com.Final.Year.models.UserModel;
import com.Final.Year.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @Bean
//    public UserRepository getUserRepository() {
//        return userRepository;
//    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel getUser(long id) {
        return userRepository.findById(id).get();
    }


    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }


    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }


    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}
