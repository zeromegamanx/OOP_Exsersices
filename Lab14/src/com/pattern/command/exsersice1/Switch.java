package com.pattern.command.exsersice1;

import java.util.LinkedList;
import java.util.List;

public class Switch {  //gửi request
    private List<Command> historyCommands;

    public Switch() {
        this.historyCommands = new LinkedList<>();
    }

    public void execute(Command command) {
        command.execute();
    }

    public void store(Command command) {
        this.historyCommands.add(command);
    }

    public void storeAndExecute(Command command) {
        store(command);
        execute(command);
    }

    public void executeAllCommands() {
        for (Command command: historyCommands) {
            command.execute();
        }
    }
}
