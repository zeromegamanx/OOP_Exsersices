package com.pattern.bridge.exsersice1;

abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }
    public abstract void startUp();
    public abstract void browswInternet(String url);
    public abstract boolean canMoveComputer();
}
