package com.parttern.iterator.exsersice2;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}