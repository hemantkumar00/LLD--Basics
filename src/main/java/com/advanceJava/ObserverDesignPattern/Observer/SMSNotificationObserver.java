package com.advanceJava.ObserverDesignPattern.Observer;

import com.advanceJava.ObserverDesignPattern.Observent.ProductObservant;

public class SMSNotificationObserver implements NotificationObserver {
    private final ProductObservant productObservant;
    public SMSNotificationObserver(ProductObservant productObservant) {
        this.productObservant = productObservant;
    }
    @Override
    public void update() {
        productObservant.performAction();
    }
}
