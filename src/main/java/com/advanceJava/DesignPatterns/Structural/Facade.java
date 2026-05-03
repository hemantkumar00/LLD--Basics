package com.advanceJava.DesignPatterns.Structural;

/*
 * Facade:- is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
 */
public class Facade {
}

class OrderProcessor{
    /*
     * private PaymentGateway paymentGateway;
     * private Inventory inventory;
     * private EmailService emailService;
     * private ShippingService shippingService;
     * private AnalyticsService analyticsService;
     */
    public void process(){
        /*
         * paymentGateway.charge();
         * inventory.update();
         * emailService.send();
         * shippingService.add();
         * analyticsService.update();
         */
    }
}

class Order{
    private OrderProcessor orderProcessor;

    public void checkout(){
        orderProcessor.process();
    }
}