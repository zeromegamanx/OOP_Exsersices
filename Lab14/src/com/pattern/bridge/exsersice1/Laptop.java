package com.pattern.bridge.exsersice1;

public class Laptop extends Computer{

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        this.os.startup();
    }

    @Override
    public void browswInternet(String url) {
        this.os.loadUrl();
        System.out.println("Laptop Browse " + url);
    }

    @Override
    public boolean canMoveComputer() {
        return true;
    }
}
