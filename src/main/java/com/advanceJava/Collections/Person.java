package com.advanceJava.Collections;

import java.util.Objects;

public class Person {
    // Immutability: It's often a good practice to make the custom objects used as keys immutable. This helps in
    // maintaining the integrity of the HashMap because the keys should not be modified after being used.

    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, age);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }
}
