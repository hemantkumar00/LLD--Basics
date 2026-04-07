package com.advanceJava.OOPs;

public class User implements Person {
    private final String name;
    private final String email;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
