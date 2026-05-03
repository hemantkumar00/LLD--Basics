package com.advanceJava.DesignPatterns.Structural;

public class Decorator {
    static void main() {
        Communicator communicator = new EmailService();
        Communicator phoneService = new PhoneService(communicator);
        Communicator slackService = new SlackService(phoneService);
        slackService.send("user", "Hello");
    }
}

/*
 * 1) Common product interface:- Declare the common interface for both wrappers and wrapped objects.
 */

interface Communicator {
    void send(String target, String message);
}

/*
 * 2) Concrete product:- Create a concrete product class that implements the common interface and represents the basic behavior of the wrapped object.
 */

class EmailService implements Communicator {
    @Override
    public void send(String target, String message) {
        System.out.println(target + " : " + message);
    }
}

/*
 * Base decorator:- Create a base decorator class that implements the common interface and contains a field for storing a reference to a wrapped object.
 */

abstract class CommunicatorDecorator implements Communicator {
    protected Communicator communicator;

    public CommunicatorDecorator(Communicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public void send(String target, String message) {
        System.out.println(target + " : " + message);
    }
}

/*
 * Concrete decorators:- Create concrete decorator classes that extend the base decorator class and add additional behavior to the wrapped object.
 */

class PhoneService extends CommunicatorDecorator {
    public PhoneService(Communicator communicator) {
        super(communicator);
    }
    @Override
    public void send(String phone, String message) {
        super.send(phone, message);
        sendPhoneNotification(phone, message);
    }

    private void sendPhoneNotification(String phone, String message) {
        System.out.println("Sending notification to phone " + phone + " : " + message);
    }
}

class SlackService extends CommunicatorDecorator {
    public SlackService(Communicator communicator) {
        super(communicator);
    }
    @Override
    public void send(String phone, String message) {
        super.send(phone, message);
        sendSlackNotification(phone, message);
    }

    private void sendSlackNotification(String phone, String message) {
        System.out.println("Sending notification to slack " + phone + " : " + message);
    }
}
