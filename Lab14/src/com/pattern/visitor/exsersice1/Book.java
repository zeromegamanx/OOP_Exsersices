package com.pattern.visitor.exsersice1;

abstract class Book {
    protected double price;

    public Book(double price) {
        this.price = price;
    }
    public abstract void accecpt(Visitor visitor);

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
