package com.parttern.decorator.exsersice2;

abstract class ToppingDecorator implements IceCream{

    protected IceCream iceCream;

    public ToppingDecorator(IceCream specialIcecream) {
        this.iceCream = specialIcecream;
    }

    public String addTopping() {
        return iceCream.getDescription();
    }
}
