package com.advanceJava.Synchronisation.SemaphoreTest2;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Queue<Object> queue, int maxSize, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (queue.size()<this.maxSize) {
                System.out.println(this.name + " adding to queue, Size " + queue.size());
                queue.add(new Object());
            }
            consumerSemaphore.release();
        }
    }
}
