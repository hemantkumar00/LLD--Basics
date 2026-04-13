package com.advanceJava.DesignPatterns;

public class Basics {
}

/*
 * Design patterns:-
 * Design patterns is a general, reusable solution to a commonly occurring problem within a given context in software design.
 * Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.
 *
 * Creational Design Patters:-
 * Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.
 *
 * Singleton:-
 * The singleton pattern is a software design pattern that restricts the instantiation of a class to one object.
 * This is useful when exactly one object is needed to coordinate actions across the system.
 *
 * Builder:-
 * Builder is a creational design pattern that lets you construct objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 *
 * Singleton:-
 * Problem:-
 * - Shared resource:- Imagine you have a class that is responsible for managing the database connection.
 * - Single access point:- Applications often require configuration. For example, you might want to configure the database connection parameters.
 *
 * Solution:-
 * - Constructor hiding:- The constructor of the singleton class should be private or protected.
 * - Global access point:- The singleton class should provide a global access point to get the instance of the singleton class. This global access point should be static and should return the same instance of the singleton class.
 */
