package com.advanceJava.Synchronisation.part3;

public class Client {
    static void main() {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtractor);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.getCount());
    }
}

class Count {
    private int count = 0;
    public void decrease(){
        synchronized (this) {
            count--;
        }
    }
    public void increase(){
        synchronized (this) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}

class Subtractor implements Runnable {
    Count count;
    public Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            count.decrease();
        }
    }
}

class Adder implements Runnable {
    Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            count.increase();
        }
    }
}