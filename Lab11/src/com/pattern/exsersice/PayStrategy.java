package com.pattern.exsersice;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetail();

}
