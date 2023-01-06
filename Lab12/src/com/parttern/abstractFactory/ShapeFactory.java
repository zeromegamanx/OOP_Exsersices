package com.parttern.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String type) {
        if (type.equals("Rectangle")){
            return new Rectangle();
        } else if (type.equals("Square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public RoundedShape getRoundedShape(String type) {
        return null;
    }
}
