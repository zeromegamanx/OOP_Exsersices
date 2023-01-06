package com.pattern.visitor.exsersice1;

public class JavaCoreBook extends ProgrammingBook{
    private String resource;
    private String favouriteBook;

    public JavaCoreBook(double price, String resource, String favouriteBook) {
        super(price);
        this.favouriteBook = favouriteBook;
        this.resource = resource;
    }

    @Override
    public void accecpt(Visitor visitor) {
        visitor.visit(this);
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    @Override
    public String getResource() {
        return resource;
    }
}
