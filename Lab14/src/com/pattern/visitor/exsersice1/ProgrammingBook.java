package com.pattern.visitor.exsersice1;

abstract class ProgrammingBook extends Book{  //hàm này có 2 hàm abstract là getResource

    public ProgrammingBook(double price){
        super(price);
    }
    public abstract String getResource();
}
