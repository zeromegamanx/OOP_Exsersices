package com.parttern.observer;


public class OctalObserver extends Observer{
    private String octal;
    public OctalObserver(Subject subject) {
        super(subject);
        subject.attact(this);
    }

    @Override
    public void update() {
        this.octal =  convertDecimalToOctal(this.subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    @Override
    public String toString() {
        return "OctalObserver{" +
                "octal='" + octal + '\'' +
                '}';
    }
}
