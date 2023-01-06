package com.pattern.adapter;

public class RoundHole {
    private int radius;

    public RoundHole (int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return  radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
