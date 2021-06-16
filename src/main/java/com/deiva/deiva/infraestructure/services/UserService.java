package com.deiva.deiva.infraestructure.services;

import com.deiva.deiva.infraestructure.repositories.UserRepository;
import com.deiva.deiva.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String save(User user) {
        userRepository.save(user);
        return "saved";
    }

    public Iterable<User> all(){
        return userRepository.findAll();
    }
}
