package com.advanceJava.Threads;

public class ThreadWithLambdaExample {
    static void main() {
        Thread myThread = new Thread(() -> {
            System.out.println("My Thread Name is " + Thread.currentThread().getName());
        });
        myThread.start();
    }

    /*
     * Starting a thread- behind the scenes
     * Thread Initialization -> new Thread() -> myThread.start()
     * Thread Scheduling -> The JVM's scheduler determines when the thread gets CPU time for execution. the actual timing is managed by OS.
     * run() Method Execution
     * Concurrent Execution
     * Thread Termination
     *
     * Important:
     *  Direct run Method Invocation: Calling the run method directly will not start a new thread; will execute the run method in the current thread.
     *  One-Time Execution
     *  In summery, calling thread.start() initiates the execution of a new thread, and the JVM takes care of the thread scheduling and execution of the run method in a separate concurrent context.
     */
}
