package com.deiva.deiva.application.commands;

import an.awesome.pipelinr.Command;

public class Ping implements Command<String> {

    public final String host;

    public Ping(String host) {
        this.host = host;
    }
}
