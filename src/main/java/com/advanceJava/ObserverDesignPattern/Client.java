package com.advanceJava.ObserverDesignPattern;

import com.advanceJava.ObserverDesignPattern.Observent.PhoneProductObservant;
import com.advanceJava.ObserverDesignPattern.Observent.ProductObservant;
import com.advanceJava.ObserverDesignPattern.Observer.EmailNotificationObserver;
import com.advanceJava.ObserverDesignPattern.Observer.NotificationObserver;
import com.advanceJava.ObserverDesignPattern.Observer.SMSNotificationObserver;

public class Client {
    static void main() {
        ProductObservant productObservant = new PhoneProductObservant();
        NotificationObserver emailNotificationObserver = new EmailNotificationObserver(productObservant);
        NotificationObserver smsNotificationObserver = new SMSNotificationObserver(productObservant);
        productObservant.add(emailNotificationObserver);
        productObservant.add(smsNotificationObserver);
        productObservant.updateInventory(10);
    }
}
