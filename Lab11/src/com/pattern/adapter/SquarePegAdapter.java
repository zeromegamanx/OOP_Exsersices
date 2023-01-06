package com.pattern.adapter;

public class SquarePegAdapter extends RoundPeg{  //chuyển giao diện của cọc hình vuông sang cọc hình tròn nên phải extend hình tròn
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }

    public int getRadius(){
        return (int) (Math.sqrt(this.peg.getWidth() * this.peg.getWidth()) / 2);
    }
}
