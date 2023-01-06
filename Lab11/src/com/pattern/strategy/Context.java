package com.pattern.strategy;

public class Context {
    private Strategy strategy; // kiểu dữ liệu supertype

    public void setStrategy(Strategy strategy) {   //thay đổi chiến thuật theo mong muốn
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.execute(a, b);
    }


}
