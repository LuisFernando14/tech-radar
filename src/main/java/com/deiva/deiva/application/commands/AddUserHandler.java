package com.deiva.deiva.application.commands;

import an.awesome.pipelinr.Command;
import com.deiva.deiva.infraestructure.AddUser;
import com.deiva.deiva.infraestructure.repositories.UserRepository;
import com.deiva.deiva.model.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AddUserHandler implements Command.Handler<AddUser, User> {

    private final UserRepository userRepository;

    @Autowired
    public AddUserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User handle(AddUser command) {
        System.out.println("Vamos a probar que tal imprime esto");
        System.out.println(command.user.getName());
        if(command.user.getName().equals("Wilfrido")) {
            throw new Error("El nombre está mal");
        }
        return command.user;
    }
}