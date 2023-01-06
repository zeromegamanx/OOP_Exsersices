package com.pattern.exsersice;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    private PayStrategy payMethod;

    public void setPayMethod(PayStrategy payMethod) {
        this.payMethod = payMethod;
    }

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetail();
    }
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
