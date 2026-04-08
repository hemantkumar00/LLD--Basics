package com.advanceJava.StreamsAndLambdas;

// A lambda expression is a block of code that gets passed around, like an anonymous method.
// It is a way to pass behavior as an argument to a method invocation and to define a method invocation and to define a method without a name.
// A stream ia a sequence of data. It is a way to write code that is more declarative and less imperative to process collections of objects.
// A functional interface is an interface that contains one and only one abstract method. It is a way to define a contract for behavior as an argument to a method invocation.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Lambda expressions, also known as anonymous functions, provide a way to create concise and expressive code by allowing the definition of a function in a more compact form.
 * (parameters) -> expression
 * (parameters) -> {statements}
 *
 * If there's only one parameter and its type is inferred, you can omit the parentheses.
 *
 * Lambda expressions are most commonly used with functional interfaces, which are interfaces containing only one abstract method.
 * Java 8 introduced the @FunctionalInterface annotation to mark such interface.
 */
public class Basics {
    static void main() {
        Runnable tradationalRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Runnable lambdaRunnable = () -> System.out.println(Thread.currentThread().getName());

        MathOperation traditionalAddition = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };

        MathOperation methodReference = Integer::sum;

        MathOperation lambdaAddition = (a, b) -> a+b;

        List<String> fruits = Arrays.asList("Apple", "Orange", "Pear", "Strawberry");

        List<String> filteredTraditional = new ArrayList<>();
        for(String fruit : fruits) {
            if(fruit.startsWith("A")) {
                filteredTraditional.add(fruit);
            }
        }

        List<String> filteredLambdas = fruits.stream().filter(fruit -> fruit.startsWith("A")).collect(Collectors.toList());
        // collect(Collectors.toList()) -> toList() same thing.

        Collections.sort(fruits, (a,b) -> a.compareTo(b));
        Collections.sort(fruits, String::compareToIgnoreCase);
        fruits.sort(String::compareToIgnoreCase);
    }
}
