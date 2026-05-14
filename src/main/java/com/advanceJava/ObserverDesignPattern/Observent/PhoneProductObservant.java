package com.advanceJava.ObserverDesignPattern.Observent;

import com.advanceJava.ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneProductObservant implements ProductObservant {

    private final List<NotificationObserver> observers =  new ArrayList<>();
    private int inventory = 0;

    @Override
    public void add(NotificationObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(NotificationObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void updateInventory(int inventory) {
        int tempInventory = this.inventory;
        this.inventory = inventory;
        if(tempInventory <= 0){
            notifyObservers();
        }
    }

    @Override
    public void performAction() {
        System.out.println("Performing action for Phone Product with inventory: " + inventory);
    }
}
