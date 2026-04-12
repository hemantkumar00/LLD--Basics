package com.advanceJava.Synchronisation.SemaphoreTest1;

import java.util.concurrent.Semaphore;

public class TShirtStore {
    private static final int STORE_CAPACITY = 5;
    private static Semaphore mutex = new Semaphore(1);
    private static Semaphore empty = new Semaphore(STORE_CAPACITY);
    private static Semaphore full = new Semaphore(0);
    private static int tShirtCount = 0;

    static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    empty.acquire();
                    mutex.acquire();
                    System.out.println("Producer produces a T-shirt. Total T-shirts: "+ ++tShirtCount);
                    mutex.release();
                    full.release();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    full.acquire();
                    mutex.acquire();
                    System.out.println("Consumer buys a T-shirt. Total T-shirts: " + --tShirtCount);
                    mutex.release();
                    empty.release();
                    Thread.sleep(1500);
                }
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void main() {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }
}

/*
 * Semaphores:-
 * Mutex:- Controls access to the critical sections (mutex stands for mutual exclusion).
 * Empty:- Represents the number of empty slots in the store, initially set to the store's capacity.
 * Full:- Represents the number of filled slots in the store, initially set to 0.
 *
 * Producer:- acquires an empty slot using empty.acquire() and enters the critical section with mutex.acquire().
 * Consumer:- acquires a filled slot using full.acquire() and enters the critical section with mutex.acquire().
 */
