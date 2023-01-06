package com.parttern.observer;


public class HexaObserver extends Observer{
    private String hexa;
    public HexaObserver(Subject subject) {
        super(subject);
        subject.attact(this);
    }

    @Override
    public void update() {
         this.hexa = convertDecimaltoHexa(this.subject.getState());
    }

    private String convertDecimaltoHexa(int decimal) {
        return Integer.toHexString(decimal);
    }

    @Override
    public String toString() {
        return "HexaObserver{" +
                "hexa='" + hexa + '\'' +
                '}';
    }
}
