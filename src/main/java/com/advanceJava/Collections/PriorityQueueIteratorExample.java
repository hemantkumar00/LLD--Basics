package com.advanceJava.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIteratorExample {
    static void main() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Java");
        pq.offer("Python");
        pq.offer("JavaScript");
        System.out.println("Elements in PriorityQueue using Iterator: ");

        Iterator<String> it = pq.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println("Element: " + next);
        }
    }
}
