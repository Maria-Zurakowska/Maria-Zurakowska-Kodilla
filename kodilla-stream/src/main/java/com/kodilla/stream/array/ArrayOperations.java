package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static int[] getAverage(int[] numbers) {
        numbers = new int[2];

        IntStream.range(0,numbers.length)
                .average();

        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        return numbers;
    }
}