package com.pattern.bridge.exsersice1;

public class PC extends Computer{

    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startUp() {
        this.os.startup();
    }

    @Override
    public void browswInternet(String url) {
        this.os.loadUrl();
        System.out.println("PC Browse " + url);

    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
