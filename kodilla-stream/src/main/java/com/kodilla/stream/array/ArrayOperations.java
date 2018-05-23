package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static Double getAverage(int[] numbers) {
        System.out.println("Selected numbers:");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        //dla ćwiczenia dodałem także metody: count() i sum()
        long count = IntStream.range(0, numbers.length)
                .map(n -> 1)
                .count();

        int sum = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum();

        OptionalDouble avr = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        System.out.println();
        System.out.println("IntStream methods");
        System.out.println("count(): " + count);
        System.out.println("sum(): " + sum);
        System.out.println("average(): " + avr.getAsDouble());

        if(avr.isPresent()) {
            return avr.getAsDouble();
        } else {
            return 0.0;
        }
    }
}
