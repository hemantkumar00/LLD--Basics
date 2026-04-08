package com.advanceJava.ExceptionHandling;

public class Basic {
}

/*
 * An exception is an event that disrupts the normal flow of a program.
 * When an exceptional situation occurs, an object representing the exception is thrown.
 * Exception handling allows you to catch and handle these exceptions, preventing your program from crashing.
 *
 * 2 types of exceptions
 *
 * Checked Exceptions (Compile-time checking) extends exception class.
 * eg:-
 * IOException
 * SQLException
 * ClassNotFoundException
 * InterruptedException
 *
 * Unchecked Exceptions (Run-time checking) extends RuntimeException class.
 * eg:-
 * ArithmeticException
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ClassCastException
 *
 * Throwing Exceptions
 * the throw keyword to explicitly throw an exception in your code.
 * the throws clause is used in a method signature to declare that the method may throw checked exceptions.
 * It informs the caller that the method might encounter certain exceptional conditions, and the caller is responsible for handling these exceptions.
 *
 * Best practices for handling unchecked exceptions
 * -> Use Defensive Programming.
 * -> Catch Specific Exceptions.
 * -> Avoid Suppressing Exceptions.
 * -> Logging
 */
