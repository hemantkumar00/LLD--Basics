package com.advanceJava.DesignPatterns.Creational.Factory;

public class SimpleFactory {
}

/*
 * The factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
 * This is done by creating objects by calling a factory method - either specified in an interface and implemented by child classes,
 * or implemented in a base class and optionally overridden by derived classes - rather than by calling a constructor.
 *
 * Simple Factory:-
 * The simple factory pattern is a creational pattern that provides a static method for creating objects.
 * The method can be used to create objects without having to specify the exact class of the object that will be created.
 * This is done by creating a factory class that contains a static method for creating objects.
 *
 * example:-
 *
 *  class UserFactory {
 *      public static user createUser(UserRole role){
 *          switch ( role ) {
 *              case STUDENT:
 *                  return new Student("John", "Doe");
 *              case TEACHER:
 *                  return new Teacher("John", "Doe");
 *              case ADMIN:
 *                  return new Admin("John", "Doe");
 *          }
 *      }
 *  }
 *
 * main class
 *  User user = UserFactory.createUser(UserRole.STUDENT);
 *
 * 1) Factory class:- Create a factory class that contains a static method for creating objects.
 * 2) Conditional:- Use a conditional statement to create the object based on the input.
 * 3) Request:- Request an object from the factory class without having to know the class of the object that will be returned.
 */
