package com.advanceJava.OOPs;

public class Base {
    static void main() {
        User user  = new User("hemant", "hemantkumar23090@gmail.com");
        System.out.println(user.getEmail());
        System.out.println(user.getName());
    }
}
