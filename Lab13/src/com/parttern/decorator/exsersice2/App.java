package com.parttern.decorator.exsersice2;

public class App {
    public static void main(String[] args) {
        IceCream iceCream1 = new HoneyToppingDecorator(new ChocolatteIceCream());
        System.out.println(iceCream1.getDescription());
        IceCream iceCream2 = new NutsToppingDecorator(new ChocolatteIceCream());
        System.out.println(iceCream2.getDescription());
        IceCream iceCream3 = new HoneyToppingDecorator(new StrawberryIceCream());
        System.out.println(iceCream3.getDescription());
        IceCream iceCream4 = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(iceCream4.getDescription());
    }
}
