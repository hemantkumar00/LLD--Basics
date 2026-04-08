package com.advanceJava.StreamsAndLambdas;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsBasics {
    static void main() {
        // Creating a stream from a collection
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "grape fruit");
        Stream<String> stream = fruits.stream();
        stream.forEach(System.out::println);

        String[] cities = {"New York", "London", "Paris", "Texas", "California"};
        Stream<String> cityStream = Arrays.stream(cities);
        cityStream.forEach(System.out::println);

        IntStream intStream = IntStream.range(0, 5);
        intStream.forEach(System.out::println);

        // Intermediate Operations
        /*
         * Stream into another stream. They are lazy, meaning they don't execute until a terminal operation is invoked.
         * There are two type of operations that you can perform on a stream. Filtering & Mapping
         */

        List<String> result = fruits.stream().filter(fruit -> fruit.startsWith("A")).map(String::toUpperCase).toList();
        result.forEach(System.out::println);

        /*
         * Filtering the filter() method is used to filter elements from a stream based on a predicate.
         * It takes a predicate as an argument and returns a stream that contains only those elements that match the predicate.
         */

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> evenNumbers = numbers.filter(number -> number % 2 == 0);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Stream<Integer> evenNumbersStream = evenNumbers.filter(isEven);
        evenNumbersStream.forEach(System.out::println);

        /*
         * Mapping:- The map() method is used to transform elements in a stream.
         * It takes a function as an argument and returns a stream that contains the results of applying the function to each element in the stream.
         */

        Function<Integer, Integer> square = number -> number * number;
        // <take value, return value>
        Stream<Integer> squareNumber = Stream.of(1,2,3,4,5);
        Stream<Integer> squares = squareNumber.map(square);

        /*
         * Sorting:- The sorted() method is used to sort elements in a stream.
         * It takes a comparator as an argument and returns a stream that contains the elements sorted according to the comparator.
         */

        Stream<Integer> sortedNumbers = squares.sorted();

        Comparator<Integer> comparator = (number1, number2) -> number2-number1;
        Stream<Integer> sorted = sortedNumbers.sorted(comparator);
        sorted.forEach(System.out::println);

        /*
         * Terminal operations
         *
         * Terminal operations trigger the processing of elements and produce a result or a side effect. They are the final step in a stream pipeline.
         * They are eager, which means that they are executed immediately. forEach, count, collect, reduce, min, max, anyMatch, allMatch, noneMatch
         */

        // Iterating:- The forEach() method is used to iterate over the elements in a steam
        // It takes a consumer as an argument and invokes the consumer for each element in the stream.

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        stream1.forEach(System.out::println);

        /*
         * Reducing:- the reduce() method is used to reduce the elements in a stream to single value
         */

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        int sum = stream2.reduce(1, (number1, number2) -> number1 * number2);
        System.out.println(sum);

        // IMPORTANT: Consumer<T> return void , Supplier<T> return T, Function<T,R> return R take T, Predicate<T> return boolean

        /*
         * Collecting:- The collect() method is used to collect the elements in a stream into a collection.
         * It takes a collector as an argument and returns the result of applying the collector to the elements in the stream.
         */

        List<Integer> list = Stream.of(1,2,3,4,5).toList();

        // toList(), toSet().

        // Find the first element:-
        Optional<Integer> first = Stream.of(1,2,3,4,5).filter(i -> i%2==0).findFirst();
        System.out.println(first.orElse(0));

        // IMPORTANT: need more practice with the LLD and project creation.
    }
}
