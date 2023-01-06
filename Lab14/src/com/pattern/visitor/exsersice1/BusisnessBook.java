package com.pattern.visitor.exsersice1;

public class BusisnessBook extends Book{
    private String publisher;

    public BusisnessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }
    @Override
    public void accecpt(Visitor visitor) {
        visitor.visit(this);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
