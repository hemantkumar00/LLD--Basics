package com.advanceJava.Synchronisation.part1;

public class AdderSubtractorClient {
    static void main() throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        Thread thread = new Thread(adder);
        Thread thread1 = new Thread(subtractor);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();

        System.out.println(count.value);
    }
}

/*
 * Critical Section:- is a part of code that must be executed by only one thread at a time to avoid data inconsistency or corruption.
 * Race Condition:- is a concurrency problem that occurs when multiple threads access and modify shared data at the same time,
 * and the final result depends on the timing/order of execution rather than the logic itself.
 * Preemption:- is a concept in OS where the CPU forcibly interrupts a running task to switch execution to another task.
 *
 * Properties of a good synchronization solution:-
 * 1. Mutual Exclusion:- Only one thread should be allowed to execute its critical section at any given time.
 * 2. Progress:- The overall system should keep moving and making progress. It should not stop at any stage and be waiting for a long period.
 * 3. Bounded Waiting:- There exists a limit on the number of times other threads are allowed to enter their critical sections
 * after a thread has requested entry into its critical section and before that request is granted. No thread should be waiting infinitely.
 * 4. No Deadlock:- is a state where two or more threads are blocked forever, each waiting for the other to release a resource.
 * 5. Efficiency:- The synchronization solution should introduce minimal overhead and allow non-conflicting threads to execute concurrently.
 * 6. Adaptability:- The synchronization solution should be adaptable to different system configurations and workloads.
 * 7. Low Busy-Waiting:- Minimizes the use of busy-waiting to conserve CPU resources.
 * When a thread has to continuously check if they can now enter the critical section.
 * Checking if a thread can enter the critical section is not a productive use of time.
 * The ideal solution should have some kind of notification system.
 * 8. Fairness:- All threads should have a fair chance to enter their critical sections. No thread should be unfairly delayed or granted preferential access.
 * 9. Scalability:- The synchronization solution should scale well with an increasing number of threads and resources.
 * 10. Portability:- The synchronization solution should be portable across different platforms and operating systems.
 *
 * Solutions to Synchronization Problem
 * 1. Mutex Lock:- Mutex means mutual exclusion. Mutex lock is a lock that enables mutual exclusion. Mutex locks are a way to solve the synchronization problem.
 * Mutex locks are a way to ensure that only one thread can access a critical section at a time. Mutex locks are also known as mutual exclusion locks.
 *
 */
