package com.advanceJava.Synchronisation.part2;

import com.advanceJava.Synchronisation.part1.Count;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    static void main() throws InterruptedException {
        Count count =  new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}

/*
 * Properties of a mutex lock
 * - A thread can only access the critical section if it has the lock.
 * - Only one thread can have the lock at a time.
 * - Other threads cannot access the critical section if a thread has the lock and thus have to wait.
 * - Lock will automatically be released when the thread exits the critical section.
 */
