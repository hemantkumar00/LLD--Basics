package com.advanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    static void main() {
        Map<Person, String> personMap = new HashMap<>();

        Person person1 = new Person(1, "Alice", 25);
        Person person2 = new Person(2, "Bob", 30);
        Person person3 = new Person(2, "Bob", 30);

        personMap.put(person1, "Employee");
        personMap.put(person2, "Manager");
        personMap.put(person3, "Manager");

        Person keyToLookUp = new  Person(1, "Alice", 25);
        String position = personMap.get(keyToLookUp);

        System.out.println("Position for " +  keyToLookUp + " : " + position);
        System.out.println(personMap);
    }
}
