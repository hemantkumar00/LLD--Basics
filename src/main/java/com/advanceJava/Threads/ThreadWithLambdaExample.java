package com.advanceJava.Threads;

public class ThreadWithLambdaExample {
    static void main() {
        Thread myThread = new Thread(() -> {
            System.out.println("My Thread Name is " + Thread.currentThread().getName());
        });
        myThread.start();
    }
}
