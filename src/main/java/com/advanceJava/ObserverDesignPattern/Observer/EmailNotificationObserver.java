package com.advanceJava.ObserverDesignPattern.Observer;

import com.advanceJava.ObserverDesignPattern.Observent.ProductObservant;

public class EmailNotificationObserver implements NotificationObserver {
    private final ProductObservant productObservant;
    public EmailNotificationObserver(ProductObservant productObservant) {
        this.productObservant = productObservant;
    }

    @Override
    public void update() {
        productObservant.performAction();
    }
}
