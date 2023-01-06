package com.pattern.command.exsersice1;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Switch mySwitch = new Switch();

        RestartCommand restartCommand1 = new RestartCommand(computer1);
        ShutdownCommand shutdownCommand1 = new ShutdownCommand(computer1);

        RestartCommand restartCommand2 = new RestartCommand(computer2);
        ShutdownCommand shutdownCommand2 = new ShutdownCommand(computer2);

        mySwitch.storeAndExecute(restartCommand1);
        mySwitch.storeAndExecute(shutdownCommand2);
        System.out.println();

        mySwitch.executeAllCommands();
    }
}
