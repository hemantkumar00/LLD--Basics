package com.advanceJava.Threads;

public class ThreadBasic {
}

// Main concepts Processes, threads, CPU Scheduling, multithreading, and parallel execution.

/*
 * Programs:- These are sets of instructions for the computers.
 * Processes:- A process is an instance of a program in execution.
 * Memory Allocation:- This memory contains the program's code, data, and other necessary information.
 *
 * A process is an independent program in execution. It has its own memory space called head, code, data and system resource.
 * The heap isn't shared b/w 2 application or processes, they each have their own. process and application are often used interchangeably.
 * Processes enable multiple tasks to run concurrently, offering isolation and independence.
 *
 * Process LifeCycle
 * - Creation: When a program is launched, it is loaded into a memory, a process is created.
 * - Execution: The process runs its instructions.
 * - Termination: The process completes its execution or is terminated.
 *
 * A thread is the smallest unit of execution within a process. Multiple threads can exist within a single process, Sharing the same resources like memory but executing independently.
 *
 * Thread Class:- Java provides the Thread class, which serves as the foundation for creating the managing threads.
 * Runnable Interface:- The Runnable interface is often implemented to define the code that a thread will execute.
 */
