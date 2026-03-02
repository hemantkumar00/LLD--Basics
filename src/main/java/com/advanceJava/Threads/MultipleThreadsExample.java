package com.advanceJava.Threads;

public class MultipleThreadsExample {
    static void main() {
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
