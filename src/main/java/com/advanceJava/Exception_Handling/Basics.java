package com.advanceJava.Exception_Handling;

// Disrupts the normal flow of a program.
/*
 * There are 2 type of exception
 * Checked and Unchecked
 *
 * ** Checked **
 * Checked are checked at compile-time,
 * and the programmer is required to handle them explicitly using try-catch blocks or declare
 * them in the method signature using the throws keywords.
 * Extends the Exception class and do not extend RuntimeException
 * eg:-
 * IOException
 * SQLException
 * ClassNotFoundException
 * InterruptedException
 *
 * ** Un-Checked **
 * Unchecked exceptions can occur at runtime due to unexpected conditions
 * They usually indicate programming errors, and it's not mandatory to handle them explicitly.
 * They are subclasses of RuntimeException
 * eg:-
 * ArithmeticException
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ClassCastException
 *
 * ** Handling Exceptions **
 * The try-catch Block
 * The try-catch block is used to handle exceptions.
 * The code that might throw an exception is placed inside the try block, and the code to handle the exception is placed inside the catch block.
 * Finally block: this will be executed regardless of whether an exception is thrown or not.
 * It is often used for cleanup operations, such as closing resources.
 *
 * Throwing Exceptions: we can use the throw keyword to explicitly throw an exception in your code.
 *
 * ** Best Practices **
 * Catch specific exceptions rather than using a generic catch (Exception e) block whenever possible.
 * Handle exceptions at an appropriate level in your application. Don't catch exceptions if you can't handle them effectively.
 * Clean up resources (e.g., closing files or database connections) in the finally block.
 * Log exceptions or relevant information to aid in debugging.
 * - For Checked Exceptions -
 * Handle or Declare: Always handle checked exceptions using the try-catch block or declare them in the method signature using the throws clause.
 * Provide Meaningful Messages.
 * Close Resource in a finally Block.
 * - For Unchecked Exceptions -
 * Use Defensive Programming: Validate inputs and conditions to avoid common causes of unchecked exceptions.
 * Catch Specific Exceptions not generic
 * Logging
 *
 * Throwable
 * ├── Error
 * └── Exception
 *      ├── RuntimeException
 *      └── Other Checked Exceptions
 */
public class Basics {
}
