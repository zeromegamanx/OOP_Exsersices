package com.pattern.visitor.exsersice1;

public interface Visitor {
    void visit(BusisnessBook book);
    void visit(JavaCoreBook book);
    void visit(DesignPartternBook book);
}
