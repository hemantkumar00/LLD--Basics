package com.advanceJava.Generics;

// Java Generics class
public class Box <T>{
    private T content;

    public void addContent(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }
}

/*
 * Generics offer several benefits:
 *
 * 1. Type Safety: Generics provide compile-time type checking, reducing the chances of runtime errors.
 * 2. Code Reusability: You can write code that works with different types without duplicating it.
 * 3. Elimination of Type Casting: Generics eliminate the need for explicit type casting, making the code cleaner.
 */
