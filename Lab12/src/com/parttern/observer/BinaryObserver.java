package com.parttern.observer;


public class BinaryObserver extends Observer{
    private String binary;
    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attact(this);
    }

    @Override
    public void update() {
        this.binary = convertDecimalToBinary(this.subject.getState());
    }

    private String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    @Override
    public String toString() {
        return "BinaryObserver{" +
                "binary='" + binary + '\'' +
                '}';
    }
}
