package com.advanceJava.Exception_Handling;

public class MultipleCatchExample {
    static void main() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: "+ e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: "+ e.getMessage());
        }
    }
}
