package com.advanceJava.Executors_Callables;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortingClient {
    static void main() throws ExecutionException, InterruptedException {
        List<Integer> l = List.of(7, 3, 1, 2, 4, 6, 17, 12);
        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(l, executor);
        Future<List<Integer>> f = executor.submit(sorter);
        System.out.println(f.get());
        executor.shutdown();
    }
}
