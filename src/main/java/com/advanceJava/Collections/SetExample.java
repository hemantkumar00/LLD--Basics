package com.advanceJava.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    static void main() {
        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");

        System.out.println("Set elements: " + mySet);
    }
}
