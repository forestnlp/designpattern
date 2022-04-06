package com.designpattern.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Broker {
    private LinkedList<Command> commands = new LinkedList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void runCommands(){
        while (!commands.isEmpty()) {
            Command c = commands.poll();
            c.execute();
        }
    }
}
