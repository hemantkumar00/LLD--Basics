package com.advanceJava.Executors_Callables;

import com.advanceJava.Threads.NumberPrinter;

import java.util.concurrent.*;

public class Overview {
    static void main() throws ExecutionException, InterruptedException {
//        ExecutorService executor  = Executors.newFixedThreadPool(10);
//        for(int i = 0; i< 100;i++){
//            executor.execute(new NumberPrinter(i));
//        }
//        executor.shutdown();

        Callable<Integer> sumTask = () -> 2+3;

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(() -> 2 + 3);
        Integer result = future.get();
        System.out.println(result);

        ExecutorService executorService2 = Executors.newCachedThreadPool();
        Future<Integer> future2 = executorService2.submit(() -> 2 + 3);
        future2.cancel(false);



    }
}

/*
 * The Executor framework in java provides a high-level and flexible framework for managing and controlling the execution of tasks in concurrent programming.
 *
 * Types of Thread Pool
 * 1. FixedThreadPool :- A thread pool with a fixed number of threads.
 * 2. CachedThreadPool :- A thread pool that dynamically adjusts the number of threads based on demand.
 * 3. SingleThreadExecutor :- A thread pool with only one thread.
 * 4. ScheduledThreadPool :- A thread pool that supports scheduling of tasks.
 * 5. WorkStealingPool :- Introduced in Java 8, it's a parallelism-friendly thread pool.
 *
 * Benefits of Executor framework
 *
 * Simplifies Task Execution
 * Efficient Resource Utilization
 * Better Control and Flexibility
 * Enhanced Scalability
 * Task Scheduling
 */
