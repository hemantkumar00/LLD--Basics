package com.advanceJava.DesignPatterns.Structural;

public class Adapter {
    static void main() {
//        PaymentProvider provider = new StripeAdapter(new StripeApi());
        PaymentProvider provider = new PayPalAdapter(new PayPalApi());
        PaymentProcessor processor = new PaymentProcessor(provider);
        processor.processPayment();
    }
}

/*
 * 1) Incompatible classes:-
 * You should have two classes that have incompatible interfaces.
 */

class StripeApi {
    public void createPayment() {
        // Create payment
    }
    public String checkStatus(String paymentId) {
        // Check payment status
        return "Stripe ka Status bad me du please.";
    }
}

class PayPalApi {
    public void makePayment() {
        // Create payment
    }
    public String getStatus(String paymentId) {
        // Check payment status
        return "PayPal ka Status bad me du please.";
    }
}

/*
 * 2) Adapter interface:-
 * Create an interface for the adapter that will be used to convert the incompatible interfaces.
 */

interface PaymentProvider {
    void makePayment();
    String getStatus(String paymentId);
}

/*
 * 3) Concrete adapter classes:-
 * Create a class that implements the target interface.
 * This is the class that the client code expects to work with.
 * The adapter will convert the interface of the existing class to this interface.
 */

/*
 * Transform request and delegate to original class:-
 * In the adapter class, transform the request to the format that the original class expects.
 * Then, call the original class to perform the operation.
 */

class StripeAdapter implements PaymentProvider{
    private final StripeApi stripeApi;
    public StripeAdapter(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }
    @Override
    public void makePayment() {
        stripeApi.createPayment();
        // Make payment
    }
    @Override
    public String getStatus(String paymentId) {
        return stripeApi.checkStatus(paymentId);
    }
}

class PayPalAdapter implements PaymentProvider {
    private final PayPalApi payPalApi;
    public PayPalAdapter(PayPalApi payPalApi) {
        this.payPalApi = payPalApi;
    }
    @Override
    public void makePayment() {
        payPalApi.makePayment();
        // Make payment
    }
    @Override
    public String getStatus(String paymentId) {
        return payPalApi.getStatus(paymentId);
    }
}

/*
 * 4) Client code:-
 * The client code expects to work with the target interface. The client code doesn't know that the adapter is converting the interface of the original class.
 */

class PaymentProcessor {
    private final PaymentProvider paymentProvider;
    public PaymentProcessor(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }
    public void processPayment() {
        paymentProvider.makePayment();
        String status = paymentProvider.getStatus("paymentId");
        System.out.println(status);
    }
}
