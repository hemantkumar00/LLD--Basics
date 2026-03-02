package com.advanceJava.Threads;

/*
 * start(): Initiates the execution of the thread, causing the run method to be called. Usage myThread.start();
 * run(): Contains the code that will be executed by the thread. This method needs to be overridden when extending the
 * Thread class or implementing the Runnable interface. Usage: Defined by the user based on the specific task.
 * sleep(long milliseconds): Description: Causes the thread to sleep for the specified number of milliseconds,
 * pausing its execution. Usage: Thread.sleep(1000);
 * join(): Waits for the thread to complete its execution before the current thread continues.
 * It is often used for synchronization between threads. Usage: myThread.join();
 * interrupt(): Interrupt the thread, causing it to stop or throw an InterruptedException.
 * The thread must handle interruptions appropriately. Usage: myThread.interrupt();
 * isAlive(): Returns true if the thread has been started and has not yet completed its execution,
 * otherwise returns false. Usage: boolean alive = myThread.isAlive();
 * setName(String name): Sets the name of the thread. Usage: myThread.setName("MyThread");
 * getName(): Returns the name of the thread. Usage: String threadName = myThread.getName();
 * setPriority(int priority): Sets the priority of the thread.
 * Priorities range from Thread.MIN_PRIORITY to Thread.MAX_PRIORITY. Usage: myThread.setPriority(Thread.MAX_PRIORITY);
 * getPriority(): Returns the priority of the thread. Usage: int priority = myThread.getPriority();
 * currentThread(): Returns a reference to the currently executing thread object.
 * Usage: Thread currentThread = Thread.currentThread();
 */

public class Main {
    static void main() {
//        Thread t = new Thread(new SimpleRunnable());
//        t.start();
        for(int i=0;i<100;i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }
    }
}
