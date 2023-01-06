package com.parttern.iteraator.exsersice1;

public interface Iterator {
    boolean hasNext();
    Object next();  // lấy ra phần tử hiện tại, trả về object

    void remove();

}
