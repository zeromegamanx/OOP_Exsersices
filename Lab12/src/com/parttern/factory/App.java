package com.parttern.factory;

public class App {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        Apple apple = (Apple) fruitFactory.provideFruit("Apple"); //ép kiểu từ fruit sang apple
        Banana banana = (Banana) fruitFactory.provideFruit("Banana");
        Orange orange = (Orange) fruitFactory.provideFruit("Orange");
    }
}
