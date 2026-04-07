package com.advanceJava.OOPs.AccessModifiersAndConstructors;

public class Player {
    String name;
    private int guess;
    public String handle;

    private void assignTeam(){

    }

    public void setTeam(int teamId){

    }

    public void setGuess(int guess){
        if(guess >= 0){
            this.guess = guess;
        }
    }

    public int getGuess(){
        return this.guess;
    }
}
/*
 * public - everywhere
 * protected - with in the package and outside the package through child class.
 * private - only within the class
 * default - only with in the package
 *
 * constructor are the gatekeepers of object-oriented design.
 * Default constructor
 * Parameterised constructor
 * Copy constructor (Shallow & Deep Copy)
 */
