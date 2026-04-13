package com.advanceJava.SOLID;

public class Bird {
    private int weight;
    private String color;
    private String type;
    private String size;
    private String beakType;

    public void fly() {
        if(type.equals("eagle")){
            System.out.println("flyLikeEagle");
        }else if(type.equals("penguin")){
            System.out.println("flyLikePenguin");
        }else if(type.equals("parrot")){
            System.out.println("flyLikeParrot");
        }
    }

    /*
     * The above code exhibits the following problems:
     * Readability:- The code is not readable.
     * Testing:- It is difficult to test the code.
     * Reusability:- The code is not reusable.
     * Parallel development:- The code is not parallel development friendly.
     * Multiple reasons to change:- The code has multiple reasons to change.
     *
     * Reasons to follow SRP
     * Maintainability
     * Ease of testing
     * Lower coupling
     *
     * How/Where to spot violations of SRP.
     * A method with multiple if-else statements
     * Monster methods or God classes
     * Utility classes:- are classes that contain only static methods which are used to perform some utility functions.
     *
     * OCP:-
     * The Open/Closed Principle states that a class should be open for extension but closed for modification.
     * This means that we should be able to add new functionality to the class without changing the existing code.
     * Abstract Class and Interface is solution to OCP.
     *
     * When to use abstract classes and interfaces?
     *
     * - If multiple classes have common functionalities, we would like to use inheritance to avoid code duplication
     * and also have fixed contracts so that the subclasses are forced to implement the common functionalities.
     * - If the common classes have common attributes, consider using abstract classes since they can have instance variables.
     * - If the common classes have common methods, consider using interfaces since they can have only abstract methods.
     * However, the implementation of the methods can be different in the subclasses.
     * Interfaces are also useful when we want to have multiple inheritance.
     */
    public void eat() {

    }
    public void makeSound() {

    }
}
