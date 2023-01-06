package com.pattern.bridge.exsersice1;

public class MacOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("Mac OS starting up");
    }

    @Override
    public void loadUrl() {
        System.out.println("Mac OS loading Url");
    }
}
