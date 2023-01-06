package com.pattern.bridge.exsersice1;

public class WindowOS implements OperatingSystem{
    @Override
    public void startup() {
        System.out.println("Window OS starting up");
    }

    @Override
    public void loadUrl() {
        System.out.println("Window OS loading Url");
    }
}
