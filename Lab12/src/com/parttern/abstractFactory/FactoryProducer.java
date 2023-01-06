package com.parttern.abstractFactory;

public class FactoryProducer {
    public AbstractFactory getFacroty(String type){
        if (type.equals("RoundedShape")){
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
