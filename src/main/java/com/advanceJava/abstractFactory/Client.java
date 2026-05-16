package com.advanceJava.abstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Operating system you want to use (Windows/Mac): ");
        String os = scanner.next();
        GUIFactory guifactory;
        if (os.equalsIgnoreCase("Windows")) {
            guifactory = new WindowsFactory();
        }else if (os.equalsIgnoreCase("Mac")) {
            guifactory = new MacFactory();
        }else {
            System.out.println(os+ " is not supported");
            return;
        }
        Application application = new Application(guifactory);
        application.renderUI();

    }
}
