package com.advanceJava.ObserverDesignPattern.Observent;

import com.advanceJava.ObserverDesignPattern.Observer.NotificationObserver;

public interface ProductObservant {
    void add(NotificationObserver o);
    void remove(NotificationObserver o);
    void notifyObservers();
    void updateInventory(int inventory);
    void performAction();
}
