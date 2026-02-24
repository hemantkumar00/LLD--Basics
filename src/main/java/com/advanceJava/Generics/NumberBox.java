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
