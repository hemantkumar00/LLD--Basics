package com.advanceJava.Generics;

import java.util.Arrays;
import java.util.List;

public class Client {
    static void main() {
        System.out.println("// Java Generics class");
        Box<Integer> intBox = new Box<>();
        intBox.addContent(42);
        System.out.println("Bx Content: " + intBox.getContent());

        Box<String> stringBox = new Box<>();
        stringBox.addContent("Hello, Generics");
        System.out.println("Bx Content: " + stringBox.getContent());

        System.out.println("// Java Generics method");
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"apple", "banana", "orange"};

        Util util = new Util();
        util.printArray(intArray);
        util.printArray(stringArray);

        System.out.println("// Java Generics wildcard");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("apple", "banana", "orange");
        Printer.printList(intList);
        Printer.printList(stringList);

        System.out.println("// Java Generics interface");
        OrderedPair<Integer, String> pair = new OrderedPair<>(42, "apple");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
