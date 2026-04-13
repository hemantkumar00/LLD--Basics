package com.advanceJava.SOLID;

public class Basics {
}

/*
 * SOLID principles:- SOLID is a mnemonic acronym for five design principles intended to make object-oriented design more understandable, flexible, and maintainable.
 *
 * Single responsibility principle:- There should never be more than one reason for a class/code unit to change. Even class should have only one responsibility.
 *
 * Open/Closed principle:- Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
 *
 * Liskov Substitution Principle:- Objects in a program should be replaceable with instance of their subtypes without altering the correctness of that program.
 * (If it looks like a duck and quacks like a duck but needs batteries, you probably have the wrong abstraction.)
 *
 * Interface Segregation Principle:- Many client-specific interfaces are better than one general-purpose interface.
 * -> A client should never be forced to implement an interface that it doesn't use, or clients shouldn't be forced to depend on methods they do not use.
 *
 * Dependency Inversion Principle:- Depend upon abstractions. Do not depend upon concrete classes.
 *
 * Single responsibility principle:- When designing our classes, we should aim to put related features together,
 * so whenever they tend to change they change for the same reason.
 * And we should try to separate features if they will change for different reasons.
 *
 * Liskov Substitution Principle states that objects in a program should be replaceable with instances of their subtypes without altering the correctness of the program.
 * To identify violations, we can check if we can replace a class with its subclasses having to handle special cases and expect the same behavior.
 * Prefer using interfaces over abstract classes to implement behavior since abstract classes tend to tie behavior to the class hierarchy.
 *
 * Dependency inversion principle:-
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 */
