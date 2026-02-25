package com.advanceJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void main() {
        List<String> myList = new ArrayList<String>();
        myList.add("orange");
        myList.add("python");
        myList.add("javaScript");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("Element: "+next);
        }

        // Can be used as enhance for loop.
        for (String next : myList) {
            System.out.println("Element: " + next);
        }
    }
}
