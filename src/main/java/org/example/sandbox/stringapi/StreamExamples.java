package org.example.sandbox.streamapi;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        List<Integer> square = numbers
                .stream()
                .map(x -> x * x) // monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // filter
        List<String> result = names
                .stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        // sorted
        List<String> result2 = names
                .stream()
                .sorted()
                .collect(Collectors.toList());

        // terminal operations
        // collect
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        // foreach
        numbers
                .stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        // reduce
        int sum = 0;
        for(int x = 1; x <= 5; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);

        int evenSum = numbers.stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (a, b) -> a + b);
        System.out.println(evenSum);

        int totalSum = IntStream.rangeClosed(1, 5)
                .filter(evenOnly)
                .sum();
        System.out.println(totalSum);

        //Random ints
        Random random = new Random();
        random.ints(1, 11)
                .skip(5)
                .limit(50)
                .forEach(System.out::println);

        // IntStream generate
        System.out.println();
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement)
                .filter(evenOnly)
                .limit(10)
                .forEach(System.out::println);

        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(512)
                .collect(Collectors.joining());
        System.out.println(randomString);
    }
}