package com.deiva.deiva.application.commands;

import an.awesome.pipelinr.Command;
import org.springframework.stereotype.Component;
import com.deiva.deiva.infraestructure.Wave;

@Component
public class WaveBack implements Command.Handler<Wave, String> {
    @Override
    public String handle(Wave command) {
        return "Aquí andamos jaja";
    }
}
