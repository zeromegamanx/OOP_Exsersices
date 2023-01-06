package com.pattern.visitor.exsersice1;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook1 = new BusisnessBook(50, "Giao Duc");
        businessBook1.accecpt(visitor);
        System.out.println();

        Book designParttenBook1 = new DesignPartternBook(100, "Store" , "Head");
        designParttenBook1.accecpt(visitor);
        System.out.println();

        Book javaCoreBook1 = new JavaCoreBook(150, "Store", "Favourite");
        javaCoreBook1.accecpt(visitor);
        System.out.println();

        System.out.println("Price of all book: " + visitor.getTotalPrice());
    }
}
