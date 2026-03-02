package com.advanceJava.Threads;

public class NumberPrinter implements Runnable {
    int number;
    NumberPrinter(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Printing " + number + " from " + Thread.currentThread().getName());
    }
}
