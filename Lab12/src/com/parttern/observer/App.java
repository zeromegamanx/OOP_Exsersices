package com.parttern.observer;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("Convert decimal 1234: ");
        subject.setState(1234);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObserver);

        System.out.println("Convert decimal 6789: ");
        subject.setState(6789);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObserver);
    }
}
