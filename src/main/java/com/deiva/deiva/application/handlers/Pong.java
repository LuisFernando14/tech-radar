package com.deiva.deiva.application.handlers;

import an.awesome.pipelinr.Command;
import com.deiva.deiva.application.commands.Ping;

public class Pong implements Command.Handler<Ping, String> {

    @Override
    public String handle(Ping command) {
        return "Pong from " + command.host;
    }
}