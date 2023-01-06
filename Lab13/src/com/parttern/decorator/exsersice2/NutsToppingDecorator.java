package com.parttern.decorator.exsersice2;

public class NutsToppingDecorator extends ToppingDecorator{
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }
    public String addTopping() {
        return " + nuts";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
}
