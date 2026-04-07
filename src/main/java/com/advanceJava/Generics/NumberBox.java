package com.advanceJava.Generics;

import java.util.Arrays;
import java.util.List;

public class NumberBox <T extends Number> {
    private T content;
    public void addContent(T content){
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public <T extends Number> List<T> fromArrayToList(T[] a){
        return Arrays.asList(a);
    }
}

/*
 * We can specify that a method accepts a type and all its subclasses (Upper bound) or a type and all its superclasses (lower bound).
 * can use extends or super to set upper or lower bounds.
 * wildcards: ? extends T and ? super T. The former is for upper-bounded wildcards, and the latter is for lower-bounded wildcards.
 */
