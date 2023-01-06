package com.parttern.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {

        return null;
    }

    @Override
    public RoundedShape getRoundedShape(String type) {
        if (type.equals("Rectangle")){
            return new RoundedRectangle();
        } else if (type.equals("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
