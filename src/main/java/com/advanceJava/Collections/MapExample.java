package com.advanceJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    static void main() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Java", 1);
        myMap.put("Python", 2);
        myMap.put("JavaScript", 3);
        System.out.println("Map elements: " + myMap);
    }
}
