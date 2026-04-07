package com.advanceJava.OOPs;

public interface Person {
    String getName();
    String getEmail();

    default void draw() {
        System.out.println("draw");
    }
}

/*
 * Abstract class -> Where we want to postpone some parts of the implementations to be completed later.
 */

/*
 * An interface is a reference type in Java. It is similar to a class, but it cannot be instantiated. it can contain only constants, method signatures, default methods, static methods, and nested types.
 * Method bodies exist only for default methods and static methods.
 *
 * In an interface, we're allowed to use:
 *
 * constants variables
 * abstract methods
 * static methods
 * default methods
 *
 * we also should remember that
 *
 * we can't instantiate interfaces directly
 * an interface can be empty, with no methods or variables in it
 * we can't use the final word in the interface definition, as it will result in a compiler error
 * all interface declarations should have the public or default access modifier, the abstract modifier will be added automatically by the compiler
 * an interface method can't be protected or final
 * up until java 9, interface methods could not be private, however, java 9 introduced the possibility to define private methods in interfaces
 * interface variables are public, static, and final by definition, we're not allowed to change their visibility
 *
 * where to use
 * 1. Behavioral functionality
 * 2. Multiple inheritances
 * 3. Polymorphism
 * 4. Default method in interfaces
 */
