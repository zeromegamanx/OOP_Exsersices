package com.parttern.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject() {
        observers = new LinkedList<>();
        state = 1;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state == state) {
            return;
        }

        this.state = state;
        notifyAllObservers();
    }

    public void attact(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
