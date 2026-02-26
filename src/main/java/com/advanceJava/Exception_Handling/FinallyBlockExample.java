package com.advanceJava.Exception_Handling;

public class FinallyBlockExample {
    static void main() {
        try {
            System.out.println("Inside try block");
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}