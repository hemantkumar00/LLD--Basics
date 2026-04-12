package com.advanceJava.Threads;

public class LifeCycle {
    static void main() throws InterruptedException {
        // NEW
        Runnable runnable = new NewThread();
        Thread thread = new Thread(runnable);
        System.out.println(thread.getState());
        // RUNNABLE
        thread.start();
        System.out.println(thread.getState());
        Thread t1 = new Thread(new DemoBlockedRunnable());
        Thread t2 = new Thread(new DemoBlockedRunnable());

        // BLOCKED
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(t2.getState());
        System.exit(0);

        Thread t3 = new Thread(new SimpleRunnableThread());
        t3.start();

        // WAITING
        Thread.sleep(1000);
        System.out.println(t3.getState());
        System.out.println(Thread.currentThread().getState());

        // TIMED WAITING
        Thread t4 = new Thread(new SimpleRunnable2());
        t4.start();
        Thread.sleep(2000);
        System.out.println(t4.getState());

        // TERMINATED

        Thread t5 = new Thread(new NewThread());
        t5.start();

        Thread.sleep(1000);
        System.out.println(t5.getState());

    }
}

class DemoBlockedRunnable implements Runnable {
    @Override
    public void run() {
        commonResource();
    }
    public static synchronized void commonResource() {
        while (true) {
            //something but I don't know what.
        }
    }
}

class SimpleRunnableThread implements Runnable {
    @Override
    public void run() {
        Thread t2 = new Thread(new SimpleRunnable2());
        t2.start();
        try{
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SimpleRunnable2 implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}