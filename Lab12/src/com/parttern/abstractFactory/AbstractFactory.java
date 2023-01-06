package com.parttern.abstractFactory;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
    public abstract RoundedShape getRoundedShape(String type);
}
