package com.deiva.deiva.infraestructure;

import an.awesome.pipelinr.Command;
import com.deiva.deiva.model.entities.User;
import java.util.List;

public class AddUser implements Command<User> {
    public final User user;

    public AddUser(User user) {
        this.user = user;
    }
}
