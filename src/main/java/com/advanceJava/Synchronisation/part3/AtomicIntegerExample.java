package com.advanceJava.Synchronisation.part3;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    static void main() {
        AtomicInteger atomicInteger = new AtomicInteger();

        int newValue = atomicInteger.incrementAndGet();
        System.out.println("Incremented Value: "+newValue);

        newValue = atomicInteger.decrementAndGet();
        System.out.println("Decrement Value: "+newValue);

        int addValue = 5;
        newValue = atomicInteger.addAndGet(addValue);
        System.out.println("After Adding "+addValue+" : "+newValue);

        int expectedValue = 5;
        int updatedValue = 10;

        boolean success = atomicInteger.compareAndSet(expectedValue, updatedValue);
        if (success) {
            System.out.println("Value updated successfully. New Value: "+ atomicInteger.get());
        } else {
            System.out.println("Value not updated successfully. New Value: "+ atomicInteger.get());
        }
    }
}

/*
 * Benefits of Atomic Datatypes:
 * Thread Safety: Operations on AtomicInteger are atomic, eliminating the need for explicit synchronization.
 * Performance: Atomic operations are more efficient than using locks for simple operations on shared variables.
 * Simplicity: Simplifies the development of thread-safe code in scenarios where simple atomic operations suffice.
 */
