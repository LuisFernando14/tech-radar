package com.deiva.deiva.application.queries;

import an.awesome.pipelinr.Command;
import com.deiva.deiva.infraestructure.Users;
import com.deiva.deiva.infraestructure.repositories.UserRepository;
import com.deiva.deiva.model.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class UsersHandler implements Command.Handler<Users, Iterable<User>> {

    private final UserRepository userRepository;

    @Autowired
    public UsersHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> handle(Users command) {
        return this.userRepository.findAll();
    }
}