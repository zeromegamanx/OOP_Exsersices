package com.pattern.visitor.exsersice1;

public class DesignPartternBook extends ProgrammingBook{
    private String resource;
    private String bestSeller;

    public DesignPartternBook(double price, String resource, String bestSeller) {
        super(price);
        this.resource = resource;
        this.bestSeller = bestSeller;
    }
    @Override
    public void accecpt(Visitor visitor) {
        visitor.visit(this);
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(String bestSeller) {
        this.bestSeller = bestSeller;
    }
}
