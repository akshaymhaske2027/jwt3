package com.akshay.jwt3.service;

import com.akshay.jwt3.entities.User;
import com.akshay.jwt3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;


//    private List<User> store = new ArrayList<>();

//    public UserService() {
//        store.add(new User(UUID.randomUUID().toString(),"Akshay Mhaske","akshay@dev.in"));
//        store.add(new User(UUID.randomUUID().toString(),"Akm Mhaske","akm@dev.in"));
//        store.add(new User(UUID.randomUUID().toString(),"Balya Mhaske","ballya@dev.in"));
//        store.add(new User(UUID.randomUUID().toString(),"Martand Mhaske","martand@dev.in"));
//    }

    public  List<User> getUsers(){
        return userRepository.findAll();
    }


    public User createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
