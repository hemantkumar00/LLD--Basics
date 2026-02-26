package com.advanceJava.Exception_Handling;

public class UncheckedExceptionExample {
    static void main() {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
    static int divide(int a, int b) {
        return a/b;
    }
}
