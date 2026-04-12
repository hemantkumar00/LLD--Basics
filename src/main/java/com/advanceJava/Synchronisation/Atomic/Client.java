package com.advanceJava.Synchronisation.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    static void main() throws InterruptedException {
        InvertorCounter ic = new InvertorCounter();
        Thread t1 = new Thread(new Adder(ic));
        Thread t2 = new Thread(new Subtractor(ic));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(ic.count.get());
    }
}

class InvertorCounter {
    AtomicInteger count = new AtomicInteger(0);
}

class Adder implements Runnable {
    private final InvertorCounter counter;

    Adder(InvertorCounter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000;i++){
            counter.count.addAndGet(1);
        }
    }
}

class Subtractor implements Runnable {
    private final InvertorCounter counter;
    Subtractor(InvertorCounter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000;i++){
            counter.count.addAndGet(-1);
        }
    }
}
