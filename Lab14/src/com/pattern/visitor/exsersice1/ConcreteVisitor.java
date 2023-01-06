package com.pattern.visitor.exsersice1;

public class ConcreteVisitor implements Visitor{
    private double totalPrice;
    public ConcreteVisitor() {
        this.totalPrice = 0.0;
    }
    @Override
    public void visit(BusisnessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());    //in ra thông tin riêng của loại Book ấy (trong trg hợp này là publisher)
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }

    @Override
    public void visit(DesignPartternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
