package com.advanceJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethodsExample {
    static void main() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Iterator<Integer> iterator = numbers.iterator();

        // hasNext(): Returns true if the iteration has more elements.
        // next(): Returns the next element in the iteration.
        // remove(): Removes the last element returned by next() from the underlying collection (optional operation).
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("Element: " + next);
            iterator.remove();
        }
        System.out.println("Number elements: " + numbers);
    }
}
