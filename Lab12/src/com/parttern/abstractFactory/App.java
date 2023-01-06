package com.parttern.abstractFactory;

public class App {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFacroty("Normal");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        System.out.println();

        AbstractFactory roundedShapeFacetory = producer.getFacroty("RoundedShape");
        RoundedShape roundedRectangle = roundedShapeFacetory.getRoundedShape("Rectangle");
        roundedRectangle.draw();
        RoundedShape roundedSquare = roundedShapeFacetory.getRoundedShape("Square");
        roundedSquare.draw();
    }
}
