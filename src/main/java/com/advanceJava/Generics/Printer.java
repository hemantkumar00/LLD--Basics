package com.advanceJava.Generics;

import java.util.List;

// Java Generics WildCard
public class Printer {
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.print(o+" ");
        }
        System.out.println();
    }
}
