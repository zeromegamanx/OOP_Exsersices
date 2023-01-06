package com.parttern.decorator.exsersice2;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }
    public String addTopping() {
        return " + honey";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
}
