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

/*
 * Type erasure is a feature in java generics where that type parameters used in generic code are removed during compilation.
 * This means that the generic type information is not available at runtime, and the generic types are replaced with their upper bounds or object type.
 *
 * How it works
 *
 * Java generics are type-checked to ensure type safety. the compiler replaces all generic types with their upper bounds or with object if no bound is specified.
 * compiler removes all generic type information and replaces it with casting or object.
 * This process is known as type erasure, and it allows java to maintain backward compatibility with non-generic code.
 *
 * Implications of Type erasure.
 * 1. Loss of Type Information at runtime.
 * 2. Bridge Methods.
 * 3. Arrays and Generics.
 * 4. Casting and unchecked warnings.
 *
 * Type erasure is a mechanism in Java generics that removes generic type information during compilation to maintain compatibility with non-generic code.
 * While this approach allows for seamless integration with existing code, it also means that certain generic type information is not available at runtime.
 * Developers need to be aware of the implications of type erasure, such as potential unchecked warnings and limitations on working with arrays of generic types.
 */
