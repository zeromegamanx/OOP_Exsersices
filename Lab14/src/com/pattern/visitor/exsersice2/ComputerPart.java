package com.pattern.visitor.exsersice2;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}