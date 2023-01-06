package com.pattern.command.exsersice1;

public class ShutdownCommand implements Command{
    private Computer computer;

    public ShutdownCommand(Computer computer) {
        this.computer = computer;
    }
    @Override
    public void execute() {
        computer.shutdown();
    }
}
